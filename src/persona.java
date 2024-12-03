public class persona {
    public  String getDni() {
        return dni;
    }

    public  String getNombre() {
        return nombre;
    }

    public  String getApellidos() {
        return apellidos;
    }

    public  int getEdad() {
        return edad;
    }

    private  String dni;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {

        if (edad < 0) {
            System.err.println("tiene que ser mayor que 0");
        } else {
            this.edad = edad;
        }
    }

    public persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    private  String nombre;
    private  String apellidos;
    private int edad;

    public boolean esMayorEdad() {
        int edad = this.edad;
        if (edad < 18) {
            return false;
        } else {
            return true;
        }
    }

    public boolean esJUbilado() {
        int edad = this.edad;
        if (edad < 65) {
            return false;
        } else {
            return true;
        }
    }

    public int diferenciaEdad(persona p) {
        int diferencia = this.edad - p.edad;
        return diferencia;

    }

    @Override
    public String toString() {
        return "Persona{DNI='" + dni + "', Nombre='" + nombre + "', Apellidos='" + apellidos + "', Edad=" + edad + "}";
    }
}
