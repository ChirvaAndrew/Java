import java.util.Scanner;

enum Planet {
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6),
    MARS(6.421e+23, 3.3972e6),
    JUPITER(1.9e+27, 7.1492e7),
    SATURN(5.688e+26, 6.0268e7),
    URANUS(8.686e+25, 2.5559e7),
    NEPTUNE(1.024e+26, 2.4746e7);

    private final double mass;   // in kilograms
    private final double radius; // in meters

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() { return mass; }
    public double getRadius() { return radius; }

}




public class Main  {

    public static double calculateGravitationalForce(Planet planet, double mass) {
        final double G = 6.67430e-11;
        double force = G * (planet.getMass() * mass) / (planet.getRadius() * planet.getRadius());
        return force;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:\n1. Mercury\n2. Venus\n3. Earth\n4. Mars\n5. Jupiter\n6. Saturn\n7. Uranus\n8. Neptune\n9. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            if (choice == 9) {
                break;
            }

            Planet selectedPlanet = null;
            switch (choice) {
                case 1:
                    selectedPlanet = Planet.MERCURY;
                    break;
                case 2:
                    selectedPlanet = Planet.VENUS;
                    break;
                case 3:
                    selectedPlanet = Planet.EARTH;
                    break;
                case 4:
                    selectedPlanet = Planet.MARS;
                    break;
                case 5:
                    selectedPlanet = Planet.JUPITER;
                    break;

            }
            System.out.print("Enter the mass of the object in kilograms: ");
            double mass = input.nextDouble();
            double force = calculateGravitationalForce(selectedPlanet, mass);
            System.out.println("The gravitational force is: " + force + " N");


        }
    }
}