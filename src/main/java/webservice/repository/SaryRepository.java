package webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import webservice.model.Sary;
import webservice.model.SaryProduit;
import webservice.model.Utilisateur;
@Repository

public interface SaryRepository  extends JpaRepository<Sary, Integer> {
}
