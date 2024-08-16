package controller;

public class CaracteresController {
	
	public CaracteresController() {
		super();
	}
	
	public String inverteTexto(String texto, int tamanho, String invertido) {
		// se o tamanho for menor que 1, retormanos o texto invertido
		if (tamanho < 1) {
			return invertido;
		} else {
			// se não, retornamos o texto invertido até agora concatenado com a chamada da função com o tamanho diminuído por 1, e portanto sua última posição também 
			tamanho--;
			return invertido + inverteTexto(texto.substring(0, tamanho), tamanho, texto.substring(tamanho));
		}
	}

}
