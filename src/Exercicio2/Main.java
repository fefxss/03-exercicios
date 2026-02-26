package Exercicio2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Paciente paciente = new Paciente();
        double[] alvo; //criado para receber os valores do alvo do metodo

        System.out.println("Nome do paciente: ");
        paciente.nome = entrada.nextLine();

        System.out.println("Idade do paciente: ");
        paciente.idade = entrada.nextInt();

        alvo = paciente.frequenciaAlvo(); //carregando a variavel criada la em cima para receber os valores

        System.out.println("Paciente: "+ paciente.nome);
        System.out.println("Frequência máxima: " + paciente.frequenciaMaxima());
        System.out.println("Intervalo de frequência alvo: [" + alvo[0] + ", " + alvo[1] + "]");
    }
}
