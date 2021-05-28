public class PointAplication {
    public static void main(String[] args) {
        Point point1 =new Point(5,6);
        PointController operation = new PointController();

        System.out.println("Punkt x: "+ point1.x + " Point y: " + point1.y);

        operation.addX(point1);

        point1.print();
        operation.minusY(point1);
        point1.print();


    }
}
