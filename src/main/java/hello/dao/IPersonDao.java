package hello.dao;

import hello.model.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IPersonDao extends CrudRepository<Person, Long> {
    List<Person> findByLastName(String lastName);
}
