
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;
import java.io.*;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Utilizador
 */
public abstract class Aluno_teste implements Serializable {
    private String Nome;
    private String Genero;
    private int codigoCand;
    private double exameA;
    private double exameB;
    private double exameIng;
    private double mediaSec;
    private ArrayList<String> escolhas;
    private double mediaEngenharia;
    private double mediaHumanidades;
    private double mediaBiociencias;
    private double mediaCiencias;
    private double mediaJuridicas;


    public Aluno_teste(String n, String g, int codC, double eA, double eB, double eI, double mSec ) { //(String Nome, String Genero, int codigoCand, double exameA, double exameB, double exameIng, double mediaSec)
        this.Nome = n;
        this.Genero = g;
        this.codigoCand = codC;
        this.exameA = eA;
        this.exameB = eB;
        this.exameIng = eI;
        this.mediaSec = mSec;
        this.escolhas = new ArrayList<String>();
        this.mediaEngenharia = 0;
        this.mediaHumanidades = 0;
        this.mediaBiociencias = 0;
        this.mediaCiencias = 0;
        this.mediaJuridicas = 0;
    }

    public void addEscolhas(String opcao){
        if(this.escolhas.contains(opcao)==true){ System.out.println("Opcao ja inserida");
        }else{this.escolhas.add(opcao);}
    }
   
    public void calculoEng(){//(0.25*exameA) + (0.25*exameB) + (0.5*media de secundario)
        this.mediaEngenharia = (this.exameA*0.25) + (this.exameB*0.25) + (this.mediaSec*0.5);
    }

    public void calculoHumana(){//(0.75*media de secundario) + (0.25*exameB);
        this.mediaHumanidades = (this.mediaSec*0.75) + (this.exameB*0.25);
    }

    public void calculoBio(){//(0.1*nota ingles) + (0.4*exameA) + (0.5* media de secundario)
        this.mediaBiociencias = (this.exameIng*0.1) + (this.exameA*0.4) + (this.mediaSec*0.5);
    }

    public void calculoCiencias(){//(0.25* nota ingles) + (0.25*exameA) + (0.25*exameB) + (0.25*media secundario)
        this.mediaCiencias = (this.exameIng*0.25) + (this.exameA*0.25) + (this.exameB*0.25) + (this.mediaSec*0.25);
    }

    public void calculoJuri(){//(0.5*exameA) + (0.5*media de secundario)
        this.mediaJuridicas = (this.exameA*0.5) + (this.mediaSec*0.5);  
    }

    public void calculoMedias(){
        this.calculoEng();
        this.calculoHumana();
        this.calculoBio();
        this.calculoCiencias();
        this.calculoJuri();
    }

    public double getMEng(){
        return this.mediaEngenharia;
    }

    public double getMHumana(){
        return this.mediaHumanidades;
    }
    
    public double getMBio(){
        return this.mediaBiociencias;
    }

    public double getMCiencias(){
        return this.mediaCiencias;
    }

    public double getMJuri(){
        return this.mediaJuridicas;
    }



   
    public String getNome() {
        return Nome;
    }

    public String getGenero() {
        return Genero;
    }

    public int getCodigoCand() {
        return codigoCand;
    }

    public double getExameA() {
        return exameA;
    }

    public double getExameB() {
        return exameB;
    }

    public double getExameIng() {
        return exameIng;
    }

    public double getMediaSec() {
        return mediaSec;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public void setCodigoCand(int codigoCand) {
        this.codigoCand = codigoCand;
    }

    public void setExameA(double exameA) {
        this.exameA = exameA;
    }

    public void setExameB(double exameB) {
        this.exameB = exameB;
    }

    public void setExameIng(double exameIng) {
        this.exameIng = exameIng;
    }

    public void setMediaSec(double mediaSec) {
        this.mediaSec = mediaSec;
    }

    public ArrayList<String> getEscolhas(){
        return this.escolhas;
    }





    

    @Override
    public String toString() {
        return "Aluno{" + "Nome=" + Nome + ", Genero=" + Genero + ", codigoCand=" + codigoCand + ", exameA=" + exameA + ", exameB=" + exameB + ", exameIng=" + exameIng + ", mediaSec=" + mediaSec + '}';
    }
    
    
    
    
      
    
}

