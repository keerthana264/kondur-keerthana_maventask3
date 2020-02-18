package com.epam5.solid.isp;


	public abstract class Vehicle implements EngineSwitch {

	    private boolean engineRunning;

	    public boolean isEngineRunning() {
	        return engineRunning;
	    }

	    @Override
	    public void startEngine() {
	        engineRunning = true;
	    }

	    @Override
	    public void shutDownEngine() {
	        engineRunning = false;
	    }

	}

