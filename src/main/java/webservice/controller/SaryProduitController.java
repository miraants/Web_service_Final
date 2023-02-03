package webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import webservice.exception.SaryNotFoundException;
import webservice.exception.SaryProduitNotFoundException;
import webservice.model.Rechargement;
import webservice.model.Sary;
import webservice.model.SaryProduit;
import webservice.model.Utilisateur;
import webservice.repository.SaryProduitRepository;
import webservice.repository.SaryRepository;

import java.util.List;

@RestController
@CrossOrigin(origins= "*", maxAge = 3600)
@RequestMapping("/api/v1/saryProduit")
public class SaryProduitController {

    @Autowired
    private SaryProduitRepository use;

    @GetMapping("/list")
    public ResponseEntity<List<SaryProduit>> getAllRechargement() {
        List<SaryProduit> cat= use.findAll();
        return ResponseEntity.ok(cat);
    }

    @GetMapping("/list/{id_utilisateur}")
    public ResponseEntity<List<SaryProduit>> getCategorieById(@PathVariable("id_utilisateur") String id_utilisateur){
        List<SaryProduit> cat= use.DetailId(id_utilisateur);
        return ResponseEntity.ok(cat);
    }

    @GetMapping("/listDetail/{id_utilisateur}")
    public ResponseEntity<List<SaryProduit>> getDetail(@PathVariable("id_utilisateur") Integer id_utilisateur){
        List<SaryProduit> cat= use.Detail(id_utilisateur);
        return ResponseEntity.ok(cat);
    }

}
