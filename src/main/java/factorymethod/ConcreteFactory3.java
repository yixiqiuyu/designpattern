package factorymethod;

import factory.ConcreteProduct3;
import factory.Product;

/**
 * TODO
 *
 * @author gejian
 * @date 2019/10/16 16:07
 */
public class ConcreteFactory3 extends Factory {
    Product factoryMethod() {
        return new ConcreteProduct3();
    }
}
