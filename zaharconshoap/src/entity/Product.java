
package entity;


public class Product {
    private String name;
    private int price;
    private int rating;

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getRating() {
        return rating;
    }
    
     public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ", rating=" + rating +'}';
    } 

}
    

