package webservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "v_liste_enchere")
public class Historique_Prop {
    @Column
    private String nom;
    @Id
    @Column
    private String nom_produit;
    @Column
    private String nom_categorie;
    @Column
    private Double prix_min;
    @Column
    private Integer duree;
}
