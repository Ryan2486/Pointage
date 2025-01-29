package com.eni.pointer.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "edt")
public class edtModel {

  @Id
  @Column(name = "edt_id")
  private String edt_id;

  @ManyToOne
  @JoinColumn(name = "room_id")
  private RoomModel room;

  @Column(name = "ue")
  private String ue;

  @Column(name = "teacher")
  private String teacher;

  @Column(name = "start_hours")
  private String start_hours;

  @Column(name = "end_hours")
  private String end_hours;

  @Column(name = "date")
  private LocalDate date;

  // getter and setter
  public String getEdt_id() {
    return edt_id;
  }

  public void setEdt_id(String edt_id) {
    this.edt_id = edt_id;
  }

  public RoomModel getRoom() {
    return room;
  }

  public void setRoom(RoomModel room) {
    this.room = room;
  }

  public String getUe() {
    return ue;
  }

  public void setUe(String ue) {
    this.ue = ue;
  }

  public String getTeacher() {
    return teacher;
  }

  public void setTeacher(String teacher) {
    this.teacher = teacher;
  }

  public String getStart_hours() {
    return start_hours;
  }

  public void setStart_hours(String start_hours) {
    this.start_hours = start_hours;
  }

  public String getEnd_hours() {
    return end_hours;
  }

  public void setEnd_hours(String end_hours) {
    this.end_hours = end_hours;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

}
