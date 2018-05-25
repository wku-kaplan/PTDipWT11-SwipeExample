package sg.com.kaplan.ptdipwt11_swipeexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Toast;

import com.github.pwittchen.swipe.library.rx2.SimpleSwipeListener;
import com.github.pwittchen.swipe.library.rx2.Swipe;

public class MainActivity extends AppCompatActivity {

    private Swipe swipe; //Step 1. Create a Swipe variable

    //Step 3
    @Override public boolean dispatchTouchEvent(MotionEvent event) {
        swipe.dispatchTouchEvent(event);
        return super.dispatchTouchEvent(event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swipe = new Swipe(); //Step 2. Create an object instance
        swipe.setListener(new SimpleSwipeListener() {
            @Override
            public boolean onSwipedLeft(MotionEvent event) {
                Toast.makeText(MainActivity.this, "LEFT", Toast.LENGTH_SHORT).show();
                return super.onSwipedLeft(event);
            }

            @Override
            public boolean onSwipedRight(MotionEvent event) {
                Toast.makeText(MainActivity.this, "RIGHT", Toast.LENGTH_SHORT).show();
                return super.onSwipedRight(event);
            }

            @Override
            public boolean onSwipedUp(MotionEvent event) {
                Toast.makeText(MainActivity.this, "UP", Toast.LENGTH_SHORT).show();
                return super.onSwipedUp(event);
            }

            @Override
            public boolean onSwipedDown(MotionEvent event) {
                Toast.makeText(MainActivity.this, "DOWN", Toast.LENGTH_SHORT).show();
                return super.onSwipedDown(event);
            }
        });
    }
}
