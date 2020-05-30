package chapter03.section01.lesson18;

import java.io.IOException;
import java.io.PipedReader;

/**
 * @author: deng
 * @datetime: 2020/5/29 3:18 下午
 * @desc:
 */
public class ReadData {
    public void readMethod(PipedReader pipedReader) {
        try {
            System.out.println("read :");
            char[] bytes = new char[20];
            int readLength = pipedReader.read(bytes);
            while (readLength != -1) {
                String newData = new String(bytes, 0, readLength);
                System.out.print(newData);
                readLength = pipedReader.read(bytes);
            }
            System.out.println();
            pipedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
