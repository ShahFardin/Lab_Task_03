package FardinShah;

public class Main {

    public static void main(String[] args) {

	// Creating an object for the Cricket class

        Player player = new Player("Shakib",75);
        Cricket cricket = new Cricket("International Match",20,player);

        cricket.display();

        // Object for Football Class
        Football football = new Football();
    }
}

/* Name : Md Fardin shah
    ID : 2012020126
    Batch : 53
    Section : C
 */