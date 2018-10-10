package Activity5;

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

    VehicleChassis myChassis = new VehicleChassis();
    System.out.println(myChassis.toString());

    VehicleChassis myChassis2 = new VehicleChassis("Car");
    System.out.println(myChassis2.toString());

    VehicleFrame vf1 = new VehicleFrame();
    System.out.println(vf1.toString());

    VehicleFrame vf2 = new VehicleFrame("Coupe");
    System.out.println(vf2.toString());

    ManufacturedEngine me1 = new ManufacturedEngine();
    System.out.println(me1.toString());

    ManufacturedEngine me2 = new ManufacturedEngine("Honda", today,
        "H-Series", "H23A1", 4,
        "88 AKI", "2WD: Two-Wheel Drive");
    System.out.println(me2.toString());

    InteriorFeature if1 = new InteriorFeature();
    System.out.println(if1.toString());

    InteriorFeature if2 = new InteriorFeature("Climate Control");
    System.out.println(if2.toString());

    ExteriorFeature ef1 = new ExteriorFeature();
    System.out.println(ef1.toString());

    ExteriorFeature ef2 = new ExteriorFeature("Fog Lamps");
    System.out.println(ef2.toString());

    Vehicle v1 = new Vehicle();
    System.out.println(v1.toString());

    Vehicle v2 = new Vehicle(today, "Honda", "Honda",
        "Prelude", vf2, "N/A", "2WD: Two-Wheel Drive", me2);
    System.out.println(v2.toString());

  }
}
