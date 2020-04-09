package Application.Behavior;

import Application.Type.Point;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class CompositeShape implements Shape{

    private Point _points;
    private Set<Shape> _set_shape;

    public CompositeShape() {
        this._set_shape = new HashSet<>();
    }

    public void add(Shape shape){
        _set_shape.add(shape);
    }

    public void remove(Shape shape){
        _set_shape.remove(shape);
    }

    @Override
    public void mouv(double x, double y) {
        _points = new Point(x,y);
    }

    @Override
    public void mouv(Point p) {
        _points = p;
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

    }

    @Override
    public void reduce(int num) {

    }

    @Override
    public void extend(int num) {

    }
}
