package webservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_produit;

    @Column(name = "nom_produit")
    private String nom_produit;

    @Column(name = "id_categorie")
    private int id_categorie;

    @Column(name = "prix_min")
    private Double prix_min;

}
