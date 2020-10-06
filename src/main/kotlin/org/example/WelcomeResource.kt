package org.example

import java.util.*
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/")
class WelcomeResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun hello(): Map<String, String> = Collections.singletonMap("message", "Hello From Quarkus")
}