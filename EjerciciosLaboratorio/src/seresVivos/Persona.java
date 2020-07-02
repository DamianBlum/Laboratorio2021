package seresVivos;

public class Persona
{
    //Atributos=Nombre,Edad,DNI,Telefono,Direccion
    private String nombre;
    private String apellido;
    private int edad;
    private int DNI;


    public Persona() {
        this("Juan",15,"Antonio",44655302);
    }
    public Persona(String Nombre,String Apellido) {
        nombre= Nombre;
        edad=15;
        apellido=Apellido;
        DNI=44655302;


    }
    public Persona(String Nombre, int Edad, String Apellido, int dni) {
        nombre= Nombre;
        edad=Edad;
        apellido=Apellido;
        DNI=dni;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getDNI() {
        return DNI;
    }

    public String getApellido() { return this.apellido; }

    public int getEdad() {
        return this.edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean esMayorDeEdad(int edad) {
        //si su edad es mayor a 18
        return edad>18;
    }
    public boolean sonLaMismaPersona(int dni) {
        return this.DNI==dni;
    }

    public boolean tienenLaMismaEdad(Persona persona2) {
        //compara y devuelve si las edades son las mismas
        return this.getEdad() == persona2.getEdad();
    }
}