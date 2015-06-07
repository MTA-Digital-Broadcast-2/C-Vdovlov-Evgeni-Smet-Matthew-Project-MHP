package hellotvxlet;

import org.havi.ui.*;
import java.awt.*;
import org.dvb.ui.*;

public class MijnComponent extends HComponent
{
    private int x,y,height, width;
    
    public MijnComponent(int xpos, int ypos, int W, int H)
    {
        this.setBounds(0,0,W+50,H+50);
        this.x = xpos;
        this.y = ypos;
        this.width = W;
        this.height = H;
    }
    
    public void paint(Graphics g)
    {       
       g.setColor(new DVBColor(0,0,0,180));
       g.drawRoundRect(x, y, width + 30, height + 30, 10, 10);
       g.setColor(new DVBColor(0,0,255,80));
       g.fillRoundRect(x, y, width, height, 10, 10);
       g.setColor(new DVBColor(255,255,0,255));
       g.drawString("Tekst bitches!!!!!", x + 20, y + 40);

       //g.fillRect(0, 0, 100, 100);
       
    }
}
