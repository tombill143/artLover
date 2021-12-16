package com.example.artlover.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Portrait {
  @Id
  private Long portraitId;
  private int dateOfCreation;
  private String nameOfArtist;
  private String nameOfPortrait;

  public Long getPortraitId() {
    return portraitId;
  }

  public void setPortraitId(Long portraitId) {
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

  public Portrait(Long portraitId) {
    this.portraitId = portraitId;
  }

  public Portrait(){

  }

  public Portrait(Long portraitId, int dateOfCreation, String nameOfArtist, String nameOfPortrait) {
    this.portraitId = portraitId;
    this.dateOfCreation = dateOfCreation;
    this.nameOfArtist = nameOfArtist;
    this.nameOfPortrait = nameOfPortrait;
  }
}
