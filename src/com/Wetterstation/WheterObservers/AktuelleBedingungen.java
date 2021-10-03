package com.Wetterstation.WheterObservers;

import com.Wetterstation.Model.Wetterdaten;
import com.Wetterstation.Observer;

public class AktuelleBedingungen implements Observer<Wetterdaten> {

	@Override
	public void update(Wetterdaten wetterdaten) {
		System.out.println("Die Aktuelle Temperature: " + wetterdaten.getTemperatur() + "\n");
		System.out.println("Die Aktuelle Feutigkeit: " + wetterdaten.getFeutigkeit() + "\n");
		System.out.println("Die Aktuelle Luftdruck: " + wetterdaten.getLuftdruck() + "\n");
	}
}
