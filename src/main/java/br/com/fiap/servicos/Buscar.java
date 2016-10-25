package br.com.fiap.servicos;


import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.fiap.dao.GenericDao;
import br.com.fiap.model.MegasenaSorteio;

@Path("/buscar")
public class Buscar {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<MegasenaSorteio> buscar(){
		GenericDao<MegasenaSorteio> dao = new GenericDao<>(MegasenaSorteio.class);
		ArrayList<MegasenaSorteio> sorteios =  (ArrayList<MegasenaSorteio>) dao.listar();
		
		return sorteios;
		
	}
}
