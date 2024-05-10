import processing.core.PApplet;

public class FourBallsGenerator extends PApplet {

    private static final int  WIDTH=640;
    private static final int  HEIGHT=480;
    private static final int DIAMETER=20;
    private static int x1=0,x2=0,x3=0,x4=0;
    private static final int TOTAL_NO_OF_BALLS = 4;
    Circle[] circles;

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        circles = new Circle[TOTAL_NO_OF_BALLS];
        circles[0] = new Circle(x1,HEIGHT/5, DIAMETER, 1);
        circles[1] = new Circle(x2,HEIGHT*2/5, DIAMETER, 2);
        circles[2] = new Circle(x3,HEIGHT*3/5, DIAMETER, 3);
        circles[3] = new Circle(x4,HEIGHT*4/5, DIAMETER, 4);

    }

    @Override
    public void draw() {
        for(Circle circle : circles) {
            circle.drawOnCanvas(this);
        }
    }

    private void paintWhite() {
        background(255);
    }

    public static void main(String[] args) {
        PApplet.main(FourBallsGenerator.class, args);
    }
}
