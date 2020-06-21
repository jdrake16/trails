package edu.cnm.deepdive.trails;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;

public class Activity7 extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_7);

    ViewPager viewPager = findViewById(R.id.viewPager);
    ImageAdapter adapter = new ImageAdapter(this);
    viewPager.setAdapter(adapter);


  }
}
