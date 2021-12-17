package com.example.artlover.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Properties;

@Entity
public class Portrait {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long portraitId;
  private String dateOfCreation;
  private String nameOfArtist;
  private String nameOfPortrait;



  public Long getPortraitId() {
    return portraitId;
  }

  public void setPortraitId(Long portraitId) {
    this.portraitId = portraitId;
  }

  public String getDateOfCreation() {
    return dateOfCreation;
  }

  public void setDateOfCreation(String dateOfCreation) {
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

  public Portrait(Long portraitId, String dateOfCreation, String nameOfArtist, String nameOfPortrait) {
    this.portraitId = portraitId;
    this.dateOfCreation = dateOfCreation;
    this.nameOfArtist = nameOfArtist;
    this.nameOfPortrait = nameOfPortrait;
  }
}
