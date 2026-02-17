package org.example;

public class alumno extends persona {
    ///  --- Atributos ---
    private String curso;
    private String notaMedia;

    /// --- Constructores ---
    /// Constructor vacio
    public alumno() {}

    /// Constructor completo con todos los parámetros (contando con los de la clase padre)
    public alumno(int id, String name, String email, String curso, String notaMedia) {
        super(id, name, email);
        this.curso = curso;
        this.notaMedia = notaMedia;
    }

    public alumno(String name, String email, String curso, String notaMedia) {
        super(name, email);
        this.curso = curso;
        this.notaMedia = notaMedia;
    }

    /// --- Metodos ---
    /// Permisos | Retorno | Nombre | (Parametros)
    public String mostrarInfo(){
        return "CURSO:" + curso + "\n" +
                "NOTA MEDIA:" + notaMedia;
    }

    ///--- GETTERS & SETTERS ---
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(String notaMedia) {
        this.notaMedia = notaMedia;
    }
}
