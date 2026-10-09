package org.example.autoloc.autoloc.Services;

import org.example.autoloc.autoloc.entities.Equipement;

import java.util.List;

public interface IEquipementService {
    Equipement AjouterEquipement (Equipement e);
    Equipement ModifierEquipement (Equipement e);
    List<Equipement> recupererEquipement ();
    void SupprimerEquipement (long id);
}
