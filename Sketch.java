import processing.core.PApplet;

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
  private void drawFlower (int X, int Y) {
    // Petals
    translate(60, 60);
    stroke(33, 99, 100);
    for (int intDegrees = 0; intDegrees <= 360; intDegrees += 45) {
      rotate((float) Math.toRadians(intDegrees));
      ellipse(0, 0, 15, 100);
    }
  // Circle 
      // noStroke();
      fill(233, 97, 80);
      circle(0, 0, 60);
  }
  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
      drawFlower();
    for (int drawFlower = (width / 5) / 2; drawFlower <= width; drawFlower += width / 5) {
      for (int drawFlowerY = (height / 5) / 2; drawFlowerY <= height; drawFlower += height / 5) {
        drawFlower();
      }
    }
  }


  /**
   * Description
   * 
   * @param 
   * @param 
   * @return
   * @author 
   */


  
}