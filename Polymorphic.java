class Rocent{
    void returnName(){
        System.out.println("��һ����Rocent");
    }
}
class Mouse extends Rocent{
    void returnName(){
        System.out.println("�ڶ�����Mouse");
    }
}
public class Polymorphic{
    public static void main(String args[]){
        Rocent[] rocents = {new Rocent(),new Mouse()};
        rocents[0].returnName();
        rocents[1].returnName();
    }
}