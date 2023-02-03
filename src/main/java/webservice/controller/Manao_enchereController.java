package webservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import webservice.Message;
import webservice.exception.CategorieNotFoundException;
import webservice.model.Categorie;
import webservice.model.Manao_enchere;
import webservice.model.Param;
import webservice.repository.Manao_enchereRepository;
import webservice.repository.SaryRepository;

import java.util.List;

@RestController
@CrossOrigin(origins= "*", maxAge = 3600)
@RequestMapping("/api/v1/manao_enchere")
public class Manao_enchereController {

    @Autowired
    private Manao_enchereRepository manaoEnchere;

    @Autowired
    private SaryRepository use;
    @GetMapping("/list/{id}")
    public ResponseEntity<Manao_enchere> getManaoEnchereId(@PathVariable Integer id){
        Manao_enchere r=manaoEnchere.findById(id).orElseThrow(() -> new CategorieNotFoundException(("Categorie not exist with id :" + id)));
        return ResponseEntity.ok(r);
    }
    @GetMapping("/list")
    public ResponseEntity <List<Manao_enchere>> getAllCategorie() {
        List<Manao_enchere> cat= manaoEnchere.findAll();
        return ResponseEntity.ok(cat);
    }


    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody Param c){
        try {
            manaoEnchere.save(c.getEnchere());
            for (int i = 0; i < c.getPhoto().length; i++) {
                use.save(c.getPhoto()[i]);
            }
            return new ResponseEntity(new Message<String>("success"), HttpStatus.ACCEPTED);

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }


}
