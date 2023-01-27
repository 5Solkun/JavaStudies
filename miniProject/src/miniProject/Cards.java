package miniProject;

public class Cards {
	final static String[] Deck= {"S-1","S-2","S-3","S-4","S-5","S-6","S-7","S-8","S-9","S-10","S-11","S-12","S-13",
			"D-1","D-2","D-3","D-4","D-5","D-6","D-7","D-8","D-9","D1-10","D-11","D-12","D-13",
			"H-1","H-2","H-3","H-4","H-5","H-6","H-7","H-8","H-9","H-10","H-11","H-12","H-13",
			"C-1","C-2","C-3","C-4","C-5","C-6","C-7","C-8","C-9","C-10","C-11","C-12","C-13"};


public static void PrintCard(String input){
	char a=input.charAt(0);
	String t[]=input.split("-");
	int b=Integer.parseInt(t[1]);
	String c = "";
	if (a=='S')
		a='♠';
	else if (a=='D')
		a='◆';
	else if (a=='H')
		a='♥';
	else if (a=='C')
		a='♣';
	if (b==1)
		c="A";
	else if(b==11)
		c="J";
	else if(b==12)
		c="Q";
	else if(b==13)
		c="K";
	else
		c=b+"";
	if(10==b)
	{
		System.out.printf(
				  ".------.\r\n"
				+ "|%s    |\r\n"
				+ "|  %c   |\r\n"
				+ "|    %s|\r\n"
				+ "`------'\n",c,a,c);
	}
	else
	System.out.printf(
			  ".------.\r\n"
			+ "|%s     |\r\n"
			+ "|  %c   |\r\n"
			+ "|     %s|\r\n"
			+ "`------'\n",c,a,c);
}
}
