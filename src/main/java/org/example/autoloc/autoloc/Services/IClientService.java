package org.example.autoloc.autoloc.Services;

import org.example.autoloc.autoloc.entities.Client;

import java.util.List;

public interface IClientService {
    Client AjouterClient (Client c);
    Client ModifierClient (Client c);
    List<Client> recupererClient ();
    void SupprimerClient (long id);
}
