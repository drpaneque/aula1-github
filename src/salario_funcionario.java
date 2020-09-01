import java.util.Scanner;

public class salario_funcionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int func, ht;
		double vht, salary;
		
		Scanner sc = new Scanner(System.in);
		
		func = sc.nextInt();
		ht = sc.nextInt();
		vht= sc.nextDouble();
		salary = ht * vht;
		System.out.println("NUMBER = " + func);
		System.out.printf("SALARY = U$ %.2f%n ", salary);
			
		sc.close();
				
				
	}

}
