package com.axonactive.jpa.service;

import com.axonactive.jpa.entity.Restaurant;

import java.util.List;

public interface RestaurantService {
    List<Restaurant> getAllRestaurants();
    Restaurant getRestaurantById(int restaurantId);
}
