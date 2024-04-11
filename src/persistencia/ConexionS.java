package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;  
import java.sql.SQLException;

public class ConexionS{
    private static String url = "jdbc:mysql://localhost/universidad";
    private static String usuario = "root";
    private static String password = "";
    
    private static ConexionS conexion = null;  // patron Singlenton
    
    private ConexionS(){     // debe estar escondido
        try {
                Class.forName("org.mariadb.jdbc.Driver");  //cargamos las clases de mariadb que implementan JDBC
        } catch (ClassNotFoundException ex) {            // si me olvide de importar la libreria // error al cargar los drivers
                System.out.println("Error NO ENCUENTRO LA LIBRERIA JAR!" + ex);
        }
    }
      
    public static Connection buscarConexion(){
        Connection conn = null;
        if (conexion==null) {  // si es la primera vez
             conexion = new ConexionS(); 
        }
        try {
            conn = DriverManager.getConnection(url, usuario, password);  //recein aca intentamos conectarnos
        } catch (SQLException ex) {
            System.out.println("Error de conexion: "+ ex);
        }
        return conn; // retorna la conexion establecida
    }
  }
