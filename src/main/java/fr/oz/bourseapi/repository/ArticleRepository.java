package fr.oz.bourseapi.repository;

import fr.oz.bourseapi.model.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {
    List<Article> findByIdVendeur(Long idVendeur);

}

