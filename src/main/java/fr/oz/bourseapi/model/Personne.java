package fr.oz.bourseapi.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "personnes")
public class Personne {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String prenom;

    private String nom;

    private String telephone;

    private String commune;

    private String email;

    @Column(name = "dateinscription")
    private LocalDate dateInscription;


}
