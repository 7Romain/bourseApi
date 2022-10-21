package fr.oz.bourseapi.controller;

import fr.oz.bourseapi.model.Personne;
import fr.oz.bourseapi.service.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Optional;

@RestController
public class PersonneController {
    @Autowired
    private PersonneService personneService;

    /**
     * Read - Get all personne
     *
     * @return - An Iterable object of personne full filled
     */
    @GetMapping("/personnes")
    public Iterable<Personne> getPersonnes() {
        return personneService.getPersonnes();
    }

    /**
     * Create - Add a new personne
     *
     * @param personne An object personne
     * @return The personne object saved
     */
    @PostMapping("/personne")
    public Personne createPersonne(@RequestBody Personne personne) {
        return personneService.savePersonne(personne);
    }


    /**
     * Read - Get one personne
     *
     * @param id The id of the personne
     * @return An Personne object full filled
     */
    @GetMapping("/personne/{id}")
    public Personne getPersonne(@PathVariable("id") final Long id) {
        Optional<Personne> personne = personneService.getPersonne(id);
        if (personne.isPresent()) {
            return personne.get();
        } else {
            return null;
        }
    }

    /**
     * Update - Update an existing personne
     *
     * @param id       - The id of the personne to update
     * @param personne - The personne object updated
     * @return
     */
    @PutMapping("/personne/{id}")
    public Personne updatePersonne(@PathVariable("id") final Long id, @RequestBody Personne personne) {
        Optional<Personne> e = personneService.getPersonne(id);
        if (e.isPresent()) {
            Personne currentPersonne = e.get();

            String prenom = personne.getPrenom();
            if (prenom != null) {
                currentPersonne.setPrenom(prenom);
            }
            String nom = personne.getNom();
            if (nom != null) {
                currentPersonne.setNom(nom);

            }
            String telephone = personne.getTelephone();
            if (telephone != null) {
                currentPersonne.setTelephone(telephone);
            }
            String commune = personne.getCommune();
            if (commune != null) {
                currentPersonne.setCommune(commune);

            }
            LocalDate dateInscription = personne.getDateInscription();
            if (dateInscription != null) {
                currentPersonne.setDateInscription(dateInscription);
            }
            personneService.savePersonne(currentPersonne);
            return currentPersonne;
        } else {
            return null;
        }
    }


    /**
     * Delete - Delete an personne
     *
     * @param id - The id of the personne to delete
     */
    @DeleteMapping("/personne/{id}")
    public void deletePersonne(@PathVariable("id") final long id) {
        personneService.deletePersonne(id);
    }

}
