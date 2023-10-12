package com.wellsfargo.counselor.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()     
    private long portfolioId;

    @OneToMany                                         
    @JoinColumn(name = "clientId", nullable = false)
    private Client clientId;

    @Column(nullable = false)
    private String creationDate;

    protected Portfolio(){
        
    }
    public Portfolio(Client clientId, String creationDate){
        this.clientId = clientId;
        this.creationDate = creationDate;
    }
    public long getPortfolioId(){
        return portfolioId;
    }
    public Client getClientId(){
        return clientId;
    }

    public String getcreationDate(){
        return creationDate;
    }
    public void setcreationDate(String creationDate){
        this.creationDate = creationDate;
    }
}