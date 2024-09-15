import com.polban.jtk.sales.*;

public class Main1 {
    public static void main(String[] args) {
        Product gehu =new Product("gehu",1500,10);
        Sales imron = new Sales(gehu);
        imron.sellProduct(5);
        imron.restockProduct(3);
        imron.updateProductPrice(2000);
        imron.updateProductPrice(-1000);
        imron.updateProductPrice(100000000);
    }
}

