package com.example.artlover.Entity;

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
@Table(name = "artist1ShoppingCart", schema = "artlover")

public class artist1ShoppingCart {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(nullable = false)
  private int portraitId;

  @Column(nullable = false)
  private int quantity;

  public int getPortraitId() {
    return portraitId;
  }

  public void setPortraitId(int portraitId) {
    this.portraitId = portraitId;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "artist1ShoppingCart{" +
            "portraitId=" + portraitId +
            ", quantity=" + quantity +
            '}';
  }

  public artist1ShoppingCart(int portraitId, int quantity) {
    this.portraitId = portraitId;
    this.quantity = quantity;
  }
}
