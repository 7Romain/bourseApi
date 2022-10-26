package fr.oz.bourseapi.service;

import fr.oz.bourseapi.model.Article;
import fr.oz.bourseapi.repository.ArticleRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    public Optional<Article> getArticle(final Long id) {
        return articleRepository.findById(id);
    }

    /**
     * Retourne les objets  liés à  l'id de la article
     *
     * @param id l'id de la article
     * @return la liste d'article en vente pour cette article
     */
    public Iterable<Article> getArticles(final Long id) {
        return articleRepository.findByIdVendeur(id);

    }

    public Article saveArticle(Article article) {
        return articleRepository.save(article);
    }
}
