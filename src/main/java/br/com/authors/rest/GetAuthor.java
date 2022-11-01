package br.com.authors.rest;

//JSON-B

import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;

// JAX-RS
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.QueryParam;

@Path("get-authors")
public class GetAuthor {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAuthor(
            @QueryParam("name") String name) {
        Author author = new Author("Michel Foucault", "have not", "have not");

        Jsonb jsonb = JsonbBuilder.create();
        String author_Json = jsonb.toJson(author);

        System.out.println(" ... send getAuthor response");
        return Response.ok(author_Json).build();
    }
}
