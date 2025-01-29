package com.eni.pointer.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "room")
public class RoomModel {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "room_id")
  private long room_id;

  @Column(name = "room_name")
  private String room_name;

  @Column(name = "room_abr")
  private String room_abr;

  @Column(name = "room_capacity")
  private int room_capacity;

  // getter and setter
  public long getRoom_id() {
    return room_id;
  }

  public void setRoom_id(long room_id) {
    this.room_id = room_id;
  }

  public String getRoom_name() {
    return room_name;
  }

  public void setRoom_name(String room_name) {
    this.room_name = room_name;
  }

  public String getRoom_abr() {
    return room_abr;
  }

  public void setRoom_abr(String room_abr) {
    this.room_abr = room_abr;
  }

  public int getRoom_capacity() {
    return room_capacity;
  }

  public void setRoom_capacity(int room_capacity) {
    this.room_capacity = room_capacity;
  }

}
