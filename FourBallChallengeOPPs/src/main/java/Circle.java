import processing.core.PApplet;

public class Circle {
    private int posX, posY, diameter, speed;
    public Circle(int posX, int posY, int diameter, int speed) {
        this.posX = posX;
        this.posY = posY;
        this.diameter = diameter;
        this.speed = speed;
    }

    public void drawOnCanvas(PApplet context){
        context.ellipse(posX, posY, diameter, diameter);
        posX += speed;
    }
}
