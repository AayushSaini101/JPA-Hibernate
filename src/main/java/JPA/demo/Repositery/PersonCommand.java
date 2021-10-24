package JPA.demo.Repositery;

import JPA.demo.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;


public interface PersonCommand extends JpaRepository<Person,Integer> {
    @Transactional
    @Modifying
    @Query(value = "delete from Person  where id=:id",nativeQuery = true)
    public void delete(int id);


}
