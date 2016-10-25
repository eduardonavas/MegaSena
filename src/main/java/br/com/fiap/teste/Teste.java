package br.com.fiap.teste;

import java.util.ArrayList;


import br.com.fiap.dao.GenericDao;
import br.com.fiap.model.MegasenaSorteio;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericDao<MegasenaSorteio> dao = new GenericDao<>(MegasenaSorteio.class);
		ArrayList<MegasenaSorteio> mega = (ArrayList<MegasenaSorteio>) dao.listar();
		
		System.out.println(mega.size());
	}

}
