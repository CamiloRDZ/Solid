package Solucion.Shop.Notifier;

import Solucion.Shop.MiniShop;

public class ShopSmsNotifier implements Notificador {

    private int phone;

    public ShopSmsNotifier(int phone){
        this.phone = phone;
    }

    public void send(MiniShop shop) {
        System.out.println("Enviando notificacion sms al movil: " + this.phone + ". Se ha creado la tienda: "+ shop.getName());
    }
}
