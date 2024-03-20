public class Triangle extends Figure {
    private double width;
    private double heigth;

    public Triangle(int numberofSides, double width, double heigth) {
        super(numberofSides);
        this.width = width;
        this.heigth = heigth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }
    
    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    @Override
    public double getPerimeter() {
        return this.width*3;
    }

    @Override
    public double getArea() {
        return (this.heigth*this.width)/2;
    }

    @Override
    public String toString(){
        return "Triangle\n_________\nWidth: " + getWidth() + "\nHeigth: " + getHeigth() + "\nPerimeter: " + getPerimeter() + "\nArea: " + getArea();
    }
    
    
}
