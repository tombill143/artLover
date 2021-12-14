package com.example.artlover.Entity;

public class portrait {
  public int id;
  public int dateOfCreation;
  public String nameOfArtist;
  public String nameOfPortrait;



  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
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

  @Override
  public String toString() {
    return "portrait{" +
            "id=" + id +
            ", dateOfCreation=" + dateOfCreation +
            ", nameOfArtist='" + nameOfArtist + '\'' +
            ", nameOfPortrait='" + nameOfPortrait + '\'' +
            '}';
  }

  public portrait() {

  }

  public portrait(int id, int dateOfCreation, String nameOfArtist, String nameOfPortrait) {
    this.id = id;
    this.dateOfCreation = dateOfCreation;
    this.nameOfArtist = nameOfArtist;
    this.nameOfPortrait = nameOfPortrait;
  }

}


