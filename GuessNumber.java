import java.util.Scanner;

class GuessNumber {
    int v;

    void greaterThan()
    {
        System.out.println("太大了！");
    }
    void smallerThan()
    {
        System.out.println("太小了！");
    }
    void right()
    {
        System.out.println("正确！");
    }
    GuessNumber(int v)
    {
        this.v = v;
    }

    public static void main(String args[]){
        GuessNumber p = new GuessNumber(5);
        Scanner r = new Scanner(System.in);
        int flag = 0;
        System.out.printf("开始猜数！请输入一个数：");
        while(flag == 0){
            int inputNum = r.nextInt();
            if(inputNum > p.v){
                p.greaterThan();
                continue;
            }
            if(inputNum < p.v){
                p.smallerThan();
                continue;
            }
            if(inputNum == p.v){
                p.right();
                flag = 1;
            }
        }
        r.close();
    }
}

