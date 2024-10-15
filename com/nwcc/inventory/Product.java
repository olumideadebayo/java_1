package com.nwcc.inventory;

import com.nwcc.money.Tax;

public class Product {
    
        String name;
        double salePrice;
        int quantity;
        Tax tax ;

        public void setName(String n){
            name = n;
        }
        public void setSalePrice(double p){
            salePrice = p;
        }
        public void setQuantity(int q){
            quantity = q;
        }
        public void setTax(Tax t){
            tax = t;
        }
        

        public void printInfo(){
            double totalPrice = (quantity * salePrice) * (1+ tax.getRate());

            System.out.println("you want to buy "+quantity+" quantities of "+name);
            System.out.println("at a total price of "+ totalPrice);

        }

}
