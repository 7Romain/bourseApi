package fr.oz.bourseapi.repository;

import fr.oz.bourseapi.model.Personne;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonneRepository extends CrudRepository<Personne, Long> {
}
