package recipes.businesslayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recipes.persistence.UserRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

  public User saveToDb(User toSave) {
        return  userRepository.save(toSave);
  }


    public List<User>  findUserByEmail(String email){
        return userRepository.findByEmail(email);
  };

}
