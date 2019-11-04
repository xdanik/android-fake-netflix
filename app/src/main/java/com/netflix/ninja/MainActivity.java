package com.netflix.ninja;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/*
 * MainActivity class that loads {@link MainFragment}.
 */
public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.plexapp.android");
        if (launchIntent != null) {
            startActivity(launchIntent);//null pointer check in case package name was not found
        }
        finish();
    }
}
