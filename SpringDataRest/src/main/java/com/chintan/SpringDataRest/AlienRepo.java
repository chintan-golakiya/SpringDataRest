package com.chintan.SpringDataRest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.chintan.SpringDataRest.Model.Alien;

@RepositoryRestResource(collectionResourceRel = "aliens", path="aliens")
public interface AlienRepo extends JpaRepository<Alien, Integer> {

}
