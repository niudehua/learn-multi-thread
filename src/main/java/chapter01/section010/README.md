### 线程优先级：线程可以划分优先级，优先级高的线程得到的CPU资源较多，也就是CPU优先处理优先级高的线程
#### 线程的优先级分为1-10这10个等级，如果小于1或者大于10会抛出throw new IllegalArgumentException();
``` java
 public final void setPriority(int newPriority) {
        ThreadGroup g;
        checkAccess();
        if (newPriority > MAX_PRIORITY || newPriority < MIN_PRIORITY) {
            throw new IllegalArgumentException();
        }
        if((g = getThreadGroup()) != null) {
            if (newPriority > g.getMaxPriority()) {
                newPriority = g.getMaxPriority();
            }
            setPriority0(priority = newPriority);
        }
    }
```