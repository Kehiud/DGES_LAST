import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.*;

public class ListaCursos implements Serializable {
    private ArrayList<Curso_teste> cursos;

    public ListaCursos(){
        this.cursos = new ArrayList<Curso_teste>();
    }

    public void addCurso(Curso_teste curso){
        this.cursos.add(curso);
    }

    public void mostraCursos(){
        for(int i = 0; i<this.cursos.size(); i++)
            System.out.println(i+ " - " + this.cursos.get(i).getNome());
        }

    public int size(){
        return this.cursos.size();
    }

    public Curso_teste devolveCurso(String nomeCurso){
        
        for(Curso_teste c : this.cursos){
            if(c.getNome().equals(nomeCurso)){
                return c;
            }
        }
        return null;
    }

}

