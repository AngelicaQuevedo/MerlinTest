package com.merlin.api;

import java.util.List;

import com.merlin.model.Bike;

public interface GetBikesApi {
	
	List<Bike> getAllBikes();
	Bike getOne (int id);

}
