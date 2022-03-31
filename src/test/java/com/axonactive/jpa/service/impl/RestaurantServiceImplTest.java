package com.axonactive.jpa.service.impl;

import com.axonactive.jpa.entity.Restaurant;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class RestaurantServiceImplTest {
    @InjectMocks
    RestaurantServiceImpl restaurantService;

    @Mock
    EntityManager em;

    @Test
    void getRestaurantById_ShouldReturnRestaurant() {
        Restaurant expectRestaurant = new Restaurant();
        expectRestaurant.setId(1);
        expectRestaurant.setName("KFC");
        expectRestaurant.setAddress("HCM");

        when(em.find(Restaurant.class, 1)).thenReturn(expectRestaurant);

        Restaurant actualRestaurant = restaurantService.getRestaurantById(1);

        assertEquals(expectRestaurant.getName(), actualRestaurant.getName());
    }
}