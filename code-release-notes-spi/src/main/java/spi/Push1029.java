package spi;


import java.util.ServiceLoader;

public class Push1029 implements IPushCoding{


    @Override
    public void context() {
        System.out.println("前端更新内容");
    }

    public static void main(String[] args) {
        ServiceLoader<IPushCoding> load = ServiceLoader.load(IPushCoding.class);
        for (IPushCoding i:load){
            i.context();
        }
    }

}
