package org.example.autoloc.autoloc.Services;

import org.example.autoloc.autoloc.entities.Paiment;
import org.example.autoloc.autoloc.entities.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation AjouterPReservation (Reservation r);
    Reservation ModifierReservation (Reservation r);
    List<Reservation> recupereReservation ();
    void SupprimerReservation (long id);
}
