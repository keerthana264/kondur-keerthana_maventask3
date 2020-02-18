package com.epam4.solid.dip;

public class Driver {
	private Vehicle vehicle;

    public Driver(final Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public void increaseSpeed(){
        vehicle.accelerate();
    }
	
	
	
	
}
