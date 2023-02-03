package webservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import webservice.Message;
import webservice.model.Categorie;
import webservice.model.Utilisateur;
import webservice.repository.UtilisateurRepository;

import java.util.List;

@RestController
@CrossOrigin(origins= "*", maxAge = 3600)
@RequestMapping("/api/v1/utilisateur")
public class UtilisateurController {
    @Autowired
    private UtilisateurRepository use;


   /* @GetMapping("/login/{email}/{mdp}")
    public Utilisateur checkCandidat(@PathVariable String email,@PathVariable String mdp) throws SQLException {
        Utilisateur utilisateur =null;

        ConnectDB postgreSQL = TpWsApplication.getPostgreSQL();
        Connection conn = null;
        PreparedStatement stmt=null;
        try {
            conn = postgreSQL.getConnection();
            String sql = "select * from utilisateur where email='"+email+"' and mdp='"+mdp+"'";
            stmt = conn.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();
            while(resultSet.next()) {
                utilisateur= new Utilisateur(resultSet.getInt(1), resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getDouble(5));

            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            if (stmt!=null) stmt.close();
        }
        return utilisateur;
    }
    @GetMapping("/list")
    public ArrayList<Utilisateur> getUser() throws SQLException {
        ArrayList<Utilisateur> utilisateur = new ArrayList<>();
        ConnectDB postgreSQL = TpWsApplication.getPostgreSQL();
        Connection conn = null;
        PreparedStatement stmt=null;
        try {
            conn = postgreSQL.getConnection();
            String sql = "select * from utilisateur";
            stmt = conn.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();
            while(resultSet.next()) {
                Utilisateur rec = new Utilisateur(resultSet.getInt(1), resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getDouble(5));
                utilisateur.add(rec);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            if (stmt!=null) stmt.close();
        }
        return utilisateur;
    }*/
   @PostMapping("/login")
    public ResponseEntity<Utilisateur> find(@RequestBody Utilisateur u)
    {

        Utilisateur a= use.findUtilisateurByEmailAndMdp(u.getEmail(),u.getMdp());
        return ResponseEntity.ok(a);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Utilisateur>> getAllUser() {
        List<Utilisateur> cat= use.findAll();
        return ResponseEntity.ok(cat);
    }

    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody Utilisateur c){
        try {
        use.save(c);
        return new ResponseEntity(new Message<String>("success"), HttpStatus.ACCEPTED);

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
