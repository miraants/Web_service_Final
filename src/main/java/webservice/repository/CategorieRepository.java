package webservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import webservice.model.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Integer> {

}
