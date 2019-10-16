package factorymethod;

import factory.ConcreteProduct1;
import factory.Product;

/**
 * TODO
 *
 * @author gejian
 * @date 2019/10/16 16:06
 */
public class ConcreteFactory1 extends Factory {
    Product factoryMethod() {
        return new ConcreteProduct1();
    }
}
