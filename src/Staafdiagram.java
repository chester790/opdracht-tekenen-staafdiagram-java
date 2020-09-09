import java.awt.*;
import java.applet.*;

public class Staafdiagram extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(20,200,250,200);
        g.drawLine(20,200,20,50);
        g.setColor(Color.red);
        g.fillRect(30,150,30,50);
        g.drawRect(30,150,30,50);
        g.setColor(Color.BLUE);
        g.fillRect(110,55,30,145);
        g.drawRect(110,55,30,145);
        g.setColor(Color.ORANGE);
        g.fillRect(190,80,30,120);
        g.drawRect(190,80,30,120);
        g.setColor(Color.black);
        g.drawString("Valerie",30,215);
        g.drawString("Jeroen",105,215);
        g.drawString("Hans",190,215);
        g.drawString("KG",15,40);
        g.drawString("20",5,180);
        g.drawString("40",5,150);
        g.drawString("60",5,120);
        g.drawString("80",5,90);
        g.drawString("100",-1,60);

    }
}