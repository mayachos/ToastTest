package com.example.toasttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    // カウントする変数
    private int mCount = 0;
    // mCountを表示するtableView
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Helloworld");
        // show_countのTextViewをmShowCountに関連付け
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        // トースト(下から出るポップアップ表示)の設定
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_LONG);
        // トーストの表示
        toast.show();
    }

    public void countUp(View view) {
        //カウントする変数に1＋
        ++mCount;
        // mShowCountが関連付けできているとき(nullでないとき)
        if (mShowCount != null)
            // mShowCountにmCountの値を表示
            mShowCount.setText(Integer.toString(mCount));
    }

    public void nextView(View view) {
        Intent intent = new Intent(getApplication(), SecondActivity.class);
        startActivity(intent);
    }
}