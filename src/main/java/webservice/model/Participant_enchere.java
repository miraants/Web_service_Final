package webservice.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Participant_enchere {


    @Column(name = "id_utilisateur")

    private Integer id_utilisateur;
    @Id
    private Integer id_manao_enchere;
    private Double prix;

    private Date daty;


}
