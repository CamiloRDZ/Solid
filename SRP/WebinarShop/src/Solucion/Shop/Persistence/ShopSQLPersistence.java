package Solucion.Shop.Persistence;

import Solucion.Shop.MiniShop;

public class ShopSQLPersistence {

    public void save(MiniShop shop){

        System.out.println("Creacion de la nueva tienda: " + shop.getName());

    }
}