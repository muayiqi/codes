abstract class Vehice{
    abstract String NoOfWheels();//抽象方法，返回字符串（轮子数量）
}
class Car extends Vehice{

    String NoOfWheels() {
        return "四个轮子";
    }
}
class Motorbike extends Vehice{

    String NoOfWheels() {
        return "两个轮子";
    }
}

public class Abstract{
    public static void main(String args[]){
        Car car = new Car();
        Motorbike motorbike = new Motorbike();

        System.out.println("car有" + car.NoOfWheels());
        System.out.println("motorbike有" + motorbike.NoOfWheels());
    }
}