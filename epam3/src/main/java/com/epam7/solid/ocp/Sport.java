package com.epam7.solid.ocp;


	public class Sport implements DrivingMode {

	    private static final int POWER = 500;
	    private static final int SUSPENSION_HEIGHT = 10;

	    @Override
	    public int getPower() {
	        return POWER;
	    }

	    public int getSuspensionHeight() {
	        return SUSPENSION_HEIGHT;

}
	

}
