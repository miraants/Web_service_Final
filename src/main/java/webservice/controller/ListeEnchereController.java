package webservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import webservice.model.Liste_Enchere;
import webservice.model.Utilisateur;
import webservice.repository.Liste_EnchereRepository;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/liste_enchere")
public class ListeEnchereController {

    @Autowired
    private Liste_EnchereRepository listeEnchere;

   /*  @GetMapping
   public ArrayList<Liste_Enchere> getManao_enchere() throws SQLException {
        ArrayList<Liste_Enchere> liste_enchere = new ArrayList<>();
        ConnectDB postgreSQL = TpWsApplication.getPostgreSQL();
        Connection conn = null;
        PreparedStatement stmt=null;
        try {
            conn = postgreSQL.getConnection();
            String sql = "select * from v_liste_enchere";
            stmt = conn.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();
            while(resultSet.next()) {
                Liste_Enchere rec = new Liste_Enchere(resultSet.getString(1),resultSet.getString(2),resultSet.getDouble(3),resultSet.getString(4), resultSet.getDate(5),resultSet.getInt(6),resultSet.getDouble(7));
                liste_enchere.add(rec);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            if (stmt!=null) stmt.close();
        }
        return liste_enchere;
    }*/

    @GetMapping("/list")
    public ResponseEntity<List<Liste_Enchere>> getAllManaoEnchere() {
        List<Liste_Enchere> cat= listeEnchere.findAll();
        return ResponseEntity.ok(cat);
    }

    @GetMapping("/listeByNom/{nom}")
    public ResponseEntity<List<Liste_Enchere>> find(@PathVariable(name = "nom") String nom)
    {
        List<Liste_Enchere> cat= (List<Liste_Enchere>) listeEnchere.findListe_EnchereByNom(nom);
        return ResponseEntity.ok(cat);
    }
    @GetMapping("select/{nom}")
    public ResponseEntity selectEnchere(@PathVariable("nom") String nom_produit){
        return ResponseEntity.ok(listeEnchere.selectEnchere(nom_produit));
    }


}
