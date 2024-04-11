package vistas;

import entidades.Mascota;
import persistencia.MascotaData;
import persistencia.miConexion;

public class MainClass {
    private MascotaData mascotaData;
    private miConexion conexion;
   
    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
       
        Mascota masco = new Mascota("Garfield", "Gato Naranja",'M',"Es arisco",true);    //  1 crear un objeto
        new MainClass().conectar(masco);                                     
        System.out.println("Mascota "+ masco.getApodo() + " guardada con exito");
    } 
    
    void conectar(Mascota mascota){
           //conexionS = conexionS.buscarConexion();
          
           conexion = new miConexion("jdbc:mysql://localhost/fielpet", "root", "");   //  2 conectarme a la base
           mascotaData = new MascotaData(conexion);
          // mascotaData.guardarMascota(mascota);                                         //  3 impactar
           System.out.println("Trae: "+ mascotaData.buscarMascota(6));
    }
}
 
        