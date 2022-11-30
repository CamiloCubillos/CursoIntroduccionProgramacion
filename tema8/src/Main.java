import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Persona p = new Persona();

        p.setEdad(30);
        p.setNombre("Juan Carlos");
        p.setTelefono("323 232 32 32");

        System.out.println("El nombre es: "+p.getNombre());
        System.out.println("La edad es: "+p.getEdad());
        System.out.println("El telefono es: "+p.getTelefono());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }
}