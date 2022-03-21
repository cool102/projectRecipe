package task;

public class Product {
    public String id;
    public String name;
    public String price;

    public Product() {
    }

    @Override
    public String toString() {
        return "{" + "\"id\"" +":\"" + id + "\"," +
                "\"name\"" +":\"" + name + "\"," +
                "\"price\"" +":\"" + price + "\"," +
                "}";
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
}
