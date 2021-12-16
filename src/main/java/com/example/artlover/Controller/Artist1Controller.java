package com.example.artlover.Controller;

import com.example.artlover.Entity.Artist1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.artlover.Services.*;

@RestController
public class Artist1Controller{
  @Autowired
  Artist1Service artist1Service;

  public Artist1Controller(Artist1Service artist2){

  }

  @GetMapping("/artist")
  public Artist1 start () {
    return new Artist1();
  }

  //@GetMapping("/anotherartist")
  //public ResponseEntity<Artist1> continuing(){
   //  Artist1 artist = artist1Service.getArtist1Repo().getById((long)1);
   //  System.out.println(artist.getFirstName());
   //  return ResponseEntity.status(HttpStatus.CREATED).body(artist);
  //}


  //Input the data as pictured below. Make sure every new object is called artistTwo, artistThree etc. Also, don't forget to add the
  //artist1Service.getArtist1Repo().save(artist) otherwise you won't see the changes.
  //Step One - add a new entry
  //Step Two - go to your browser and type http://localhost:8080/addnewartist. This should give the message The Artists mentioned in the controller should be now uploaded to the database. Check the MYSQL database artLover to make sure changes have been made
  //Step Three - Go to mysql and search in the artlover database SELECT * FROM artlover.artist1;
   @GetMapping("/addnewartist")
  public String addArtist(){
    Artist1 artist = new Artist1(1, "55 Workplace Avenue", 38, "JohnDoe@joemail.com", "John", "Doe", 76522321);
    Artist1 artistTwo = new Artist1(2, "55 Maple Drive", 37, "JaneDoe@janemail.com", "Jane", "Doe", 60745182);
    Artist1 artistThree = new Artist1(3, "22 Westfield rd", 25, "wpistons@yahoo.com", "Winston", "Piston", 65821567);
    Artist1 artistFour = new Artist1(4, "8 Carrill Grove", 60, "waferman@btinternet.com", "Jeff", "Wafer", 61225974);
    Artist1 artistFive = new Artist1(5, "14 Cromwell Avenue", 60, "sporky@hotmail.com", "Matilda", "Spork", 67816359);
     Artist1 artistSix = new Artist1(6, "1 Tibb Street", 60, "bruceleeroy@outlook.com", "Jimmy", "Pigeon", 67816359);
    artist1Service.getArtist1Repo().save(artist);
     artist1Service.getArtist1Repo().save(artistTwo);
     artist1Service.getArtist1Repo().save(artistThree);
     artist1Service.getArtist1Repo().save(artistFour);
     artist1Service.getArtist1Repo().save(artistFive);
     return "The Artists mentioned in the controller should be now uploaded to the database. Check the MYSQL database artLover to make sure changes have been made";
   }
}
