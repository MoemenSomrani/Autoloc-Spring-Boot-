package org.example.autoloc.autoloc.Services;

import lombok.AllArgsConstructor;
import org.example.autoloc.autoloc.Repositories.AgenceRepository;
import org.example.autoloc.autoloc.entities.Agence;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor

public class AgenceService implements IAgenceSerivce{

    private AgenceRepository AgenceRepo;
    @Override
    public Agence AjouterAgence(Agence a) {
        return AgenceRepo.save(a);   }

    @Override
    public Agence ModifierAgence(Agence a) {
        return AgenceRepo.save(a);
    }

    @Override
    public List<Agence> recupererAgence() {
        return AgenceRepo.findAll();
    }

    @Override
    public void SupprimerAgence(long id) {
        AgenceRepo.deleteById(id);
    }
}
