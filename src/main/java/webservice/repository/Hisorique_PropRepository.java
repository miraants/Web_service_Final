package webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import webservice.model.Historique_Prop;

import java.util.List;

@Repository
public interface Hisorique_PropRepository extends JpaRepository<Historique_Prop, String> {
    @Query(value = "select * from v_liste_enchere where nom=:noms",nativeQuery = true)
    List<Historique_Prop> ByName(@Param("noms") String noms);
}
