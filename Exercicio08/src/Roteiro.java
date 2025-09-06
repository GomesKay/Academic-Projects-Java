public class Roteiro {
  private double distanciaKm;
  private double velocidadeMediaKmH;

  public double getDistanciaKm() {
    return distanciaKm;
  }

  public void setDistanciaKm(double distanciaKm) {
    this.distanciaKm = distanciaKm;
  }

  public double getVelocidadeMediaKmH() {
    return velocidadeMediaKmH;
  }

  public void setVelocidadeMediaKmH(double velocidadeMediaKmH) {
    this.velocidadeMediaKmH = velocidadeMediaKmH;
  }

  public double tempoHoras() {
    return distanciaKm / velocidadeMediaKmH;
  }
}