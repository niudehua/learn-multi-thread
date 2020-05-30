package chapter03.section01.lesson17;

import java.io.PipedInputStream;

/**
 * @author: deng
 * @datetime: 2020/5/29 3:26 下午
 * @desc:
 */
public class ThreadRead extends Thread {
    private ReadData readData;
    private PipedInputStream pipedInputStream;

    public ThreadRead(ReadData readData, PipedInputStream pipedInputStream) {
        this.readData = readData;
        this.pipedInputStream = pipedInputStream;
    }

    @Override
    public void run() {
        readData.readMethod(pipedInputStream);
    }
}
