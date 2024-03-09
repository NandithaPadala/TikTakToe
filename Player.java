package player;

public class Player{
    private String name, ads,emailid,phnum;
    private char symbol;
    private int age;

    public void setPlayerDetalis(String name, String address, String phnum, String emailid, char psym, int age){
        this.name = name;
        this.ads = address;
        this.emailid = emailid;
        this.age = age;
        this.phnum = phnum;
        this.symbol = psym;
    }
    public void setPlayerNameandAdd(String name, String address){
        this.name = name;
        this.ads = address;
    }
    public void changeSymbol(char symbol){
        this.symbol = symbol;
    }

    public String getPlayerName(){
        return this.name;
    }

    public String getPlayerEmailid(){
        return this.emailid;
    }

    public int getPlayerAge(){
        return this.age;
    }

    public String getPlayerContactnum(){
        return this.phnum;
    }

    public String getPlayerAddress(){
        return this.ads;
    }

    public char getPlayerSymbol(){
        return this.symbol;
    }

    public void getPlayerDetails(){
        System.out.println("Name of the Player: " + this.name);
        System.out.println("Address of the Player: " + this.ads);
        System.out.println("Email id of the Player: " + this.emailid);
        System.out.println("Phone number of the Player: " + this.phnum);
        System.out.println("Age of the Player: " + this.age);
        System.out.println("Symbol of the Player: " + this.symbol);
    }
    
}
