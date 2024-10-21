package ClassWork.M303_13;

import java.io.File;

public class FileExample {

    public static void main(String[] args) {


        File absolute = new File("c:\\Users\\tbenn\\development\\RTT-116-Classwork\\Module-303\\Module-303\\src\\temp.txt");

        // relative
        File file = new File("src/temp.txt");

        System.out.println(file.getAbsolutePath());
        System.out.println("exists: " + file.exists());
        System.out.println("is Directory: " + file.isDirectory());
        System.out.println("is Hidden: " + file.isHidden());
        System.out.println("can read: " + file.canRead());
        System.out.println("can write: " + file.canWrite());
        System.out.println("can execute: " + file.canExecute());
        System.out.println("size of file: " + file.length());

        if (file.isDirectory()) {
            // let's list the files in this directory
            File[] files = file.listFiles();
            for ( File f : files) {
                System.out.println("===> " + f.getName());
            }
        }

        // Be VERY CAREFUL what you delete... b/c ... there is not passing go and it will delete a directory and all the contents
        // file.delete();

        // example for creating a new directory
        File newDirectory = new File("asdf");

        // make new directory
        if ( !newDirectory.exists()) {
            newDirectory.mkdir();
        }
    }
}
