public class Termometro {
  private double celsius;

  public double getCelsius() {
    return celsius;
  }

  public void setCelsius(double celsius) {
    this.celsius = celsius;
  }

  public double paraFahrenheit() {
    return (celsius * 9 / 5) + 32;
  }

  public double paraKelvin() {
    return celsius + 273.15;
  }

  @Override
  public String toString() {
    return "Celsius: " + celsius + " °C";
  }
}
