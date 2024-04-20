import processing.core.PApplet;
import java.util.Random;

public class Sketch extends PApplet {

  public void settings() {
    size(600, 400);
  }
  public void setup() {
    background(210, 255, 173);
  }
  
  private void colourChange (int PositionX ) {
    Random myRandom = new Random();
    if (PositionX >= 30) {
      fill(myRandom.nextInt(255), myRandom.nextInt(255),myRandom.nextInt(255));
    }
  }
/**
  * A code drawFlower that draws the the nucleus in a grid and rotates each ellipse by 45 degrees
  * @param intPositionX: This parameter changes the location of the nucleus along the X-axis
  * @param intPositionY: This parameter changes the location of the nucleus along the Y-axis
  * @author: Gabriel Jaja
  */
  private void drawFlower (int PositionX, int PositionY) {
    // Petals
    translate(PositionX, PositionY);
    stroke(33, 99, 100);
    for (int intDegrees = 0; intDegrees <= 360; intDegrees += 45) {
      rotate((float) Math.toRadians(intDegrees));
      ellipse(0, 0, 15, 100);
    }
  }

  /**
  * A code drawTinyNucleus that draws the "two eyes" in between the shape of the nucleus 
  * 
   * @param NsPositionX: This parameter changes the location of the nucleus along the X-axis
   * @param NstPositionY: This parameter changes the location of the nucleus along the Y-axis
   * @author: Gabriel Jaja
   */

  private void drawTinynucleus (int NsPositionX, int NsPositionY) {
  translate(NsPositionX, NsPositionY);
    stroke(100, 25, 8);
    fill (100, 8, 25);
    for (int intNsPositionX = 10; intNsPositionX <= 30; intNsPositionX += 100) {
      for (int intNsPositionY = 30; intNsPositionY <= 360; intNsPositionY += 45) {
        ellipse(NsPositionX - -17, NsPositionY + 20 , 20, 20);
      }
        for (int intNsPositionY = 30; intNsPositionY <= 360; intNsPositionY += 45) {
          ellipse(NsPositionX - 55, NsPositionY - 50 , 20, 20);
        }
        fill (255);
        for (int intNsPositionY = 30; intNsPositionY <= 360; intNsPositionY += 45) {
          ellipse(NsPositionX - 8, NsPositionY + -10, 8, 15);
        }
        for (int intNsPositionY = 30; intNsPositionY <= 360; intNsPositionY += 45) {
          ellipse(NsPositionX - 30, NsPositionY + -10, 8, 15);
      }
    }

// Eyes inside Circle
   noStroke();
   fill(233, 97, 80);
   circle(0, 0, 5);
   translate(NsPositionX - 33, NsPositionY - 10);
   circle(0, 0, 5);
   resetMatrix();
  }

  public void draw() {
    for (int drawFlower = (width / 3) / 2; drawFlower <= width; drawFlower += width / 3) {
      colourChange(drawFlower);
      for (int drawFlowerY = (height / 3) / 2; drawFlowerY <= height; drawFlowerY += height / 3) {
        resetMatrix();
        colourChange(drawFlowerY);
        drawFlower(drawFlower, drawFlowerY);

      drawTinynucleus(10, 10);
      }
    }
  }
}