package com.werockstar.androidmvpdemo.model;

import com.google.gson.Gson;
import com.werockstar.androidmvpdemo.JsonResource;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FlowersCollectionTest {

    private String response;
    private FlowersCollection collection;

    @Before
    public void setUp() throws Exception {
        response = JsonResource.fromResource("flowers.json");
        collection = new Gson().fromJson(response, FlowersCollection.class);
    }

    @Test
    public void should_see_category_shrubs() throws Exception {
        assertEquals("Shrubs", collection.getCategory());
    }
}