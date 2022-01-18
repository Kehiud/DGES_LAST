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


public class Main_teste {
    static Aluno_teste regAluno(final int i, final ListaCursos lista){//se 0 é desfavorecido, se 1 é deficiente e se 2 é normal.
        final Scanner scan = new Scanner(System.in);        
        //listaAlunos lista = new listaAlunos();
        
        if(i==0){// desfavorecido CERTO
                                System.out.println("Insira o Codigo de Zona Respetivo");
                                final String codDes = scan.nextLine();
                                final int CodDes = Integer.parseInt(codDes);
                                
                                System.out.println("Insira o seu Nome");
                                final String NomeDes = scan.nextLine();
                        
                                System.out.println("Insira o seu Género(Masulino/Feminino)");
                                final String GeneroDes = scan.nextLine();
                        
                                System.out.println("Inisra o seu Código de Candidato");
                                final String CodigoCanDes = scan.nextLine();
                                final int CodCanDes = Integer.parseInt(CodigoCanDes);
                        
                                System.out.println("Insira o resultado obtido no exame A");
                                final String ExameADes = scan.nextLine();
                                final double exameADes = Double.parseDouble(ExameADes);
                        
                                System.out.println("Insira o resultado obtido no exame B");
                                final String ExameBDes = scan.nextLine();
                                final double exameBDes = Double.parseDouble(ExameBDes);
                        
                                System.out.println("Insira o resultado obtido no exame de Ingles");
                                final String ExameIngDes = scan.nextLine();
                                final double exameIngDes = Double.parseDouble(ExameIngDes);
                        
                                System.out.println("Insira a sua Media de Secundário");
                                final String MediaSecDes = scan.nextLine();
                                final double mediaSecDes = Double.parseDouble(MediaSecDes);

                                final AlunoDesfavorecido_teste desfavorecido = new AlunoDesfavorecido_teste(NomeDes,GeneroDes,CodCanDes,exameADes,exameBDes,exameIngDes,mediaSecDes,CodDes);
                               
                                System.out.println("Insira o nome dos cursos a que se pretende candidatar por ordem de preferencia. Caso não queira inserir as 6 opcoes disponiveis digite 'q' para parar.");
                                lista.mostraCursos();
                                String escolha;
                                final String out = "q"; 
                                
                                    escolha = scan.nextLine();//escolha1
                                    if(escolha.equals(out)==false){//tem de inserir pelo menos uma escolha
                                        desfavorecido.addEscolhas(escolha);
                                        final Curso_teste e1 = lista.devolveCurso(escolha);//devolve um objeto do curso, se existir
                                        e1.addCandidato(desfavorecido,1);}//done

                                    escolha = scan.nextLine();//escolha2
                                    if(escolha.equals(out)==false){///ou escolhe apenas uma ou apenas duas ou prossegue
                                        desfavorecido.addEscolhas(escolha);
                                        final Curso_teste e2 = lista.devolveCurso(escolha);//devolve um objeto do curso, se existir
                                        if(e2.addCandidato(desfavorecido,2)==false){
                                            System.out.println("Ja se inscreveu neste curso!");
                                            return desfavorecido;
                                        }else{e2.addCandidato(desfavorecido,2);}}else{return desfavorecido;}  

                                    escolha = scan.nextLine();//escolha3
                                    if(escolha.equals(out)==false){//..ou tres ou prossegue
                                        desfavorecido.addEscolhas(escolha);
                                        final Curso_teste e3 = lista.devolveCurso(escolha);//devolve um objeto do curso, se existir
                                        if(e3.addCandidato(desfavorecido,3)==false){ 
                                            System.out.println("Ja se inscreveu neste curso!");
                                            return desfavorecido;
                                        }else{e3.addCandidato(desfavorecido,3);}}else{return desfavorecido;}

                                    escolha = scan.nextLine();//escolha4
                                    if(escolha.equals(out)==false){//...ou quatro ou prossgue
                                        final Curso_teste e4 = lista.devolveCurso(escolha);//devolve um objeto do curso, se existir
                                        desfavorecido.addEscolhas(escolha);
                                        if(e4.addCandidato(desfavorecido,4)==false){
                                            System.out.println("Ja se inscreveu neste curso!");
                                            return desfavorecido;    
                                    }else{e4.addCandidato(desfavorecido,4);}}else{return desfavorecido;}
                                        
                                    escolha = scan.nextLine();//escolha5
                                    if(escolha.equals(out)==false){//...ou quinta ou prossegue
                                        desfavorecido.addEscolhas(escolha);
                                        final Curso_teste e5 = lista.devolveCurso(escolha);//devolve um objeto do curso, se existir
                                        if(e5.addCandidato(desfavorecido,5)==false){
                                            System.out.println("Ja se inscreveu neste curso!");
                                            return desfavorecido;
                                        }else{e5.addCandidato(desfavorecido,5);}}else{return desfavorecido;}

                                    escolha = scan.nextLine();//escolha6
                                    if(escolha.equals(out)==false){
                                        desfavorecido.addEscolhas(escolha);
                                        final Curso_teste e6 = lista.devolveCurso(escolha);//devolve um objeto do curso, se existir
                                        if(e6.addCandidato(desfavorecido,6)==false){
                                            System.out.println("Ja se inscreveu neste curso!");
                                            return desfavorecido;
                                        }else{e6.addCandidato(desfavorecido,6);}}else{return desfavorecido;}

                               //escolha.equals(out)==false && lista.size()>=6;
                                

                                


                                
                                
                                
                                
                                /*desfavorecido.setCodZona(CodDes);
                                desfavorecido.setNome(NomeDes);
                                desfavorecido.setGenero(GeneroDes);
                                desfavorecido.setCodigoCand(CodCanDes);
                                desfavorecido.setExameA(exameADes);
                                desfavorecido.setExameB(exameBDes);
                                desfavorecido.setExameIng(exameIngDes);
                                desfavorecido.setMediaSec(mediaSecDes);*/
                                return desfavorecido;
                                
                                //lista.insereAluno(desfavorecido);
                                
                                //System.out.println(desfavorecido.toString());
                                //lista.ListaAlunos();
                                //lista.getAluno(0);
                               
                                
                                
        }
        if(i==1){//deficiente
                                        System.out.println("Insira o seu nível de incapacidade");
                                        final String nivel = scan.nextLine();
                                        final double Nivel = Double.parseDouble(nivel);
                                        
                                        System.out.println("Insira o tipo de incapacidade");
                                        final String tipo = scan.nextLine();
                                        
                                        System.out.println("Insira o seu Nome");
                                        final String NomeDef = scan.nextLine();
                        
                                        System.out.println("Insira o seu Género(Masulino/Feminino)");
                                        final String GeneroDef = scan.nextLine();
                        
                                        System.out.println("Inisra o seu Código de Candidato");
                                        final String CodigoCanDef = scan.nextLine();
                                        final int CodCanDef = Integer.parseInt(CodigoCanDef);
                        
                                        System.out.println("Insira o resultado obtido no exame A");
                                        final String ExameADef = scan.nextLine();
                                        final double exameADef = Double.parseDouble(ExameADef);
                        
                                        System.out.println("Insira o resultado obtido no exame B");
                                        final String ExameBDef = scan.nextLine();
                                        final double exameBDef = Double.parseDouble(ExameBDef);
                        
                                        System.out.println("Insira o resultado obtido no exame de Ingles");
                                        final String ExameIngDef = scan.nextLine();
                                        final double exameIngDef = Double.parseDouble(ExameIngDef);
                        
                                        System.out.println("Insira a sua Media de Secundário");
                                        final String MediaSecDef = scan.nextLine();
                                        final double mediaSecDef = Double.parseDouble(MediaSecDef);
                                        
                                        final AlunoDef_teste deficiente = new AlunoDef_teste(NomeDef,GeneroDef,CodCanDef,exameADef,exameBDef,exameIngDef,mediaSecDef,Nivel,tipo);
                                        
                                        System.out.println("Insira o nome dos cursos a que se pretende candidatar por ordem de preferencia. Caso não queira inserir as 6 opcoes disponiveis digite 'q' para parar.");
                                        lista.mostraCursos();
                                        String escolha;
                                        final String out = "q"; 
                                
                                    escolha = scan.nextLine();//escolha1
                                    if(escolha.equals(out)==false){//tem de inserir pelo menos uma escolha
                                        deficiente.addEscolhas(escolha);
                                        final Curso_teste e1 = lista.devolveCurso(escolha);//devolve um objeto do curso, se existir
                                        e1.addCandidato(deficiente,1);
                                        //System.out.println(e1.getNome());
                                        //System.out.println("ANTES DISTO");
                                        //System.out.println(e1.getCandidatos().size())                   //nao existia e adiciona      
                                            //caso exista adiciona a lista de candidatos do curso em particular
                                            //System.out.println("Entro na lista de candidatos");
                                       }

                                    escolha = scan.nextLine();//escolha2
                                    if(escolha.equals(out)==false){///ou escolhe apenas uma ou apenas duas ou prossegue
                                        final Curso_teste e2 = lista.devolveCurso(escolha);//devolve um objeto do curso, se existir
                                        if(e2.addCandidato(deficiente,2)==false){
                                            deficiente.addEscolhas(escolha);
                                            System.out.println("Ja se inscreveu neste curso!");
                                            return deficiente; 
                                        }else{e2.addCandidato(deficiente,2);}}else{return deficiente;}   

                                    escolha = scan.nextLine();//escolha3
                                    if(escolha.equals(out)==false){//..ou tres ou prossegue
                                       final Curso_teste e3 = lista.devolveCurso(escolha);//devolve um objeto do curso, se existir
                                        if(e3.addCandidato(deficiente,3)==false){
                                            deficiente.addEscolhas(escolha);
                                            System.out.println("Ja se inscreveu neste curso!");
                                            return deficiente; 
                                        }else{e3.addCandidato(deficiente,3);}}else{return deficiente;}

                                    escolha = scan.nextLine();//escolha4
                                    if(escolha.equals(out)==false){//...ou quatro ou prossgue 
                                        final Curso_teste e4 = lista.devolveCurso(escolha);//devolve um objeto do curso, se existir
                                        if(e4.addCandidato(deficiente,4)==false){
                                             deficiente.addEscolhas(escolha);
                                            System.out.println("Ja se inscreveu neste curso!");
                                            return deficiente; 
                                        }else{e4.addCandidato(deficiente,4);}}else{return deficiente;}

                                    escolha = scan.nextLine();//escolha5
                                    if(escolha.equals(out)==false){//...ou quinta ou prossegue
                                        final Curso_teste e5 = lista.devolveCurso(escolha);//devolve um objeto do curso, se existir
                                        if(e5.addCandidato(deficiente,5)==false){
                                             deficiente.addEscolhas(escolha);
                                            System.out.println("Ja se inscreveu neste curso!");
                                            return deficiente; 
                                        }else{e5.addCandidato(deficiente,5);}}else{return deficiente;}

                                    escolha = scan.nextLine();//escolha6
                                        if(escolha.equals(out)==false){
                                        final Curso_teste e6 = lista.devolveCurso(escolha);//devolve um objeto do curso, se existir
                                        if(e6.addCandidato(deficiente,6)==false){
                                             deficiente.addEscolhas(escolha);
                                            System.out.println("Ja se inscreveu neste curso!");
                                            return deficiente;
                                        }else{e6.addCandidato(deficiente,6);}}else{return deficiente;}
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        /*deficiente.addDefInfo(Nivel, tipo);
                                        deficiente.setNome(NomeDef);
                                        deficiente.setGenero(GeneroDef);
                                        deficiente.setCodigoCand(CodCanDef);
                                        deficiente.setExameA(exameADef);
                                        deficiente.setExameB(exameBDef);
                                        deficiente.setExameIng(exameIngDef);
                                        deficiente.setMediaSec(mediaSecDef);*/
                                        return deficiente;
                                        //lista.insereAluno(deficiente);
                                        //System.out.println(deficiente.toString());
                                        //lista.ListaAlunos();
                                        //lista.getAluno(0);
                                        //lista.getAluno(1);
                                    }
                                    
                                        
        if(i==2){ //CERTO
                                        System.out.println("Insira o seu Nome");
                                        final String Nome = scan.nextLine();
                        
                                        System.out.println("Insira o seu Género(Masulino/Feminino)");
                                        final String Genero = scan.nextLine();
                        
                                        System.out.println("Inisra o seu Código de Candidato");
                                        final String CodigoCan = scan.nextLine();
                                        final int CodCan = Integer.parseInt(CodigoCan);
                        
                                        System.out.println("Insira o resultado obtido no exame A");
                                        final String ExameA = scan.nextLine();
                                        final double exameA = Double.parseDouble(ExameA);
                        
                                        System.out.println("Insira o resultado obtido no exame B");
                                        final String ExameB = scan.nextLine();
                                        final double exameB = Double.parseDouble(ExameB);
                        
                                        System.out.println("Insira o resultado obtido no exame de Ingles");
                                        final String ExameIng = scan.nextLine();
                                        final double exameIng = Double.parseDouble(ExameIng);
                        
                                        System.out.println("Insira a sua Media de Secundário");
                                        final String MediaSec = scan.nextLine();
                                        final double mediaSec = Double.parseDouble(MediaSec);

                                        System.out.println("Insira os numeros respetivos aos cursos a que se pretende candidatar por ordem de preferencia");
                                        lista.mostraCursos();
                                        
                                         final Aluno_regular aluno_regular = new Aluno_regular(Nome,Genero,CodCan,exameA,exameB,exameIng,mediaSec);
                                        
                                         System.out.println("Insira o nome dos cursos a que se pretende candidatar por ordem de preferencia. Caso não queira inserir as 6 opcoes disponiveis digite 'q' para parar.");
                                         lista.mostraCursos();
                                         String escolha;
                                         final String out = "q"; 
                                 
                                     escolha = scan.nextLine();//escolha1
                                     if(escolha.equals(out)==false){//tem de inserir pelo menos uma escolha
                                         aluno_regular.addEscolhas(escolha);
                                         final Curso_teste e1 = lista.devolveCurso(escolha);//devolve um objeto do curso, se existir
                                         //System.out.println(e1.getNome());
                                         //System.out.println("ANTES DISTO");
                                         //System.out.println(e1.getCandidatos().size());
                                         e1.addCandidato(aluno_regular,1);//caso exista adiciona a lista de candidatos do curso em particular
                                         //System.out.println("Entro na lista de candidatos");
                                         }
 
                                     escolha = scan.nextLine();//escolha2
                                     if(escolha.equals(out)==false){///ou escolhe apenas uma ou apenas duas ou prossegue
                                        final Curso_teste e2 = lista.devolveCurso(escolha);//devolve um objeto do curso, se existir
                                        if(e2.addCandidato(aluno_regular,2)==false){
                                            aluno_regular.addEscolhas(escolha);
                                            System.out.println("Ja se inscreveu neste curso!");
                                            return aluno_regular;
                                        }else{e2.addCandidato(aluno_regular,2);}}else{return aluno_regular;}    
 
                                     escolha = scan.nextLine();//escolha3
                                     if(escolha.equals(out)==false){//..ou tres ou prossegue
                                         
                                         final Curso_teste e3 = lista.devolveCurso(escolha);//devolve um objeto do curso, se existir
                                         if(e3.addCandidato(aluno_regular,3)==false){
                                            aluno_regular.addEscolhas(escolha);
                                            System.out.println("Ja se inscreveu neste curso!");
                                            return aluno_regular;
                                         }else{e3.addCandidato(aluno_regular,3);}}else{return aluno_regular;}
 
                                     escolha = scan.nextLine();//escolha4
                                     if(escolha.equals(out)==false){//...ou quatro ou prossgue
                                         
                                         final Curso_teste e4 = lista.devolveCurso(escolha);//devolve um objeto do curso, se existir
                                         if(e4.addCandidato(aluno_regular,4)==false){
                                            aluno_regular.addEscolhas(escolha); 
                                            System.out.println("Ja se inscreveu neste curso!");
                                            return aluno_regular;
                                         }else{e4.addCandidato(aluno_regular,4);}}else{return aluno_regular;}
 
                                     escolha = scan.nextLine();//escolha5
                                     if(escolha.equals(out)==false){//...ou quinta ou prossegue
                                        
                                         final Curso_teste e5 = lista.devolveCurso(escolha);//devolve um objeto do curso, se existir
                                         if(e5.addCandidato(aluno_regular,5)==false){
                                            aluno_regular.addEscolhas(escolha);
                                            System.out.println("Ja se inscreveu neste curso!");
                                            return aluno_regular;
                                         }else{e5.addCandidato(aluno_regular,5);}}else{return aluno_regular;}
 
                                     escolha = scan.nextLine();//escolha6
                                         if(escolha.equals(out)==false){
                                         final Curso_teste e6 = lista.devolveCurso(escolha);//devolve um objeto do curso, se existir
                                         if(e6.addCandidato(aluno_regular,6)==false){
                                            aluno_regular.addEscolhas(escolha);
                                            System.out.println("Ja se inscreveu neste curso!");
                                            return aluno_regular;
                                         }else{e6.addCandidato(aluno_regular,6);}}else{return aluno_regular;}
                                        
                                        
                                        /*aluno.setNome(Nome);
                                        aluno.setGenero(Genero);
                                        aluno.setCodigoCand(CodCan);
                                        aluno.setExameA(exameA);
                                        aluno.setExameB(exameB);
                                        aluno.setExameIng(exameIng);
                                        aluno.setMediaSec(mediaSec);
                                        //lista.insereAluno(aluno);*/
                                        
                                        //System.out.println(aluno.toString());
                                        //lista.ListaAlunos();
                                        //lista.getAluno(0);
                                        //lista.getAluno(1);
                                        //lista.getAluno(2);
                                        return aluno_regular;
                                        
            
        }
        return null;//em caso de outra opçao
    }
    
    static void menu(){
         System.out.println("Esolha uma das opções");
         System.out.println("1 - Registar a sua Candidatura");
         System.out.println("2 - Entrar como Administrador");
         System.out.println("3 - Verificar estado de Candidatura");
         System.out.println("4 - Consultar Lista de Colocados");
         System.out.println("5 - Consultar Cursos Existentes");
         System.out.println("6 - Sair");
    }

    static void menu_admin(){
        System.out.println("Sucesso!");
        System.out.println("Escolha uma opção:");
        System.out.println("1-Adicionar novo curso");
        System.out.println("2-Verificar lista de candidatos");
        System.out.println("3-Fechar epoca de candidaturas");
    }

    static void menu_admin_add(){
        System.out.println("O seu curso integra qual das seguintes areas?");
        System.out.println("1 - Engenharia");
        System.out.println("2 - Huamnidades");
        System.out.println("3 - Biociencias");
        System.out.println("4 - Ciencias");
        System.out.println("5 - Ciencias Juridicas");
    }

    static void escolhe_area(){
        System.out.println("Qual?");
        System.out.println("1 - Engenharia");
        System.out.println("2 - Huamnidades");
        System.out.println("3 - Biociencias");
        System.out.println("4 - Ciencias");
        System.out.println("5 - Ciencias Juridicas");
    }

    /*static void save(Aluno_teste al){
        try {
            FileWriter myWriter = new FileWriter("admin.txt");
            myWriter.write(al.toString());
            myWriter.close();
            //System.out.println(this.Lista.toString());
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }*/

    
    public static void main(final String[] args) throws IOException {
        final Admin_teste admin = new Admin_teste();
        final ListaCursos Cursos = new ListaCursos();
        final Scanner scan = new Scanner(System.in);
        /*try {
            File myObj = new File("admin.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              System.out.println(data);
            }
            myReader.close();}
            catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
              }*/
        boolean sw = true;
        final ListaAlunos_teste lista = new ListaAlunos_teste();
        int a = 0;
        //File info = new File("admin.txt");
        //PrintWriter myWriter = new PrintWriter(new FileWriter(info, true));
        final File file = new File("admin.txt");
        final FileWriter fw = new FileWriter(file,true);
        final BufferedWriter myWriter = new BufferedWriter(fw);
       // bw.write(Data);
        //bw.newLine();
        //bw.close();
        while(sw==true){
        
            //System.out.println();
            //System.out.println();
            //System.out.println();
            //System.out.println();
            do{
                menu();
                lista.ListaAlunos();
                System.out.println("vazia");
                a = scan.nextInt();
                switch(a){
                    case 1:
                        scan.nextLine();
                        System.out.println("Pertence a uma Zona Desfavorecida?(S/N)");
                        final String resposta = scan.nextLine();
                        final char c = resposta.charAt(0);                        
                        switch(c){
        
                            case 'S'://é potencialmente desfavorecido
                            case 's'://verificar se é de uma zona considerada desfavorecida(nao importante)
                               //regAluno(0);
                               System.out.println("AQUI CHEGOU!!");
                               final Aluno_teste alunoDes =  regAluno(0, Cursos);
                               alunoDes.calculoMedias();
                               /*System.out.println("MEDIASSS");
                               System.out.println(alunoDes.getMEng());
                               System.out.println(alunoDes.getMHumana());
                               System.out.println(alunoDes.getMBio());
                               System.out.println(alunoDes.getMCiencias());
                               System.out.println(alunoDes.getMJuri());*/
                               lista.insereAluno(alunoDes);
                               lista.ListaAlunos();
                               System.out.println("FODA-SE!");
                               System.out.println(alunoDes.getEscolhas());
                               System.out.println("AQUI CHEGOU!!");
                                myWriter.write(alunoDes.toString());
                                myWriter.newLine();
                                System.out.println("Registou!");
                              

                                break;
                            case 'N'://ou é deficiente ou é um aluno regular
                            case 'n':
                                System.out.println("Possui necessidades educativas especiais?(S/N)");
                                final String answer = scan.nextLine();
                                final char C = answer.charAt(0);
                                switch(C){
                                    case 'S':
                                    case 's':
                                    //regAluno(1);  
                                        final Aluno_teste alunodef = regAluno(1,Cursos);
                                        lista.insereAluno(alunodef);
                                        System.out.println(alunodef.getEscolhas());
                                        Cursos.devolveCurso("leti").mostraCandidatos();//devolver os candidatos do curso
                                        myWriter.write(alunodef.toString());
                                        myWriter.newLine();
                                        //myWriter.close();
                                        break;
                                        
                                    case 'N'://é obrigatoriamnete um aluno normal
                                    case 'n':
                                        //regAluno(2);
                                        final Aluno_teste alunoR = regAluno(2,Cursos);
                                        lista.insereAluno(alunoR);
                                        lista.ListaAlunos();
                                        System.out.println(alunoR.getEscolhas());
                                        myWriter.write(alunoR.toString());
                                        myWriter.newLine();
                                        break;
                                    }
                                    
                                    }
                                    
                                    break;
                                    
                    case 2:
                       scan.nextLine();
                       System.out.println("Inisra o Username");
                       final String username = scan.nextLine();
                       System.out.println("Insira a Password");
                       final String pass = scan.nextLine();
                       if(username.equals(admin.getUsername()) && pass.equals(admin.getPassword())){
                            menu_admin();
                            final int op = scan.nextInt();
                            //adicionar cursos
                            if(op==1){
                                scan.nextLine();
                                System.out.println("Insira o nome que pretende atribuir ao curso?");
                                final String nome = scan.nextLine();
                                System.out.print("Quantas vagas pretende que o mesmo possua?");
                                final int vagas = scan.nextInt(); 
                                menu_admin_add();
                                final int curso = scan.nextInt();
                                switch(curso){
                                    case 1:
                                        final Engenharia eng = new Engenharia(nome, vagas);
                                        Cursos.addCurso(eng);
                                        System.out.println("Curso de Engenharia adicionado com Sucesso!");
                                        //eng.ListaEngenharia(eng);
                                        break;
                                    case 2:
                                        final Humanidades huma = new Humanidades(nome , vagas);
                                        Cursos.addCurso(huma);
                                        System.out.println("Curso de Humanidades adicionado com sucesso");
                                        //huma.ListaHumanidades(huma);
                                        break;
                                    case 3:
                                        final Biociencias bio = new Biociencias(nome, vagas);
                                        Cursos.addCurso(bio);
                                        System.out.println("Curso de Biociencias adicionado com sucesso");
                                        //bio.ListaBiociencias(bio);
                                        break;
                                    case 4:
                                        final Ciencias ciencia = new Ciencias(nome, vagas);
                                        Cursos.addCurso(ciencia);
                                        System.out.println("Curso de Ciencias adicionado com sucesso");
                                        //ciencia.ListaCiencias(ciencia);
                                        break;
                                    case 5:
                                        final cJuridicas juri = new cJuridicas(nome, vagas);
                                        Cursos.addCurso(juri);
                                        System.out.println("Curso de Ciencias Juridicas adicionado com sucesso"); 
                                        //juri.ListaJuridicas(juri);   
                                        break;
                                    default:
                                    System.out.println("Inseriu uma opcao nao valida!");
                                    }}
                            
                                if(op==2){//revela os candidatos por curso
                                scan.nextLine();
                                System.out.println("Que curso deseja verificar?");
                                final String k = scan.nextLine();
                                System.out.println("NUMERO");
                                System.out.println(Cursos.devolveCurso(k).getCandidatos().values().size() );
                                for( Aluno_teste i : Cursos.devolveCurso(k).getCandidatos().keySet())
                                    System.out.println(i.getNome());
                                } 

                                if(op==3){//fecha epoca de candidaturas
                                    
                                }
                            
                           
                            }else{System.out.println("Credenciais Erradas");}

                            
                       sw = true;
                        a = 0;
                        break;
                    
                    case 5:
                        Cursos.mostraCursos();
                        break;


                    case 6: 
                        myWriter.close();
                        sw = true;
                        System.exit(0);
                        
                        
                        break;
                        
                    default:
                        System.out.println("Opcao Invalida! Por favor, insira novamente!");
                    }
            }while(a!=0);
        }
        
        
    }
}
