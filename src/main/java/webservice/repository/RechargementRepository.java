package webservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import webservice.model.Rechargement;

@Repository
public interface RechargementRepository  extends JpaRepository<Rechargement, Integer> {
    @Query("select c from Rechargement c where c.id_utilisateur=:id order by c.id_rechargement desc limit 1")
    public Rechargement findTopById_utilisateurOrderById_rechargementDesc(@Param("id") int id_user);
}
