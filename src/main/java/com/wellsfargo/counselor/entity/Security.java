package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Security{
    @Id
    @GeneratedValue()
    private long securityId;

    @OneToMany
    @JoinColumn(name = "portfolioId", nullable = false)
    private Portfolio portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;
   
    @Column(nullable = false)
    private String purchasePrice;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private long quantity;
    protected Security(){

    }
    public Security(Portfolio portfolioId, String name, String category, String purchasePrice, String purchaseDate, long quantity){
        this.portfolioId = portfolioId;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;

    }
    public Portfolio getPortfolioId(){
        return portfolioId;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setCategory(String category){
        this.name = category; 
    }
    public String getCategory(){
        return category;
    }
    public void setpurchasePrice(String purchasePrice){
        this.purchasePrice = purchasePrice; 
    }
    public String getpurchasePrice(){
        return purchasePrice;
    }
    public void setpurchaseDate(String purchaseDate){
        this.purchaseDate = purchaseDate; 
    }
    public String getpurchaseDate(){
        return purchaseDate;
    }
    public void setquantity(long quantity){
        this.quantity = quantity; 
    }
    public long getquantity(){
        return quantity;
    }
}