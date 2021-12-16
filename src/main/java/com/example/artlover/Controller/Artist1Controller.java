package com.example.artlover.Controller;

import com.example.artlover.Entity.Artist1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.example.artlover.Services.*;

@RestController
public class Artist1Controller{
  @Autowired
  Artist1Service artist1Service;

  public Artist1Controller(Artist1Service artist2){

  }

}
