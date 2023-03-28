public class persona implements Comparable {
    private String nombre;
    private int edad;
    private String apellidos;


    public String getnombre() {
        return nombre;
    }

    public int getedad() {
        return edad;
    }

    public String getapellidos() {
        return apellidos;
    }

    //Setters
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public void setedad(int edad) {
        this.edad = edad;
    }

    public void setapellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public persona(String nombre) {
        this.nombre = nombre;
    }

    public persona() {
    }

    public persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    @Override
    public String toString() {
        return this.nombre;
    }


    @Override
    public int compareTo(Object other) {
        persona otherPersona = (persona) other;
        return this.nombre.compareTo(otherPersona.nombre);
    }
}
