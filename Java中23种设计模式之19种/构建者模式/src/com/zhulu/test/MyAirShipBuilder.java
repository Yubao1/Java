package com.zhulu.test;

public class MyAirShipBuilder implements AirShipBuilder{

	@Override
	public OrbitalModel builderOrbitalModel() {
		System.out.println("轨道舱");
		return new OrbitalModel("我的轨道舱");
	}

	@Override
	public Engine builderEngine() {
		System.out.println("发动机");
		return new Engine("我的发动机");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		System.out.println("逃逸塔");
		return new EscapeTower("我的逃逸塔");
	}

}
