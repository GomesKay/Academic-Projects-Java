import java.util.Scanner;

/*
 * 🤖 Exemplo de execução
 * 
 * Digite seu nome: Caio
 * Digite seu peso (kg): 69
 * Digite sua altura (m): 1.79
 * 
 * Paciente - Caio
 * Seu IMC é: 21,53
*/

// IMC - Cálculo numérico
public class App {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    Paciente paciente = new Paciente();

    System.out.print("Digite seu nome: ");
    paciente.setNome(entrada.nextLine());

    System.out.print("Digite seu peso (kg): ");
    paciente.setPeso(entrada.nextDouble());

    System.out.print("Digite sua altura (m): ");
    paciente.setAltura(entrada.nextDouble());

    System.out.println("\nPaciente - " + paciente.getNome());
    System.out.printf("Seu IMC é: %.2f", paciente.calcularIMC());

    entrada.close();
  }
}
