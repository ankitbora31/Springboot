package com.rest.springrest.controller;

import com.rest.springrest.entities.NGO;
import com.rest.springrest.repository.NGOrepo;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class MyController{
	
	@Autowired
	private NGOrepo repo;
	
	@GetMapping("/ngo")
    public List<NGO> getNGO() {
        return repo.findAll();
    }

    @GetMapping("/ngo/{id}")
    public ResponseEntity<Optional<NGO>> getNGOById(@PathVariable(value = "id") Long ngoId) {
        Optional<NGO> ngo = repo.findById(ngoId);
        return ResponseEntity.ok().body(ngo);
    }

    @PostMapping("/register")
    public NGO registerNgo(@Valid @RequestBody NGO ngo) {
        return repo.save(ngo);
    }

	
	
	
}