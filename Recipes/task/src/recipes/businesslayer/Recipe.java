package recipes.businesslayer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="recipes")
public class Recipe {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @JsonIgnore
    long id;

    @NotEmpty
    @NotBlank
    @Column(name = "name")
    private String name;

    @UpdateTimestamp
    private LocalDateTime date;

    @NotEmpty
    @NotBlank
    @Column(name = "category")
    private String category;

    @NotEmpty
    @NotBlank
    @Column(name = "description")
    private String description;


    @NotEmpty
    @Size(min = 1)
    @ElementCollection
    private List<String> ingredients = new ArrayList<String>();

    @NotEmpty
    @Size(min = 1)
    @ElementCollection
    private List<String> directions = new ArrayList<String>();

    @JsonIgnore
    private String email;

}