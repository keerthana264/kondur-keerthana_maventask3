package com.epam5.solid.isp;



	public class Drone extends Vehicle implements CameraSwitch {

	    private boolean cameraOn;

	    public boolean isCameraOn() {
	        return cameraOn;
	    }

	    @Override
	    public void turnCameraOn() {
	        cameraOn = true;
	    }

	    @Override
	    public void turnCameraOff() {
	        cameraOn = false;
	    }
	}
	
	

