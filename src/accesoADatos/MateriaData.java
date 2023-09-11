package accesoADatos;

import entidades.Materia;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MateriaData {
    
    Connection con;
    
    public MateriaData() {
        con = Conexion.getConnection();
    }
    
    public void guardarMateria(Materia materia) {
        String sql= "INSERT INTO materia (nombre, anio, estado) VALUES (?,?,?)";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                materia.setIdMateria(rs.getInt("idMateria"));
                JOptionPane.showMessageDialog(null, "Materia añadida correctamente.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Materia" + ex.getMessage());
        }
    }
    
    public Materia buscarMateria(int id) {
        Materia materia = new Materia();
        String sql = "SELECT nombre, anio FROM materia WHERE idMateria = ? AND estado = 1 ";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anio"));
                materia.setActivo(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "El ID no corresponde a ninguna materia activa.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Materia" + ex.getMessage());
        }
        return materia;
    }
    
    public void modificarMateria(Materia materia) {
        String sql = "UPDATE materia SET nombre = ?, anio = ?, estado = ? WHERE idMateria = ? ";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(4, materia.getIdMateria());
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            int mostrar = ps.executeUpdate();
            if (mostrar == 1) {
                JOptionPane.showMessageDialog(null, "Materia modificada correctamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Materia" + ex.getMessage());
        }
        
    }
    
    public void eliminarMateria(int id) {
        String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ? ";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó la materia.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Materia" + ex.getMessage());
        }
    }
    
    public List<Materia> listarMaterias() {
        List materias = new ArrayList();
        String sql = "SELECT * FROM materia WHERE estado = 1";
        PreparedStatement ps;
        try {
            ps= con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anio"));
                materia.setActivo(rs.getBoolean("estado"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return materias;
    }
}
