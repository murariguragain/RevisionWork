


package javaproject;

public class RevisionA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//comparision operater:
		System.out.println(9>5);
		System.out.println(10<100);
		System.out.println(5==3);
		System.out.println(6!=6);
		System.out.println(3<=2);
		//and or NOT
		System.out.println(3<5 && 4>6);
		System.out.println(6<8 && 8>9);
		System.out.println(5<5 || 8>=8);
		System.out.println(41<43 || 3>3);
		System.out.println(!(5==5));
		System.out.println(!(7<8));
		
		// CONDITIONAL
		int numberC = 45;
		if(numberC>0 && numberC <10) {
		System.out.println("10% discount");
		}
		if(numberC>10 && numberC<20) {
			System.out.println("20%discount");
		}
		if(numberC>20) {
			System.out.println("30%discount");
		}
		int height = 45;
		if(height>20) {
		System.out.println("dwarf");
		}
		else if(height>40) {
		System.out.println("normal");
		}
		else if(height>44){
		System.out.println("Taller");
		}
		//tenary operator
		int a1 = 200;
		int b1 = 300;
		if(a1>b1) {
		System.out.println("a1 is greater");
		}
		else {
		System.out.println("b1 is greater");
			
		}
		int max = (a1>b1)? a1:b1;
		System.out.println(max);
		
		//Switch case
		String city = "Pokhara";
		switch(city) {
		case "Pokhara":
			System.out.println("Gandaki pradesh");
			break;
		case "ilam":
			System.out.println("Pradesh one");
			break;
		case "kathmandu":
			System.out.println("bagmati pradesh");
			break;
		default:
			System.out.println("not a city");
		}
		//loop
		for(int i = 4; i<17; i++) {
			System.out.println(i);
		}
		for(int i1 = 200; i1> 20; i1=i1-10) {
			System.out.println(i1);
			//if(i1==70) 
				//break;
	
			int i3 = 1;
			while(i3<15) {
				System.out.println(i3);
				i3++;
			}
			
			//function
			int m = 12;
			int n = 10;
			System.out.println(m+n);
			System.out.println(m-n);
			System.out.println(m*n);
			System.out.println(m/n);
			System.out.println(m%n);
			
			int m1 = 30;
			int n1 = 10;
			System.out.println(m1+n1);
			System.out.println(m1-n1);
			System.out.println(m1*n1);
			System.out.println(m1/n1);
			System.out.println(m1%n1);
			Guiter(2,3);
			GuiterA(4,5);
			String singer = Geet("Narayan ", "Gopal ");
			System.out.println(singer);
			System.out.println(singer + "swor samrat");
		}
		
	
	
	
	
	
	}
	
public static void Guiter(int x, int y) {
	System.out.println(x+y);
}
public static int GuiterA(int x1, int y1) {
		System.out.println(x1+y1);
		return x1+y1;
}
public static String Geet(String firstname, String lastname) {
	System.out.println(firstname+lastname);
	return firstname+lastname;
	
}
}
