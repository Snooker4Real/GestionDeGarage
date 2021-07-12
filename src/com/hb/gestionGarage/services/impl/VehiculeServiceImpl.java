package com.hb.gestionGarage.services.impl;

import com.hb.gestionGarage.pojos.Vehicule;

import java.util.ArrayList;
import java.util.List;

public class VehiculeServiceImpl implements VehiculeService {

    private List<Vehicule> vehicules = new ArrayList<Vehicule>();

    @Override
    public void ajouterVehicule(Vehicule vehicule) {
        vehicules.add(vehicule);
    }

    @Override
    public Vehicule recupererVehicule(int id) {
        for(Vehicule vehicule : vehicules) {
            if(id == vehicule.getId()) {
                return vehicule;
            }
        }

        return null;
    }

    @Override
    public List<Vehicule> recupererVehicules() {

        return vehicules;
    }

    @Override
    public boolean supprimerVehicule(int id) {
        for(Vehicule vehicule : vehicules) {
            if(id == vehicule.getId()) {

                vehicules.remove(vehicule);

                return true;
            }
        }

        return false;
    }

}