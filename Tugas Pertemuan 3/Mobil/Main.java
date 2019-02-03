package Mobil;

public class Main {
  //Latihan overloading method
  public static void main(String[] args) {
    Mobil sedan = new Mobil();
    sedan.start();
    sedan.gas();
    sedan.gantiGigi(2);
    sedan.gas();
    sedan.gantiGigi(3);
    sedan.gas();
    sedan.rem();
    sedan.stop();
    sedan.gas();

  }
}