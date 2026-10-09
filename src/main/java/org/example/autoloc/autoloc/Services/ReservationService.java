package org.example.autoloc.autoloc.Services;

import org.example.autoloc.autoloc.Repositories.ReservationRepository;
import org.example.autoloc.autoloc.entities.Reservation;

import java.util.List;

public class ReservationService implements IReservationService{
    private ReservationRepository ReservationRepo;
    @Override
    public Reservation AjouterPReservation(Reservation r) {
        return ReservationRepo.save(r);
    }

    @Override
    public Reservation ModifierReservation(Reservation r) {
        return ReservationRepo.save(r);
    }

    @Override
    public List<Reservation> recupereReservation() {
        return ReservationRepo.findAll();
    }

    @Override
    public void SupprimerReservation(long id) {
        ReservationRepo.deleteById(id);
    }
}
