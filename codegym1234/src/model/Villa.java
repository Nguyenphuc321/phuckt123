package model;

import java.util.ArrayList;
import java.util.List;

public class Villa {
    final static private int price = 10;
    final static private int amount = 5;
    static List<Villa>villas=new ArrayList<>();
    private int id;
    private String name;
    private String  description;
    static {
        villas.add(new Villa(1,"villa1","abc"));
        villas.add(new Villa(2,"villa2","abc"));
        villas.add(new Villa(3,"villa3","abc"));
        villas.add(new Villa(4,"villa4","abc"));
        villas.add(new Villa(5,"villa5","abc"));
    }

    public Villa() {

    }

    public Villa(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
    public static List<Villa>getVillas(){
        return villas;
    }
    public static void setVillas(List<Villa>villas){
        Villa.villas = villas;
    }

    public static int getAmount() {
        return amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public static int getPrice() {
        return price;
    }
}
