package homeworks.homework8;

import java.awt.*;

public class Cell {
    private int x;
    private int y;
    private int size;
    private Color color;

    public Cell(int x, int y, int size, Color color){
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    public void set(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void paint(Graphics2D graphics2D){
        graphics2D.setColor(color);
        graphics2D.fillRect(x * size, y * size, size, size);
    }

    public void setColor(Color snakeHeadColor) {
        this.color = snakeHeadColor;
    }
}
