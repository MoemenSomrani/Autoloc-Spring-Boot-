package org.example.autoloc.autoloc.Services;

import org.example.autoloc.autoloc.entities.Contrat;

import java.util.List;

public interface IContratService {
    Contrat AjouterContrat (Contrat c);
    Contrat ModifierContrat (Contrat c);
    List<Contrat> recupererContrat ();
    void SupprimerContrat (long id);
}
