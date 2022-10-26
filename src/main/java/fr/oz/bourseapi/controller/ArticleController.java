package fr.oz.bourseapi.controller;

import fr.oz.bourseapi.model.Article;
import fr.oz.bourseapi.model.Categorie;
import fr.oz.bourseapi.model.Type;
import fr.oz.bourseapi.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    /**
     * Recherche un article via son id
     */
    @GetMapping("/article/{id}")
    public Article getArticle(@PathVariable("id") final Long id) {
        Optional<Article> article = articleService.getArticle(id);

        if (article.isPresent()) {
            return article.get();
        } else {
            return null;
        }
    }

    /**
     * Recherche tous les articles d'une article via l'id de la article
     */
    @GetMapping("/articles/{id}")
    public Iterable<Article> getArticles(@PathVariable("id") final Long id) {
        return articleService.getArticles(id);
    }


    @PostMapping("/article")
    public Article createArticle(@RequestBody Article article) {
        return articleService.saveArticle(article);
    }

    @PutMapping("/article/{id}")
    public Article updateArticle(@PathVariable("id") final Long id, @RequestBody Article article) {
        Optional<Article> e = articleService.getArticle(id);
        if (e.isPresent()) {
            Article currentArticle = e.get();

            Categorie categorie = article.getCategorie();
            if (categorie != null) {
                currentArticle.setCategorie(categorie);
            }
            Type type = article.getType();
            if (type != null) {
                currentArticle.setType(type);

            }
            String taille = article.getTaille();
            if (taille != null) {
                currentArticle.setTaille(taille);
            }
            String couleurs = article.getCouleurs();
            if (couleurs != null) {
                currentArticle.setCouleurs(couleurs);

            }
            String annotations = article.getAnnotations();
            if (annotations != null) {
                currentArticle.setAnnotations(annotations);
            }
            int reference = article.getReference();
            if (reference != 0) {
                currentArticle.setReference(reference);

            }
            int prixVendeur = article.getPrixVendeur();
            if (prixVendeur != 0) {
                currentArticle.setPrixVendeur(prixVendeur);

            }


            articleService.saveArticle(currentArticle);
            return currentArticle;
        } else {
            return null;
        }
    }
}
