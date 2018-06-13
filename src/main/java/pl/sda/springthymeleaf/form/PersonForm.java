package pl.sda.springthymeleaf.form;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonForm {

    private String firstname;
    private String lastName;
}
