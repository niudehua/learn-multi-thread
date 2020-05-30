package chapter03.section01.lesson17;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @author: deng
 * @datetime: 2020/5/29 3:29 下午
 * @desc: 通过管道进行线程间通信：字节流
 */
public class Run {
    public static void main(String[] args) {
        try {
            ReadData readData = new ReadData();
            WriteData writeData = new WriteData();
            PipedInputStream pipedInputStream = new PipedInputStream();
            PipedOutputStream pipedOutputStream = new PipedOutputStream();
            pipedOutputStream.connect(pipedInputStream);
            ThreadRead threadRead = new ThreadRead(readData, pipedInputStream);
            ThreadWrite threadWrite = new ThreadWrite(writeData, pipedOutputStream);
            threadRead.start();
            Thread.sleep(2000);
            threadWrite.start();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
