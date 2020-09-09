package com.github.boyu8266.android_java_listener_callback_1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // bind
        button = findViewById(R.id.button);

        //  set listener/callback
        button.setOnClickListener(listener);
    }

    //  當 view 元件設定此監聽器(名為: listener)
    //  該 view 元件被點擊的時候就會做 onClick 裡面的相應動作
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //  當 view 被點擊的時候會觸發此 function
            System.out.println("listener has been triggered.");

            //  確認當前的 thread
            System.out.println(Thread.currentThread().getName());
        }
    };
}