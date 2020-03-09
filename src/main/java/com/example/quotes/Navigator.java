package com.example.quotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.r0adkll.slidr.Slidr;

public class Navigator extends AppCompatActivity {
    ImageView img;
    TextView txtView;
    private Switch nightswitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if(AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES){
            setTheme(R.style.darktheme);
        }
        else setTheme(R.style.AppTheme);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigator);

        Slidr.attach(this);

        img = findViewById(R.id.imageView);
        txtView = findViewById(R.id.textView);

        nightswitch = (Switch) findViewById(R.id.switch1);
        if(AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES){
            nightswitch.setChecked(true);
        }
        nightswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                }
                else{
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                }
            }
        });

        Intent i = getIntent();
        String var1 = i.getStringExtra("robin");
        String var2 = i.getStringExtra("paulo");
        String var3 = i.getStringExtra("gandhi");
        String var4 = i.getStringExtra("einstein");

        if(var1!=null && var1.equals("Robin Sharma")){
            img.setImageResource(R.drawable.robin);
            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(Navigator.this, "Robin Sharma", Toast.LENGTH_SHORT).show();
                }
            });
            String htmlString = "√ Give out what you most want to come back.<br/><br/>"+
                    "√ You can't make someone feel good about themselves until you feel good about.<br/>";
            txtView.setText(Html.fromHtml(htmlString));
        }
        else if(var2!=null && var2.equals("Paulo Coelho")){
            img.setImageResource(R.drawable.paulo);
            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(Navigator.this, "Paulo Coelho", Toast.LENGTH_SHORT).show();
                }
            });
            String htmlString = "√ Tell your heart that the fear of suffering is worse than the suffering itself. And no heart has ever suffered when it goes in search of its dream.<br/><br/>"+
                    "√ When you want something, all the universe conspires in helping you to achieve it.<br/>";

            txtView.setText(Html.fromHtml(htmlString));

        }
        else if(var3!=null && var3.equals("Mohandas Karamchand Gandhi")){
            img.setImageResource(R.drawable.gandhi);
            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(Navigator.this, "MK Gandhi", Toast.LENGTH_SHORT).show();
                }
            });
            String htmlString = "√ An eye for eye only ends up making the whole world blind.<br/><br/>"+
                    "√ Happiness is when what you think, what you say, and what you do are in harmony.<br/>";

            txtView.setText(Html.fromHtml(htmlString));

        }

        else if(var4!=null && var4.equals("Albert Einstein")){
            img.setImageResource(R.drawable.einstein);
            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(Navigator.this, "Albert Einstein", Toast.LENGTH_SHORT).show();
                }
            });
            String htmlString = "√ Insanity: doing the same thing over and over again and expecting different results.<br/><br/>"+
                    "√ Two things are infinite: the universe and human stupidity; and I'm not sure about the universe.<br/>";

            txtView.setText(Html.fromHtml(htmlString));

        }

    }
    public void dev(View v){
        Intent i = new Intent(getApplicationContext(), Dev.class);
        startActivity(i);

    }
}
