package curso.clases.curso_1_1.Models;

import java.io.Serializable;

public class Usuario implements Serializable {
    String nombre,password;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Usuario(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }
}
