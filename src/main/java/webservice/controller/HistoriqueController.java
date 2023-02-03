package webservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import webservice.model.Categorie;
import webservice.model.Historique;
import webservice.repository.HistoriqueRepository;
import webservice.exception.CategorieNotFoundException;
import org.springframework.http.ResponseEntity;
import java.util.List;

@RestController
@CrossOrigin(origins= "*", maxAge = 3600)
@RequestMapping("/api/v1/historique")
public class HistoriqueController {

    @Autowired
    private HistoriqueRepository historiqueRepository;

   /* @GetMapping("/liste/{id_utilisateur}")
    public ArrayList<Historique> getHistorique(@PathVariable Integer id_utilisateur) throws SQLException {
        ArrayList<Historique> historiques = new ArrayList<>();
        ConnectDB postgreSQL = TpWsApplication.getPostgreSQL();
        Connection conn = null;
        PreparedStatement stmt=null;
        try {
            conn = postgreSQL.getConnection();
            String sql = "select * from v_historique_enchere where id_utilisateur="+id_utilisateur;
            stmt = conn.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();
            while(resultSet.next()) {
                Historique rec = new Historique(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4));
                historiques.add(rec);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            if (stmt!=null) stmt.close();
        }
        return historiques;
    }

    @GetMapping("/liste")
    public ArrayList<Historique> getHistorique() throws SQLException {
        ArrayList<Historique> historiques = new ArrayList<>();
        ConnectDB postgreSQL = TpWsApplication.getPostgreSQL();
        Connection conn = null;
        PreparedStatement stmt=null;
        try {
            conn = postgreSQL.getConnection();
            String sql = "select * from v_historique_enchere";
            stmt = conn.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();
            while(resultSet.next()) {
                Historique rec = new Historique(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4));
                historiques.add(rec);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            if (stmt!=null) stmt.close();
        }
        return historiques;
    }*/

    @GetMapping("/list/{id}")
    public ResponseEntity<List<Historique>> getHistoriqueById(@PathVariable("id") Integer id_utlisateur){
        List<Historique> r=historiqueRepository.ById(id_utlisateur);
        return ResponseEntity.ok(r);
    }

    @GetMapping("/list")
    public ResponseEntity <List<Historique>> getAllCategorie() {
        List<Historique> cat= historiqueRepository.findAll();
        return ResponseEntity.ok(cat);
    }


}
