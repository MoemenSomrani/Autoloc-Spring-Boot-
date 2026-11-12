package tn.esprit.autolock.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.autolock.Repositories.ClientRepository;
import tn.esprit.autolock.Repositories.ContratRepository;
import tn.esprit.autolock.Repositories.ReservationRepository;
import tn.esprit.autolock.entities.Client;
import tn.esprit.autolock.entities.Contrat;
import tn.esprit.autolock.entities.Reservation;

import java.util.List;

@AllArgsConstructor
@Service
public class ReservationService implements IReservationService {

    private ReservationRepository reservationRepo;
    private ContratRepository contratRepo;
    private ClientRepository clientRepo;

    @Override
    public Reservation ajouterReservation(Reservation reservation) {
        return reservationRepo.save(reservation);
    }

    @Override
    public Reservation modifierReservation(Reservation reservation) {
        return reservationRepo.save(reservation);
    }

    @Override
    public void supprimerReservation(Long id) {
        reservationRepo.deleteById(id);
    }

    @Override
    public List<Reservation> recupererReservations() {
        return reservationRepo.findAll();
    }

    // La relation OneToOne est portée par Contrat (colonne reservation_id),
    // donc c'est le contrat qu'on modifie puis qu'on sauvegarde.
    @Override
    @Transactional
    public void affecterContratAReservation(Long idContrat, Long idReservation) {
        Contrat contrat = contratRepo.findById(idContrat).get();
        Reservation reservation = reservationRepo.findById(idReservation).get();
        contrat.setReservation(reservation);
        contratRepo.save(contrat);
    }

    @Override
    @Transactional
    public void desaffecterContratDeReservation(Long idReservation) {
        Reservation reservation = reservationRepo.findById(idReservation).get();
        Contrat contrat = reservation.getContrat();
        if (contrat != null) {
            contrat.setReservation(null);
            contratRepo.save(contrat);
        }
    }

    @Override
    public void affecterClientAReservation(Long idClient, Long idReservation) {
        Client client = clientRepo.findById(idClient).get();
        Reservation reservation = reservationRepo.findById(idReservation).get();
        reservation.setClient(client);
        reservationRepo.save(reservation);
    }
}
