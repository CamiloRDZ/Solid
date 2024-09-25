package Solucion.Shop;

public class MiniShop {
    private String name;
    private Integer phone;

    public MiniShop(String name, Integer phone){
        this.name = name;
        this.phone = phone;
    }

    public String getName(){
        return this.name;
    }

    public Integer getPhone(){
        return this.phone;
    }
}