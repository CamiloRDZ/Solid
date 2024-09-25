package Solucion.Shop.Notifier;

import Solucion.Shop.MiniShop;

public class ShopSmsNotifier {

    public void send(MiniShop shop) {
        System.out.println("Enviando notificacion sms al movil: " + shop.getPhone() + ". Se ha creado la tienda: "+ shop.getName());
    }
}
