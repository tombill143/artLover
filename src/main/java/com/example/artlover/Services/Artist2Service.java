package com.example.artlover.Services;

import com.example.artlover.Repositories.Artist2Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Artist2Service {
  private final Artist2Repo artist2Repo;

  public Artist2Repo getArtist2Repo() {
    return artist2Repo;
  }
    @Autowired
    public Artist2Service(Artist2Repo artist2Repo) {
    this.artist2Repo = artist2Repo;
  }
}
