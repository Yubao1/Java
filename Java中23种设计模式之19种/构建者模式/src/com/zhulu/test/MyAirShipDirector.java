package com.zhulu.test;

public class MyAirShipDirector implements AirShipDirector{
    private AirShipBuilder builder;
    
	public MyAirShipDirector(AirShipBuilder builder) {
		super();
		this.builder = builder;
	}

	@Override
	public AirShip directorAirShip() {
		Engine engine = builder.builderEngine();
		OrbitalModel orbitalModel = builder.builderOrbitalModel();
		EscapeTower escapeTower = builder.builderEscapeTower();
		AirShip airShip = new AirShip();
		airShip.setEngine(engine);
		airShip.setEscapeTower(escapeTower);
		airShip.setOrbitalModel(orbitalModel);
		return airShip;
	}

}
