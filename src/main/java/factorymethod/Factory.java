package factorymethod;

import factory.Product;

/**
 * TODO
 *
 * @author gejian
 * @date 2019/10/16 16:04
 */
//定义了一个创建对象的接口，但由子类决定要实例化哪个类。工厂方法把实例化操作推迟到子类。
//在简单工厂中，创建对象的是另一个类，而在工厂方法中，是由子类来创建对象。
public abstract class Factory {
    abstract Product factoryMethod();

    public void doSomething() {
        Product product = factoryMethod();
        //do something with product
    }
}
