package chapter03.section01.lesson17;

import java.io.PipedOutputStream;

/**
 * @author: deng
 * @datetime: 2020/5/29 3:24 下午
 * @desc:
 */
public class ThreadWrite extends Thread {
    private WriteData writeData;
    private PipedOutputStream pipedOutputStream;

    public ThreadWrite(WriteData writeData, PipedOutputStream pipedOutputStream) {
        this.writeData = writeData;
        this.pipedOutputStream = pipedOutputStream;
    }

    @Override
    public void run() {
        writeData.writeMethod(pipedOutputStream);
    }
}
