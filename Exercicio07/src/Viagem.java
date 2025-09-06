public class Viagem {
  private double distanciaKm;

  public double getDistanciaKm() {
    return distanciaKm;
  }

  public void setDistanciaKm(double distanciaKm) {
    this.distanciaKm = distanciaKm;
  }

  public double litrosNecessarios(Carro c) {
    return distanciaKm / c.getConsumoKmPorLitro();
  }
}
