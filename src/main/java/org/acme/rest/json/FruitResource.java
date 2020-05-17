package org.acme.rest.json;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/fruits")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FruitResource {
	
	private static Fruit fruit = new Fruit("apple", "red, sweet and winter fruit");
	private static List<Fruit> fruits = new ArrayList<>();

//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String hello() {
//        return "hello";
//    }
    
 
	@GET
	@Path("/first")
	 public Fruit first() {
		return fruit;
	}
	
	@GET
	@Path("/list")
	public List<Fruit> list() {
		return fruits;
	}
	
	@POST
	public Fruit add(Fruit fruit) {
        fruits.add(fruit);
        return fruit;
	}
}