package webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import webservice.Message;
import webservice.exception.CategorieNotFoundException;
import webservice.exception.ParticipantEnchereNotFoundException;
import webservice.model.Participant_enchere;
import webservice.model.Produit;
import webservice.repository.ParticipantEnchereRepository;

import java.util.List;

@RestController
@CrossOrigin(origins= "*", maxAge = 3600)
@RequestMapping("/api/v1/participant_enchere")

public class ParticipantEnchereController {
    @Autowired
    private ParticipantEnchereRepository pe;

    @GetMapping("/list/{id_user}")
    public ResponseEntity<Participant_enchere> getParticipant(@PathVariable Integer id){
        Participant_enchere r=pe.findById(id).orElseThrow(() -> new ParticipantEnchereNotFoundException(("participation not exist with id :" + id)));
        return ResponseEntity.ok(r);
    }

    @GetMapping("/list")
    public ResponseEntity <List<Participant_enchere>> getAllParticipant() {
        List<Participant_enchere> cat= pe.findAll();
        return ResponseEntity.ok(cat);
    }

    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody Participant_enchere c) {
        try {
            pe.save(c);

            return new ResponseEntity(new Message<String>("success"), HttpStatus.ACCEPTED);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
