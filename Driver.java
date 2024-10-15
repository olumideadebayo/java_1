
import com.nwcc.money.Tax;
import com.nwcc.inventory.Product;

public class Driver {

    public static void main(String[] args){

        //Tax tax = new Tax();

        Product m = new Product();
        m.setName("Milk");
        m.setSalePrice(7.99);
        m.setQuantity(3);
        Tax mTax = new Tax("CT",0.065f);
        m.setTax(mTax);
        m.printInfo();
        
        Product c = new Product();
        c.setName("Coffee Beans");
        c.setSalePrice(12.00);
        c.setQuantity(1);
        mTax = new Tax("CT",0.02f);
        c.setTax(mTax);
        c.printInfo();

    }
}
