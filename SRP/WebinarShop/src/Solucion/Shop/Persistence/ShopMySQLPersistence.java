package Solucion.Shop.Persistence;

import Solucion.Shop.MiniShop;

public class ShopMySQLPersistence implements Repository {

    @Override
    public void save(MiniShop shop){
        System.out.println("Creacion de la nueva tienda: " + shop.getName() + ". En MySql");
    }
}