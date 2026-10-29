package com.example.zadaniezlist;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
ListView listView;
EditText editText;
Button button;
ArrayList<String> arrayList;
ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextText2);
        button = findViewById(R.id.button2);
        listView = findViewById(R.id.listView);
        arrayList = new ArrayList<>();
        arrayList.add("Zakupy: Chleb, masło, ser");
        arrayList.add("Do zrobienia: Obiad, umyć podłogi");
        arrayList.add("weekend: kino, spacer z psem");
        arrayAdapter = new ArrayAdapter<>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                arrayList
        );
        listView.setAdapter(arrayAdapter);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String element = editText.getText().toString();
                        arrayList.add(element);
                        arrayAdapter.notifyDataSetChanged();
                    }
                }
        );

    }
}