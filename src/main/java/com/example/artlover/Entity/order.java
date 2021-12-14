package com.example.artlover.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "order", schema = "artlover")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class order {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private int invoice;

    @Column(nullable = false)
    private String dateOfPayment;

    @Column(nullable = false)
    private String shipmentDate;

    @Column(nullable = false)
    private String shipmentStatus;

    public int getInvoice() {
        return invoice;
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

    public order(int invoiced, String dateOfPayment, String shipmentDate, String shipmentStatus) {
        this.invoice = invoiced;
        this.dateOfPayment = dateOfPayment;
        this.shipmentDate = shipmentDate;
        this.shipmentStatus = shipmentStatus;
    }
}
