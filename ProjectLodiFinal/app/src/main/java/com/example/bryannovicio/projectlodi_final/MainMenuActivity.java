package com.example.bryannovicio.projectlodi_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainMenuActivity extends AppCompatActivity {
   // ImageView imgLogo;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        this.setTitle("Project Lodi");
      //  imgLogo.setImageResource(R.drawable.logo);

    }
    public void doSomething(View v)
    {
        switch(v.getId())
        {
            case R.id.btnKahitAno:
                i = new Intent(this, KahitAnoActivity.class);
                startActivity(i);
                break;
            case R.id.btnBudget:
                i = new Intent(this, NuBudgetActivity.class);
                startActivity(i);
                break;
        }
    }

}
