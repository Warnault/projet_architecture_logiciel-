package Application.Behavior;

import Application.Type.Point;

public interface Shape {

    public void mouv(double x, double y);

    public void mouv(Point p);
    
    public void roundedCorners();
    
    public void leftRotation();
    
    public void rightRotation();
    
    public void display();
    
    public void color(Color color);
    
    public void reduce(int num);
    
    public void extend(int num);
}
