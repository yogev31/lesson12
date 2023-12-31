public class circle {
    private double _radius;
    private Point _center;

    public circle(int x, int y, double radius)
    {
        _center = new Point(x,y);
        if (radius > 0)
        {
            _radius = radius;
        }
        else {
            _radius = 1;
        }
    }
    public circle(Point center, double radius)
    {
        _center = new Point(center);
        if (radius > 0)
        {
            _radius = radius;
        }
        else {
            _radius = 1;
        }
    }

    public circle(circle other)
    {
        _center = new Point(other._center.get_x(),other._center.get_y());
        _radius = other._radius;
    }


    public Point get_center() {
        return _center;
    }

    public void set_center(Point _center) {
        this._center = _center;
    }

    public double get_radius() {
        return _radius;
    }

    public void set_radius(double _radius) {
        this._radius = _radius;
    }

    public double perimeter()
    {
        return this._radius*Math.PI*2;
    }

    public double area()
    {
        return Math.pow(this._radius,2)*Math.PI;
    }

    public void move(int deltax , int deltay)
    {
        _center.set_x(deltax+this._center.get_x());
        _center.set_y(deltay+this._center.get_y());
    }
    public boolean equals(circle other)
    {
        return this._center.isEqual(other._center) && this._radius == other._radius;
    }
    public boolean isLarger(circle other)
    {
        return this.area() > other.area();
    }
    public double distance(Point p)
    {
        return Math.sqrt(Math.pow(p.get_x()- this._center.get_x(),2)+ Math.pow(p.get_y()- this._center.get_y(),2));
    }
    public boolean isInCircle(Point p) {
        double distanceFromCenter = distance(p);
        return distanceFromCenter <= _radius; // Use <= for boundary inclusion
    }

    public String toString()
    {
        return ("the center of the circle = " + this._center.toString() +" and the radius " + this._radius);
    }

}
