package com.eni.pointer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eni.pointer.model.RoomModel;

@Repository
public interface RoomRepository extends JpaRepository<RoomModel, Long> {

}
