/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.aula;

/**
 *
 * @author aluno.saolucas
 */
public class Aluno {
      public String nome;
    public Aluno(String nome){
        this.nome=nome;
    }
    public void assistirAula(Professor professor){
    System.out.println(nome+ " Esta assistindo aula com " +professor.nome); 
     }
    
   
}



