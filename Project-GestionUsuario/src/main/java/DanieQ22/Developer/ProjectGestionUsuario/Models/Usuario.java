package DanieQ22.Developer.ProjectGestionUsuario.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
public class Usuario {

    private Integer id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;



}
