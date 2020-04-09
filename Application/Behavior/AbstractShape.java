package Application.Behavior;

import Application.Type.Point;

import java.awt.*;

public abstract class AbstractShape implements Shape {

    private Point _coord;
    private double _rotation; // degres 0 <= x <360
    private int _nb_side;
    private double _rounded_edge;
    private Color _color;

    public AbstractShape(Point p, double _rotation, int _nb_side,double rounded_edge,Color color) {
        _coord = p;
        _rotation = _rotation;
        _nb_side = _nb_side;
        _rounded_edge = rounded_edge;
        _color = color;
    }

    @Override
    public  void mouv(double x, double y){
        _coord = new Point(x,y);
    }

    @Override
    public void mouv(Point p ){
        _coord = p;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void roundedCorners() {

    }

    @Override
    public void leftRotation() {

    }

    @Override
    public void rightRotation() {

    }

    @Override
    public void display() {

    }

    @Override
    public void changeColor(Color color) {
        _color = color;
    }

    public abstract void reduce(int num);
    public abstract void extend(int num) ;
}
