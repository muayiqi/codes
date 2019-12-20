class Rocent{
    void returnName(){
        System.out.println("第一个是Rocent");
    }
}
class Mouse extends Rocent{
    void returnName(){
        System.out.println("第二个是Mouse");
    }
}
public class Polymorphic{
    public static void main(String args[]){
        Rocent[] rocents = {new Rocent(),new Mouse()};
        rocents[0].returnName();
        rocents[1].returnName();
    }
}