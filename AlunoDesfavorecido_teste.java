/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Utilizador
 */
public class AlunoDesfavorecido_teste extends Aluno_teste {
    private int codZona;
    
    public AlunoDesfavorecido_teste(String n , String g, int codC, double eA, double eB, double eI, double mSec, int codZ){
        super(n,g,codC,eA,eB,eI,mSec);
        this.codZona = codZ;
        
    }

    public int getCodZona() {
        return codZona;
    }

    public void setCodZona(int codZona) {
        this.codZona = codZona;
    }

     @Override
    public String toString() {
        return "{" + "Nome=" + super.getNome() + "codZona=" + codZona + ", Genero=" + super.getGenero() + ", codigoCand=" + super.getCodigoCand()+ ", exameA=" + super.getExameA() + ", exameB=" + super.getExameB() + ", exameIng=" + super.getExameIng() + ", mediaSec=" + super.getMediaSec() + '}';
    }
    
        
}
