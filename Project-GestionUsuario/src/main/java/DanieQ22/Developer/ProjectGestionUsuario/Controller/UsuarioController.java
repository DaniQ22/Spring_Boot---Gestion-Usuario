package DanieQ22.Developer.ProjectGestionUsuario.Controller;

import DanieQ22.Developer.ProjectGestionUsuario.Models.Usuario;
import org.apache.catalina.authenticator.SavedRequest;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
    List<Usuario> users = new ArrayList<>();

    @GetMapping("/api/usuarios")
    public List<Usuario> listarUsuario() {

        Usuario usuario = new Usuario();
        Usuario usuario2 = new Usuario();
        List<Usuario> users = new ArrayList<>();

        usuario.setId(1005438555);
        usuario.setNombre("Daniel Jose");
        usuario.setApellido("Quiñonez Montes");
        usuario.setTelefono("3215218780");
        usuario.setEmail("Daniel.jose1999@Outlook.com");

        usuario2.setId(92257554);
        usuario2.setNombre("Ernesto Fabio");
        usuario2.setApellido("Guevara Mendez");
        usuario2.setTelefono("3215218780");
        usuario2.setEmail("Daniel.jose1999@Outlook.com");
        users.add(usuario);
        users.add(usuario2);
        return users;
    }

    @DeleteMapping("/api/usuario/{id}")
    public void eliminarUsuario(@PathVariable String id) {
        for (Usuario user : users){
            if (user.getId().equals(id)) {
                users.remove(user);
            }
        }
    }
    @PostMapping("/api/usuario")
    public void crearUsuario(@RequestBody Usuario usuario){
        users.add(usuario);
    }

}

