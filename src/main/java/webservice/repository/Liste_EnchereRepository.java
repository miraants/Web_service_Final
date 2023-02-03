package webservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import webservice.model.Liste_Enchere;
import webservice.model.Rechargement;

import java.util.List;

@Repository
public interface Liste_EnchereRepository extends JpaRepository<Liste_Enchere, Integer> {
    @Query("select c from v_liste_enchere c where c.nom=:nom")
    public List<Liste_Enchere> findListe_EnchereByNom(@Param("nom") String nom);

    @Query(value = "select * from v_liste_enchere where nom_produit=:nom_produit",nativeQuery = true)
    public Liste_Enchere selectEnchere(@Param("nom_produit") String nom_produit);

     @Query(value = "select * from v_liste_enchere where statut=0",nativeQuery = true)
    public List<Liste_Enchere> findListe_Enchere();
}
