package model;

public class Book {
    private String Name;
    private String description;
    public Book(){

    }
    public Book(String name, String description) {
        Name = name;
        this.description = description;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Name='" + Name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

