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
public class IndividualGuitar
{
    double guitarSerialNumber;
    int guitarYear;
    double guitarRentCharge;
    private String guitarColour;
    private double guitarLength;
    private double guitarWidth;
    private double guitarHeight;
    String guitarStatus;
    private LocalDate dayRented;
    private LocalDate dayReturn;

    /**
     *
     * @param guitarSerialNumber
     * @param guitarYear
     * @param guitarRentCharge
     * @param guitarColour
     * @param guitarLength
     * @param guitarWidth
     * @param guitarHeight
     * @param guitarStatus
     * @param dayRented
     * @param dayReturn
     */
    public IndividualGuitar(double guitarSerialNumber, int guitarYear, double guitarRentCharge, String guitarColour, double guitarLength, double guitarWidth, double guitarHeight, String guitarStatus, LocalDate dayRented, LocalDate dayReturn) {
        this.guitarSerialNumber = guitarSerialNumber;
        this.guitarYear = guitarYear;
        this.guitarRentCharge = guitarRentCharge;
        this.guitarColour = guitarColour;
        this.guitarLength = guitarLength;
        this.guitarWidth = guitarWidth;
        this.guitarHeight = guitarHeight;
        this.guitarStatus = guitarStatus;
        this.dayRented = dayRented;
        this.dayReturn = dayReturn;
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

    public String getGuitarColour() {
        return guitarColour;
    }

    public void setGuitarColour(String guitarColour) {
        this.guitarColour = guitarColour;
    }

    public double getGuitarLength() {
        return guitarLength;
    }

    public void setGuitarLength(double guitarLength) {
        this.guitarLength = guitarLength;
    }

    public double getGuitarWidth() {
        return guitarWidth;
    }

    public void setGuitarWidth(double guitarWidth) {
        this.guitarWidth = guitarWidth;
    }

    public double getGuitarHeight() {
        return guitarHeight;
    }

    public void setGuitarHeight(double guitarHeight) {
        this.guitarHeight = guitarHeight;
    }

    public String getGuitarStatus() {
        return guitarStatus;
    }

    public void setGuitarStatus(String guitarStatus) {
        this.guitarStatus = guitarStatus;
    }

    public LocalDate getDayRented() {
        return dayRented;
    }

    public void setDayRented(LocalDate dayRented) {
        this.dayRented = dayRented;
    }

    public LocalDate getDayReturn() {
        return dayReturn;
    }

    public void setDayReturn(LocalDate dayReturn) {
        this.dayReturn = dayReturn;
    }

  
    
}