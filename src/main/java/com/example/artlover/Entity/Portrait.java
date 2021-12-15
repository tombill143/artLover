package com.example.artlover.Entity;

public class Portrait {
  private int portraitId;
  private int dateOfCreation;
  private String nameOfArtist;
  private String nameOfPortrait;

  public int getPortraitId() {
    return portraitId;
  }

  public void setPortraitId(int portraitId) {
    this.portraitId = portraitId;
  }

  public int getDateOfCreation() {
    return dateOfCreation;
  }

  public void setDateOfCreation(int dateOfCreation) {
    this.dateOfCreation = dateOfCreation;
  }

  public String getNameOfArtist() {
    return nameOfArtist;
  }

  public void setNameOfArtist(String nameOfArtist) {
    this.nameOfArtist = nameOfArtist;
  }

  public String getNameOfPortrait() {
    return nameOfPortrait;
  }

  public void setNameOfPortrait(String nameOfPortrait) {
    this.nameOfPortrait = nameOfPortrait;
  }

  public Portrait(int portraitId) {
    this.portraitId = portraitId;
  }

  public Portrait(){

  }

  public Portrait(int portraitId, int dateOfCreation, String nameOfArtist, String nameOfPortrait) {
    this.portraitId = portraitId;
    this.dateOfCreation = dateOfCreation;
    this.nameOfArtist = nameOfArtist;
    this.nameOfPortrait = nameOfPortrait;
  }
}
