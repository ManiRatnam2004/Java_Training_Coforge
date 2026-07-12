package com.coforge.Day3_06_07_26_CollectionsPrj;

public class Product implements Comparable<Product> {


private int prodId;
private String prodName;
private double prodCost;
private int nou;

public Product(int prodId, String prodName, double prodCost, int nou) {
    this.prodId = prodId;
    this.prodName = prodName;
    this.prodCost = prodCost;
    this.nou = nou;
}

public int getProdId() {
    return prodId;
}

public String getProdName() {
    return prodName;
}

public double getProdCost() {
    return prodCost;
}

public int getNou() {
    return nou;
}

@Override
public int compareTo(Product o) {
    return this.prodName.compareTo(o.prodName);
}

@Override
public String toString() {
    return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodCost=" + prodCost + ", nou=" + nou + "]";
}

}
