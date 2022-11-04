package fr.oz.bourseapi.service;

import fr.oz.bourseapi.model.Personne;
import fr.oz.bourseapi.repository.PersonneRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public Iterable<Personne> chercherPersonne(String info) {
        System.out.println("premier sout " + info);

        String infoMaj = info;
        Pattern pattern = Pattern.compile("\\d{10}");
        Matcher matcher = pattern.matcher(info);
        boolean matchOk = matcher.find();

        if (matchOk) {
            Pattern espace = Pattern.compile("(\\d{2})(\\d{2})(\\d{2})(\\d{2})(\\d{2})");
            infoMaj = info.replaceAll(espace.pattern(), "$1 $2 $3 $4 $5");
            System.out.println("sout if nombre " + infoMaj);


        } else {

            try {
                infoMaj = info.toUpperCase();
            } catch (Exception exception) {
                exception.printStackTrace();
                System.out.println("ne peut passer en majuscule seulement des lettres");
            }
        }
        System.out.println("denier sout avant requete " + infoMaj);
        return personneRepository.findByNomContainingOrTelephoneContaining(infoMaj, infoMaj);
    }

}
