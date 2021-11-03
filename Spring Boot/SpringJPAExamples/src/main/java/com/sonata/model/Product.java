package com.sonata.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
@Id
//@GeneratedValue(strategy = GenerationType.AUTO)
long pId;
String pName;
double pPrice;

Product(){}

Product(long id , String name , double price){
this.pId=id;
this.pName=name;
this.pPrice=price;
}

public long getpId() {
return pId;
}
public void setpId(long pId) {
this.pId = pId;
}
public String getpName() {
return pName;
}
public void setpName(String pName) {
this.pName = pName;
}
public double getpPrice() {
return pPrice;
}
public void setpPrice(double pPrice) {
this.pPrice = pPrice;
}

@Override
public String toString() {
return "Product [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + "]";
}




}