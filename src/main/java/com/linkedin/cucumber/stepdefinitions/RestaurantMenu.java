package com.linkedin.cucumber.stepdefinitions;

import com.linkedin.cucumber.RestaurantMenuItem;

import java.util.ArrayList;

public class RestaurantMenu {

    ArrayList<RestaurantMenuItem> menuItems = new ArrayList<>();

    public boolean add(RestaurantMenuItem newMenuItem) {
        return menuItems.add(newMenuItem);
    }

    public boolean doesItemExist(RestaurantMenuItem newMenuItem) {
        return menuItems.contains(newMenuItem) ? true : false;
    }
}
