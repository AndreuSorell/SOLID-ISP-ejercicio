package edu.poniperro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProcesadorTextoBasico implements ProcesadorBasico {

    private List<String> texto = new ArrayList<>();
	
    @Override
	public void nueva (String palabra) {
		texto.add(palabra);
	}
	
    @Override
	public String texto () {
		return texto.stream().collect(Collectors.joining(" "));
	}
    
}
