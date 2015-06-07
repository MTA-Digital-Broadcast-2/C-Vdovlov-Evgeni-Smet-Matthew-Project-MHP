package hellotvxlet;

import javax.tv.xlet.*;
import org.dvb.ui.*;
import java.awt.*;
import java.awt.event.*;

import org.havi.ui.*;
import org.havi.ui.event.HActionListener;
/**
 * Just a simple xlet that draws a String in the center of the screen.
 */
public class HelloTVXlet implements Xlet, HActionListener{

   private XletContext actueleXletContext;
   private HScene scene;
   private boolean debug = true;
   
   private HStaticText tekstlabel;
   private HTextButton knop1, knop2,knop3,knop4,knop5;
    
   
    public void initXlet(XletContext context) throws XletStateChangeException 
    {
        this.actueleXletContext = context;
        HSceneTemplate sceneTemplate = new HSceneTemplate();
        
        sceneTemplate.setPreference(HSceneTemplate.SCENE_SCREEN_DIMENSION, new HScreenDimension(1.0f,1.0f), HSceneTemplate.REQUIRED);
        sceneTemplate.setPreference(HSceneTemplate.SCENE_SCREEN_LOCATION, new HScreenPoint(0.0f,0.0f), HSceneTemplate.REQUIRED);
        
        scene = HSceneFactory.getInstance().getBestScene(sceneTemplate);
            
            tekstlabel = new HStaticText("Wie wordt multimiljonair?");
            tekstlabel.setLocation(0, 0);
            tekstlabel.setSize(260, 50);
        
            knop1 = new HTextButton("Persoon 1");
            knop1.setLocation(100,100);
            knop1.setSize(100,50);
            knop1.setBackground(new Color(0,0,0,179));
            knop1.setBackgroundMode(HVisible.BACKGROUND_FILL);
        
            knop2 = new HTextButton("Persoon 2");
            knop2.setLocation(100,200);
            knop2.setSize(100,50);
            knop2.setBackground(new Color(0,0,0,179));
            knop2.setBackgroundMode(HVisible.BACKGROUND_FILL);
            
            knop3 = new HTextButton("Persoon 3");
            knop3.setLocation(300,100);
            knop3.setSize(100,50);
            knop3.setBackground(new Color(0,0,0,179));
            knop3.setBackgroundMode(HVisible.BACKGROUND_FILL);
            
            knop4 = new HTextButton("Persoon 4");
            knop4.setLocation(300,200);
            knop4.setSize(100,50);
            knop4.setBackground(new Color(0,0,0,179));
            knop4.setBackgroundMode(HVisible.BACKGROUND_FILL);
            
            knop5 = new HTextButton("Hulplijn");
            knop5.setLocation(400,200);
            knop5.setSize(100,50);
            knop5.setBackground(new Color(0,0,0,179));
            knop5.setBackgroundMode(HVisible.BACKGROUND_FILL);
            
            knop1.setFocusTraversal(null, knop2, null, knop3);
            knop2.setFocusTraversal(knop1, null, null, knop4);
            knop3.setFocusTraversal(null, knop4, knop1, null);
            knop4.setFocusTraversal(knop3, null, knop2, knop5);
            knop5.setFocusTraversal(null, null, knop4, null);
         
        scene.add(tekstlabel);
        scene.add(knop1);
        scene.add(knop2);
        scene.add(knop3);
        scene.add(knop4);
        scene.add(knop5);
        
        knop1.requestFocus();
        
        knop1.setActionCommand("winning");
        knop2.setActionCommand("losing");
        knop3.setActionCommand("losing");
        knop4.setActionCommand("losing");
        knop5.setActionCommand("hulp");
        
        knop1.addHActionListener(this);
        knop2.addHActionListener(this);
        knop3.addHActionListener(this);
        knop4.addHActionListener(this);
        knop5.addHActionListener(this);
        
    }

    public void startXlet() {
        if(debug) System.out.println("Xlet starten");
        
        scene.validate();
        scene.setVisible(true);
    }

    public void pauseXlet() {
        
    }

    public void destroyXlet(boolean unconditional) throws XletStateChangeException {
        
    }

    public void actionPerformed(ActionEvent e) 
    {
        HStaticText winnaarlabel;
        if ("winning".equals(e.getActionCommand())) 
        {
            winnaarlabel = new HStaticText("U bent een winnaar");
            winnaarlabel.setSize(260,50);
            winnaarlabel.setLocation(0,300);
            scene.add(winnaarlabel);
            scene.repaint();
        }
        else if("losing".equals(e.getActionCommand()))
        {
            winnaarlabel = new HStaticText("U bent een Verliezer");
            winnaarlabel.setSize(260,50);
            winnaarlabel.setLocation(0,300);
            scene.add(winnaarlabel);
            scene.repaint();
        }
        else if("hulp".equals(e.getActionCommand()))
        {
            scene.remove(knop2);
            scene.remove(knop4);
            scene.repaint();
        }
            
    }
}
