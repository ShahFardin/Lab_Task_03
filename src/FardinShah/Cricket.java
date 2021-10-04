package FardinShah;

public class Cricket extends Sports{

    String matchType;
    int over;
    Player player;

    // parameterized constructor

    Cricket( String matchType, int over, Player player){
        this.matchType = matchType;
        this.over = over;
        this.player = player;
    }

    // Display method to print the objects
    void display(){
        System.out.println("Match type : "+matchType);
        System.out.println("Over : "+over);

        System.out.println("Player Name : "
                +player.playerName);
        System.out.println("Jersey Number of the Player : "
                +player.jerseyNumber);
    }
}

/* Name : Md Fardin shah
    ID : 2012020126
    Batch : 53
    Section : C
 */