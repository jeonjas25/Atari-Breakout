public class AtariBreakout {
    // main() method
    public static void main(String[] args) {
        Paddle paddle = new Paddle(300, 640);
        GameCanvas gameCanvas = new GameCanvas(paddle);
    }
}

