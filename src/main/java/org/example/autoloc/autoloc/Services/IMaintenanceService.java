package org.example.autoloc.autoloc.Services;

import org.example.autoloc.autoloc.entities.Equipement;
import org.example.autoloc.autoloc.entities.Maintenance;

import java.util.List;

public interface IMaintenanceService {
    Maintenance AjouterMaintenance (Maintenance m);
    Maintenance ModifierMaintenance (Maintenance m);
    List<Maintenance> recupererMaintenance ();
    void SupprimerMaintenance (long id);
}
