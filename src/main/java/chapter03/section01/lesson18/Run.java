package chapter03.section01.lesson18;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * @author: deng
 * @datetime: 2020/5/29 3:29 下午
 * @desc: 通过管道进行线程间通信：字符流
 */
public class Run {
    public static void main(String[] args) {
        try {
            ReadData readData = new ReadData();
            WriteData writeData = new WriteData();
            PipedReader pipedReader = new PipedReader();
            PipedWriter pipedWriter = new PipedWriter();
            pipedWriter.connect(pipedReader);
            ThreadRead threadRead = new ThreadRead(readData, pipedReader);
            ThreadWrite threadWrite = new ThreadWrite(writeData, pipedWriter);
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
