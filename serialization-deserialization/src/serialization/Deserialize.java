package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream=new FileInputStream("record.txt");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            Student st1=(Student) objectInputStream.readObject();
            st1.displayName();
            System.out.println(st1.getName());
            System.out.println(st1.getId());
            System.out.println(st1.getAge());
            System.out.println(st1.getAddress());
            Student st2=(Student) objectInputStream.readObject();
            st2.displayName();
            System.out.println(st2.getName());
            System.out.println(st2.getId());
            System.out.println(st2.getAge());
            System.out.println(st2.getAddress());
        }
        catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
