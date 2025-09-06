import java.util.Scanner;

/*
 * 🤖 Exemplo de execução
 * 
 * Digite o modelo do carro: Gol
 * Digite o consumo (km por litro): 
 * Digite a distância da viagem (km): 
 * 
 * O carro Gol precisará de 20.00 litros para a viagem.
*/

// Combustível - Consumo de um único trajeto
public class App {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    Carro carro = new Carro();
    Viagem viagem = new Viagem();

    System.out.print("Digite o modelo do carro: ");
    carro.setModelo(entrada.nextLine());

    System.out.print("Digite o consumo (km por litro): ");
    carro.setConsumoKmPorLitro(entrada.nextDouble());

    System.out.print("Digite a distância da viagem (km): ");
    viagem.setDistanciaKm(entrada.nextDouble());

    double litros = viagem.litrosNecessarios(carro);

    System.out.printf("\nO carro %s precisará de %.2f litros para a viagem.\n", carro.getModelo(), litros);

    entrada.close();
  }
}
