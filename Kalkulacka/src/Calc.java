import java.util.*;
public class Calc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // objekt cislo ? metoda?
		int a; // difinovanie premennych
		int b; //druha premenna
		int c;  //vysledok
		float s;
		
		int o; //tretie cislo na kalkulaciu
		int k; //tretie vysledne cislo
		float q;
		
		//float h;
		//float f;
		
		int selection; //vyber matematickej operacie
		System.out.println("Napis 2 numericke cisla s ktorymi sa bude pocitat"); //Vypis na konzole
		a=scan.nextInt(); // Prve cislo
		b= scan.nextInt(); //druhe cislo
		
		
		
		System.out.println("Vyber si moznost");
		System.out.println("1.Scitaj");
		System.out.println("2. Odcitaj");
		System.out.println("3.Nasob");
		System.out.println("4.Vydel");
		
		selection=scan.nextInt();//vyber matemat operacie 1az4
		methods metoda = new methods();
		
		while(selection>4) {
			System.out.println("Vyber len z operacii 1 az 4");
			selection=scan.nextInt(); // Vybera moznost 1 az 4
		}

		if(selection==1) {
			c=metoda.pridaj(a, b);
			System.out.println("Vysledok je: " +c );
			System.out.println("Napis cislo ktore chces pripocitat k vysledku");
			
			o= scan.nextInt();
			k=c+o;
			System.out.println("Vysledok je " +k);
			
			
		}
		else if (selection==2) {
			c=metoda.minus(a,b);
			System.out.println("Vysledok je: " +c);
			System.out.println("Napis cislo ktore chces odcitat od vysledku");
			o= scan.nextInt();
			k=c-o;
			System.out.println("Vysledok je " +k);
			
			
		}
		
		else if (selection==3) {
			c=metoda.krat(a,b);
			System.out.println("Vysledok je: " +c);
			System.out.println("Napis cislo ktore chces vynasobit k vysledku");
			o= scan.nextInt();
			k=c*o;
			System.out.println("Vysledok je " +k);
		}
		
		else if (selection==4) {
			s=metoda.deleno(a,b);
			System.out.println("Vysledok je: " +s);
			System.out.println("Napis cislo ktore chces vydelit k vysledku");
			
			o= scan.nextInt();
			q=s/o;
			System.out.println("Vysledok je " +q);
			
		}
		
	
		

	}

}
