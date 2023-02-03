package webservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webservice.model.Utilisateur;

@Repository

public interface UtilisateurRepository  extends JpaRepository<Utilisateur, Integer> {
    public Utilisateur findUtilisateurByEmailAndMdp(String email,String mdp);
}
