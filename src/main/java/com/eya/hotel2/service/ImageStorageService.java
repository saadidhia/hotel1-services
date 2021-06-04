package com.eya.hotel2.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.eya.hotel2.entities.ImageModel;
import com.eya.hotel2.repos.ImageRepository;

@Service
public class ImageStorageService {
	
	 @Autowired
	  private ImageRepository  imageDBRepository;
	 
	 public ImageModel upload(MultipartFile image) throws IOException {
		    String imageName = StringUtils.cleanPath(image.getOriginalFilename());
		    System.out.println(image.getBytes());
		    ImageModel imageDB = new ImageModel(imageName, image.getContentType(), image.getBytes());
		    return imageDBRepository.save(imageDB);
	 }
	 
	 
	 public ImageModel getImage(Long id) {
		    return imageDBRepository.findById(id).get();
		  }

}
