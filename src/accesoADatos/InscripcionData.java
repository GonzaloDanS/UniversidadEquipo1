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
        matData = new MateriaData();
        aluData = new AlumnoData();
        con = Conexion.getConnection();

    }

    public void guardarInscripcion(Inscripcion insc) {
        String sql = "INSERT INTO inscripcion VALUES (null, ?, ?, ?)";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getIdAlumno());
            ps.setInt(3, insc.getIdMateria());
            int exito = ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                insc.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno inscripto correctamente.");
            }
            ps.close();
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "Alumno ya inscrito en esa materia. - " + ex.getMessage());
            } else {
                JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla inscripción - " + ex.getMessage());
            }
        }

    }

    public List<Inscripcion> obtenerInscripciones() {
        List Inscripciones = new ArrayList();
        String sql = "SELECT * FROM inscripcion";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                inscripcion.setAlumno(aluData.buscarAlumno(rs.getInt("idAlumno")));
                inscripcion.setMateria(matData.buscarMateria(rs.getInt("idMateria")));
                inscripcion.setNota(rs.getDouble("nota"));
                Inscripciones.add(inscripcion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla inscripcion. " + ex.getMessage());
        }
        return Inscripciones;
    }

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id) {
        List Inscripciones = new ArrayList();
        String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                inscripcion.setAlumno(aluData.buscarAlumno(rs.getInt("idAlumno")));
                inscripcion.setMateria(matData.buscarMateriaTODO(rs.getInt("idMateria")));
                inscripcion.setNota(rs.getDouble("nota"));
                Inscripciones.add(inscripcion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla inscripcion. " + ex.getMessage());
        }
        return Inscripciones;
    }

    public List<Materia> obtenerMateriasCursadas(int id) {
        List<Materia> materias = new ArrayList<>();
        try {
            String sql = "SELECT inscripcion.idMateria, nombre, anio FROM inscripcion, materia WHERE inscripcion.idMateria = materia.idMateria AND materia.estado = 1 AND inscripcion.idAlumno = ? ";
            PreparedStatement ps;
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anio"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla inscripcion. " + ex.getMessage());
        }
        return materias;
    }

    public List<Materia> obtenerMateriasNOCursadas(int id) {
        List<Materia> materias = new ArrayList<>();
        try {
            String sql = "SELECT * FROM materia WHERE estado = 1 AND idMateria NOT IN (SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";
            PreparedStatement ps;
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anio"));
                materia.setActivo(rs.getBoolean("estado"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla inscripcion. " + ex.getMessage());
        }
        return materias;
    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
        String sql = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int mostrar = ps.executeUpdate();
            if (mostrar == 1) {
                JOptionPane.showMessageDialog(null, "Inscripción borrada exitosamente.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla inscripcion. " + ex.getMessage());
        }

    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno= ? AND idMateria = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int mostrar = ps.executeUpdate();
//            if (mostrar == 1) {
//                JOptionPane.showMessageDialog(null, "Nota actualizada.");
//            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla inscripcion. " + ex.getMessage());
        }
    }

    public List<Alumno> obtenerAlumnosPorMateria(int idMateria) {
    List<Alumno> alumnos = new ArrayList<>();
        try {
            String sql = "SELECT inscripcion.idAlumno, dni, apellido, nombre, fechaNacimiento, estado FROM inscripcion, alumno WHERE inscripcion.idAlumno = alumno.idAlumno AND inscripcion.idMateria = ? ";
            PreparedStatement ps;
            ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(rs.getBoolean("estado"));
                alumnos.add(alumno);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla inscripcion. " + ex.getMessage());
        }
        return alumnos;
    }
}
