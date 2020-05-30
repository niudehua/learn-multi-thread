### ThreadLocal
    变量值的共享可以使用public static的形式，所有的线程都使用同一个public static变量，如果想实现每一个线程都有自己的共享变量，可以使用 ThreadLocal