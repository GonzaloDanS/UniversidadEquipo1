package accesoADatos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
    private static final String URL="jdbc:mariadb://localhost:";
    private static final String PUERTO="3306/";
    private static final String DB="universidadGrupo1";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection con;
    
    private Conexion(){}
    
    public static Connection getConnection(){
        if (con==null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                con = DriverManager.getConnection(URL+PUERTO+DB, USUARIO, PASSWORD);
                
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los drivers - "+ex.getLocalizedMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos - "+ex.getLocalizedMessage());
            }
        }
        return con;
    }
}
