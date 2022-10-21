package fr.oz.bourseapi.service;

import fr.oz.bourseapi.model.Personne;
import fr.oz.bourseapi.repository.PersonneRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class PersonneService {
    @Autowired
    private PersonneRepository personneRepository;

    public Optional<Personne> getPersonne(final Long id) {
        return personneRepository.findById(id);
    }

    public Iterable<Personne> getPersonnes() {
        return personneRepository.findAll();

    }

    public void deletePersonne(final long id) {
        personneRepository.deleteById(id);
    }

    public Personne savePersonne(Personne personne) {
        return personneRepository.save(personne);
    }


}
