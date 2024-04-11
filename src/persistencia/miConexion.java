package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;  // 
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class miConexion{
    private String url;
    private String usuario;    // root
    private String password;   // ""
    
    private static Connection conexion = null;  // lo que importa  
    
    public miConexion(String url, String usr, String pass){     
        this.url= url;  // "jdbc:mariabd://localhost/universidad"
        usuario=usr;
        password=pass;
    }
      
    public Connection buscarConexion(){
        if (conexion==null) {  // si es la primera vez
            try {
                //cargamos las clases de mariadb que implementan JDBC
                Class.forName("org.mariadb.jdbc.Driver");
                conexion = DriverManager.getConnection(url, usuario, password);
            } catch (SQLException | ClassNotFoundException ex) {  // si me olvide de importar la libreria // error al cargar los drivers
                Logger.getLogger(miConexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return conexion; // retorna la conexion establecida
    }
  }
