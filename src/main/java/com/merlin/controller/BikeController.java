/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.merlin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.merlin.model.Bike;
import com.merlin.service.GetBikeImplementation;

/**
 *
 * @author dev.angelica
 */
@RestController
public class BikeController {
	
	@Autowired
	GetBikeImplementation getBikeImplementation;

 @RequestMapping(value = "/bikeStore/listBikes", method = RequestMethod.GET)
  public List<Bike> getAllBikes() {
	 
	 return getBikeImplementation.getAllBikes();
	 
	 
	 //return null;
    
  }

}
