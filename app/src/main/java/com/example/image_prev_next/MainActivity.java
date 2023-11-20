package com.example.image_prev_next;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button btnNext, btnPrev;
    private int[] imageCarousel = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3};
    int i= 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //view init
        imageView = findViewById(R.id.imageView);
        btnNext = findViewById(R.id.btnNext);
        btnPrev = findViewById(R.id.btnPrev);

        //btnPrevious
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i--;
                imageChange();
            }
        });

        //btnNext
        btnNext.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                i++;
                imageChange();
            }

        });
    }

    private void imageChange() {
        if ( i == 0){
            btnPrev.setVisibility(View.GONE);
        }else {
            btnPrev.setVisibility(View.VISIBLE);
        }

        if(i == imageCarousel.length - 1){
            btnNext.setVisibility(View.GONE);
        }else{
            btnNext.setVisibility(View.VISIBLE);
        }

        imageView.setImageResource(imageCarousel[i]);
    }
}