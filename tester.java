public class tester {
    public static void main(String[] args) {
                circle c1 = new circle(10, 20, 5.0);
                System.out.println("Circle c1: " + c1);

                Point p1 = new Point(3, 4);
                System.out.println("Point p1: " + p1);

                System.out.println("Perimeter of c1: " + c1.perimeter());
                System.out.println("Area of c1: " + c1.area());

                System.out.println("Distance between c1's center and p1: " + c1.distance(p1));

                System.out.println("Is p1 inside c1? " + c1.isInCircle(p1));

                c1.move(5, 5);
                System.out.println("Circle c1 after moving: " + c1);

                circle c2 = new circle(c1);
                System.out.println("Circle c2: " + c2);

                System.out.println("Are c1 and c2 equal? " + c1.equals(c2));

                c2.set_radius(7.5);
                System.out.println("Circle c2 after changing radius: " + c2);

                System.out.println("Is c1 larger than c2? " + c1.isLarger(c2));

    }
}
