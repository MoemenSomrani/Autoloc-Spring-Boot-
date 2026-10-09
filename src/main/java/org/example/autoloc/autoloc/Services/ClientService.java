package org.example.autoloc.autoloc.Services;

import lombok.AllArgsConstructor;
import org.example.autoloc.autoloc.Repositories.ClientRepository;
import org.example.autoloc.autoloc.entities.Agence;
import org.example.autoloc.autoloc.entities.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class ClientService implements IClientService{
    private ClientRepository ClientRepo;

    @Override
    public Client AjouterClient(Client c) {
        return ClientRepo.save(c);
    }

    @Override
    public Client ModifierClient(Client c) {
        return ClientRepo.save(c);
    }

    @Override
    public List<Client> recupererClient() {
        return ClientRepo.findAll();
    }

    @Override
    public void SupprimerClient(long id) {
        ClientRepo.deleteById(id);
    }
}
