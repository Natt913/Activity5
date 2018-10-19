package activity.five;

import java.util.Date;

public class Car extends Vehicle {

  private Feature[] feature = new Feature[10];
  private int carAxle;


  public Car() {
    super();
    carAxle = 0;
    feature = new Feature[]{new InteriorFeature("Generic"),
        new ExteriorFeature("Generic"),
        new InteriorFeature("Generic"),
        new ExteriorFeature("Generic")};
  }

  public Car(Date vehicleManufacturedDate, String vehicleManufacturer, String vehicleMake,
      String vehicleModel, Chassis vehicleFrame, String vehicleType, String driveTrain, Engine vehicleEngine,
      Feature[] feature, int carAxle) {
    super(vehicleManufacturedDate, vehicleManufacturer, vehicleMake, vehicleModel, vehicleFrame,
        vehicleType, driveTrain, vehicleEngine);
    this.feature = feature;
    this.carAxle = carAxle;
  }

  //Struggling soooooooo much with this.

  public String getExteriorFeatures() {
    for (int i = 0; i < feature.length; i++) {
      if (feature[i] instanceof ExteriorFeature) {
        System.out.print("Exterior Feature      : " + feature[i]);

      }
    }
    return "";
  }

  public String getInteriorFeatures() {
    for (int i = 0; i < feature.length; i++) {
      if (feature[i] instanceof InteriorFeature) {
        System.out.print("Interior Feature      : " + feature[i]);
      }
    }
    return "";
  }

  public String toString() {

    System.out.println(super.toString());
    System.out.println("Features:");
    return getExteriorFeatures() + getInteriorFeatures();

  }

}
