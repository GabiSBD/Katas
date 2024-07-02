package CodeWars;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String titulo;
    private float duracion; //Expresada en horas
    private int videos; //cantidad de vídeos
    private int alumnos; //Cantidad de alumnos
    private List<Curso> cursos;

    public Curso(){
        this.cursos = new ArrayList<>();
        cursos.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200 ));
        cursos.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800 ));
        cursos.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700 ));
        cursos.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400 ));
        cursos.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300 ));
    }
    public Curso(String titulo, float duracion, int videos, int alumnos) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.videos = videos;
        this.alumnos = alumnos;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public int getVideos() {
        return videos;
    }

    public void setVideos(int videos) {
        this.videos = videos;
    }

    public int getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(int alumnos) {
        this.alumnos = alumnos;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", duracion=" + duracion +
                ", videos=" + videos +
                ", alumnos=" + alumnos +
                '}';
    }

    /* Esto en el main de Kata

    Curso curso = new Curso();
        List<Curso> cursos= curso.getCursos();

        cursos.parallelStream().filter(e->e.getDuracion()>5.0f).forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------");
        cursos.parallelStream().filter(e->e.getDuracion()<2.0f).forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------");
        cursos.parallelStream().sorted(Comparator.comparing(Curso::getDuracion).reversed()).limit(3).forEach(System.out::println);
        System.out.println("---------------------------------------------------------");
        cursos.parallelStream().mapToDouble(Curso::getDuracion).average().ifPresent(System.out::println);
        System.out.println("-------------------------------------------------------------------");
        cursos.parallelStream().mapToDouble(Curso::getDuracion).reduce(Double::sum).ifPresent(System.out::println);
        System.out.println("-------------------------------------------------------------------------------------");
        cursos.parallelStream().filter(e-> e.getAlumnos()>500).forEach(System.out::println);
        System.out.println("------------------------------------------------------------------------------------");
        cursos.stream().max(Comparator.comparing(Curso::getDuracion)).ifPresent(System.out::println);
        System.out.println("----------------------------------------------------------------------------------------");
        cursos.parallelStream().map(Curso::getTitulo).toList().parallelStream().forEach(System.out::println);*/
}
