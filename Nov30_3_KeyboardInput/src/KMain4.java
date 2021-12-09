import java.util.Scanner;

public class KMain4 {
	public static void main(String[] args) {
		//¸Þ´ºÆÇ ºÐ½ÄÁý
		//¶±ººÀÌ, ¼ø´ë, ¾î¹¬, Æ¢±è, ...
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("***********ºÐ½ÄÁý***********");
		System.out.println("\t¶±ººÀÌ : 4500¿ø");
		System.out.println("\t¼ø´ë : 3000¿ø");
		System.out.println("\t¾î¹¬ : 2000¿ø");
		System.out.println("\tÆ¢±è : 2500¿ø");		
		System.out.println("***********-----***********");
		
		System.out.println("ÁÖ¹®ÇØÁÖ¼¼¿ä");
		System.out.print("¶±ººÀÌ °³¼ö : ");
		int a = keyboard.nextInt();
		System.out.print("¼ø´ë °³¼ö : ");
		int b = keyboard.nextInt();
		System.out.print("¾î¹¬ °³¼ö : ");
		int c = keyboard.nextInt();
		System.out.print("Æ¢±è °³¼ö : ");
		int d = keyboard.nextInt();
		
		System.out.printf("°è»ê¼­ : ¶±ººÀÌ%d/¼ø´ë%d/¾î¹¬%d/Æ¢±è%d => "
				+ "%,d¿ø",a,b,c,d,4500*a + 3000*b + 2000*c + 2500*d);
		
		
		
		
		
		
		
		
		
	}
}
