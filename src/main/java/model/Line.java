package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Line extends Shape{
    private double length;
    private double angle;

    public Line(double x, double y, Color color, double length, double angle) {
        super(x, y,color);
        this.length = length;
        this.angle = angle;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.strokeLine(x,y,length,angle);
    }
}