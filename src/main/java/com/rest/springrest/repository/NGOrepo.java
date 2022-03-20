package com.rest.springrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rest.springrest.entities.NGO;

@Repository
public interface NGOrepo extends JpaRepository<NGO, Long> {

}
