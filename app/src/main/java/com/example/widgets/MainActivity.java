package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);

        // Get a reference to the ImageView
        ImageView imageView = findViewById(R.id.imageView);

        // Set the image resource to ic_launcher_background.xml
        imageView.setImageResource(R.drawable.ic_launcher_background);
    }
}
