public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("carlos");
        persona.setEdad(55);
        persona.setTelefono(53265612);

        System.out.println("La persona es: " + persona.getNombre() + " de " + persona.getEdad() + " años y su telefono es: " + persona.getTelefono());





    }
}



class Persona{
    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getTelefono(){
        return this.telefono;
    }

}