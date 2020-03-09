package com.example.quotes;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.r0adkll.slidr.Slidr;



public class Dev extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dev);
            Slidr.attach(this);

    }

    public void redirect(View v) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/gaurav-kabra"));
        startActivity(browserIntent);
    }
}

/**
 *
 * Uncomment the below code for
 * only alert/ popup and not full screen
 *
 */
//
//public class Dev extends AppCompatActivity {
//
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//
//        super.onCreate(savedInstanceState);
//
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setPositiveButton("Visit profile", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/gaurav-kabra"));
//                startActivity(browserIntent);
//                finish();
//            }
//        }).setNegativeButton("Okay", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                finish();
//            }
//        });
//        final AlertDialog dialog = builder.create();
//        LayoutInflater inflater = getLayoutInflater();
//        View dialogLayout = inflater.inflate(R.layout.image_layout, null);
//        dialog.setView(dialogLayout);
//        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
//
//        dialog.show();
//
//        dialog.setOnShowListener(new DialogInterface.OnShowListener() {
//            @Override
//            public void onShow(DialogInterface d) {
//                ImageView image = (ImageView) dialog.findViewById(R.id.imageView2);
//                float imageWidthInPX = (float)image.getWidth();
//
//                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(Math.round(imageWidthInPX), Math.round(imageWidthInPX/200) );
//                image.setLayoutParams(layoutParams);
//
//
//            }
//        });
//
//    }
//    public void redirect(View v) {
//        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/gaurav-kabra"));
//        startActivity(browserIntent);
//        finish();
//    }
//
//}
