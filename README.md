# Task 2 Starter Repo
Contains Everything you need to get started on task 2 of Forage's Wells Fargo software engineering program
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity 
public class Client

@ID
@GeneratedValue
private Long Client id;

@Column(nullable = false)
private String FirstName;

@Coulmn(nullable = false)
private String LastName;

@Column
private String Email;

Public Client(){}

public Client(String FirstName, StringLast Name, String Email) {
        this.FistName = FirstName;
        this.email = email;
        this.LastName = LastName;
    }
Public Long getid(){
  return id;
 }
  public void setId(Long id) {
        this.id = id;
    }
public String getFirstName() {
        return FirstName;
    }
public void setFirstName(String FirstName) {
        this.name = Firstname;
    }
public String getLastName() {
        return LastName;
    }
public void setFirstName(String LastName) {
        this.name = Lastname;
    }
public String getEmail() {
        return email;
    }
public void setEmail(String email) {
        this.email = email;
    }
 public List<Portfolio> getPortfolios() {
        return portfolios;
    }
public void setPortfolios(List<Portfolio> portfolios) {
        this.portfolios = portfolios;


    




