package ejemplos.set.modelo;

import java.util.Objects;

public class Alumno implements Comparable<Alumno> {
    private String nombre;
    private double nota;

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + ", nota=" + nota;
    }

    @Override
    public int compareTo(Alumno a) {
        if(this.nombre == null) return 0;
        return this.nombre.compareTo(a.nombre);
        // si quiero comparar por nota no puedo usar compareTo porque es int
//        if(this.nota == 0) return 0;
//        if (this.nota > a.nota) return 1;
//        else return -1;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Double.compare(nota, alumno.nota) == 0 && Objects.equals(nombre, alumno.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nota);
    }
}
