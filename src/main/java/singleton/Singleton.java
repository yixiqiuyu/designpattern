package singleton;

/**
 * TODO
 *
 * @author gejian
 * @date 2019/10/16 14:54
 */

//懒汉式（uniqueInstance被延迟加载，如果没有用到，就不实例化，从而节约资源）
// 线程不安全，如果有多个线程同时进入if(uniqueInstance==null)，则导致实例化多个uniqueInstance
/*public class Singleton {
    private static Singleton uniqueInstance;
    private Singleton(){}

    public static Singleton getUniqueInstance(){
        if (uniqueInstance==null){
            uniqueInstance=new Singleton();
        }
        return uniqueInstance;
    }
}*/

//懒汉式，线程安全，但是性能有问题，当一个线程进入该方法之后，其他试图进入该方法的线程都必须等待。
/*
public class Singleton{
    private static Singleton uniqueInstance;
    private Singleton(){}

    //使用synchronize关键字修饰方法，使线程安全
    public static synchronized Singleton getUniqueInstance(){
        if (uniqueInstance==null){
            uniqueInstance=new Singleton();
        }
        return uniqueInstance;
    }
}*/

//静态内部类实现，当Singleton类被加载时，静态内部类SingletonHolder没有被加载进内存，只有当调用
//getUniqueInstance方法触发SingletonHolder.INSTANCE时SingletonHolder才会被加载，此时初始化
//INSTANCE实例，并且JVM能确保INSTANCE只被实例化一次
//这种方式不仅具有延迟加载的好处，而且由JVM提供了对线程安全的支持
public class Singleton {
    private Singleton() {
    }

    private static class SingletonHolder {
        private static final Singleton UNIQUEINSTANCE = new Singleton();
    }

    public Singleton getUniqueInstance() {
        return SingletonHolder.UNIQUEINSTANCE;
    }
}