package fr.oz.bourseapi.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "articles")
public class Article {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "categorie")
    private Categorie categorie;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private Type type;

    private String taille;

    private String couleurs;

    private String annotations;

    private int reference;

    @Column(name = "prixvendeur")
    private int prixVendeur;

    @Column(name = "prixvente")
    private int prixVente;

    @Column(name = "idvendeur")
    private long idVendeur;

    @Column(name = "tableenregistrement")
    private int tableEnregistrement;


}
