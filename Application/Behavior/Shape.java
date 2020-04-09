package Application.Behavior;

import Application.Type.Point;

import java.awt.*;

public interface Shape {

    public void mouv(double x, double y);

    public void mouv(Point p);
    
    public void roundedCorners();
    
    public void leftRotation();
    
    public void rightRotation();
    
    public void display();
    
    public void changeColor(Color color);
    
    public void reduce(int num);
    
    public void extend(int num);
}
