package actividad3.conversortemperaturas;

import java.util.Scanner;
public class Temperature_converter {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("\n\tBienvenido al conversor de temperaturas\n");
	System.out.print("Introduce el valor que quieres convertir : ");
	float value = scan.nextFloat();
	System.out.println("  Introduce 1 para pasar de Celsius a Fahrenheit....");
	System.out.println("  Introduce 2 para pasar de Fahrenheit a Celsius....");
	System.out.print("\nIntroduce tu valor aquí...   ");
	int ans = scan.nextInt();
	if (ans == 1) {
		float value1 = (float) ((value*(1.8))+32);
		System.out.print("Aquí tienes tu converson.. "+value1+"�F");
		}
	if (ans == 2) {
			float value2 = (float) (value-32);
			float value3 = (float) (value2*(5)/9);
			System.out.print("Aqui tienes tu conversion.. "+value3+"�C");
		}
	System.out.println("\n\tGracias!!..");
	}
}
