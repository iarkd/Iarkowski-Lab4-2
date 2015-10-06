// Lab04Bst.java
// The Expo Graphics Program
// This is the student, starting version, of Lab 04B.


import java.awt.*;
import java.applet.*;


public class Lab04Bst extends Applet
{

    public void paint(Graphics g)
    {
        // DRAW CUBE
           Expo.drawRectangle(g,50,150,250,350);
           Expo.drawRectangle(g,150,250,350,450);
           Expo.drawLine(g,50,150,150,250);
           Expo.drawLine(g,250,350,350,450);
           Expo.drawLine(g,50,350,150,450);
           Expo.drawLine(g,250,150,350,250);


        // DRAW TARGET
           Expo.setColor(g,Expo.black);
           Expo.fillCircle(g,650,300,125);
           Expo.setColor(g,Expo.white);
           Expo.fillCircle(g,650,300,100);
           Expo.setColor(g,Expo.blue);
           Expo.fillCircle(g,650,300,75);
           Expo.setColor(g,Expo.red);
           Expo.fillCircle(g,650,300,50);
           Expo.setColor(g,Expo.yellow);
           Expo.fillCircle(g,650,300,25);
           Expo.setColor(g,Expo.black);

        // DRAW TRIANGLE
           Expo.drawLine(g,775,600,775,900);
           Expo.drawLine(g,775,600,675,900);
           Expo.drawLine(g,775,600,875,900);
           Expo.drawLine(g,675,900,875,900);
           Expo.drawLine(g,675,900,825,750);
           Expo.drawLine(g,875,900,725,750);


        // DRAW SMILEY FACE
           Expo.drawOval(g,450,700,100,150);
           //Expo.drawLine(g,450,550,450,850);
           //Expo.drawLine(g,350,700,550,700);
           Expo.drawArc(g,450,725,75,50,90,270);
           Expo.drawPoint(g,415,640);
           Expo.drawPoint(g,485,640);
           Expo.drawCircle(g,415,640,20);
           Expo.drawCircle(g,485,640,20);
           Expo.drawArc(g,415,615,20,10,270,90);
           Expo.drawArc(g,485,615,20,10,270,90);
        // DRAW JPII






    }

}


