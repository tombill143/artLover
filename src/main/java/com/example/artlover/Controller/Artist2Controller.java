package com.example.artlover.Controller;

import com.example.artlover.Entity.Artist2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.example.artlover.Services.*;

@RestController
public class Artist2Controller{
  @Autowired
  Artist2Service artist2Service;

  public Artist2Controller(Artist2Service artist2){

  }

}
