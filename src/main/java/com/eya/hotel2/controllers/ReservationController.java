
package com.eya.hotel2.controllers;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.eya.hotel2.entities.Reservation;
import com.eya.hotel2.service.ReservationService;

@CrossOrigin(origins ="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ReservationController {
	
	
	@Autowired
	private ReservationService reservationService;

	
	

	@PostMapping("/reservation")
	public String addreservation(@RequestBody Reservation reservation) {
	return reservationService.saveReservation(reservation);	
	}
	
	@GetMapping("/reservation")
	public List<Reservation>findAllReservations() {
	return reservationService.getAllReservations();
	}
	
	
	@GetMapping("/reservation/{id}")
	public Optional<Reservation> findReservationsById(@PathVariable Long id) {
	return reservationService.getReservationsById(id);
	}
	
	

	@PutMapping("/reservation")
	public Reservation updateReservation(@RequestBody Reservation reservation) {
	return reservationService.updateReservation(reservation);
	}

	
	@DeleteMapping("/reservation/{id}")
	public String deleteReservation(@PathVariable Long id) {
	return reservationService.deleteReservation(id);
	}
	
	@DeleteMapping("/reservation")
	public String deleteAllReservation(Reservation reservation) {
	return reservationService.deleteAllReservation(reservation);
	}
	
	
	
	
	
	
	
	
	
}
