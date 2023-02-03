package webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import webservice.model.Rechargement;
import webservice.model.SaryProduit;
import webservice.model.Utilisateur;

import java.util.List;

@Repository
public interface SaryProduitRepository extends JpaRepository<SaryProduit, Integer> {

    @Query(value = "select * from v_sary_produit where nom_produit=:id",nativeQuery = true)

    List<SaryProduit> DetailId(@Param("id") String id);

    @Query(value = "select * from v_sary_produit where id_utilisateur=:id",nativeQuery = true)

    List<SaryProduit> Detail(@Param("id") Integer id);




}
