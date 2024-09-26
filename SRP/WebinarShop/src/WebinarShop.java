import Solucion.Shop.MiniShop;
import Solucion.Shop.Notifier.Notificador;
import Solucion.Shop.Notifier.ShopEmailNotifier;
import Solucion.Shop.Notifier.ShopSmsNotifier;
import Solucion.Shop.Persistence.Repository;
import Solucion.Shop.Persistence.ShopMySQLPersistence;
import Solucion.Shop.Persistence.ShopPostgreSQLPersistence;

public class WebinarShop {
    private MiniShop shop;
    private Notificador notifier;
    private Repository repo;

    public WebinarShop(MiniShop shop, Notificador notifier, Repository repo) {
        this.shop = shop;
        this.notifier = notifier;
        this.repo = repo;
    }

    public void run() {
        this.repo.save(this.shop);
        this.notifier.send(this.shop);
    }

    public static void main(String[] args){

        Repository mysqlRepository = new ShopMySQLPersistence();

        WebinarShop app = new WebinarShop(
            new MiniShop("Kata Shops"),
            new ShopEmailNotifier("correo@pruebas"),
            mysqlRepository
        );

        app.run();

        Repository postgreSqlRepository = new ShopPostgreSQLPersistence();

        WebinarShop app2 = new WebinarShop(
            new MiniShop("Anime Shops"),
            new ShopSmsNotifier(3156727),
            postgreSqlRepository
        );

        app2.run();
    }
}