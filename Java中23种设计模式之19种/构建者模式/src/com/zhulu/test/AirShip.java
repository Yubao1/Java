package com.zhulu.test;

import javax.management.loading.PrivateMLet;

public class AirShip {
    private OrbitalModel orbitalModel;
    private Engine engine;
    private EscapeTower escapeTower;
	public OrbitalModel getOrbitalModel() {
		return orbitalModel;
	}
	public void setOrbitalModel(OrbitalModel orbitalModel) {
		this.orbitalModel = orbitalModel;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public EscapeTower getEscapeTower() {
		return escapeTower;
	}
	public void setEscapeTower(EscapeTower escapeTower) {
		this.escapeTower = escapeTower;
	}
    
}

class OrbitalModel {
	private String name;
    
	public OrbitalModel(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}  
class Engine {
	private String name;

	public Engine(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class EscapeTower {
	private String name;

	public EscapeTower(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}