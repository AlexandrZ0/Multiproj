
public class Car implements runnable{
  
  String name;
  runnable rb;
  static int second;
  boolean flag = false;
  
  Car(runnable rb){
     this.rb = rb;
     flag = true;
  }
  Car(String name){
     this.name = name;
  }
  
  public static int pause(int param){
	  
	  second = param;
	  return second;
  }
  
  void start(){
     if(flag == true){
        rb.run();
     }else run();
  }
  
   
  
  public void run(){
    System.out.println("This car is running !!!");
  }
  
  String getName(){
     return this.name;
  }
  
  public static void main(String args[]) {
	  new Bmw("BMW").start();
	  
	  Audi audi = new Audi();
	  Car car = new Car(audi);
	  car.start();
  }
 
} 


class Bmw extends Car{
  
  Bmw(String name){
     super(name);
  }
  
  public void run(){
	 int pause = Car.pause(1000);
     System.out.println(this.name+" is running !!!"+pause);
  }

}


class Audi implements runnable{
   /* public void start(){
   
   }*/
   public void run(){
      System.out.println("I am Audi");
   }
}

interface runnable{
   void run();
}



