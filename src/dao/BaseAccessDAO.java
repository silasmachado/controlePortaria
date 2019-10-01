package dao;

import java.util.ArrayList;

public class BaseAccessDAO {
	
	public ArrayList<String> retornaCondominios() {
		
		ArrayList<String> listaCondominios = new ArrayList<String>();
		
		//TODO aqui ficara a query que busca os condominios
		
		listaCondominios.add("--SELECIONE--");
		listaCondominios.add("ASTORIA");
		listaCondominios.add("COLIBRI");
		listaCondominios.add("MARAVILHA");
		
		return listaCondominios;
	}

}
