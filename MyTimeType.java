public class MyTimeType{
    private int hour;
    private int minute;
    private int second;

    MyTimeType(int hour,int minute,int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    void display(){
        System.out.printf("%02d:%02d:%02d\n", hour,minute,second);
    }
    void addSecond(int sec){
        int CHour = (sec + this.second) / 3600;
        int CMimute = (sec + this.second - CHour * 3600) / 60;

        if(CHour > 0){
            addHour(CHour);
        }
        if(CMimute > 0){
            addMinute(CMimute);
        }
        this.second = this.second + sec - CHour * 3600 - CMimute * 60;
    }
    void addMinute(int min){
        int CHour = (min + this.minute) / 60;
        if(CHour > 0){
            addHour(CHour);
        }
        this.minute = this.minute + min - CHour * 60;
    }
    void addHour(int hour){
        if(this.hour + hour > 24){
            this.hour = (this.hour + hour) % 24;
        }
        else{
            this.hour = this.hour + hour;
        }
    }

    public static void main(String args[])
    {
        MyTimeType myTimeType = new MyTimeType(12, 20, 34);
        System.out.print("原时间：");
        myTimeType.display();
        System.out.print("更改后时间：");
        myTimeType.addMinute(40);
        myTimeType.display();
    }
}