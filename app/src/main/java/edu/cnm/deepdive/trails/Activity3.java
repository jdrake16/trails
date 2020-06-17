package edu.cnm.deepdive.trails;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Activity3 extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_3);

    Button butt6 = findViewById(R.id.butt6);

    butt6.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent int6 = new Intent(Activity3.this,Activity6.class);
        startActivity(int6);
      }
    });

  }
}
