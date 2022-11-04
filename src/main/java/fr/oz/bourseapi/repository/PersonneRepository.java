package fr.oz.bourseapi.repository;

import fr.oz.bourseapi.model.Personne;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonneRepository extends CrudRepository<Personne, Long> {

//    @Query("SELECT p FROM PERSONNES p WHERE p.nom LIKE %?1%"
//            + " OR p.telephone LIKE %?1%")

    Iterable<Personne> findByNomContainingOrTelephoneContaining(String nom, String tel);
}
