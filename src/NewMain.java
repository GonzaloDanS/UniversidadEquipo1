
import accesoADatos.AlumnoData;
import accesoADatos.Conexion;
import accesoADatos.InscripcionData;
import accesoADatos.MateriaData;
import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import java.sql.*;
import java.time.LocalDate;

public class NewMain {

    
    public static void main(String[] args) {
        Connection con = Conexion.getConnection();
        AlumnoData alu = new AlumnoData();
        MateriaData mat = new MateriaData();
        InscripcionData ins = new InscripcionData();
        Alumno pau = new Alumno(123,"Cortez","Paula",LocalDate.parse("1993-09-28"),true);
        Alumno maca = new Alumno(456,"Noya","Macarena",LocalDate.parse("1989-05-12"),true);
        Alumno flor = new Alumno(789,"Vaca Cardoso","Florencia",LocalDate.parse("1996-02-11"),true);
        Alumno gon = new Alumno (745,"Vazques","Ramiro",LocalDate.parse("1999-11-25"),true);
        Alumno lau = new Alumno (568,"Mercedes","Laura",LocalDate.parse("2000-07-15"),true);
        Materia matem=new Materia(1,"Matemática Aplicada",4,true);
        Materia bio=new Materia(2,"Biologia II",5,false);
        Materia ing=new Materia("Ingles",3,true);
        Materia fil=new Materia("Filosofia",1,true);
//        mat.modificarMateria(bio);
//        System.out.println(alu.buscarAlumno(2));
//        alu.guardarAlumno(pau);
//        alu.guardarAlumno(maca);
//        alu.guardarAlumno(flor);
//        alu.guardarAlumno(gon);
//        mat.guardarMateria(matem);
//        mat.guardarMateria(bio);
//        mat.guardarMateria(ing);
//        alu.guardarAlumno(lau);
//        mat.guardarMateria(fil);
//        System.out.println(alu.buscarAlumno(1)+"\n");
//        alu.eliminarAlumno(5);
//        System.out.println(mat.buscarMateria(10)+"\n");
//        System.out.println(mat.buscarMateria(12));
        Inscripcion i1= new Inscripcion(alu.buscarAlumno(6),mat.buscarMateria(1),8);
        Inscripcion i2= new Inscripcion(alu.buscarAlumno(6),mat.buscarMateria(3),8);
//        Inscripcion i2= new Inscripcion(lau, bio, 10);
//        Inscripcion i3= new Inscripcion(gon,matem,8);
//        Inscripcion i4= new Inscripcion(flor,ing,8);
        ins.guardarInscripcion(i1);
        ins.guardarInscripcion(i2);
//        ins.guardarInscripcion(i3);
//        ins.guardarInscripcion(i4);
        //ins.guardarInscripcion(i5);
    }
    
}
