import java.util.Scanner;

public class TicTacToe{
    
    public static void main(String[] args){
        char[] xando = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        Scanner in = new Scanner(System.in);
        boolean turn = true;
        int position;

        System.out.println("Instrustions:");
        System.out.println("When it is your turn you will be able to type a number from 1 - 9.");
        System.out.println("This number will correspond to a position on the board.");
        System.out.println(" 1 | 2 | 3 \n---|---|---\n 4 | 5 | 6 \n---|---|---\n 7 | 8 | 9 ");

        

        for(int i = 0; i < 9; i++){
            if(turn){
                System.out.println("It is X's turn input your value.\nPosition:");
                position = in.nextInt();
                setPosition('X', position, xando, in);
            } else {
                System.out.println("It is O's turn input your value.\nPosition:");
                position = in.nextInt();
                setPosition('O', position, xando, in);
            }

            if((xando[1] == 'X' && xando[2] == 'X' && xando[3] == 'X') || (xando[1] == 'X' && xando[5] == 'X' && xando[9] == 'X') || (xando[1] == 'X' && xando[4] == 'X' && xando[7] == 'X') || (xando[2] == 'X' && xando[5] == 'X' && xando[8] =='X') || (xando[3] == 'X' && xando[6] == 'X' && xando[9] == 'X') || (xando[4] == 'X' && xando[5] == 'X' && xando[6] == 'X') || (xando[7] == 'X' && xando[8] =='X' && xando[9] =='X') || (xando[3] == 'X' && xando[5] == 'X' && xando[7] == 'X')){
                System.out.println("X wins");
                break;
            } else if((xando[1] == 'O' && xando[2] == 'O' && xando[3] == 'O') || (xando[1] == 'O' && xando[5] == 'O' && xando[9] == 'O') || (xando[1] == 'O' && xando[4] == 'O' && xando[7] == 'O') || (xando[2] == 'O' && xando[5] == 'O' && xando[8] =='O') || (xando[3] == 'O' && xando[6] == 'O' && xando[9] == 'O') || (xando[4] == 'O' && xando[5] == 'O' && xando[6] == 'O') || (xando[7] == 'O' && xando[8] =='O' && xando[9] =='O') || (xando[3] == 'O' && xando[5] == 'O' && xando[7] == 'O')) {
                System.out.println("O wins");
                break;
            } else if(i == 8){
                System.out.println("Tie Game");
            }

            System.out.println(output(xando));
            turn = !turn;
        }

        in.close();
    }

    public static void setPosition(char xoro, int position, char[] xando, Scanner in){

        

        if(xando[position] == 'X' || xando[position] == 'O' || position > 9 || position < 1){
            System.out.println("Invalid position. "+ xoro +"Please try again.\nPosition:");
            position = in.nextInt();
            setPosition(xoro, position, xando, in);
        } else {
            xando[position] = xoro;
        }

        
    }

    public static String output(char[] xando){
        return " " + xando[1] + " | " + xando[2] + " | " + xando[3] + "\n---|---|---\n " + xando[4] + " | " + xando[5] + " | " + xando[6] + "\n---|---|---\n " + xando[7] + " | " + xando[8] +" | " + xando[9];
    }


}