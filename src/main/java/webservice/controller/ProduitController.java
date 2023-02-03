package webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import webservice.Message;
import webservice.exception.CategorieNotFoundException;
import webservice.model.Produit;
import webservice.model.Rechargement;
import webservice.model.Sary;
import webservice.model.Utilisateur;
import webservice.repository.ProduitRepository;
import webservice.repository.RechargementRepository;
import webservice.repository.SaryRepository;

import java.util.List;
@RestController
@CrossOrigin(origins= "*", maxAge = 3600)
@RequestMapping("/api/v1/produit")
public class ProduitController {
    @Autowired
    private ProduitRepository produitR;


    @GetMapping("/list")
    public ResponseEntity<List<Produit>> getAllProduit() {
        List<Produit> cat = produitR.findAll();
        return ResponseEntity.ok(cat);
    }

    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody Produit c) {
        try {
            produitR.save(c);

            return new ResponseEntity(new Message<String>("success"), HttpStatus.ACCEPTED);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
