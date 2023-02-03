package webservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webservice.model.Produit;
import webservice.model.Rechargement;

@Repository
public interface ProduitRepository  extends JpaRepository<Produit, Integer> {
}
