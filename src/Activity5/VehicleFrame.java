package Activity5;

public class VehicleFrame implements Chassis {

  private String vehicleFrameType;

  public VehicleFrame() {
    vehicleFrameType = "Unibody";
  }

  public VehicleFrame(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  public Chassis getChassisType() {
    return this;
  }

  public void setChassisType(String vehicleChassis) {
    vehicleFrameType = vehicleChassis;
  }

  public String toString() {
    return "Chassis       : Chassis\n"
         + "Vehicle Frame : " + vehicleFrameType + "\n";
  }

}
