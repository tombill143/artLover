package com.example.artlover.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "portrait", schema = "artlover")
@JsonInclude(JsonInclude.Include.NON_NULL)

public class portrait {
  @Id
  @Column(name = "portrait_id", nullable = false)
  private Long portraitId;

  @Column(name = "id", nullable = false)
  private int id;

  @Column(nullable = false)
  private int dateOfCreation;

  @Column(nullable = false)
  private String nameOfArtist;

  @Column(nullable = false)
  private String nameOfPortrait;

  @JsonIgnore
  @ManyToMany(mappedBy = "portrait", fetch = FetchType.LAZY)
  private List<portrait> movies = new ArrayList<portrait>();

  @ManyToMany
  @JoinTable(name = "portrait_portrait",
          joinColumns = @JoinColumn(name = "portrait_1_portrait_id", referencedColumnName = "portrait_2_portrait_id"))
  private List<portrait> portrait;


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

  public portrait(int id, int dateOfCreation, String nameOfArtist, String nameOfPortrait) {
    this.id = id;
    this.dateOfCreation = dateOfCreation;
    this.nameOfArtist = nameOfArtist;
    this.nameOfPortrait = nameOfPortrait;
  }

}


