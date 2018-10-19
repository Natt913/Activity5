package activity.five;

import java.util.Date;

public class ManufacturedEngine implements Engine {

  private String engineManufacturer;
  private Date engineManufacturedDate;
  private String engineMake;
  private String engineModel;
  private int engineCylinders;
  private String engineType;
  private String driveTrain;

  /**
   *A public default constructor with no formal parameters and initialize all instance variables
   * With generic literal values.
   */
  public ManufacturedEngine() {
    engineManufacturer = "Generic";
    engineManufacturedDate = new Date();
    engineMake = "Generic";
    engineModel = "Generic";
    engineCylinders = 0;
    engineType = "85 AKI";
    driveTrain = "2WD: Two-Wheel Drives";
  }

  /**
   * A public overloaded constructor with values for all of the variables.
   * @param engineManufacturer Is set to the manufacturer of the engine.
   * @param engineManufacturedDate Is set to the date the engine was manufactured.
   * @param engineMake Is set to the make of the engine.
   * @param engineModel Is set to the model of the engine.
   * @param engineCylinders Is set to the number of cylinders.
   * @param engineType Is set to the type of engine.
   * @param driveTrain Is set to the drive train.
   */
  public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate,
      String engineMake, String engineModel, String engineType, int engineCylinders,
      String driveTrain) {
    this.engineManufacturer = engineManufacturer;
    this.engineManufacturedDate = engineManufacturedDate;
    this.engineMake = engineMake;
    this.engineModel = engineModel;
    this.engineCylinders = engineCylinders;
    this.engineType = engineType;
    this.driveTrain = driveTrain;
  }

  /**
   * Method to set the number of cylinders an engine has.
   * @param engineCylinders The number os cyclinders an engine has.
   */
  public void setEngineCylinders(int engineCylinders) {
    this.engineCylinders = engineCylinders;
  }

  /**
   * Method to set the date that the engine was manufactured.
   * @param date The date the engine was manufactured.
   */
  public void setEngineManufacturedDate(Date date) {
    this.engineManufacturedDate = date;
  }

  /**
   * Method to set the name of the manufacturer.
   * @param manufacturer The name of the manufacturer.
   */
  public void setEngineManufacturer(String manufacturer) {
    this.engineManufacturer = manufacturer;
  }

  /**
   * Method to set the name of the make of the engine.
   * @param engineMake The name of the make of the engine.
   */
  public void setEngineMake(String engineMake) {
    this.engineMake = engineMake;
  }

  /**
   * Method to set the name of the model of the engine.
   * @param engineModel The name of the engine model.
   */
  public void setEngineModel(String engineModel) {
    this.engineModel = engineModel;
  }

  /**
   * Method to set the drive train of the engine.
   * @param driveTrain The drive train of the engine.
   */
  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;
  }

  /**
   * Method to set the type of fuel the engine takes.
   * @param fuel The name of the fuel it takes.
   */
  public void setEngineType(String fuel) {
    this.engineType = fuel;
  }

  /**
   * Method to return a string.
   * @return The template provided by Oracle.
   */
  public String toString() {
    return "Engine Manufacturer   : " + engineManufacturer + "\n"
        +  "Engine Manufactured   : " + engineManufacturedDate + "\n"
        +  "Engine Make           : " + engineMake + "\n"
        +  "Engine Model          : " + engineModel + "\n"
        +  "Engine Type           : " + engineType + "\n"
        +  "Engine Cylinders      : " + engineCylinders + "\n"
        +  "Drive Train           : " + driveTrain;
  }


}
