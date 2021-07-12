package com.hb.gestionGarage;

import com.hb.gestionGarage.pojos.*;

public class GestionGarageMain {

    public static void main(String[] args) {

        // créé un garage
        Garage garage = new Garage("Garage des bottes");

        // créé des moteurs
        Moteur moteur110e = new Moteur(110, TypeMoteur.ESSENCE);
        Moteur moteur85e = new Moteur(85, TypeMoteur.ESSENCE);
        Moteur moteur300d = new Moteur(300, TypeMoteur.DESIEL);

        // créé des options
        Option gps = new Option("GPS", 800);

        // créé des véhicules
        Voiture clio = new Voiture("Clio", 19000, Marque.RENAULT, moteur110e, 6, 5, 4, 300);
        Moto thunderbird = new Moto("Thunderbird", 12000, Marque.TRIUMPH, moteur85e, 900);
        Camion tHight = new Camion("T HIGH", 40000, Marque.RENAULT, moteur300d, 3, 10000, 200);

        clio.ajouterOption(gps);

        garage.ajouterVehicule(clio);
        garage.ajouterVehicule(thunderbird);
        garage.ajouterVehicule(tHight);

        garage.afficher();
    }
}
