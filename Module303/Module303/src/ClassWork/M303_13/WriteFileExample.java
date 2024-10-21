package ClassWork.M303_13;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteFileExample {

    public static void main(String[] args) {

        File file = new File("src/temp1.txt");

        try {
            // creating a new file writer with a single argument (file) it will overwrite the existing file.
            // create a new file writer and the 2nd argument, true is append and false is overwrite
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            bw.write("Line 1\n");
            bw.write("Line 2\n");
            bw.write("Line 3");
            bw.write(" More on ine 3\n");

            // as we are writing to the file we are automatically writing to a buffer in memory
            // when the buffer fills it will automatically writes the bugger to the file as a chunk
            // we have finished writing all that we want to write o the file...
            // the final buffer may not have completely filled and we have a partial buffer
            // we need to flush that buffer to force it to write what it has to the file even though it's not full
            bw.flush();

            // this closes the writer and releases resources at the operating system level
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
