// package nim;
// @SpringBootApplication
// public class nimgame{
// 	public static void main(String[] args) throws Exception{
// 		nimgame.run(nimgame.class, args);
// 	}

// }

// import java.util.Scanner;
public class nimgame
{
  public static void main(String[] args) {
	String q1,q2,id1 ,id2,choice=null;
	int u,v,x,y,system,z = 0;
	Scanner n1 = new Scanner(System.in); 
	System.out.println("select your name with player 1");
	q1 = n1.next();
	Scanner n3 = new Scanner(System.in); 
	System.out.println("select the MIT ID with Player 1");
	id1 = n3.next();
		
	Scanner n2 = new Scanner(System.in); 
	System.out.println("select the name with Player 2");
	q2 = n2.next();
	Scanner n4 = new Scanner(System.in); 
	System.out.println("select the MIT ID with Player 2");
	id2 = n4.next();
	System.out.println("hi players.shall we begin the game. Be careful you may loose game");
	System.out.println("here the computer is playing with you picking the stones between 1 to 3 from the box");
	System.out.println("picking the last player is winner");
	Scanner n8 = new Scanner(System.in); 
	System.out.println("can we begin the game tell (Y/N)");
	choice= n8.next();
	
	while (choice=="Y") {
		Scanner n5 = new Scanner(System.in); 
		System.out.println("give the number of stones in the box. It should be between 30 to 50");
		u = n5.nextInt();
		if (u>=30 && u<=50)
		do{
			Scanner n6 = new Scanner(System.in); 
			System.out.println("select the number of stones player1  need to take out");
			v= n6.nextInt();
			if (v>=1 && v<=3){
			u=u-v;
			System.out.println("number of stones left in box" +u);
			}
			else{
			System.out.println("give the correct number between 1 and 3");
			v = n4.nextInt();
			u=u-v;
			System.out.println("number of stones left in the box  " +u);
			}
			if (u==0){
			System.out.println("name of player = "+q1+ "and mit id " +id1+ "game won");
			Scanner n11 = new Scanner(System.in); 
			System.out.println("lets  begin the game (Y/N)");
			choice= n11.next();
			}				 
			Scanner n7 = new Scanner(System.in); 
			System.out.println("choose number of stones player 2 take of the box");
			x= n7.nextInt();
			if (x<=3 && x>=1){
			u=u-x;
			System.out.println("total stones left in box" +u);
			}
			else{
			System.out.println("select the correct number between 1 and 3");				 
			x= n5.nextInt();
			u=u-x;
			System.out.println("number of stones left " +u);
			}
			if(u==0){
			System.out.println("name of player= "+q2+ "and mit id " +id2+ "game won");
			Scanner n12 = new Scanner(System.in); 
			System.out.println("lets start the game say (Y/N)");
			choice= n12.next();
			}				 
			if (u==0){
			System.out.println("CONGRATS");
			}
			else{
			system=comchoice(u);
			System.out.println("System selected stones "+system+ "stones");
			u=u-system;
			System.out.println("total number of stones left in box " +u);
			if (u==0){
				System.out.println("system won");
				Scanner n13 = new Scanner(System.in); 
				System.out.println("lets begin the game (Y/N)");
				choice= n13.next();
			}
			}
		}while (u>0);
		else{
			System.out.println("choose the number stones between 30 and 50 for stones in box");
			u= n3.nextInt();
		}	  
    }
	
}
	 public static int comchoice(int u) 
	 {
		 int system;
		 if (u%3==0)
		 {system=2;} else { system=1;}
		 return system;
	 }
	
}
