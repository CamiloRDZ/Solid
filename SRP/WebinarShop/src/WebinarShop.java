import Solucion.Shop.MiniShop;
import Solucion.Shop.Notifier.ShopSmsNotifier;
import Solucion.Shop.Persistence.ShopSQLPersistence;

public class WebinarShop {
    private MiniShop shop;
    private ShopSmsNotifier notifier;
    private ShopSQLPersistence repo;

    public WebinarShop(MiniShop shop, ShopSmsNotifier notifier, ShopSQLPersistence repo) {
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
            new MiniShop("Kata Shops", 317567676),
            new ShopSmsNotifier(),
            new ShopSQLPersistence()
        );

        app.run();
    }
}