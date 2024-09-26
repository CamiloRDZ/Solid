package Solucion.Shop.Notifier;

import Solucion.Shop.MiniShop;

public interface NotificadorEmailInterface extends NotificadorInterface{
    void send(MiniShop miniShop);
    String getEmail();
}
