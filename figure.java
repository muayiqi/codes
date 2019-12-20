import java.awt.*;
import java.util.Scanner;
import java.awt.event.*;
import javax.swing.*;

class Rectangle {
    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void setLength(int newLength) {
        length = newLength;
    }

    void setWidth(int newWidth) {
        width = newWidth;
    }
}

class recFrame extends JFrame implements KeyListener{
    private static final long serialVersionUID = -1758269090444429434L;
    recFrame(int x, int y) {
        recPanel rp = new recPanel(x,y);
        add(rp);
        setSize(600,600);
        setBackground(Color.WHITE);
        setResizable(true);
        addKeyListener(new KeyAdapter(){});
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}
}
class recPanel extends JPanel{
    private static final long serialVersionUID = 3546867780766335167L;
    int x;
    int y;
    public void paint(Graphics g) {
        Rectangle rectangle = new Rectangle(x,y);
        super.paint(g);
        g.setColor(Color.BLACK);
        g.drawRect(0,0, rectangle.length, rectangle.width);
    }
    recPanel(int x,int y){
        this.x = x;
        this.y = y;
    }
}
public class figure {
    public static void main(String args[]){
        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        new recFrame(x,y);
        sc.close();
    }
}