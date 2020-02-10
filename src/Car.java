public class Car {

    private int year;
    private int miles;
    private String model;

    public Car(int year, int miles, String model){
        this.year= year;
        this.model = model;
        this.miles = 0;
    }


    public int getYear() {
        return year;
    }

    public int getMiles() {
        return miles;
    }

    public String getModel() {
        return model;
    }



    public void setYear(int year) {
        this.year = year;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public String toString() {
        return "Car{" +
                "year=" + year +
                ", miles=" + miles +
                ", model='" + model + '\'' +
                '}';
    }


    public void drive(int miles){
        this.miles += miles;
    }
}
