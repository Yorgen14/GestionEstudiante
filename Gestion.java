import java.util.ArrayList;

/**
 * Write a description of class Sistema here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gestion {
private Estudiante estudiante1;
private Estudiante estudiante2;  
private Estudiante estudiante3;      
ArrayList <Estudiante> estudiantes = new ArrayList();
public Gestion(Estudiante estudio) {
         this.estudiantes = new ArrayList<Estudiante>();
        estudiantes.add(estudio);
    }
 public ArrayList<Estudiante> getAyudas() {
        return estudiantes;
    }
  public void setAyudas(ArrayList<Estudiante> ayudas) {
        this.estudiantes = estudiantes;
    }

   public void addEstudiante(Estudiante estudio){
       estudiantes.add(estudio);
       
   }   
     public int getCantidadEstudiantes (){
       return this.estudiantes.size();
   }
   
public void BuscarEstudiante(int CodigoEstudiante){
  if(estudiante1.getCodigo()=="1"){
       estudiante1.MostrarInformacion();
  }else if(estudiante2.getCodigo()=="2"){
       estudiante2.MostrarInformacion();
  }else if(estudiante3.getCodigo()=="3"){
       estudiante3.MostrarInformacion();
}

}
}
