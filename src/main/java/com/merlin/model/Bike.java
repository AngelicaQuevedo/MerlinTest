package com.merlin.model;

import com.merlin.enums.BikeEnums;
import com.merlin.enums.BikeEnums.BrakesType;
import com.merlin.enums.BikeEnums.BrakesType.BrakesTypeEnum;
import com.merlin.enums.BikeEnums.PedalsType;
import com.merlin.enums.BikeEnums.PedalsType.PedalsTypeEnum;
import com.merlin.enums.BikeEnums.TireType;
import com.merlin.enums.BikeEnums.TireType.TireTypeEnum;

/**
 * @author Angelica Q
 *
 */

public class Bike {
	
	int chasisNumber;
	
	TireTypeEnum tireType;
	
	BrakesTypeEnum brakesType;
	
	PedalsTypeEnum  pedalsType;
	
	final int SERIAL = 2346677;

	public int getChasisNumber() {
		return chasisNumber;
	}

	public void setChasisNumber(int chasisNumber) {
		this.chasisNumber = chasisNumber;
	}

	public TireTypeEnum getTireType() {
		return tireType;
	}

	public void setTireType (TireType.TireTypeEnum tireNumber) {
		this.tireType = tireNumber;
	}

	public BrakesTypeEnum getBrakesType() {
		return brakesType;
	}

	public void setBrakesType(BrakesTypeEnum brakesType) {
		this.brakesType = brakesType;
	}

	public PedalsTypeEnum getPedalsType() {
		return pedalsType;
	}

	public void setPedalsType(PedalsTypeEnum pedalsType) {
		this.pedalsType = pedalsType;
	}
	
	
	

}
