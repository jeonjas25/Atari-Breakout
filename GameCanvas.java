// import
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameCanvas extends JPanel implements ActionListener {
    private static final int SCREEN_HEIGHT = 700;
    private static final int SCREEN_WIDTH = 700;
    private Ball ball;
    private Paddle paddle;
    private Timer timer;
    private boolean isRunning = false;
    private int delay;
    private int score = 0;
    private int lives = 3;
    private int level = 1;

    public GameCanvas(Paddle paddle, Ball ball) {
        this.paddle = paddle;
        this.ball = ball;

        // setting up frame and panel
        this.setBackground(Color.BLACK);
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setFocusable(true);
        JFrame gameFrame = new JFrame("Atari Breakout");
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.add(this);
        gameFrame.setVisible(true);
        gameFrame.setResizable(false);
        gameFrame.pack();
        gameFrame.setLocationRelativeTo(null);

    }

    // starts game and timer
    public void startGame() {
        isRunning = true;
        timer = new Timer(delay, this);
        timer.start();
    }

    // drawing objects
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

            drawPaddle(g);
            drawBall(g);
    }

    public void drawPaddle(Graphics g) {
        // drawing paddle
        g.setColor(Color.DARK_GRAY);
        g.fillRect(paddle.getX(), paddle.getY(), 100, 10);
        g.setColor(Color.WHITE);
        g.drawRect(paddle.getX(), paddle.getY(), 100, 10);

        // drawing lines in paddle
        for (int i = 1; i < 5; i++) {
            g.drawLine(paddle.getX() + i * 20, paddle.getY(), paddle.getX() + i * 20, paddle.getY() + 10);
        }
        
    }

    public void drawBall(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(ball.getX(), ball.getY(), ball.getRadius() * 2, ball.getRadius() * 2);
        
    }

    public void drawBricks(Graphics g) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}