package accesoADatos;

import entidades.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class InscripcionData {
    private Connection con;
    private MateriaData matData;
    private AlumnoData aluData;
    
    public InscripcionData() {
        con = Conexion.getConnection();
    }
    
    public void guardarInscripcion (Inscripcion insc){
        String sql = "INSERT INTO inscripcion (nota, idAlumno, idMateria) VALUES (?, ?, ?)";
        
        PreparedStatement ps;
        
        try {
            ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, insc.getNota());
            ps.setInt (2, insc.getIdAlumno());
            ps.setInt (3, insc.getIdMateria());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()){
                insc.setIdInscripcion(rs.getInt("idInscripcion"));
                JOptionPane.showMessageDialog(null, "Alumno inscripto correctamente.");
            }
            ps.close();
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla inscripción");
        }
        
    }
    
/*    public List<Inscripcion> obtenerInscripciones(){
        List Inscripciones = new ArrayList();
        
        String sql = "SELECT * FROM inscripcion";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                Inscripcion inscripcion = new Inscripcion();
                
                inscripcion.setIdInscripcion(rs.getInt("idIncripcion"));
                inscripcion.
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id){
    
    }
    
    public List<Materia> obtenerMateriasCursadas (int id){
    
    }
    
    public List<Materia> obtenerMateriasNOCursadas (int id){
    
    }
    
    public void borrarInscripcionMateriaAlumno (int idAlumno, idMateria){
    
    }
    
    public void actualizarNota (int idAlumno, int idMateria, double nota){
    
    }
    
    public List<Alumno> obtenerAlumnosPorMateria(int idMateria){
    
    }
    */
}
