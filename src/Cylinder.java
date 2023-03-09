import static java.lang.Math.PI;
public class Cylinder {
    private double radios;
    private double height;

    public Cylinder() {
    }

    public double getRadios() {
        return radios;
    }

    public void setRadios(double radios) throws Filter {
        if (radios <= -0) {
            throw new Filter("Negative numbers are not allowed!!");
        }
        this.radios = radios;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) throws Filter {
            if (height <= -0) {
                throw new Filter("Negative numbers are not allowed!!");
            }
            this.height = height;

    }

    @Override
    public String toString() {
        return "Cylinder: " +"\n"+
                "radius: " + radios +"\n"+
                "height: " + height ;
    }

    void area() {
        System.out.println(2 * PI * radios * (height + radios));
    }

    void volume() {
        System.out.println((PI * radios * radios * height));
    }
}

