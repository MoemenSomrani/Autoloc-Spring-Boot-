package org.example.autoloc.autoloc.Services;

import org.example.autoloc.autoloc.entities.Agence;

import java.util.List;

public interface IAgenceSerivce {
    Agence AjouterAgence (Agence a);
    Agence ModifierAgence (Agence a);
    List <Agence> recupererAgence ();
    void SupprimerAgence (long id);
}
