package com.example.quotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton sharebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharebtn = (ImageButton) findViewById(R.id.sharebtn);
        sharebtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                String shareBody = "Hey check Out this cool app by Gaurav Kabra!";
                String shareSub = "Sharing";
                i.putExtra(Intent.EXTRA_SUBJECT, shareSub);
                i.putExtra(Intent.EXTRA_TEXT,shareBody);
                startActivity(i.createChooser(i,"I want to share this app by Gaurav Kabra via..."));
            }
        });
    }

    public void robin(View v){
        Intent i1 = new Intent(MainActivity.this, Navigator.class);
        i1.putExtra("robin","Robin Sharma");
        startActivity(i1);
    }
    public void paulo(View v){
        Intent i1 = new Intent(MainActivity.this, Navigator.class);
        i1.putExtra("paulo","Paulo Coelho");
        startActivity(i1);
    }
    public void gandhi(View v){
        Intent i1 = new Intent(MainActivity.this, Navigator.class);
        i1.putExtra("gandhi","Mohandas Karamchand Gandhi");
        startActivity(i1);
    }
    public void einstein(View v){
        Intent i1 = new Intent(MainActivity.this, Navigator.class);
        i1.putExtra("einstein","Albert Einstein");
        startActivity(i1);
    }

}
