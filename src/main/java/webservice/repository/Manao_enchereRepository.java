package webservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import webservice.model.Manao_enchere;
import webservice.model.Rechargement;

public interface Manao_enchereRepository extends JpaRepository<Manao_enchere, Integer> {

}
