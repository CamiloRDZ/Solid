import Solucion.Shop.MiniShop;
import Solucion.Shop.Notifier.Notificador;
import Solucion.Shop.Notifier.ShopEmailNotifier;
import Solucion.Shop.Notifier.ShopSmsNotifier;
import Solucion.Shop.Persistence.ShopSQLPersistence;

public class WebinarShop {
    private MiniShop shop;
    private Notificador notifier;
    private ShopSQLPersistence repo;

    public WebinarShop(MiniShop shop, Notificador notifier, ShopSQLPersistence repo) {
        this.shop = shop;
        this.notifier = notifier;
        this.repo = repo;
    }

    public void run() {
        this.repo.save(this.shop);
        this.notifier.send(this.shop);
    }

    public static void main(String[] args){
	
        WebinarShop app = new WebinarShop(
            new MiniShop("Kata Shops"),
            new ShopEmailNotifier("correo@pruebas"),
            new ShopSQLPersistence()
        );

        app.run();

        WebinarShop app2 = new WebinarShop(
            new MiniShop("Anime Shops"),
            new ShopSmsNotifier(3156727),
            new ShopSQLPersistence()
        );

        app2.run();
    }
}