package zharkovalexeyv.baks;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        ImageView image = findViewById(R.id.imageView);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.animation);
        image.startAnimation(animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent perehod = new Intent(StartActivity.this, MainActivity.class);
                startActivity(perehod);
                finish();
            }
        }, 4*1000);
    }
}
