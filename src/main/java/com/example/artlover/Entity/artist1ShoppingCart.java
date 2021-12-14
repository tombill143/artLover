package com.example.artlover.Entity;

public class artist1ShoppingCart {

  private int portraitId;
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
  public artist1ShoppingCart() {

  }

  public artist1ShoppingCart(int portraitId, int quantity) {
    this.portraitId = portraitId;
    this.quantity = quantity;
  }
}
