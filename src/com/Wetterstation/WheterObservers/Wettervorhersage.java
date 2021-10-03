package com.Wetterstation.WheterObservers;

import com.Wetterstation.Model.Wetterdaten;
import com.Wetterstation.Observer;

public class Wettervorhersage implements Observer<Wetterdaten> {
	private Double letzteLuftDruckInfo;

	@Override
	public void update(Wetterdaten wetterdaten) {
		setLuftDruck(wetterdaten.getLuftdruck());
	}

	public void setLuftDruck(Double neueLuftDruck){
		checkLuftDruckToNull(neueLuftDruck);
		if (this.letzteLuftDruckInfo == null){
			System.out.println("Es wird angefanden zu rechen, wie das Wetter sich ändert... \n");
		} else {
			System.out.println(berechneLuftDruck(neueLuftDruck));
		}
		this.letzteLuftDruckInfo = neueLuftDruck;
	}

	private String berechneLuftDruck(Double neueLuftDruck){
		if (this.letzteLuftDruckInfo > neueLuftDruck){
			return "Das Wetter wird schlechter...\n";
		}
		if (this.letzteLuftDruckInfo < neueLuftDruck){
			return "Das Wetter wird besser...\n";
		}
		return "Die Temperaure bleibt weiterhin so \n";
	}

	private void checkLuftDruckToNull(Double neueLuftDruck){
		if (neueLuftDruck == null){
			throw new IllegalArgumentException("Luftdruck ist nicht angegeben! Luftdruck darf nicht leer sein!");
		}
	}
}
