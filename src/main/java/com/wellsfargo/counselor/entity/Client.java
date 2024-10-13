package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue()
    private long clientId;

    @ManyToOne
    private Advisor advisor;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;
  
    @Column(nullable = false)
    private String email;
  
  public Client() {}
  
  public Client(String firstName,String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
  public Long getclientId() {
        return clientid;
    }
  public void setclientId(Long clientid) {
        this.clientid = clientid;
    }
  public String getfirstName() {
        return firstName;
    }
  public void setfirstName(String firstName) {
        this.firstName = firstName;
    }
  public String getlasttName() {
        return lastName;
    }
  public void setlastName(String LastName) {
        this.lastName = LastName;
    }
  public String getEmail() {
        return email;
    }
  public void setEmail(String email) {
        this.email = email;
    }
  
