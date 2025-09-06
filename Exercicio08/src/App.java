import java.util.Scanner;

/*
 * 🤖 Exemplo de execução
 * 
 * Digite a distância em (km): 300
 * Digite a velocidade média em (km/h): 60
 * 
 * O tempo estimado é de viagem: 5 horas
*/

// Tempo de Viagem - Cálculo simples
public class App {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    Roteiro roteiro = new Roteiro();

    System.out.print("Digite a distância em (km): ");
    roteiro.setDistanciaKm(entrada.nextDouble());

    System.out.print("Digite a velocidade média em (km/h): ");
    roteiro.setVelocidadeMediaKmH(entrada.nextDouble());

    double tempo = roteiro.tempoHoras();
    System.out.println("\nO tempo estimado é de viagem: " + Math.round(tempo) + " horas");

    entrada.close();
  }
}
