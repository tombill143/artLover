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

   @GetMapping("/default")
  public String addArtist(){
    Artist1 artist = new Artist1(1, "55 Workplace Avenue", 38, "JohnDoe@joemail.com", "John", "Doe", 76522321);
     artist1Service.getArtist1Repo().save(artist);
     return "test";
   }
}
