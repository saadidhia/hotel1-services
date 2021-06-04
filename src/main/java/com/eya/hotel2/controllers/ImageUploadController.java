package com.eya.hotel2.controllers;




import java.io.IOException;
import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.eya.hotel2.entities.ImageModel;
import com.eya.hotel2.entities.ResponseMessageImage;
import com.eya.hotel2.repos.ImageRepository;
import com.eya.hotel2.service.ImageStorageService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value="/check")

public class ImageUploadController {
    
	@Autowired
	  private ImageStorageService storageService;
      /*@PostMapping("/upload")
      public ImageModel uplaodImage(@RequestParam("imageFile") MultipartFile file) throws IOException {
          ImageModel img = new ImageModel( file.getOriginalFilename(),file.getContentType(),file.getBytes() );
          final ImageModel savedImage = imageRepository.save(img);
          System.out.println("Image saved");
          
          return savedImage;

      }*/
      
      @PostMapping("/upload")
      public ResponseEntity<ResponseMessageImage> uploadImage(@RequestParam("file") MultipartFile image) {
        String message = "";
        try {
          storageService.upload(image);

          message = "Uploaded the file successfully: " + image.getOriginalFilename();
          return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessageImage(message));
        } catch (Exception e) {
          message = "Could not upload the file: " + image.getOriginalFilename() + "!";
          return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessageImage(message));
        }
      }
      
      
    
  }
  
