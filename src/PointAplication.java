public class PointAplication {
    public static void main(String[] args) {
        Point point1 =new Point(5,6);
        PointController operation = new PointController();

        point1.print();
        operation.addX(point1);

        point1.print();
        operation.minusY(point1);

        point1.print();


    }
}
