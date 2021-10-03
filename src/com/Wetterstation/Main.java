package com.Wetterstation;

import com.Wetterstation.Model.Wetterdaten;
import com.Wetterstation.WheterObservers.AktuelleBedingungen;
import com.Wetterstation.WheterObservers.Wettervorhersage;

public class Main {

    public static void main(String[] args) {
        Wetterdaten wetterdaten = new Wetterdaten();
        wetterdaten.addObserver(new AktuelleBedingungen());
        wetterdaten.addObserver(new Wettervorhersage());

        wetterdaten.setFeutigkeit(2.3);
        wetterdaten.setTemperatur(3.2);
        wetterdaten.setLuftdruck(4.2);
        wetterdaten.setLuftdruck(5.2);
        wetterdaten.setLuftdruck(4.2);
        wetterdaten.setLuftdruck(4.2);
    }
}
