package curso.clases.curso_1_1.Models;

public class Persona {


   public Persona(String nombre, int edad, String sexo, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
    }
    public Persona(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    String nombre;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int edadEndias(){
        return (this.edad)*365;
    }

    int edad;
    String sexo;
    float altura;
}
