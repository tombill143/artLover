package com.example.artlover.Services;

  import com.example.artlover.Repositories.Artist1Repo;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.stereotype.Service;

  @Service
public class Artist1Service {
    @Autowired
    private final Artist1Repo artist1Repo;

    public Artist1Repo getArtist1Repo() {
      return artist1Repo;
    }

    public Artist1Service(Artist1Repo artist1Repo) {
      this.artist1Repo = artist1Repo;
    }



}
