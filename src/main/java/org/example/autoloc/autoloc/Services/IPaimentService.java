package org.example.autoloc.autoloc.Services;

import org.example.autoloc.autoloc.entities.Maintenance;
import org.example.autoloc.autoloc.entities.Paiment;

import java.util.List;

public interface IPaimentService {
    Paiment AjouterPaiment (Paiment p);
    Paiment ModifierPaiment (Paiment p);
    List<Paiment> recupererPaiment ();
    void SupprimerPaiment (long id);
}
