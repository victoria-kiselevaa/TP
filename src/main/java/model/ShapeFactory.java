package model;

public class ShapeFactory {
    public Shape createShape(int num,double x, double y){
        if(num==1){
            return new Line(x,y,200,45);
        } else if (num==2) {
            return new Rectangle(x,y,100,50);
        } else if (num==3) {
            return new Hexagon(x,y);
        }else {
            return null;
        }
    }
}
