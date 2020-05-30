package chapter03.section01.lesson17;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * @author: deng
 * @datetime: 2020/5/29 3:18 下午
 * @desc:
 */
public class ReadData {
    public void readMethod(PipedInputStream pipedInputStream) {
        try {
            System.out.println("read :");
            byte[] bytes = new byte[20];
            int readLength = pipedInputStream.read(bytes);
            while (readLength != -1) {
                String newData = new String(bytes, 0, readLength);
                System.out.print(newData);
                readLength = pipedInputStream.read(bytes);
            }
            System.out.println();
            pipedInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
