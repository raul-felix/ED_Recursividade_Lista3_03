package view;

import controller.CaracteresController;

public class Main {
	
	public static void main(String[] args) {

		CaracteresController carController = new CaracteresController();
		String texto = "JABUTICABA";
		System.out.println(carController.inverteTexto(texto, texto.length(), ""));
	}
}
