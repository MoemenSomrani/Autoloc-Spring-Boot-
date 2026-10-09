package org.example.autoloc.autoloc.Repositories;

import org.example.autoloc.autoloc.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.ClientInfoStatus;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
