package com.example.assetsfiles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.widget.TextView;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static android.os.Environment.getRootDirectory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView=findViewById(R.id.textView);
        AssetManager mngr=getAssets();
        try {
            String[] files=mngr.list("docs");
            List<String> it=new LinkedList<String>(Arrays.asList(files));
            for(int i=0;i<it.size();i++)
                textView.setText(textView.getText() + it.get(i) + " , ");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
