package org.example.autoloc.autoloc.Services;

import com.sun.tools.javac.Main;
import org.example.autoloc.autoloc.Repositories.MaintenanceRepository;
import org.example.autoloc.autoloc.entities.Maintenance;

import java.util.List;

public class MaintenanceService implements IMaintenanceService{
    private MaintenanceRepository MaintenanceRepo;
    @Override
    public Maintenance AjouterMaintenance(Maintenance m) {
        return MaintenanceRepo.save(m);
    }

    @Override
    public Maintenance ModifierMaintenance(Maintenance m) {
        return MaintenanceRepo.save(m);
    }

    @Override
    public List<Maintenance> recupererMaintenance() {
        return MaintenanceRepo.findAll();
    }

    @Override
    public void SupprimerMaintenance(long id) {
        MaintenanceRepo.deleteById(id);
    }
}
