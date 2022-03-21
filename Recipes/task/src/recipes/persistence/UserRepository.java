package recipes.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import recipes.businesslayer.User;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

  List<User> findByEmailIgnoreCase (String email);

  List<User> findByEmail (String email);


}
