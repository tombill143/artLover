package com.example.artlover.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.example.artlover.Services.*;

@RestController
public class PortraitController{

  @Autowired
  PortraitService portraitService;

    public PortraitController(PortraitService portraitService){

    }
}
