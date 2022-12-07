
package br.com.ead.mapa.ps1;

import java.util.Scanner;

/**  @author Uendel - Bacharelado Em Engenharia de Software*/
public class RegistroNotas {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("<<<<<<Registros de Alunos>>>>>>");
        System.out.println("");
        
        System.out.println("Entre com a Matricula do Aluno:  ");
        String matricula = ler.nextLine();
        
        System.out.println("Entre com o Nome do Aluno:  ");
        String nomeAluno = ler.nextLine();
        
        System.out.println("Entre com a primeira nota:  ");
        double nota1 = ler.nextDouble();
        
        System.out.println("Entre com a segunda nota:  ");
        double nota2 = ler.nextDouble();

        
        System.out.println("Entre com a terceira nota:  ");
        double nota3 = ler.nextDouble();
        
        
        System.out.println("Entre com a quantidade de presenças:  ");
        int presenca = ler.nextInt();
        System.out.println("");
        
        
        System.out.println("<<<<<<Informações para a Diretora>>>>>>");
        System.out.println("");
        System.out.println("Nome do Aluno:  "+nomeAluno+"  \n\nMédia de Notas:  "
        +(nota1+nota2+nota3)/3);
        System.out.println("");
        /**Cálculo baseado em uma regra de três simples*/
        System.out.println("O precentual de presenças deste aluno foi de:  "
        + (presenca*100/60)+"%");
        System.out.println("");

    }
}
