package org.example.autoloc.autoloc.Services;

import org.example.autoloc.autoloc.Repositories.EmployeRepository;
import org.example.autoloc.autoloc.entities.Employe;

import java.util.List;

public class EmployeService implements IEmployeService{
    private EmployeRepository EmployeRepo;
    @Override
    public Employe AjouterEmploye(Employe e) {
        return EmployeRepo.save(e);
    }

    @Override
    public Employe ModifierEmploye(Employe e) {
        return EmployeRepo.save(e);
    }

    @Override
    public List<Employe> recupererEmploye() {
        return EmployeRepo.findAll();
    }

    @Override
    public void SupprimerEmploye(long id) {
        EmployeRepo.deleteById(id);
    }
}
