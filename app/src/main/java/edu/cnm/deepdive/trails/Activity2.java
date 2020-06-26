package edu.cnm.deepdive.trails;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Activity2 extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_2);

    Button butt5 = findViewById(R.id.butt5);
    Button butt13 = findViewById(R.id.butt13);

    butt5.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent int5 = new Intent(Activity2.this,Activity5.class);
        startActivity(int5);
      }
    });

  }
}
