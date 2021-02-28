
package bus_average;


public class Bus_average {

    
    
  public double penumpang;
  public double maxPenumpang;
  public double counter;
  public double penumpangbaru;
  public Bus_average(double maxPenumpang){
    this.maxPenumpang = maxPenumpang;
}
  //Methhod mutator
  public void addpenumpang(double penumpang){
      double temp;
      temp = this.penumpang+penumpang;
      if (temp>maxPenumpang){
          System.out.println("Penumpang melebihi kuota");
      }
      else{
          this.penumpang=temp;
          counter++;
      }
  }
  public void getPenumpang(int password){
      if(password==24){
          System.out.println("Password benar");
      }
      else{
          System.out.println("Password salah");
      }
  }
  public double getaverage(){
      return penumpang/counter;
  }
  public void cetakPenumpang(){
      System.out.println("Penumpang sekarang adalah : "+penumpang);
      System.out.println("Maksimum penumpang yang seharusnya adalah : "+maxPenumpang);
    }
    
}
