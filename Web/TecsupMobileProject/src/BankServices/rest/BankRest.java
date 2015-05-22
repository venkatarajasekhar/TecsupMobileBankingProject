package BankServices.rest;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Path("/loginUserPass")
public class BankRest {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
	public String Test( ) {

		
		JSONObject arrayObj = new JSONObject();
		
		try {
			arrayObj.put("response","test");
			
			
		} catch (Exception e) {	
			System.out.println(e.getMessage());
		}
		return arrayObj.toString();
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public String login(@FormParam("username") String username, 
							@FormParam("password") String password) {



		JSONObject jsonObj = new JSONObject();
		
		try {
			/*
			ProductoDAO dao = new ProductoDAO();
			
			Producto vo = new Producto();
			Categoria cvo = new Categoria();
			cvo.setIdCategoria(idCategoria);
			vo.setCategoria(cvo);
			vo.setNombre(nombre);
			vo.setPrecio(precio);
			
			vo = dao.insertar(vo);
			System.out.println(vo.getIdProducto());
			*/
			jsonObj.put("return", "CURRECT");
			if (username == "")
			{
				jsonObj.put("return", "INCORRECT");
			}
			
			else if (password == "")
			{
				jsonObj.put("return", "INCORRECT");
			}
			
			
			
						
		} catch (Exception e) {
			jsonObj.put("return", "INCORRECT");
			System.out.println(e.getMessage());
		}
		return jsonObj.toString();
	}
	

}
