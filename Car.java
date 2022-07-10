package com.company.vehicles;


import com.company.details.Engine;
import com.company.professions.Driver;

public class Car  {
    String marks ;
    String klass ;
    double weight ;
    String driverTip ;
    String motor = "Engine";

public void start(){
    System.out.println("Go");
}
public void stop(){
    System.out.println("Stop");
}
public void ternRight(){
    System.out.println("Tern on Right");
}
public void ternLeft(){
    System.out.println("Tern on Left");
}
Driver driver1 = new Driver("Ivan",35);
Engine engine1 = new Engine(200,"GM");
Engine engine2 = new Engine(300,"Fera");

public void toString (String marks,String klass,double weight,String driverTip,String motor){
    if (marks =="BMW"){
        System.out.println("Data: "+"Marks auto-"+marks+", klass auto -"+klass+ ", Driver name - "+ driver1.getName()+", Driver age : "+ driver1.getAge()+ ", motor - "+motor+" Driver name: "+ driver1.getName()+ ", Engine power: "+ engine1.getPower()+ ", Engine manufacture : "+engine1.getManufacturer());
    }
    else
    System.out.println("Data: "+"Marks auto-"+marks+", klass auto -"+klass+ ", Driver name - "+ driver1.getName()+", Driver age : "+ driver1.getAge()+ ", motor - "+motor+" Driver name: "+ driver1.getName()+ ", Engine power: "+ engine2.getPower()+ ", Engine manufacture : "+engine2.getManufacturer());

}
}
