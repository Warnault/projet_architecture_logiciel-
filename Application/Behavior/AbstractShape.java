package Application.Behavior;

import Application.Type.Point;

public abstract class AbstractShape implements Shape {

    private Point _coord;
    private double _rotation; // degres 0 <= x <360
    private int _nb_side;
    private double _rounded_edge;


    @Override
    public  void mouv(double x, double y){
        _coord = new Point(x,y);
    }

    @Override
    public void mouv(Point p ){
        _coord = p;
    }

    public AbstractShape(Point p, double _rotation, int _nb_side,double rounded_edge) {
        _coord = p;
        _rotation = _rotation;
        _nb_side = _nb_side;
        _rounded_edge = rounded_edge;
    }

}
