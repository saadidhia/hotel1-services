package com.eya.hotel2.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.eya.hotel2.entities.Planning;
import com.eya.hotel2.service.PlanningService;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/planning/api/")
public class PlanningController {
	@Autowired
    private PlanningService service;

    @PostMapping("/plannings")
    public Planning addPlanning(@RequestBody Planning planning) {
        return service.savePlanning(planning);
    }

    @PutMapping("/plannings")
    public Planning updatePlanning(@RequestBody Planning planning) {
        return service.updatePlanning(planning);
    }

    @DeleteMapping("/plannings/{id}")
    public String deletePlanning(@PathVariable Long id) {
        return service.deletePlanning(id);
    }
    
    @GetMapping("/plannings")
    public List<Planning> findAllPlannings() {
        return service.getPlannings();
    }

    @GetMapping("/plannings/{id}")
    public Planning findPlanningById(@PathVariable Long id) {
        return service.getPlanningById(id);
    }

}
