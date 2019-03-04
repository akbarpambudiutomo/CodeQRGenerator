package com.example.akbar.codeqrgenerator;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class GeneratorReader extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generator_reader);

        imageView = findViewById(R.id.image1);
        Bitmap bitmap = getIntent().getParcelableExtra("pic");
        imageView.setImageBitmap(bitmap);

    }
}
