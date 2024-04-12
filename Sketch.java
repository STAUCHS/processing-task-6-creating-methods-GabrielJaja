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
  private void drawFlower (int ciricle) {
    // Petals
    translate(450, 450);
    stroke(0);
    for (int intDegrees = 0; intDegrees <= 360; intDegrees += 45) {
      rotate((float) Math.toRadians(intDegrees));
      ellipse(0, 0, 15, 250);
    }
  // Circle 
      noStroke();
      fill(24, 97, 8);
      circle(0, 0, 60);
  }
  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
      drawFlower(circle);

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