package chapter03.section01.lesson17;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * @author: deng
 * @datetime: 2020/5/29 3:15 下午
 * @desc:
 */
public class WriteData {
    public void writeMethod(PipedOutputStream pipedOutputStream) {
        try {
            System.out.println("write:");
            for (int i = 0; i < 300; i++) {
                String outData = String.valueOf((i + 1));
                pipedOutputStream.write(outData.getBytes());
                System.out.print(outData);
            }
            System.out.println();
            pipedOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
