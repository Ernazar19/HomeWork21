import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("|------------------------------|" + "\n" +
                "|<~~~~~~~~~~~~MENU~~~~~~~~~~~~>|" + "\n" +
                "|------------------------------|" + "\n" +
                "| 1.AreaParallelepiped         |" + "\n" +
                "| 2.VolumeParallelepiped       |" + "\n" +
                "| 3.AreaCylinder               |" + "\n" +
                "| 4.VolumeCylinder             |" + "\n" +
                "|______________________________|");
        while (true) {
            try {
                Parallelepiped parallelepiped = new Parallelepiped();
                Cylinder cylinder = new Cylinder();
                Scanner scanner = new Scanner(System.in);
                switch (scanner.nextInt()) {
                    case 1:
                        System.out.println("~~~~Input height~~~~");
                        parallelepiped.setHeight(scanner.nextDouble());
                        System.out.println("~~~~Input length~~~~");
                        parallelepiped.setLength(scanner.nextDouble());
                        System.out.println("~~~~Input width~~~~");
                        parallelepiped.setWidth(scanner.nextDouble());
                        System.out.println("~~~~Result of the area  parallelepiped~~~~");
                        parallelepiped.findByArea();
                        System.out.println(parallelepiped);
                        break;
                    case 2:
                        System.out.println("~~~~Input Length~~~~");
                        parallelepiped.setLength(scanner.nextDouble());
                        System.out.println("~~~~Input Width~~~~");
                        parallelepiped.setWidth(scanner.nextDouble());
                        System.out.println("~~~~Input Heigth ");
                        parallelepiped.setHeight(scanner.nextDouble());
                        System.out.println("~~~~Result of the volume  parallelepiped~~~~");
                        parallelepiped.findByVolume();

                        break;
                    case 3:

                        System.out.println("~~~~Input radios~~~~");
                        cylinder.setRadios(scanner.nextDouble());
                        System.out.println("~~~~Input height~~~~");
                        cylinder.setHeight(scanner.nextDouble());
                        System.out.println("~~~~Result of the area  cylinder~~~~");
                        cylinder.area();

                        break;
                    case 4:

                        System.out.println("~~~~Input radios~~~~");
                        cylinder.setRadios(scanner.nextDouble());
                        System.out.println("~~~~Input height~~~~");
                        cylinder.setHeight(scanner.nextDouble());
                        System.out.println("~~~~Result of the volume  Cylinder~~~~");
                        cylinder.volume();
                    default:
                        System.out.println("Enter numbers from 1-4");
                }
            }  catch (Filter e) {
                System.out.println(e.getMessage());

            } catch (InputMismatchException e) {
                System.out.println("<~~~~Wrong input! Enter only numbers~~~~>");
            }
        }
    }
}
