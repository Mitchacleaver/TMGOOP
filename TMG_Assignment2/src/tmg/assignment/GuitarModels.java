/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tmg.assignment;

import java.time.LocalDate;

/**
 *
 * @author thomaskerr-smith
 */
public class GuitarModels extends IndividualGuitar
{
  String guitarModel;
  private String guitarType;
  private String guitarBuilder;
  private String guitarBackWood;
  private String guitarTopWood;

    public GuitarModels(String guitarModel, String guitarType, String guitarBuilder, String guitarBackWood, String guitarTopWood, double guitarSerialNumber, int guitarYear, double guitarRentCharge, String guitarColour, double guitarLength, double guitarWidth, double guitarHeight, String guitarStatus, LocalDate dayRented, LocalDate dayReturn) {
        super(guitarSerialNumber, guitarYear, guitarRentCharge, guitarColour, guitarLength, guitarWidth, guitarHeight, guitarStatus, dayRented, dayReturn);
        this.guitarModel = guitarModel;
        this.guitarType = guitarType;
        this.guitarBuilder = guitarBuilder;
        this.guitarBackWood = guitarBackWood;
        this.guitarTopWood = guitarTopWood;
    }

    public String getGuitarModel() {
        return guitarModel;
    }

    public void setGuitarModel(String guitarModel) {
        this.guitarModel = guitarModel;
    }

    public String getGuitarType() {
        return guitarType;
    }

    public void setGuitarType(String guitarType) {
        this.guitarType = guitarType;
    }

    public String getGuitarBuilder() {
        return guitarBuilder;
    }

    public void setGuitarBuilder(String guitarBuilder) {
        this.guitarBuilder = guitarBuilder;
    }

    public String getGuitarBackWood() {
        return guitarBackWood;
    }

    public void setGuitarBackWood(String guitarBackWood) {
        this.guitarBackWood = guitarBackWood;
    }

    public String getGuitarTopWood() {
        return guitarTopWood;
    }

    public void setGuitarTopWood(String guitarTopWood) {
        this.guitarTopWood = guitarTopWood;
    }

    public double getGuitarSerialNumber() {
        return guitarSerialNumber;
    }

    public void setGuitarSerialNumber(double guitarSerialNumber) {
        this.guitarSerialNumber = guitarSerialNumber;
    }

    public int getGuitarYear() {
        return guitarYear;
    }

    public void setGuitarYear(int guitarYear) {
        this.guitarYear = guitarYear;
    }

    public double getGuitarRentCharge() {
        return guitarRentCharge;
    }

    public void setGuitarRentCharge(double guitarRentCharge) {
        this.guitarRentCharge = guitarRentCharge;
    }
  
  
}