package homeworks.homework8;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class GameSnake extends JFrame {
    final String TITLE_OF_PROGRAM = "Classic Game Snake";
    final String GAME_OVER_MSG = "GAME OVER";
    final static int CELL_SIZE = 20;           // size of cell in pix
    final static int CANVAS_WIDTH = 30;        // width in cells
    final static int CANVAS_HEIGHT = 25;       // height in cells
    //red HEX
    final static Color SNAKE_COLOR = new Color(0x23CE6B);
    final static Color SNAKE_HEAD_COLOR = new Color(0x1A535C);
    final static Color FOOD_COLOR = new Color(0xBF211E);
    final static Color POISON_COLOR = new Color(0x031926);

    private static Image background;
    final static int KEY_LEFT = 37;            // codes
    final static int KEY_UP = 38;              //   of
    final static int KEY_RIGHT = 39;           //   cursor
    final static int KEY_DOWN = 40;            //   keys
    final int START_SNAKE_SIZE = 5;            // initialization data
    final int START_SNAKE_X = CANVAS_WIDTH / 2;  //   for
    final int START_SNAKE_Y = CANVAS_HEIGHT / 2; //   snake
    final int SNAKE_DELAY = 130;               // snake delay in milliseconds
    int snakeSize = 0;                         // current snake size
    static boolean gameOver = false;           // a sign game is over or not
    Canvas canvas;
    Snake snake;
    Food food;
    Poison poison;

    public GameSnake() {
        setTitle(TITLE_OF_PROGRAM);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(CELL_SIZE * CANVAS_WIDTH,
                CELL_SIZE * CANVAS_HEIGHT));
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                snake.setDirection(e.getKeyCode());
            }
        });

        add(canvas);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }


    public static void main(String[] args) throws IOException {
        background = ImageIO.read(new java.io.File("src/homeworks/homework8/background.jpg"));
        new GameSnake().game();
    }

    private void game() {
        snake = new Snake(
                START_SNAKE_X,
                START_SNAKE_Y,
                START_SNAKE_SIZE,
                KEY_RIGHT
        );
        food = new Food(snake);
        snake.setFood(food);

        poison = new Poison(snake);
        poison.setFood(food);
        food.setPoison(poison);
        snake.setPoison(poison);

        while (!gameOver) {
            snake.move();

            if (snake.size() > snakeSize) {
                snakeSize = snake.size();
                setTitle(TITLE_OF_PROGRAM + ": " + snakeSize + " points");
            }

            if (food.isEaten()) {
                food.appear();
                poison.add();
            }
            canvas.repaint();
            sleep(SNAKE_DELAY);
        }
        JOptionPane.showMessageDialog(this, GAME_OVER_MSG);
    }

    private void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    class Canvas extends JPanel {    // class for rendering (drawing)
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            Graphics2D g2D = (Graphics2D) g;
            g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            g2D.drawImage(background, 0, 0, getWidth(), getHeight(), this);
            snake.paint(g2D);
            food.paint(g2D);
            poison.paint(g2D);
        }
    }
}