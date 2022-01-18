

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
/**
 *
 * @author Utilizador
 */
public class ListaAlunos_teste {
    private ArrayList<Aluno_teste> Lista;
    
    public ListaAlunos_teste(){
        this.Lista = new ArrayList<>();
    }
    
    public void insereAluno(Aluno_teste aluno){
        this.Lista.add(aluno);
    }
    
    public int size(){
        return Lista.size();
    }
    
    public void ListaAlunos(){
        int i=0;
        for(i=0;i<this.Lista.size();i++){
            System.out.println("Alunos:" + this.Lista.get(i));
            
        }
    }
    
    public void getAluno(int a){
        System.out.println(this.Lista.get(a))
                ;
    }
    
    public String getAlunoi(int a){
        return this.Lista.get(a).toString();
    }
}
