package Homework.M303_13Lesson13.GLAB303_13_2NIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioExample {

    // Example One: Multiple source channels (input files) to a single output channel.
    // In this example, we will read the file content from two different files and write their combined output into a single separate file.
    // In total, we will create three channels:
    // We will create two channels for the source file.
    // We will create one channel for the destination file.
    // Instructions:
    //Click on the links below to download a dummy file for this lab:
    // File1.txt
    // File2.txt
    // Create a class named NioExample and write the code below.
    // Note: Do not forget to change the path or location for both files, file1.txt, and file2.txt.
    public static void main(String[] args) throws IOException {
        // initializing two files in Array;
        String[] inputFiles = {"C:\\Users\\tbenn\\development\\RTT-116-Classwork\\Module303\\Module303\\src\\Homework\\M303_13Lesson13\\GLAB303_13_2\\file1.txt",
                "C:\\Users\\tbenn\\development\\RTT-116-Classwork\\Module303\\Module303\\src\\Homework\\M303_13Lesson13\\GLAB303_13_2\\file2.txt"};

        // Specify out file with path location
        //Files contents will be written in these files
        String outputFile = "C:\\Users\\tbenn\\development\\RTT-116-Classwork\\Module303\\Module303\\src\\Homework\\M303_13Lesson13\\GLAB303_13_2\\nioOutput.txt";

        // Get Channel for destination or outputFile
        FileOutputStream fos = new FileOutputStream(outputFile);
        FileChannel targetChannel = fos.getChannel();

        for (int i = 0; i < inputFiles.length; i++) {
            // Get channel for inputFiles
            FileInputStream fis = new FileInputStream(inputFiles[i]);
            FileChannel inputchannel = fis.getChannel();
            long size = inputchannel.size();
            ByteBuffer buf = ByteBuffer.allocate((int) size);
            System.out.print((char) buf.get());
            while (inputchannel.read(buf) > 0) {
                buf.flip();
                while (buf.hasRemaining()) {
                    //  System.out.print((char) buf.get());
                    targetChannel.write(buf);
                }
            }
            //fis.close();
        }
    }
}
