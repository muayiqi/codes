class Person{
    String name;
    char sex;//M = Male,F = Female
    int age;
    Person(String name,char sex,int age){
        this.age = age;
        this.name = name;
        this.sex = sex;
    }
    void setData(String name,char sex,int age){
        this.age = age;
        this.name = name;
        this.sex = sex;
    }
    private String getPersonData(){
        String Data = name + "  " + sex + "  " + age;
        return Data;
    } 
    String getData(){
        return getPersonData();
    }
}
class Student extends Person{

    String sID;
    int classNo;
    Student(String name, char sex, int age,String sID,int classNo) {
        super(name, sex, age);
        this.sID = sID;
        this.classNo = classNo;
    }
    void setData(String name,char sex,int age,String sID,int classNo){
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.sID = sID;
        this.classNo = classNo;
    }
    String getData(){//����Ḳ�Ǹ�����ͬ��ͬ��������
        String Data = name + "  " + sex + "  " + age + "  " + sID + "  " + classNo;
        return Data;
    }
} 

public class Extends{
    public static void main(String args[]){
        Person person = new Person("��һ��",'M',19);
        System.out.println(person.getData());
        Student student = new Student("��һ��",'M',19,"2018091606003", 1606);
        System.out.println(student.getData());
    }
}