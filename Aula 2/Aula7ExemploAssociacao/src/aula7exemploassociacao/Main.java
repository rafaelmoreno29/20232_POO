/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula7exemploassociacao;

import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Cria 2 cursos        
        Curso c1 = new Curso(1, "ADS", 2400);
        Curso c2 = new Curso(2, "Engenharia", 5800);

        //cria alunos do curso ADS
        Aluno a1 = new Aluno("0001", "Rafael");
        c1.inserirAluno(a1);
        a1 = new Aluno("0002", "José");
        c1.inserirAluno(a1);

        //cria alunos do curso Engenharia
        a1 = new Aluno("0003","Maria");
        c2.inserirAluno(a1);
        
        //mostra dados dos cursos
       JOptionPane.showMessageDialog(null, c1.imprimirCompleto());
       JOptionPane.showMessageDialog(null, c2.imprimirCompleto());

    }
    
}
