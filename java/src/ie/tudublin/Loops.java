package ie.tudublin;

import javax.lang.model.util.ElementScanner14;

import processing.core.PApplet;

public class Loops extends PApplet {

    public void settings() {
        size(500, 500);
        cx = width / 2;
        cy = height / 2;        
    }

    int mode = 0;

    float cx;
    float cy;

    public void keyPressed() {
        // the value of mode will be the number of the 
        // number key pressed
        if (keyCode >= '0' && keyCode <= '9')
            mode = keyCode - '0';
    }

    public void setup() {
        colorMode(HSB);
    }

    public void draw() {
        background(0);
        switch (mode)
        {
            case 0:
                 fill(50, 255, 255);
                if (mouseX < cx)
                {
                    rect(0, 0, cx, height);
                }
                else
                {
                    rect(cx, 0, cx, height);
                }    
                break;
            case 1:
                fill(50, 255, 255);
                if (mouseX < cx && mouseY < cy)
                {
                    rect(0, 0, cx, cy);    
                }
               //else if ()

        }
    }
}
