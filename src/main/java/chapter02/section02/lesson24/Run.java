package chapter02.section02.lesson24;

import chapter02.section02.lesson24.PublicClass.PrivateClass;

/**
 * @author: deng
 * @datetime: 2020/5/24 1:00 上午
 * @desc: 内置类
 */
public class Run {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.setUsername("niudehua");
        publicClass.setPassword("123456");
        PrivateClass privateClass = publicClass.new PrivateClass();
        privateClass.setAge("18");
        privateClass.setAddr("武汉");
        System.out.println(publicClass.getUsername());
        System.out.println(publicClass.getPassword());
        System.out.println(privateClass.getAge());
        System.out.println(privateClass.getAddr());
        privateClass.printPublicProperty();
    }
}
