package webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import webservice.model.Historique_Prop;
import webservice.repository.Hisorique_PropRepository;

import java.util.List;

@RestController
@CrossOrigin(origins= "*", maxAge = 3600)
@RequestMapping("/api/v1/historiqueProp")
public class Historique_PropController {
    @Autowired
    private Hisorique_PropRepository hs;

    @GetMapping("list/{nom}")
    public ResponseEntity<List<Historique_Prop>> getHistoProp(@PathVariable("nom") String nom){
        List<Historique_Prop> hr= hs.ByName(nom);
        return ResponseEntity.ok(hr);
    }

}
