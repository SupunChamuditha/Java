

import java.util.Scanner;

public class Player {

    private String[] name;
    private String[] password;
    private int players;

    Scanner scn = new Scanner(System.in);

    public int ChoosePlayerCount() {
        System.out.println("Enter players count:");
        players = scn.nextInt();
        name = new String[players];
        password = new String[players];
        return players;
    }

    public void InputName_Password() {
        for (int i = 0; i < players; i++) {
            System.out.println("Enter Player Name:");
            scn.nextLine(); // Consume the newline character
            name[i] = scn.nextLine();

            System.out.println("Enter Player Password:");
            password[i] = scn.nextLine();
        }
    }

    public String[] getNames() {
        return name;
    }
}
