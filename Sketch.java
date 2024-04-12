import processing.core.PApplet;
import java.util.Random;

public class Sketch extends PApplet {
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  private void colourChange (int PositionX ) {
    Random myRandom = new Random();
    if (PositionX >= 30) {
      fill(myRandom.nextInt(255), myRandom.nextInt(255),myRandom.nextInt(255));
    }
  }

  private void drawFlower (int PositionX, int PositionY) {
    // Petals
    translate(PositionX, PositionY);
    stroke(33, 99, 100);
    for (int intDegrees = 0; intDegrees <= 360; intDegrees += 45) {
      rotate((float) Math.toRadians(intDegrees));
      ellipse(0, 0, 15, 100);
    }

   
    
  // Circle 
      // noStroke();
      fill(233, 97, 80);
      circle(0, 0, 60);
      resetMatrix();
    }
  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    for (int drawFlower = (width / 3) / 2; drawFlower <= width; drawFlower += width / 3) {
      colourChange(drawFlower);
      for (int drawFlowerY = (height / 3) / 2; drawFlowerY <= height; drawFlowerY += height / 3) {
        resetMatrix();
        colourChange(drawFlowerY);
        drawFlower(drawFlower, drawFlowerY);
     }
    }
  }


  /**
   * A program that uses methods and parameters to 
   * 
   * @param intPositionX 
   * @param 
   * @author: Gabriel Jaja
   */


  
}