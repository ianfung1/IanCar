public class Rectangle {

    private double Length;
    private double Width;

    public Rectangle(double Length, double Width){
        this.Length = Length;
        this.Width = Width;

    }

    public double Length() {
        return Length;
    }

    public double Width() {
        return Width;
    }


    public void Length(double Length) {
        this.Length = Length;
    }

    public void Width(double Width) {
        this.Width = Width;
    }

    public double getArea(){
        return Length * Width;
    }

    public double getDiagonal(){
        return Math.sqrt((Length * Length) + (Width * Width));
    }

    public boolean isSquare(){
        if(Length == Width){
            return true;
        }else{
            return false;
        }
    }
}
