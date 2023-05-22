package rockPaper;
import java.util.*;
public class RockPaperScissor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int indx;
System.out.println("How many Round you want play : ");
int round,move;
 Scanner input = new Scanner(System.in);
 round=input.nextInt();
 String arr[]= {"Rock","Paper","Scissors"};
 int t=1,myp=0,pcp=0;
 while (t<=round) {
	 indx=rand.nextInt(3);
	 System.out.println("Round No : "+t);
	 System.out.println("Enter your moves by choosing a number between 1 to 3 : ");
	 System.out.println("Remember that---\n\nyou are choosing Rock by 1\nyou are choosing Paper by 2\nyou are choosing Scissor by 3\n\tfor your guess number : ");
	 move=input.nextInt();
	 
	 
	 if(indx==0 && move==2) {
			System.out.println("Awesome! Paper Wrapped the Rock\n You Got 1 Point\n\n");
			myp++;
		}else if(indx==0 && move==3) {
			System.out.println("Oho! Rock Break the Scissors\n Mr. PC Got 1 Point\n\n");
			pcp++;
		}else if(indx==1 && move==1) {
			System.out.println("Oho! Paper Wrapped the Rock\n Mr. PC Got 1 Point\n\n");
			pcp++;
		}else if(indx==1 && move==3) {
			System.out.println("Yahoo! Scissors Cut the Paper\n You Got 1 Point\n\n");
			myp++;
		}else if(indx==2 && move==1) {
			System.out.println("Great! Rock Break the Scissors\n You Got 1 Point\n\n");
			myp++;
		}else if(indx==2 && move==2) {
			System.out.println("So Sad! Scissors Cut the Paper\n You Loss 1 Point\n\n");
			pcp++;
		}else {
			System.out.println("\n\tMr. PC and You Showed The Same Sign\n\t**So This Round Will be Played Again**\n");
			t--;
		}
	 t++;
 }
	System.out.println("~~)Final Result(~~"+ "PC Obtained"+pcp+ " points"+ "You Obtained"+myp+ " points");
	if(myp>pcp)
	{
		System.out.println("Congratulation You Win the Game ('-')");
	}
	else if(myp<pcp)
		System.out.println("OH shit! PC Wins the Game ('^')");
	else
		System.out.println("Match Draw");
		
		
	}

}
