public interface Vehicle {//liskopv principle is that derived class can be substitute in place of base class
    public void start();
}
class vehicleWithEngine  implements Vehicle{
    @Override
    public void start(){
        System.out.println("Vehicle with Engine");
    }
}
class vehiclWithoutEngine implements Vehicle{
    @Override
    public void start(){
        System.out.println("Vehicle Without Engine");
    }
}
class Bike extends vehiclWithoutEngine{

}
class Car extends vehicleWithEngine{

}

