package com.example.sean.retrofitdemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private TextView id;
    private TextView facebookId;
    private TextView joinDate;
    private TextView fullName;
    private TextView postsDiscovered;
    private TextView postsCreated;
    private TextView city;
    private TextView state;
    private TextView country;
    private EditText edit;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id = (TextView) findViewById(R.id.id);
        facebookId = (TextView) findViewById(R.id.facebookId);
        joinDate = (TextView) findViewById(R.id.joinDate);
        fullName = (TextView) findViewById(R.id.fullName);
        postsDiscovered = (TextView) findViewById(R.id.postsDiscovered);
        postsCreated = (TextView) findViewById(R.id.postsCreated);
        city = (TextView) findViewById(R.id.city);
        state = (TextView) findViewById(R.id.state);
        country = (TextView) findViewById(R.id.country);
        edit = (EditText) findViewById(R.id.edit);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.button:
                //TODO do things
                RestClient.get().getUser(Long.parseLong(edit.getText().toString()), new Callback<User>() {

                    @Override
                    public void success(User user, Response response) {

                        id.setText(String.valueOf(user.getId()));
                        facebookId.setText(String.valueOf(user.getFacebookId()));
                        joinDate.setText(String.valueOf(user.getJoinDate()));
                        fullName.setText(user.getFullName());
                        postsDiscovered.setText(String.valueOf(user.getPostsDiscovered()));
                        postsCreated.setText(String.valueOf(user.getPostsCreated()));
                        city.setText(user.getCity());
                        state.setText(user.getState());
                        country.setText(user.getCountry());

                    }

                    @Override
                    public void failure(RetrofitError error) {

                        Toast.makeText(MainActivity.this, "Shit fucked up", Toast.LENGTH_LONG).show();

                    }
                });
                break;
        }
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
