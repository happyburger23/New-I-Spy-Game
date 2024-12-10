import java.awt.*;

public class PlayManager {
    //PLAYABLE AREA
    final int WIDTH = 360; //turn to 940
    final int HEIGHT = 600; //turn into 540

    public static int left_x;
    public static int right_x;
    public static int top_y;
    public static int bottom_y;

    public PlayManager() {
        left_x = (GamePanel.WIDTH / 2) - (WIDTH / 2); // 1280/2 - 720/2 = 460
        right_x = left_x + WIDTH;
        top_y = 50;
        bottom_y = top_y + HEIGHT;
    }

    public void update() {
        //
    }

    public void draw(Graphics2D g2) {
        //draw play area
        g2.setColor(Color.white);
        g2.setStroke(new BasicStroke(4f));
        g2.drawRect(left_x - 4, top_y - 4, WIDTH + 8, HEIGHT + 8);
    }
}
