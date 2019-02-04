package mx.conacyt.cgtic.dashboard.repo;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.conacyt.cgtic.dashboard.model.Customer;
import javax.persistence.Query;

@Repository
public class ExtraRepository {
    @Autowired
    EntityManager entityManager;
    
    /*@Autowired
    JdbcTemplate jdbcTemplate;
    
    final String SELECT_BY_ID = "select message from sys_message where id = ?";

    public String getMessageById(long id) {
        return this.jdbcTemplate.queryForObject(SELECT_BY_ID, String.class, new Object[] { id });
    }*/
    
    public List<Customer> getPage(int pageNumber, int pageSize) {
        Query query = entityManager.createQuery("From CUSTOMER");
        query.setFirstResult((pageNumber-1) * pageSize); 
        query.setMaxResults(pageSize);
        List<Customer> list = query.getResultList();
        return list;
    }
}
