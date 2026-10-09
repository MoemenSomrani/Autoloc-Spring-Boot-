package org.example.autoloc.autoloc.Repositories;

import org.example.autoloc.autoloc.entities.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employe,Long> {
}
