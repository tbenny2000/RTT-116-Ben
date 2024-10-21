package Homework.M303_13Lesson13.GLAB303_13_2NIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public class NioExampleTwo {

    // Example Two: Java NIO FileChannel transferTo() and transferFrom().
    // As in normal Java applications, where IO happens mostly between an input source and an output target,
    // it happens in NIO as well, and we may need to transfer data from one channel to another channel frequently.
    // Bulk transfers of file data from one place to another are so common that a couple of optimization methods
    // have been added to the FileChannel class to make it even more efficient.
    // Data Transfer between Channels
    // Java NIO provides two methods for transferring the data between two channels:
    // FileChannel.transferTo()
    // FileChannel.transferFrom()
    // The transferTo() and transferFrom() methods allow us to cross-connect one channel to another.
    // This eliminates the need to pass the data through an intermediate buffer.
    // These methods exist only in the FileChannel class; therefore, one of the channels involved in
    // a channel-to-channel transfer must be a FileChannel.
    // Create a class named NioExampleTwo and write the code below.
    // Note: Do not forget to change the path location for both files,  file1.txt, and file2.txt.

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        //Input files
        String[] inputFiles = {"C:\\Users\\tbenn\\development\\RTT-116-Classwork\\Module303\\Module303\\src\\Homework\\M303_13Lesson13\\GLAB303_13_2\\file1.txt",
                "C:\\Users\\tbenn\\development\\RTT-116-Classwork\\Module303\\Module303\\src\\Homework\\M303_13Lesson13\\GLAB303_13_2\\file2.txt"};

        //Files contents will be written in these files
        String outputFile = "C:\\Users\\tbenn\\development\\RTT-116-Classwork\\Module303\\Module303\\src\\Homework\\M303_13Lesson13\\GLAB303_13_2\\OutputExampleTwo.txt";
        //Get channel for output file

        FileOutputStream fos = new FileOutputStream(outputFile);
        WritableByteChannel targetChannel = fos.getChannel();
        for (int i = 0; i < inputFiles.length; i++)
        {
            //Get channel for input files
            FileInputStream fis = new FileInputStream(inputFiles[i]);
            FileChannel inputChannel = fis.getChannel();

            //Transfer data from input channel to output channel
            inputChannel.transferTo(0, inputChannel.size(), targetChannel);

            //close the input channel
            inputChannel.close();
            fis.close();
        }

        //finally close the target channel
        targetChannel.close();
        fos.close();
    }
}
