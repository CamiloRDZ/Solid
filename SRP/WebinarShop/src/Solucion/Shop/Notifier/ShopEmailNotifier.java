package Solucion.Shop.Notifier;

import Solucion.Shop.MiniShop;

public class ShopEmailNotifier implements Notificador {

    private String email;

    public ShopEmailNotifier(String email){
        this.email = email;
    }

    @Override
    public void send(MiniShop shop) {
        System.out.println("Enviando notificacion email : " + this.email + ". Se ha creado la tienda: "+ shop.getName());
    }

}
