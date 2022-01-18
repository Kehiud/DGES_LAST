import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Utilizador
 */
public abstract class Curso_teste {
    
    private String Nome;
    private int NumClauss;
    private HashMap<Aluno_teste,Integer> candidatos;
    private ArrayList<Aluno_teste> colocados;

    public Curso_teste(String n, int numC) {
        this.Nome = n;
        this.NumClauss = numC;
        this.candidatos = new HashMap<Aluno_teste,Integer>();
        this.colocados = new ArrayList<Aluno_teste>();
        /*  
            4 andre     
            2 samuel
            3 sins        */ 
    }

    public HashMap<Aluno_teste,Integer> getCandidatos(){
        return this.candidatos;
    }
    
    public String getNome() {
        return Nome;
    }

    /*public boolean addCandidato(Aluno_teste aluno){
        if(this.candidatos.contains(aluno)==false){// se contem o aluno é falso, adiciona e da return true
            this.candidatos.add(aluno);
            return true;}
        else{return false;}//se contem o aluno é verdade, da return false
    }*/

    public boolean addCandidato(Aluno_teste aluno , int pref){
        if(this.candidatos.containsKey(aluno)==false){
            this.candidatos.put(aluno,pref);
            System.out.println("Adicionou aluno");
            return true;
        }else{return false;}
    }

    public void addColocado(Aluno_teste aluno){
        this.colocados.add(aluno);
    }
    

    public void mostraCandidatos(){
        for(Aluno_teste a : this.candidatos.keySet()){
            System.out.println(a.getNome());
        }
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getNumClauss() {
        return NumClauss;
    }

    public void setNumClauss(int NumClauss) {
        this.NumClauss = NumClauss;
    }    
}
