package com.example.artlover.Controller;


import com.example.artlover.Entity.Artist2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.artlover.Services.*;

@RestController
public class Artist2Controller{
  @Autowired
  Artist2Service artist2Service;

  public Artist2Controller(Artist2Service artist2){

  }

  @GetMapping("/artists")
  public Artist2 start() {
    return new Artist2();
  }

  @GetMapping("/addnewcustomer")
  public String addArtist(){
    Artist2 artist = new Artist2(1, "800 Mulberry Road", 67, "mrsFrisky@protonmail.com", "Martha", "Paxton", 65438012);
    Artist2 artistTwo = new Artist2(2, "Flat 4 Elliot Bay Towers", 27, "wildalleycat@zohomail.com", "Roy", "Lichenstein", 60945610);
    Artist2 artistThree = new Artist2(3, "69 Mornington Crescent", 31, "eugenicsmastergeneral@icloudmail.com", "Andy", "Warholl", 71217749);
    Artist2 artistFour = new Artist2(4, "44 Buckingham rd", 70, "handoham@outlook.com", "Jackson", "Pollock", 50243091);
    Artist2 artistFive = new Artist2(5, "60 Beech Rd", 33, "porkynbeans1973@gmail.com", "Frida", "Kahlo", 62708940 );
    Artist2 artistSix = new Artist2(6, "Strawberry Lane", 39, "timbull541@hotmail.com", "Gustav", "Klimt", 70645485 );
    Artist2 artistSeven = new Artist2(7, "800 Mulberry Road", 65, "meltieclock@gmail.com", "Salvador", "Dali", 70872909 );
    Artist2 artistEight = new Artist2(8, "800 Mulberry Road", 34, "ilovepitchforks@aol.com", "Grant", "Wood", 658804175 );
    Artist2 artistNine = new Artist2(9, "800 Mulberry Road", 22, "thereverendcoyote@yahoo.com", "Edward", "Hopper", 65667466 );
    Artist2 artistTen = new Artist2(10, "800 Mulberry Road", 50, "ilovemybed@imail.com", "Tracy", "Emmins", 60215373 );


    artist2Service.getArtist2Repo().save(artist);
    artist2Service.getArtist2Repo().save(artistTwo);
    artist2Service.getArtist2Repo().save(artistThree);
    artist2Service.getArtist2Repo().save(artistFour);
    artist2Service.getArtist2Repo().save(artistFive);
    artist2Service.getArtist2Repo().save(artistSix);
    artist2Service.getArtist2Repo().save(artistSeven);
    artist2Service.getArtist2Repo().save(artistEight);
    artist2Service.getArtist2Repo().save(artistNine);
    artist2Service.getArtist2Repo().save(artistTen);

    return "The Artists mentioned in the controller should be now uploaded to the database. Check the MYSQL database artLover to make sure changes have been made";
  }

}
