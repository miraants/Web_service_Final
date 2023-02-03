package webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import webservice.Message;
import webservice.exception.CategorieNotFoundException;
import webservice.exception.SaryNotFoundException;
import webservice.model.Categorie;
import webservice.model.Produit;
import webservice.model.Sary;
import webservice.model.Utilisateur;
import webservice.repository.SaryRepository;
import webservice.repository.UtilisateurRepository;

import java.util.List;

@RestController
@CrossOrigin(origins= "*", maxAge = 3600)
@RequestMapping("/api/v1/sary")
public class SaryController {
    @Autowired
    private SaryRepository use;

    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody Sary[] c){
        try {
            for(int i=0;i<c.length;i++) {
                use.save(c[i]);
            }
            return new ResponseEntity(new Message<String>("success"), HttpStatus.ACCEPTED);

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<Sary> getCategorieById(@PathVariable Integer id){
        Sary r=use.findById(id).orElseThrow(() -> new SaryNotFoundException(("Sary not exist with id :" + id)));
        return ResponseEntity.ok(r);
    }
}
