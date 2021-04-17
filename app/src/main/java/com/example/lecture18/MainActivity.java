package com.example.lecture18;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    HashMap<Integer, String> map = new HashMap<>();
    ArrayList <Integer> keys = new ArrayList<>();
    ArrayList <String> values = new ArrayList<>();

    String lastName = "казак";
    boolean result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        map.put(1, "Hello");
        map.put(2, "Android");
        map.put(3, "I");
        map.put(4, "am");
        map.put(5, "amazing");
        map.put(6, "programmer");

        setKeys(map);
        setValues(map);

        result = polindrom(lastName);
        Log.i("RES", String.valueOf(result));
    }

    public void setKeys (HashMap map) {
        for (Object key : map.keySet()) {
            keys.add((Integer) key);
        }
    }

    public void setValues (HashMap map) {
        Iterator <Map.Entry<Integer, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> pair = it.next();
            values.add(pair.getValue());
        }
    }

    public boolean polindrom (String lastName) {
        String lastNameFromMain = lastName;
        String str = "";
        char[] chars = lastName.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        boolean res = true;

        for (int i = chars.length - 1; i >= 0; i--) {
            list.add(chars[i]);
        }
        for (char ch : list) {
            str += ch;
        }

        Log.i("POL", String.valueOf(str));
        Log.i("POL1", String.valueOf(lastNameFromMain));

        if (str.equals(lastNameFromMain)) {
            res = true;
        } else {
            res = false;
        }
        Log.i("POL2", String.valueOf(res));
        return res;
    }
}