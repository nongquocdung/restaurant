package com.axonactive.jpa.controller;

import com.axonactive.jpa.entity.Restaurant;
import com.axonactive.jpa.service.RestaurantService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("restaurants")
@Produces(MediaType.APPLICATION_JSON)
public class RestaurantController {
    @Inject
    RestaurantService restaurantService;

    @GET
    public Response getAllRestaurants() {
        return Response.ok(restaurantService.getAllRestaurants()).build();
    }

    @GET
    @Path("/{restaurantId}")
    public Response getRestaurantById(@PathParam("restaurantId") int restaurantId) {
        return Response.ok(restaurantService.getRestaurantById(restaurantId)).build();
    }
}
