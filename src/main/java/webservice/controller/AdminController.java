package webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import webservice.Message;
import webservice.exception.ResourceNotFoundException;
import webservice.model.Admin;
import webservice.repository.AdminRepository;
import webservice.repository.RechargementRepository;

@RestController
@CrossOrigin(origins= "*", maxAge = 3600)
@RequestMapping("/api/v1/admin")
public class AdminController {
    @Autowired
    private RechargementRepository rechargementRepository;
    @Autowired
    private AdminRepository admin;
    public ResponseEntity find(int idadmin)
    {
        Admin a= admin.findById(idadmin).orElseThrow(() -> new ResourceNotFoundException("Rechargement not exist with id: " + idadmin));
        return ResponseEntity.ok(a);
    }

    @PostMapping("/insert")
    public ResponseEntity<String> insert(@RequestBody Admin c) {
        try {
            admin.save(c);

            return new ResponseEntity(new Message<String>("success"), HttpStatus.ACCEPTED);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /*@PutMapping("{id}")
    public ResponseEntity<Rechargement> updateRecharge(@PathVariable Integer id){
        Rechargement updateRechargement= rechargementRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Rechargement not exist with id: " + id));

        updateRechargement.setStatut(1);

        rechargementRepository.save(updateRechargement);
        return ResponseEntity.ok(updateRechargement);

    }
    @PutMapping("{id}")
    public ResponseEntity<Utilisateur> updateUser(@PathVariable long id,int a){
        Utilisateur updateUtilisateur= utilisateurRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Rechargement not exist with id: " + id));
        Rechargement updateRechargement= rechargementRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Rechargement not exist with id: " + id));

        updateUtilisateur.setValeur(updateUtilisateur.getValeur()+updateRechargement.getValeur());

        utilisateurRepository.save(updateUtilisateur);
        return ResponseEntity.ok(updateUtilisateur);
    }*/


}
