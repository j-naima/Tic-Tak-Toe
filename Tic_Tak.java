import java.util.Scanner;

public class Tic_Tak {
    private static char[] square = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public static void main(String[] args) {
        int Player = 1, i;
    char mark;

    Scanner input = new Scanner(System.in);

    do {
        board();

        if (Player % 2 == 1)
        {
            Player = 1;
        }

        else 
        {
            Player = 2;
        }

        System.out.printf("\nPlayer %d, enter a number: ", Player);
        int choice = input.nextInt();

        if (Player == 1)
        {
            mark = 'X';
        }

        else
        {
            mark = 'O';
        }

        if (choice == 1 && square[1] == '1')
        {
            square[1] = mark;
        }
        else if (choice == 2 && square[2] == '2')
        {
            square[2] = mark;
        }
        else if (choice == 3 && square[3] == '3')
        {
            square[3] = mark;
        }
        else if (choice == 4 && square[4] == '4')
        {
            square[4] = mark;
        }
        else if (choice == 5 && square[5] == '5')
        {
            square[5] = mark;
        }
        else if (choice == 6 && square[6] == '6')
        {
            square[6] = mark;
        }
        else if (choice == 7 && square[7] == '7')
        {
            square[7] = mark;
        }
        else if (choice == 8 && square[8] == '8')
        {
            square[8] = mark;
        }
        else if (choice == 9 && square[9] == '9')
        {
            square[9] = mark;
        }
        else 
        {
            System.out.println("\n\t\tInvalid move 👻");
            Player--;
        }

        i = checkWin();
        Player++;

    } while(i == -1);
    
    input.close();
    board();
    
        if( i == 1)
        {
            System.out.printf("Player %d win", --Player);
        }
        else 
        {
            System.out.println("Game Draw");
        }
    }

    static int checkWin() {

        if (square[1] == square[2] && square[2] == square[3]) {
            return 1;
        }

        else if (square[1] == square[4] && square[4] == square[7]) {
            return 1;
        }

        else if (square[3] == square[6] && square[6] == square[9]) {
            return 1;
        }

        else if (square[3] == square[5] && square[5] == square[7]) {
            return 1;
        }

        else if (square[2] == square[5] && square[5] == square[8]) {
            return 1;
        }

        else if (square[1] == square[5] && square[5] == square[9]) {
            return 1;
        }

        else if (square[7] == square[8] && square[8] == square[9]) {
            return 1;
        }

        else if (square[1] != '1' && square[2] != '2' && square[3] != '3' && square[4] != '4' && square[5] != '5' && square[6] != 6 && square[7] !='7' && square[8] != '8' && square[9] != '9') {
            return 0;
        }

        else {
            return -1;
        }

    }

    static void board() {
        System.out.printf("\n\n\n\t\t\t\t\t\t\tTic-Tac-Toe Game\n");
        System.out.print("\t\t\t\t\t\t__________________________________\n\n");
        System.out.printf("\t\t\t\t\t\tPlayer - 01~N (X) VS Player - 02~P (O)\n\n\n");
        
        System.out.print("\t\t\t\t\t\t\t___________________\n");
        System.out.print("\t\t\t\t\t\t\t|     |     |     |\n");
        System.out.printf("\t\t\t\t\t\t\t|  %c  |  %c  |  %c  |\n", square[1], square[2], square[3]);
        System.out.print("\t\t\t\t\t\t\t|_____|_____|_____|\n");
        System.out.print("\t\t\t\t\t\t\t|     |     |     |\n");
        System.out.printf("\t\t\t\t\t\t\t|  %c  |  %c  |  %c  |\n", square[4], square[5], square[6]);
        System.out.print("\t\t\t\t\t\t\t|_____|_____|_____|\n");
        System.out.print("\t\t\t\t\t\t\t|     |     |     |\n");
        System.out.printf("\t\t\t\t\t\t\t|  %c  |  %c  |  %c  |\n", square[7], square[8], square[9]);
        System.out.print("\t\t\t\t\t\t\t|_____|_____|_____|\n");
    }
}