package com.epam7.solid.ocp;


	public class Comfort implements DrivingMode {

	    private static final int POWER = 400;
	    private static final int SUSPENSION_HEIGHT = 20;

	    @Override
	    public int getPower() {
	        return POWER;
	    }

	    @Override
	    public int getSuspensionHeight() {
	        return SUSPENSION_HEIGHT;
	    }
	}

