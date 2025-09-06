import java.util.Scanner;

/*
 * 🤖 Exemplo de execução
 * 
 * Digite a tempetura em Celsius: 25
 * 
 * Celsius: 25.0 °C
 * Fahrenheit: 77.0 °F
 * Kelvin: 298.15 K
*/

// Termômetro - Conversões
public class App {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    Termometro termometro = new Termometro();

    System.out.print("Digite a tempetura em Celsius: ");
    termometro.setCelsius(entrada.nextDouble());

    System.out.println("\n" + termometro);
    System.out.println("Fahrenheit: " + termometro.paraFahrenheit() + " °F");
    System.out.println("Kelvin: " + termometro.paraKelvin() + " K");

    entrada.close();
  }
}
