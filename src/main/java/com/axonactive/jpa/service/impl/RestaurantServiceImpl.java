package com.axonactive.jpa.service.impl;

import com.axonactive.jpa.entity.Restaurant;
import com.axonactive.jpa.service.RestaurantService;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@RequestScoped
public class RestaurantServiceImpl implements RestaurantService {
    @PersistenceContext(unitName = "restaurant")
    EntityManager em;

    @Override
    public List<Restaurant> getAllRestaurants() {
        return em.createQuery("from Restaurant").getResultList();
    }

    @Override
    public Restaurant getRestaurantById(int restaurantId) {
        return em.find(Restaurant.class, restaurantId);
    }
}
