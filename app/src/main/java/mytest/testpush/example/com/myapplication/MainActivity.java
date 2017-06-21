package mytest.testpush.example.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.microsoft.azure.mobile.MobileCenter;
import com.microsoft.azure.mobile.push.Push;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MobileCenter.setLogUrl("https://in-staging-south-centralus.staging.avalanch.es");
        Push.setListener(new MyPushListener());
        MobileCenter.start(getApplication(), "29e31553-3260-40b3-bc6b-39249895cd6e", Push.class);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
