package serialization;

import java.io.*;

public class Serialize  {
    public static void main(String[] args) {
        Student student=new Student("Student1","1",4,"Dhaka");
        Student student2=new Student("Student2","2",6,"Dhaka");
        try {
            FileOutputStream fileOutputStream=new FileOutputStream("record.txt");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);
            objectOutputStream.writeObject(student2);

            objectOutputStream.close();
            fileOutputStream.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Record saved in the file");
    }
}
