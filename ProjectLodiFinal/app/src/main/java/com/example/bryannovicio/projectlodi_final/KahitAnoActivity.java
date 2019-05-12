package com.example.bryannovicio.projectlodi_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Random;

public class KahitAnoActivity extends AppCompatActivity {
    ImageView img;
    TextView output;
    Random rnd;
    private ArrayList<RestaurantBean> RESTAURANTS = new ArrayList<RestaurantBean>();
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kahit_ano);
        this.setTitle("Project Lodi");
        output =(TextView) findViewById(R.id.txtRestaurantName);
        RESTAURANTS.add(new RestaurantBean("Jollibee", R.drawable.jabee, 55, 192));
        RESTAURANTS.add(new RestaurantBean("McDonalds", R.drawable.mcdo, 55, 230));
        RESTAURANTS.add(new RestaurantBean("Burger King", R.drawable.burgerking, 99, 249));
        RESTAURANTS.add(new RestaurantBean("KFC", R.drawable.kfc, 64, 595));
        RESTAURANTS.add(new RestaurantBean("Subway", R.drawable.subway, 99, 245));
        RESTAURANTS.add(new RestaurantBean("Pizza Hut", R.drawable.pizzahut, 99, 649));
        RESTAURANTS.add(new RestaurantBean("Tapa King", R.drawable.tapaking, 39, 169));
        RESTAURANTS.add(new RestaurantBean("Pancake House", R.drawable.pancakehouse, 159, 489));
        RESTAURANTS.add(new RestaurantBean("Starbucks", R.drawable.starbucks, 105, 185));
        output.setText("Saan tayo lodi?");
    }
    public void taraLodi(View v)
    {
        Toast.makeText(this, "Tara, enka!", Toast.LENGTH_LONG).show();
        img = (ImageView) findViewById(R.id.imgResto);
        rnd = new Random();
        int num = rnd.nextInt(RESTAURANTS.size());
        img.setImageResource(RESTAURANTS.get(num).getImageID());
        output.setText("Sa " + RESTAURANTS.get(num).getName() + " tayo. Werpa!");
    }
    public void balikMenu(View v)
    {
        i = new Intent(this, MainMenuActivity.class);
        startActivity(i);
    }
}
