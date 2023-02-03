package webservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import webservice.model.Historique;

import java.util.List;

@Repository
public interface HistoriqueRepository extends JpaRepository<Historique, Integer> {
    @Query(value = "select * from v_historique_enchere where id_utilisateur=:id",nativeQuery = true)
    List<Historique> ById(@Param("id") Integer id);

}
