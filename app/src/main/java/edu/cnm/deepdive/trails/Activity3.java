package edu.cnm.deepdive.trails;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Activity3 extends AppCompatActivity {

//  private ImageView mimageView;
//  private static final int REQUEST_IMAGE_CAPTURE = 101;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_3);

////    mimageView = findViewById(R.id.imageView);
//  }


    Button butt6 = findViewById(R.id.butt6);
    Button butt7 = findViewById(R.id.butt7);

    butt6.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent int6 = new Intent(Activity3.this, Activity6.class);
        startActivity(int6);
      }
    });

    butt7.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent int7 = new Intent(Activity3.this, Activity7.class);
        startActivity(int7);
      }
    });

//  public void takePicture(View view) {
//
//    Intent imageTakeIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//
//    if (imageTakeIntent.resolveActivity(getPackageManager()) != null) {
//      startActivityForResult(imageTakeIntent, REQUEST_IMAGE_CAPTURE);
//    }
//
//  }
//
//  @Override
//  protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//
//    if (requestCode==REQUEST_IMAGE_CAPTURE && requestCode==RESULT_OK) {
//      Bundle extras = data.getExtras();
//      Bitmap imageBitmap = (Bitmap) extras.get("data");
//      mimageView.setImageBitmap(imageBitmap);
//    }
//
//  }
  }

}


