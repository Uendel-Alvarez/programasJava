/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultorio;

import java.util.Scanner;

/**
 *
 * @author uende
 */
public class Consultorio {
    public static void main(String[] args) {
        Medico novoMedico = new Medico();
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("#####Cadastro Clínico#####");
        System.out.println("");
        System.out.println("Entre com o nome do novo médico:  ");
        novoMedico.setNome(scn.nextLine());
        System.out.println("");
        System.out.println("Entre com o endereço do médico:  ");
        novoMedico.setEndereco(scn.nextLine());
        System.out.println("");
        System.out.println("Entre com o horário de atendimento do médico:  ");
        novoMedico.setHorario(scn.nextLine());
        System.out.println("");
        System.out.println("Entre coma a especialidade do médico:  ");
        novoMedico.setEspecialidade(scn.next());
        
        System.out.println("");
        System.out.println("\n#####Dados do Médico#####");
        System.out.println("Nome do Médico:  "+novoMedico.getNome());
        System.out.println("");
        System.out.println("Endereço:  "+novoMedico.getEndereco());
        System.out.println("");
        System.out.println("Horário:  "+novoMedico.getHorario());
        System.out.println("");
        System.out.println("Especialidade:  "+novoMedico.getEspecialidade());
        System.out.println("");
        novoMedico.andar();
        System.out.println("######Fim da execução######");
        
    }
}
