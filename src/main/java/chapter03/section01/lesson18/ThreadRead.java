package chapter03.section01.lesson18;

import java.io.PipedReader;

/**
 * @author: deng
 * @datetime: 2020/5/29 3:26 下午
 * @desc:
 */
public class ThreadRead extends Thread {
    private ReadData readData;
    private PipedReader pipedReader;

    public ThreadRead(ReadData readData, PipedReader pipedReader) {
        this.readData = readData;
        this.pipedReader = pipedReader;
    }

    @Override
    public void run() {
        readData.readMethod(pipedReader);
    }
}
