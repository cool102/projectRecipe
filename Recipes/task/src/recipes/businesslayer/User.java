package recipes.businesslayer;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {

    @Id
    @NotEmpty
    @NotBlank
    @Pattern(regexp = ".+@.+\\..+")
    private String email;

    @NotEmpty
    @NotBlank
    @Size(min=8)
    private String password;

        public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }



    public User(String email, String password, String role) {
        this.email = email;
        this.password = password;

    }

    public User() {
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
