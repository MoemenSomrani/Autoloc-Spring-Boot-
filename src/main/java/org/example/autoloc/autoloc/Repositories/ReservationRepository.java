package org.example.autoloc.autoloc.Repositories;

import org.example.autoloc.autoloc.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
