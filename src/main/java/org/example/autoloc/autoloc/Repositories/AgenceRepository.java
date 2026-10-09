package org.example.autoloc.autoloc.Repositories;

import org.example.autoloc.autoloc.entities.Agence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgenceRepository extends JpaRepository<Agence,Long> {
}
