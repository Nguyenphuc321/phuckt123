package model;

import java.util.ArrayList;
import java.util.List;

public class House {

    final static private int price = 5;
    final static private int amount = 2;
    static List<House>houses=new ArrayList<>();
    private int id;
    private String name;
    private String description;
    static {
        houses.add(new House(1,"House1","abc"));
        houses.add(new House(2,"House","abc"));
    }

    public House() {
    }

    public House(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
    public static List<House> getHouses(){
        return houses;
    }
    public static void setHouses(List<House>houses){
        House.houses = houses;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public static int getPrice(){
        return price;
    }
    public static int getAmount(){
        return amount;
    }
}
