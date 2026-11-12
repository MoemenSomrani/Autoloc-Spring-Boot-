package tn.esprit.autolock.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolock.Repositories.ContratRepository;
import tn.esprit.autolock.Repositories.PaimentRepository;
import tn.esprit.autolock.entities.Contrat;
import tn.esprit.autolock.entities.Paiment;

import java.util.List;

@AllArgsConstructor
@Service
public class PaimentService implements IPaimentService {

    private PaimentRepository paimentRepo;
    private ContratRepository contratRepo;

    @Override
    public Paiment ajouterPaiment(Paiment paiment) {
        return paimentRepo.save(paiment);
    }

    @Override
    public Paiment modifierPaiment(Paiment paiment) {
        return paimentRepo.save(paiment);
    }

    @Override
    public void supprimerPaiment(Long id) {
        paimentRepo.deleteById(id);
    }

    @Override
    public List<Paiment> recupererPaiments() {
        return paimentRepo.findAll();
    }

    @Override
    public void affecterPaiementAContrat(Long idPaiement, Long idContrat) {
        Paiment paiment = paimentRepo.findById(idPaiement).get();
        Contrat contrat = contratRepo.findById(idContrat).get();
        paiment.setContrat(contrat);
        paimentRepo.save(paiment);
    }
}
