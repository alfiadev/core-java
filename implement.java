
interface Drivable {
    void drive();
    default void fuelType(){
        System.out.println("By defualt fuel type is patrol");
    }
}
abstract class vehicle{
    private int year ;
    private String Brand ;

   public vehicle(int year,String Brand){
    this.year=year;
    this.Brand=Brand;

    
   }
   public void setYear(int year){
        this.year=year;
    }

    public int getYear(){
        return year;
    }
      public void setBrand(String Brand){
        this.Brand=Brand;
    }

    public int getBrand(){
        return year;
    }

    public abstract  void start();
    
    public void displayInfo(){
        System.out.println("Brand" +year + " year"+Brand);
    }
}
class Car extends  vehicle implements Drivable{
  private String model;

  public  Car(int year ,String Brand,String model){
        
      super(year,Brand);
      this.model=model;

    

    } public void start(String keyType){
        System.out.println("car starting withn keytype"+keyType);
     } 
     public void start(){
        System.out.println("car is  starting with push button");
     }
     public void drive(){
        System.out.println("car is being driven");
     }

     public void showCarDetail(){
        displayInfo();
        System.out.println("model"+model);
     }
    
}


class Driver{
    public void testDrive(Drivable vehicle){
         vehicle.drive();
         vehicle.fuelType();

    }

}


class OopsConceptDemo{
    public static void main(String[] args) {
          Car myCar= new Car(2022,"Toyota","camry");

          System.out.println("brant of the Car"+myCar.getBrand());
          
          System.out.println("brant of the Car"+myCar.getYear());

          myCar.start("smart key");
          
          myCar.start();

          Drivable drivableCar=myCar;
          
          drivableCar.drive();

          myCar.showCarDetail();

          Driver driver= new Driver();
          driver.testDrive(myCar);
          

    }
}