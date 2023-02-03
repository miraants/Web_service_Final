package webservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Entity(name="v_historique_enchere")
@Immutable
public class Historique {


    private int id_utilisateur;
    @Column(name = "nom")
    private String nom;

    @Id
    @Column(name = "nom_produit")
    private String nom_produit;
    @Column(name = "daty")
    private Date daty;
    @Column(name = "prix")
    private String prix;
}
