package org.example.autoloc.autoloc.Services;

import org.example.autoloc.autoloc.Repositories.VehiculeRepository;
import org.example.autoloc.autoloc.entities.Vehicule;

import java.util.List;

public class VehiculeService implements IVehiculeService{
    private VehiculeRepository VehiculeRepo;
    @Override
    public Vehicule AjouterPVehicule(Vehicule v) {
        return VehiculeRepo.save(v);
    }

    @Override
    public Vehicule ModifierVehicule(Vehicule v) {
        return VehiculeRepo.save(v);
    }

    @Override
    public List<Vehicule> recupereVehicule() {
        return VehiculeRepo.findAll();
    }

    @Override
    public void SupprimerVehicule(long id) {
        VehiculeRepo.deleteById(id);
    }
}
