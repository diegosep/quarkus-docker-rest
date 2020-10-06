package org.example.resources

import org.example.domain.Plant
import java.net.URI
import javax.transaction.Transactional
import javax.ws.rs.*
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

@Path("/plant")
class PlantResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun getAllPlants(): List<Plant> {
        return Plant.listAll()
    }

    @Transactional
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    fun savePlant(newPlant: Plant): Response {
        Plant.persist(newPlant)
        return Response.created(URI.create("/plant/" + newPlant.id)).build()
    }
}