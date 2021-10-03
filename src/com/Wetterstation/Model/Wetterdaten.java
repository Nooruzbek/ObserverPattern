package com.Wetterstation.Model;

import com.Wetterstation.Subject;

public class Wetterdaten extends Subject<Wetterdaten> {

	private double temperatur;
	private double feutigkeit;
	private double luftdruck;

	public Wetterdaten(){
		this.temperatur = 0.0;
		this.feutigkeit = 0.0;
		this.luftdruck = 0.0;
	}

	public void setTemperatur(double neueTemperature) {
		if (neueTemperature != this.temperatur){
			this.temperatur = neueTemperature;
			notifyObservers(this);
		}
	}

	public void setFeutigkeit(double neueFeutigkeit){
		if (neueFeutigkeit != this.feutigkeit){
			this.feutigkeit = neueFeutigkeit;
			notifyObservers(this);
		}
	}

	public void setLuftdruck(double neueLuftdruck){
		if (neueLuftdruck != luftdruck){
			this.luftdruck = neueLuftdruck;
			notifyObservers(this);
		}
	}

	public double getTemperatur() {
		return temperatur;
	}

	public double getFeutigkeit() {
		return feutigkeit;
	}

	public double getLuftdruck() {
		return luftdruck;
	}
}
