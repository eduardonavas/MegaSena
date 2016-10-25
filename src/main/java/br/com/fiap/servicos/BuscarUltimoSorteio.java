package br.com.fiap.servicos;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.fiap.dao.GenericDao;
import br.com.fiap.model.MegasenaSorteio;

@Path("/buscarUltimo")
public class BuscarUltimoSorteio {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public MegasenaSorteio get(){
		GenericDao<MegasenaSorteio> dao = new GenericDao<>(MegasenaSorteio.class);
		
		MegasenaSorteio m = dao.buscarUltimo();
		return m;
	}
}
