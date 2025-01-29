package com.eni.pointer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eni.pointer.model.edtModel;

@Repository
public interface edtRepository extends JpaRepository<edtModel, String> {

}
