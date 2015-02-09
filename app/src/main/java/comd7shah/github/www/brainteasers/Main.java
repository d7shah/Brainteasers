package comd7shah.github.www.brainteasers;

import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Main extends ActionBarActivity {
    private final String TAG = "answerbutton";
    ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        viewpager = (ViewPager) findViewById(R.id.pager);
        PagerAdapter padapter = new PagerAdapter(getSupportFragmentManager());
        viewpager.setAdapter(padapter);


        setupMessageButton();
        setupMessageButton1();
    }

    private void setupMessageButton() {
        // 1. Get a reference to the button
        Button messageButton = (Button) findViewById(R.id.button);

        //2. Set the click listener to run my code
        messageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "There is nothing called a half whole and it cannot be dug!");
                Toast.makeText(Main.this, "There is nothing called a half whole and it cannot be dug!", Toast.LENGTH_LONG).show();



            }
        });
    }

    private void setupMessageButton1() {
        // 1. Get a reference to the button
        Button messageButton = (Button) findViewById(R.id.button2);

        //2. Set the click listener to run my code
        messageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "11 Cows");
                Toast.makeText(Main.this, "11 Cows", Toast.LENGTH_LONG).show();



            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
