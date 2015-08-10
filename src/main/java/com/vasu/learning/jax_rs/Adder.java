package com.vasu.learning.jax_rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("adder/{a}/{b}")
public class Adder {

	@GET
	public Response add(@PathParam("a") long a, @PathParam("b") long b) {
		float fl = 100;



		return Response.status(200).entity("Jersey say : " + (a + b)).build();
	}
}
