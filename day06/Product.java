package day06;

public class Product {
    private long id;
    private String name;
    private String description;
    private String category;
    
    public Product(long id, String name, String description, String category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", description=" + description + ", category=" + category + "]";
    }

   
    
    
}
