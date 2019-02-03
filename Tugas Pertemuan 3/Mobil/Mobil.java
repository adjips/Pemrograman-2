package Mobil;
 
public class Mobil {
  private boolean started;
  private int kecMax;
  private int percepatan;
  private int kecAktual;

  public int getKecMax(){
    return kecMax;
  }

  public int getPercepatan(){
    return percepatan;
  }

  public void setPercepatan(int percepatan){
    this.percepatan = percepatan;
  }

  public int getKecAktual(){
    return this.kecAktual;
  }

  public Mobil() {
    this.started = false;
    this.kecMax = 120;
    this.percepatan = 10;
    this.kecAktual = 0;
  }

  public void start() {
    started = true;
    System.out.println("Menyalakan Mobil, Mobil dijalankan");
  }

  public void gas() {
    if (started == false) {
      System.out.println("Mesin belum dihidupkan");
    } else {
      kecAktual = kecAktual + percepatan;
      System.out.println("Mobil digas, kecepatan sekarang : "+ kecAktual +"Km/Jam");
    }
  }

  public void rem() {
    if (started == false) {
      System.out.println("Mobil direm, tapi mesin belum hidup...");
    } else {
      kecAktual = kecAktual / 2;
      System.out.println("Mobil direm, sekarang percepatannya "+ kecAktual);
    }
  }
  
  public void gantiGigi(int gigi) {
    if (started == false) {
      System.out.println("Ganti gigi, tapi mesin belum hidup...");
    } else {
      percepatan = percepatan / 2 * gigi;
      System.out.println("Ganti gigi, sekarang percepatannya : "+ percepatan);
    }
  }

  public void stop() {
    System.out.println("Mobil Berhenti");
    started = false;
    kecAktual = 0;
    percepatan = 10;
  }
}