package webservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import webservice.model.Admin;

@Repository
public interface AdminRepository extends  MongoRepository<Admin, Integer> {
    public Admin findAdminByEmailAndMdp(String email,String mdp);

}
