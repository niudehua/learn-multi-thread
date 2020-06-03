package chapter03.section01.lesson18;

import java.io.IOException;
import java.io.PipedWriter;

/**
 * @author: deng
 * @datetime: 2020/5/29 3:15 下午
 * @desc:
 */
public class WriteData {
    public void writeMethod(PipedWriter pipedWriter) {
        try {
            System.out.println("write:");
            for (int i = 0; i < 300; i++) {
                String outData = String.valueOf((i + 1));
                pipedWriter.write(outData);
                System.out.print(outData);
            }
            System.out.println();
            pipedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
