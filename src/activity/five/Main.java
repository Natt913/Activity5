package activity.five;

import java.util.Date;

public class Main {

  //Write a static main method
  public static void main(String[] args) {
    //Creates two objects, one with the default constructor
    // Other with the constructor with parameters.
    // Give sample data for the parameters

    Date today = new Date();

    Feature[] f = {new InteriorFeature("AM/FM Radio"),
                    new ExteriorFeature("Wood Panels"),
                    new InteriorFeature("Air Conditioning"),
                    new ExteriorFeature("Moonroof")};

    for(int i = 0; i < 4; i++) {
      System.out.println(f[i].toString());
    }

    VehicleChassis myChassis = new VehicleChassis();
    System.out.println(myChassis);

    VehicleChassis myChassis2 = new VehicleChassis("Car");
    System.out.println(myChassis2);

    VehicleFrame vf1 = new VehicleFrame();
    System.out.println(vf1);

    VehicleFrame vf2 = new VehicleFrame("Ladder Frame");
    System.out.println(vf2);

    ManufacturedEngine me1 = new ManufacturedEngine();
    System.out.println(me1);

    ManufacturedEngine me2 = new ManufacturedEngine("Honda", today,
        "H-Series", "H23A1",
        "88 AKI", 4, "2WD: Two-Wheel Drive");
    System.out.println(me2);

    InteriorFeature if1 = new InteriorFeature();
    System.out.println(if1);

    InteriorFeature if2 = new InteriorFeature("Climate Control");
    System.out.println(if2);

    ExteriorFeature ef1 = new ExteriorFeature();
    System.out.println(ef1);

    ExteriorFeature ef2 = new ExteriorFeature("Fog Lamps");
    System.out.println(ef2);

    Vehicle v1 = new Vehicle();
    System.out.println(v1);

    Vehicle v2 = new Vehicle(today, "Honda", "Honda",
        "Prelude", vf2, "N/A", "2WD: Two-Wheel Drive", me2);
    System.out.println(v2);

    System.out.println("\n" + "\n" + "\n");
    Car c1 = new Car(today, "Honda", "Honda",
        "Prelude", vf2, "N/A", "2WD: Two-Wheel Drive", me2, f, 2);
    System.out.println(c1);

    Car c2 = new Car();
    System.out.println(c2);

  }
}
