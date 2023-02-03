package webservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Sary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_sary;


    private String nom_sary;

    private int id_produit;
}
