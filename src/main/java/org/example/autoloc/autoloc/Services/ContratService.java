package org.example.autoloc.autoloc.Services;

import org.example.autoloc.autoloc.Repositories.ContratRepository;
import org.example.autoloc.autoloc.entities.Contrat;

import java.util.List;

public class ContratService implements IContratService{
    private ContratRepository ContratRepo;

    @Override
    public Contrat AjouterContrat(Contrat c) {
        return ContratRepo.save(c);
    }

    @Override
    public Contrat ModifierContrat(Contrat c) {
        return ContratRepo.save(c);
    }

    @Override
    public List<Contrat> recupererContrat() {
        return ContratRepo.findAll();
    }

    @Override
    public void SupprimerContrat(long id) {
        ContratRepo.deleteById(id);
    }
}
