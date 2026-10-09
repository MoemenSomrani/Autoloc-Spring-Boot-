package org.example.autoloc.autoloc.Services;

import org.example.autoloc.autoloc.Repositories.PaimentRepository;
import org.example.autoloc.autoloc.entities.Paiment;

import java.util.List;

public class PaimentService implements IPaimentService{
    private PaimentRepository PaimentRepo;
    @Override
    public Paiment AjouterPaiment(Paiment p) {
        return PaimentRepo.save(p);
    }

    @Override
    public Paiment ModifierPaiment(Paiment p) {
        return PaimentRepo.save(p);
    }

    @Override
    public List<Paiment> recupererPaiment() {
        return PaimentRepo.findAll();
    }

    @Override
    public void SupprimerPaiment(long id) {
        PaimentRepo.deleteById(id);
    }
}
