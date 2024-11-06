
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //write2File();
    }

    public static void readFromFile(){
        User user1 = null;
        User user2 = null; 

       try {
        FileInputStream fileIn = new FileInputStream("myUsers.ser"); //responsible for 
        ObjectInputStream objectIn = new ObjectInputStream(fileIn); //Responible for 

        //Read from file
       user1 = (User) objectIn.readObject();
       user2 = (User) objectIn.readObject();

       //Close the streams
        objectIn.close();
        fileIn.close();

        }catch (Exception error){
            System.out.println("Could not read :( ");
        }

        user1.intruduction();
        user2.intruduction();

    }

    private static void write2File(){
        //Create the users we want to write to the file
        User liv = new User("Liv", "TessaIsCute", 38);
        User steve = new User("Steve", "HejSteve", 23);
    


   try {
    FileOutputStream fileOut = new FileOutputStream("myUsers.ser"); //the stream writing
   ObjectOutputStream objectOut = new ObjectOutputStream(fileOut); //the string describing the users

   //write to the file
   objectOut.writeObject(liv);
   objectOut.writeObject(steve); 

   //Close the streams
   objectOut.close();
   fileOut.close();

   System.out.println("I HAVE WRITTEN");
    }catch (IOException error){
        System.out.println("could not write");
    }
    }
}
