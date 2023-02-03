package webservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="v_sary_produit")
@Immutable
public class SaryProduit {


    @Column(name = "id_utilisateur")
    private int id_utilisateur;
    @Id
    @Column(name = "id_produit")
    private int id_produit;

    @Column(name = "nom_sary")
    private String nom_sary;

    @Column(name = "nom_produit")
    private String nom_produit;

    @Column(name = "nom_categorie")
    private String nom_categorie;

    @Column(name = "statut")
    private int statut;

    @Column(name = "prix_min")
    private Double prix_min;

    @Column(name = "duree")
    private int duree;

    @Column(name = "daty")
    private Date daty;

}
