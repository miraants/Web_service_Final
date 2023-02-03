package webservice.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("admin")
public class Admin {

    @Id
    private int id_admin;

    private String email;

    private String mdp;

}
