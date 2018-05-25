package com.istanbul.bankalar;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.istanbul.pojo.Bankalar;

@Path("/subeler")
public class KartBilgileri {
	
	
	@GET
	@Path("/jsube")
	@Produces(MediaType.APPLICATION_JSON)
	public Response subelerJSON() {
		
		List<Bankalar> bankalar = new ArrayList<Bankalar>();
		
		bankalar.add(new Bankalar("Esenler","Garanti Bankas�"));
		bankalar.add(new Bankalar("Esenler","Ziraat Bankas�"));
		bankalar.add(new Bankalar("Bagc�lar","TEB Bankas�"));
		bankalar.add(new Bankalar("Bak�rkoy","Finans Bankas�"));
		return Response.status(200).entity(bankalar).build();
	}
	
	
	

}
