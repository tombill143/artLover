package com.example.artlover.Entity;

public class order {
    int invoiced;
    String dateOfPayment;
    String shipmentDate;
    String shipmentStatus;

    public int getInvoiced() {
        return invoiced;
    }

    public String getDateOfPayment() {
        return dateOfPayment;
    }

    public String getShipmentDate() {
        return shipmentDate;
    }

    public String getShipmentStatus() {
        return shipmentStatus;
    }

    public order(){

    }

    public order(int invoiced, String dateOfPayment, String shipmentDate, String shipmentStatus) {
        this.invoiced = invoiced;
        this.dateOfPayment = dateOfPayment;
        this.shipmentDate = shipmentDate;
        this.shipmentStatus = shipmentStatus;
    }
}
