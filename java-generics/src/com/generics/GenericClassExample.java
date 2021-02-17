package com.generics;

public class GenericClassExample {
    public static void main(String[] args) {
        /*Product product = new Product(121,"Soap");
        int pId = (int)product.getProductId();
        System.out.println("Product Id :"+pId);
        String productDescription = (String)product.getProductDescription();
        System.out.println("Product Description :"+productDescription);*/
        Product1<Integer,String> prod = new Product1<>(121,"Soap");
        int productId = prod.productId;

        String productDescription = prod.productDescription;
        System.out.println("Product Id :"+productId +" Product Description :"+productDescription);
        Product1<String,String> prod1 = new Product1<>("EDCAR","Soap");
        String productId1 = prod1.productId;
        String productDescription1 = prod1.productDescription;
        System.out.println("Product Id :"+productId1 +" Product Description :"+productDescription1);
    }
}
class Product1<PRODUCT,DESCRIPTION>{
    PRODUCT productId;
    DESCRIPTION productDescription;

    public Product1(PRODUCT productId, DESCRIPTION productDescription) {
        this.productId = productId;
        this.productDescription = productDescription;
    }
}
class Product{
    private Object productId;
    private  Object productDescription;

    public Product(Object productId, Object productDescription) {
        this.productId = productId;
        this.productDescription = productDescription;
    }

    public Object getProductId() {
        return productId;
    }

    public void setProductId(Object productId) {
        this.productId = productId;
    }

    public Object getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(Object productDescription) {
        this.productDescription = productDescription;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productDescription=" + productDescription +
                '}';
    }
}