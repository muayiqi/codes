abstract class Vehice{
    abstract String NoOfWheels();//���󷽷��������ַ���������������
}
class Car extends Vehice{

    String NoOfWheels() {
        return "�ĸ�����";
    }
}
class Motorbike extends Vehice{

    String NoOfWheels() {
        return "��������";
    }
}

public class Abstract{
    public static void main(String args[]){
        Car car = new Car();
        Motorbike motorbike = new Motorbike();

        System.out.println("car��" + car.NoOfWheels());
        System.out.println("motorbike��" + motorbike.NoOfWheels());
    }
}