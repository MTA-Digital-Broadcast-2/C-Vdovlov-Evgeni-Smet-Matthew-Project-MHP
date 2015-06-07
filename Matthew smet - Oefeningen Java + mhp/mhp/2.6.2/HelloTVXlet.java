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
   private MijnComponent cmp;
    
   
    public void initXlet(XletContext context) throws XletStateChangeException 
    {
        this.actueleXletContext = context;
        HSceneTemplate sceneTemplate = new HSceneTemplate();
        
        sceneTemplate.setPreference(HSceneTemplate.SCENE_SCREEN_DIMENSION, new HScreenDimension(1.0f,1.0f), HSceneTemplate.REQUIRED);
        sceneTemplate.setPreference(HSceneTemplate.SCENE_SCREEN_LOCATION, new HScreenPoint(0.0f,0.0f), HSceneTemplate.REQUIRED);
        
        scene = HSceneFactory.getInstance().getBestScene(sceneTemplate);
            
            cmp = new MijnComponent(50, 50, 600, 200);
            
            scene.add(cmp);       
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
            
    }
}
