import java.util.InputMismatchException;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonSample {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Persona p = new Persona();
		int exc1 = 0;
		int exc = 0;
		int intentos = 0;

		System.out.println("Introduce tu nombre:");
		p.setNombre(teclado.nextLine());

		while (p.contieneSoloLetras(p.getNombre()) == false || p.getNombre().length() == 0) {
			System.out.println("Introduce algo coherente:");
			p.setNombre(teclado.nextLine());
		}

		System.out.println("Introduce tus apellidos:");
		p.setApellidos(teclado.nextLine());

		while (p.contieneSoloLetras(p.getApellidos()) == false || p.getApellidos().length() == 0) {
			System.out.println("Introduce algo coherente:");
			p.setApellidos(teclado.nextLine());
		}

		while (exc1 == exc) {
			try {
				if (intentos == 0) {
					System.out.println("Introduce tu edad:");
					p.setEdad(teclado.nextInt());
					exc = 1;
				} else {
					System.out.println("Introduce algo coherente:");
					p.setEdad(teclado.nextInt());
					exc = 1;
				}
			} catch (InputMismatchException exception) {
				intentos = 1;
				teclado.nextLine();
			}
		}

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println("");
		System.out.println(json);

		teclado.close();

	}

}