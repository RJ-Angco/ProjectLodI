package com.example.bryannovicio.projectlodi_final;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class NuBudgetActivity extends AppCompatActivity {
   private ArrayList<RestaurantBean> allRestaurants = new ArrayList<>();
   private ArrayList<RestaurantBean> budgetRestaurants = new ArrayList<>();
   Random rnd;
   ImageView img;
   TextView output;
   Intent i;
   EditText anoBudget;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nu_budget);
        this.setTitle("Project Lodi");
        output = (TextView) findViewById(R.id.txtSaan);
        anoBudget = (EditText) findViewById(R.id.txtBudget);
        img = (ImageView) findViewById(R.id.imgSaan);
        img.setImageResource(R.drawable.logo);
        anoBudget.setText("");
        allRestaurants.add(new RestaurantBean("Jollibee", R.drawable.jabee, 55, 192));
        allRestaurants.add(new RestaurantBean("McDonalds", R.drawable.mcdo, 55, 230));
        allRestaurants.add(new RestaurantBean("Burger King", R.drawable.burgerking, 99, 249));
        allRestaurants.add(new RestaurantBean("KFC", R.drawable.kfc, 64, 595));
        allRestaurants.add(new RestaurantBean("Subway", R.drawable.subway, 99, 245));
        allRestaurants.add(new RestaurantBean("Pizza Hut", R.drawable.pizzahut, 99, 649));
        allRestaurants.add(new RestaurantBean("Tapa King", R.drawable.tapaking, 39, 169));
        allRestaurants.add(new RestaurantBean("Pancake House", R.drawable.pancakehouse, 159, 489));
        allRestaurants.add(new RestaurantBean("Starbucks", R.drawable.starbucks, 105, 185));
        output.setText("Saan tayo lodi?");

    }
    public void onABudget(View v)
    {
        budgetRestaurants.removeAll(budgetRestaurants);
        try {
            double budget = (Double.parseDouble((anoBudget.getText()).toString()));
            for (int i = 0; i < allRestaurants.size(); i++) {
                if (budget >= allRestaurants.get(i).getMinPrice() && budget < allRestaurants.get(i).getMaxPrice() || (budget > allRestaurants.get(i).getMaxPrice())) {
                    budgetRestaurants.add(allRestaurants.get(i));
                }
            }
            if (budgetRestaurants.isEmpty()) {
                img.setImageResource(R.drawable.logo);
                output.setText("Wala, pare. :(");
            } else {
                rnd = new Random();
                int num = rnd.nextInt(budgetRestaurants.size());
                img.setImageResource(budgetRestaurants.get(num).getImageID());
                output.setText("Sa " + budgetRestaurants.get(num).getName() + " tayo. Werpa!");
            }
        }
        catch(Exception e)
        {
            output.setText("Bawal blanko, lodi </3");
        }
    }
    public void clearAll(View v)
    {
        img.setImageResource(R.drawable.logo);
        anoBudget.setText(" ");
        output.setText("Saan tayo lodi?");
        budgetRestaurants.removeAll(budgetRestaurants);
    }
    public void returnToMenu(View v)
    {
        i = new Intent(this, MainMenuActivity.class);
        startActivity(i);
    }
}
