package com.example.artlover.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
  public class Artist2ShoppingCart {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "artist_1_shopping_cart_id", nullable = false)
  private Long artist1ShoppingCartId;

  private int id;
    private int portraitId;
    private int quantity;

  public Long getArtist1ShoppingCartId() {
    return artist1ShoppingCartId;
  }

  public void setArtist1ShoppingCartId(Long artist1ShoppingCartId) {
    this.artist1ShoppingCartId = artist1ShoppingCartId;
  }

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

    public Artist2ShoppingCart(){

    }

    public Artist2ShoppingCart(int id, int portraitId, int quantity) {
      this.id = id;
      this.portraitId = portraitId;
      this.quantity = quantity;
    }
  }


