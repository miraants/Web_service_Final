package webservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webservice.model.Participant_enchere;

@Repository
public interface ParticipantEnchereRepository extends JpaRepository<Participant_enchere, Integer> {
}
