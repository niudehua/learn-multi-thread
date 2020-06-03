package chapter03.section01.lesson18;

import java.io.PipedWriter;

/**
 * @author: deng
 * @datetime: 2020/5/29 3:24 下午
 * @desc:
 */
public class ThreadWrite extends Thread {
    private WriteData writeData;
    private PipedWriter pipedWriter;

    public ThreadWrite(WriteData writeData, PipedWriter pipedWriter) {
        this.writeData = writeData;
        this.pipedWriter = pipedWriter;
    }

    @Override
    public void run() {
        writeData.writeMethod(pipedWriter);
    }
}
