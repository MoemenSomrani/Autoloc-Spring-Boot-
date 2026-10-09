package org.example.autoloc.autoloc.Services;

import org.example.autoloc.autoloc.entities.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule AjouterPVehicule (Vehicule v);
    Vehicule ModifierVehicule (Vehicule v);
    List<Vehicule> recupereVehicule ();
    void SupprimerVehicule (long id);
}
