package com.example.artlover.Controller;

import com.example.artlover.Entity.Portrait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.artlover.Services.*;

@RestController
public class PortraitController {

  @Autowired
  PortraitService portraitService;

  public PortraitController(PortraitService portraitService) {

  }

  @GetMapping("/addnewportrait")
  public String addPortrait() {
    Portrait portrait1 = new Portrait(1L, "30/12/1990", "Martha Paxton", "Elegy In Green");
    Portrait portrait2 = new Portrait(2L, "06/02/1889", "Vincent Van Gough", "Starry Night");
    Portrait portrait3 = new Portrait(3L, "01/04/1871", "James McNeill", "Whistlers Mother");
    Portrait portrait4 = new Portrait(4L, "14/03/1517", "Leonardo Da Vinci", "Mona Lisa");
    Portrait portrait5 = new Portrait(5L, "20/06/1893", "Edvard Munch", "The Scream");
    portraitService.getPortraitRepo().save(portrait1);
    portraitService.getPortraitRepo().save(portrait2);
    portraitService.getPortraitRepo().save(portrait3);
    portraitService.getPortraitRepo().save(portrait4);
    portraitService.getPortraitRepo().save(portrait5);

    return "The Portraits mentioned in the controller should be now uploaded to the database. Check the MYSQL database artLover to make sure changes have been made";
  }

}