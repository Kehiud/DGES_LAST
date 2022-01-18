/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;
/**
 *
 * @author Utilizador
 */
public class AlunoDef_teste extends Aluno_teste {
    private double nivelDef;//nivel de def
    private String tipoDef;

    public AlunoDef_teste(String n , String g, int codC, double eA, double eB, double eI, double mSec, double nD, String tD  ) {
        super(n,g,codC,eA,eB,eI,mSec);
        this.nivelDef = nD;
        this.tipoDef = tD;
    }

    public double getNivelDef() {
        return nivelDef;
    }

    public String getTipoDef() {
        return tipoDef;
    }
    
     @Override
    public String toString() {
        return "{" + "Nome=" + super.getNome() + "Nivel=" + this.getNivelDef() + ",Deficiencia= " + this.getTipoDef() + ", Genero=" + super.getGenero() + ", codigoCand=" + super.getCodigoCand()+ ", exameA=" + super.getExameA() + ", exameB=" + super.getExameB() + ", exameIng=" + super.getExameIng() + ", mediaSec=" + super.getMediaSec() + '}';
    }

    
    
    
    
}
