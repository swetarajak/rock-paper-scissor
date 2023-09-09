import java.util.*;
// import java.io.*;
class Game{
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Player1 name:");
       String player1 = sc.nextLine();
       System.out.print("Enter Player2 name:");
       String player2 = sc.nextLine();
       System.out.println("Options Avaliable");
       int choice1 = 0;
       int choice2 = 0;
       String[] arr={"ROCK", "PAPER", "SCISSORS"};
       int point1=0;
       int point2=0;
       int[] num = {0,1,2};
       Random random = new Random();
       for(int i = 0; i < 3; i++){
           System.out.println(arr[i] + " ");
       }
       System.out.println("Choose numbers from 0 to 2:");
       for(int j = 0; j < 10; j++){
           for(int i = 0; i < 3; i++){
               int a = random.nextInt(num.length);
               int temp = num[a];
               num[a]=num[i];
               num[i]=temp;
           }
           arr[num[0]]="ROCK";
           arr[num[1]]="PAPER";
           arr[num[2]]="SCISSORS";
           System.out.print(player1+"'s Turn:");
           choice1 = sc.nextInt();
           System.out.print(player2+"'s Turn:");
           choice2 = sc.nextInt();
           if(choice1 <=2 && choice2 <=2){
           System.out.println(choice1+". "+ arr[choice1]);
           System.out.println(choice2+". "+ arr[choice2]);
           
           if(arr[choice1] == "PAPER" && arr[choice2] == "SCISSORS"){
               point2++;
               System.out.println("Scissors cuts paper");
               
           }
           else if(arr[choice2] == "PAPER" && arr[choice1] == "SCISSORS"){
               point1++;
               System.out.println("Scissors cuts paper");
           }
           
           if(arr[choice1] == "ROCK" && arr[choice2] == "PAPER"){
               point2++;
                System.out.println("Paper wraps rock");
           }
           else if(arr[choice2] == "ROCK" && arr[choice1] == "PAPER"){
               point1++;
               System.out.println("Paper wraps rock");
           }
            
           if(arr[choice1] == "ROCK" && arr[choice2] == "SCISSORS"){
               point1++;
               System.out.println("The rock smashes the scissor");
           }
           else if(arr[choice2] == "ROCK" && arr[choice1] == "SCISSORS"){
               point2++;
               System.out.println("The rock smashes the scissor");
           }
           
           System.out.println(player1+"'s score:" + point1);
           System.out.println(player2+"'s score:" + point2);
           
        }
        else{
            System.out.println("Enter the digits carefully!!");
        }
       }
       if(point1==point2){
            System.out.println("OOPS!! TIE");
       }
       else if(point1>point2){
           System.out.println("HURRAH!!!!!!"+"\n"+player1+" is Winner");
       }
       else{
           System.out.println("HURRAH!!!!!!"+"\n"+player2+" is Winner");
       }
       sc.close();
   }
}
