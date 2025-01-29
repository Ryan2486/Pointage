package com.eni.pointer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.eni.pointer.model.RoomModel;
import com.eni.pointer.repository.RoomRepository;

public class RoomService {

  @Autowired
  private RoomRepository roomRepository;

  public List<RoomModel> getAllRooms() {
    return roomRepository.findAll();
  }

  public RoomModel saveRoom(RoomModel room) {
    return roomRepository.save(room);
  }

  public RoomModel getRoomById(long id) {
    return roomRepository.findById(id).get();
  }

  public void deleteRoom(long id) {
    roomRepository.deleteById(id);
  }

}
