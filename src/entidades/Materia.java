package entidades;

public class Materia {
    private int idMateria;
    private String nombre;
    private int anioMateria;
    private boolean estado=true;

    public Materia() {
    }

    public Materia(int idMateria, String nombre, int anioMateria, boolean activo) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anioMateria = anioMateria;
        this.estado = activo;
    }

    public Materia(String nombre, int anioMateria, boolean activo) {
        this.nombre = nombre;
        this.anioMateria = anioMateria;
        this.estado = activo;
    }
    
    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioMateria() {
        return anioMateria;
    }

    public void setAnioMateria(int anioMateria) {
        this.anioMateria = anioMateria;
    }

    public boolean isActivo() {
        return estado;
    }

    public void setActivo(boolean activo) {
        this.estado = activo;
    }

    @Override
    public String toString() {
        return " " + "ID: " + idMateria + " || Nombre: " + nombre + " || Año: " + anioMateria + " || Estado: " + estado + ' ';
    }
    
}