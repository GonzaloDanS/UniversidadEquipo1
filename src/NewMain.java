
import accesoADatos.AlumnoData;
import accesoADatos.Conexion;
import accesoADatos.InscripcionData;
import accesoADatos.MateriaData;
import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import java.sql.*;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NewMain {

    
    public static void main(String[] args) {
        Connection con = Conexion.getConnection();
        AlumnoData alu = new AlumnoData();
        MateriaData mat = new MateriaData();
        InscripcionData ins = new InscripcionData();
        Alumno pau = new Alumno(123,"Cortez","Paula",LocalDate.parse("1993-09-28"),true);
        Alumno maca = new Alumno(456,"Noya","Macarena",LocalDate.parse("1989-05-12"),true);
        Alumno flor = new Alumno(789,"Vaca Cardoso","Florencia",LocalDate.parse("1996-02-11"),true);
        Alumno gon = new Alumno (741,"Sosa","Gonzalo",LocalDate.parse("1998-11-25"),true);
        Materia matem=new Materia("Matematica",1,true);
        Materia bio=new Materia("Biologia",2,true);
        Materia ing=new Materia("Ingles",3,true);
        
        System.out.println(alu.buscarAlumno(2));
//        alu.guardarAlumno(pau);
//        alu.guardarAlumno(maca);
//        alu.guardarAlumno(flor);
//        alu.guardarAlumno(gon);
//        mat.guardarMateria(matem);
//        mat.guardarMateria(bio);
//        mat.guardarMateria(ing);
//        System.out.println(alu.buscarAlumno(23)+"\n");
//        System.out.println(mat.buscarMateria(10)+"\n");
//        System.out.println(mat.buscarMateria(12));
        //Inscripcion i1= new Inscripcion(alu.buscarAlumno(3),mat.buscarMateria(3),8);
        //Inscripcion i5= new Inscripcion(alu.buscarAlumno(2),mat.buscarMateria(2),8);
//        Inscripcion i2= new Inscripcion(maca,bio,7.5);
//        Inscripcion i3= new Inscripcion(gon,matem,8);
//        Inscripcion i4= new Inscripcion(flor,ing,8);
        //ins.guardarInscripcion(i1);
//        ins.guardarInscripcion(i2);
//        ins.guardarInscripcion(i3);
//        ins.guardarInscripcion(i4);
        //ins.guardarInscripcion(i5);
    }
    
}