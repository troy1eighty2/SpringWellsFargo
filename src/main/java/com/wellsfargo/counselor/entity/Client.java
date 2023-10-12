package com.wellsfargo.counselor.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Client {
    @Id
    @GeneratedValue()
    private long clientId;

    @OneToMany
    @JoinColumn(name = "advisorId", nullable = false)
    private Advisor advisorId;

    @Column(nullable = false)
    private String firstName;
    
    @Column(nullable = false) 
    private String lastName;
    
    @Column(nullable = false) 
    private String address;     
    
    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;
    protected Client() {
                                                                                                   
    }
    
    public Client(Advisor advisorId, String firstName, String lastName, String address, String phone, String email) {
        this.advisorId = advisorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    
    public Long getClientId() {
        return clientId;
    }

    public Advisor getAdvisorId() {
        return advisorId;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}