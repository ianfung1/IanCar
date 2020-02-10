public class Runner {

    public static void main(String[] args) {
        Car myCar = new Car(2006, 100000, "LightningMcqueen");
        System.out.println(myCar.toString());

        Rectangle myRectangle = new Rectangle(3, 4);
        System.out.println(myRectangle.getArea());
        System.out.println(myRectangle.getDiagonal());
        System.out.println(myRectangle.isSquare());
    }
}

