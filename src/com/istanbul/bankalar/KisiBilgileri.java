package com.istanbul.bankalar;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.PathSegment;
import javax.ws.rs.core.Response;

import com.istanbul.pojo.Bankalar;
import com.istanbul.pojo.Sahisler;

@Path("/kisibilgi")
public class KisiBilgileri {

	
	
	
	@GET
	@Path("/kisiler")
	@Produces(MediaType.APPLICATION_XML)
	public Response SpecialDatas()
	{
		Sahisler sahis = new Sahisler("Sercan","Beyoglu");
		
		
		return Response.status(200).entity(sahis).build();
	}
	
// 	 /rest/kisibilgi/matriks;subeadi1=bagc%C4%B1lar;bankadi1=garanti%20bankasi;subeadi2=ye%C5%9Filk%C3%B6y;bankadi2=vak%C4%B1f%20bank
	@GET
	@Path("/matriks")
	@Produces(MediaType.APPLICATION_JSON)
	public Response Dedektif(@MatrixParam("subeadi1")String subeadi,@MatrixParam("bankadi1") String bankadi,
							 @MatrixParam("subeadi2")String subeadi2,@MatrixParam("bankadi2")String bankadi2)
	{
			
		Bankalar banka = new Bankalar(subeadi,bankadi);
		Bankalar banka2 = new Bankalar(subeadi2,bankadi2);
		
		List<Bankalar> bk = new ArrayList<Bankalar>();
						bk.add(banka);
						bk.add(banka2);
		return Response.status(200).entity(bk).build();
	}
	
	@GET
	@Path("/dursun/{bugun}")
	@Produces(MediaType.TEXT_HTML)
	public Response Editor(@PathParam("bugun") PathSegment parametreler)
	{
		MultivaluedMap<String, String> tr = parametreler.getMatrixParameters();
		
		
		String v1="";
		for(String w : tr.keySet())
		{
			v1 += w+"="+tr.get(w);
		}
		
		return Response.status(200).entity(v1).build();
	}
	
	
	
}
