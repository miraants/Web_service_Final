package webservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Manao_enchere {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_manao_enchere;
    private int id_utilisateur;
    private int id_produit;
    private int statut;
    private Date daty;
    private int duree;
    private Double commission;



}
