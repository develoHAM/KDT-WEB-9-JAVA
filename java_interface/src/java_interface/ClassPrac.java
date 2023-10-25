package java_interface;

abstract class Vehicl{
   private String name;
   private int maxSpeed;
   
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getMaxSpeed() {
      return maxSpeed;
   }
   public void setMaxSpeed(int maxSpeed) {
      this.maxSpeed = maxSpeed;
   }
   abstract void move(String name, int speed);
   
}
interface Flyabless{
   void fly();
}
class Carss extends Vehicl{
   @Override
   public void move(String name, int maxSpeed) {
      this.setName("AUDI");
      this.setMaxSpeed(240);
      System.out.println(this.getName()+"의 속도는 : "+this.getMaxSpeed());
      System.out.println("도로를 따라 이동중"); 
   }
}

class Airplaness extends Vehicl implements Flyabless{
   
   @Override
   public void move(String name, int maxSpeed) {
      this.setName("보잉747");
      this.setMaxSpeed(9999);
      System.out.println(this.getName() +"의 속도는 : "+this.getMaxSpeed());
      System.out.println("하늘을 날아가는 중");
   }

   @Override
   public void fly() {
      System.out.println("고도 10,000피트에서 비행중");
      
   }
}

public class ClassPrac {
   public static void main(String []args) {
      Carss cars = new Carss();
      Airplaness air = new Airplaness();
      Vehicl[]  vehicles= {cars, air};
      for(Vehicl vehicle: vehicles) {
         vehicle.move(vehicle.getName(), vehicle.getMaxSpeed());
         if(vehicle instanceof Flyabless) {
            Flyabless flyingvehicle = (Flyabless) vehicle;
            flyingvehicle.fly();
//            ((Flyable) vehicle).fly();
         }
      }
   }

}