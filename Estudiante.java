
/**
 * Write a description of class Estudiante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Estudiante
{
   private String Nombre;
   private String Apellido;
   private int Edad;
   private String Codigo;
   
   
   public Estudiante() {
    }

    public Estudiante(String Nombre, String Apellido, int Edad, String Codigo) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
   
   public void MostrarInformacion(){
        System.out.println("codigo: " + Codigo);
        System.out.println("Nombre: " + Nombre);
        System.out.println("Apellido: " + Apellido);
        System.out.println("Edad: " + Edad);
    }
    
}
