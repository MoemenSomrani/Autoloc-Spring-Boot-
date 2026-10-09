package org.example.autoloc.autoloc.Services;

import org.example.autoloc.autoloc.entities.Employe;

import java.util.List;

public interface IEmployeService {
    Employe AjouterEmploye (Employe e);
    Employe ModifierEmploye (Employe e);
    List<Employe> recupererEmploye ();
    void SupprimerEmploye (long id);
}
