import java.io.Serializable;

public class User implements Serializable{
    //attributes
    private String name;
    private String password;
    private int age = 0;

    //Constroctur
    public User(String inName, String inPass, int inAge){
        this.name = name;
        password = inPass;
        this.age = age;
    }

    public void intruduction(){
        System.out.println("Hej jag ");
    }
}
