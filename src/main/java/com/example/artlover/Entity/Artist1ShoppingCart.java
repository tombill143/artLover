package com.example.artlover.Entity;

public class Artist1ShoppingCart {
  private int id;
  private int portraitId;
  private int quantity;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

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

  public Artist1ShoppingCart(){

  }

  public Artist1ShoppingCart(int id, int portraitId, int quantity) {
    this.id = id;
    this.portraitId = portraitId;
    this.quantity = quantity;
  }
}
