import processing.core.PApplet;
public class fourballs extends PApplet {
    public static final int width=640;
    public static final int height=488;
    int x=0;
    int j=0;
    int r=0;
    int k=0;
    @Override
    public void settings() {
        super.settings();
        size(width,height);
    }

    @Override
    public void draw() {

        ellipse(x,width/6,20,20);
        x++;
        ellipse(j,width*2/6,20,20);
        j=j+2;
        ellipse(r,width*3/6,20,20);
        r=r+3;
        ellipse(k,width*4/6,20,20);
        k=k+4;
    }

    public static void main(String[] args) {
        PApplet.main("fourballs",args); }
}

