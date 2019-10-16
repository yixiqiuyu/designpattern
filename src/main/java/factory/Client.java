package factory;

/**
 * TODO
 *
 * @author gejian
 * @date 2019/10/16 15:39
 */
public class Client {
    public static void main(String[] args) {
        //int type = 1;
        Product product;
        SimpleFactory simpleFactory=new SimpleFactory();
        product=simpleFactory.createProduct(1);
        /*if (type == 1) {
            product = new ConcreteProduct1();
        } else if (type == 2) {
            product = new ConcreteProduct2();
        } else {
            product = new ConcreteProduct3();
        }*/
    }
}
