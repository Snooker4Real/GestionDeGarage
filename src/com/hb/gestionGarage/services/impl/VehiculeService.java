package com.hb.gestionGarage.services.impl;

import com.hb.gestionGarage.pojos.Vehicule;

import java.util.List;

public interface VehiculeService {

    void ajouterVehicule(Vehicule vehicule);

    Vehicule recupererVehicule(int id);

    List<Vehicule> recupererVehicules();

    boolean supprimerVehicule(int id);
}
