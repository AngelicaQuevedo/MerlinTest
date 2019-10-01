package com.merlin.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.merlin.api.GetBikesApi;
import com.merlin.dto.DtoBike;
import com.merlin.model.Bike;


@Component
public class GetBikeImplementation implements GetBikesApi{
	
	@Autowired
	DtoBike dtoBike;

	@Override
	public List<Bike> getAllBikes() {
		List<Bike> bikes = new ArrayList<>();		
		return dtoBike.getBikesFromDataBase();
	}

	@Override
	public Bike getOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
