package com.merlin.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.merlin.enums.BikeEnums;
import com.merlin.enums.BikeEnums.BrakesType.BrakesTypeEnum;
import com.merlin.enums.BikeEnums.PedalsType.PedalsTypeEnum;
import com.merlin.enums.BikeEnums.TireType;
import com.merlin.enums.BikeEnums.TireType.TireTypeEnum;
import com.merlin.model.Bike;


@Component
public class DtoBike {

	
@Autowired
Bike bike;
	
	
	public List<Bike> getBikesFromDataBase (){
		
		List <Bike> bikes = new ArrayList();
		
		bike.setBrakesType(BrakesTypeEnum.MEDIUM);
		bike.setChasisNumber(12);
		bike.setPedalsType(PedalsTypeEnum.HIGH);
		bike.setTireType(TireTypeEnum.LOW);

		
		bikes.add((Bike) bikes);
		
		
		return bikes;
		
		
	}
    
}
