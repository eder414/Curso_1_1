package curso.clases.curso_1_1.Models;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona{

    String IdProfesor;

    public String getIdProfesor() {
        return IdProfesor;
    }

    public void setIdProfesor(String idProfesor) {
        IdProfesor = idProfesor;
    }

    public List<String> getSalones() {
        return salones;
    }

    public void setSalones() {
        List<String> salones = new ArrayList<String>();
        salones.add("1A");
        salones.add("2B");
        salones.add("3C");
        salones.add("1B");
        salones.add("1C");
        this.salones = salones;
    }

    public int edadEndias(){
        return (this.edad)*366;
    }

    List<String> salones =  new ArrayList<String>();
    public Profesor(String nombre,int edad, String sexo, float altura) {
        super(nombre, edad,sexo, altura);
    }
}
