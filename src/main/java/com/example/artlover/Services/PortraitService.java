package com.example.artlover.Services;


import com.example.artlover.Repositories.PortraitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PortraitService {
  private final PortraitRepo portraitRepo;

  @Autowired
  public PortraitService(PortraitRepo portraitRepo){
    this.portraitRepo = portraitRepo;
  }
}
