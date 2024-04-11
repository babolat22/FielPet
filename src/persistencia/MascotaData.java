package persistencia;

import entidades.Mascota;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MascotaData{
    private Connection con = null;
    
    public MascotaData(miConexion conexion){
        this.con = conexion.buscarConexion();
    }
    
    public void guardarMascota(Mascota m){    // obj mascota sin id valido
        String query = "INSERT INTO mascota(apodo, raza, sexo, obs, activo) VALUES (?,?,?,?,?)";  //1
        
        try {
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS); //2
            ps.setString(1, m.getApodo());
            ps.setString(2, m.getRaza());
            ps.setString(3, String.valueOf(m.getSexo()));
            ps.setString(4, m.getObs());
            ps.setBoolean(5, m.getActivo());
            ps.executeUpdate();     // 3
           
            ResultSet rs = ps.getGeneratedKeys();  // recupero y asigno
            if(rs.next())
                m.setId(rs.getInt(1)); //claveGenerada 
            else
                System.out.println("No se pudo tener la claveGenerada");
            ps.close();
            System.out.println("Guardado!");
        } catch (SQLException ex) {
            Logger.getLogger(MascotaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }   // INSERT INTO
    
    public Mascota buscarMascota(int id){
      Mascota m= null; char []letra;
      String sql = "SELECT * FROM mascota WHERE id= ?";  //1
      
      PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);    // 2
            ps.setInt(1, id);
            ResultSet rs= ps.executeQuery();  //3
            while (rs.next()) {  // 4 armo el objeto
                m=new Mascota();
                letra = rs.getString("sexo").toCharArray();
                m.setId(rs.getInt("id"));
                m.setApodo(rs.getString("apodo"));
                m.setRaza(rs.getString("raza"));
                m.setSexo(letra[0]);
                m.setObs(rs.getString("obs"));
                m.setActivo(rs.getBoolean("activo"));
            }
            ps.close(); // 5
            
        } catch (SQLException ex) {
            Logger.getLogger(MascotaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return m; 
    }  // SELECT 1 MASCOTA
    
    public List<Mascota> listarMascotas(){
        Mascota m= null; char []letra;
        List<Mascota> mascotas = new ArrayList<>();     
        String query = "SELECT * FROM mascota";  // 1
        try {
            PreparedStatement ps = con.prepareStatement(query); //2
            ResultSet rs = ps.executeQuery();  //3
            while(rs.next()){     //4
                letra = rs.getString("sexo").toCharArray();
                m=new Mascota();
                m.setId(rs.getInt("id"));
                m.setApodo(rs.getString("apodo"));
                m.setRaza(rs.getString("raza"));
                m.setSexo(letra[0]);
                m.setObs(rs.getString("obs"));
                m.setActivo(rs.getBoolean("activo"));
                mascotas.add(m);
            }
            ps.close();   // 5
            
        } catch (SQLException ex) {
            Logger.getLogger(MascotaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return mascotas;
    } // SELECT *
    
     
    
    public Mascota actualizarMascota(Mascota m){
        String sql = "UPDATE mascota SET apodo=?, raza=?, sexo=?, obs=?, activo=? WHERE id=?";  //1
        try {
           PreparedStatement ps = con.prepareStatement(sql);    // 2
            ps.setString(1, m.getApodo());
            ps.setString(2, m.getRaza());
            ps.setString(3, String.valueOf(m.getSexo()));
            ps.setString(4, m.getObs());
            ps.setBoolean(5, m.getActivo());
            ps.setInt(6, m.getId());
            ps.executeUpdate();     // 3
            System.out.println("Actualizado!");
            ps.close(); // 5
            
        } catch (SQLException ex) {
            Logger.getLogger(MascotaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return m; 
    }  
    
     public void deshabilitarMascota(int id, Boolean marca){   // borrado logico
        String sql = "UPDATE mascota SET activo=? WHERE id=?";  //1
        try {
            PreparedStatement ps = con.prepareStatement(sql);    // 2
            ps.setBoolean(1, marca);
            ps.setInt(2, id);
            ps.executeUpdate();     // 3
            System.out.println("DESHABILITADA!");
            ps.close(); // 4
            
        } catch (SQLException ex) {
            Logger.getLogger(MascotaData.class.getName()).log(Level.SEVERE, null, ex);
        }         
    }  
     
    public void borrarMascota(int id){     // borrado fisico/real
        String sql = "DELETE FROM mascota WHERE id=?";  //1
        try {
           PreparedStatement ps = con.prepareStatement(sql);    // 2
            ps.setInt(1, id);
            ps.executeUpdate();     // 3
            System.out.println("Eliminada con exito!");
            ps.close(); // 4
        } catch (SQLException ex) {
            Logger.getLogger(MascotaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
} 

 
