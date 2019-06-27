package com.company;
import java.math.RoundingMode;
import java.text.NumberFormat;
public class Product {
    private String code;
    private String description;
    private double price;

    public Product() {
        code = "";
        description = "";
        price = 0.0;


    }
    //this method return the string representation of the object
    @Override
    public String toString() {
        return "Code:                " + code + "\n" +
                "Description:        " + description + "\n" +
                "Price:              " + this.getFormattedPrice(this.price) + "\n";


        // Get and set accessors for the code, description, and price instance variables


    }
    // Use the NumberFormat class to format the price to 2 decimal places

    public String getFormattedPrice(double y){
        return NumberFormat.getCurrencyInstance().format(y);
    }

    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getDescription(){
        return  this.description;
    }
    public void setDescription(String description){
        this.code = code;
    }
    public double getPrice() {
        return price;
        // Use the NumberFormat class to format the price to 2 decimal places
    }
    public void setprice(double price){
        this.price=price;

        }

    }


