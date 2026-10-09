package org.example.autoloc.autoloc.Services;

import org.example.autoloc.autoloc.Repositories.EquipementRepository;
import org.example.autoloc.autoloc.entities.Equipement;

import java.util.List;

public class EquipementService implements IEquipementService{
    private EquipementRepository EquipementRepo;
    @Override
    public Equipement AjouterEquipement(Equipement e) {
        return EquipementRepo.save(e);
    }

    @Override
    public Equipement ModifierEquipement(Equipement e) {
        return EquipementRepo.save(e);
    }

    @Override
    public List<Equipement> recupererEquipement() {
        return EquipementRepo.findAll();
    }

    @Override
    public void SupprimerEquipement(long id) {
        EquipementRepo.deleteById(id);
    }
}
