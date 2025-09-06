import java.util.Scanner;

/*
 * 🤖 Exemplo de execução
 * 
 * Digite o seu consumo em KWh: 250
 * Digite a sua tarifa: 0.75
 * 
 * Valor Total da Conta de Luz: 187.5
*/

// Conta de Luz - Cálculo direto
public class App {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    Conta conta = new Conta();

    System.out.print("Digite o seu consumo em KWh: ");
    conta.setConsumoKWh(entrada.nextDouble());

    System.out.print("Digite a sua tarifa: ");
    conta.setTarifa(entrada.nextDouble());

    System.out.println("Valor Total da Conta de Luz: R$ " + conta.valorTotal());

    entrada.close();
  }
}
