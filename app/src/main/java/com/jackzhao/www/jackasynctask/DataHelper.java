package com.jackzhao.www.jackasynctask;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class DataHelper {
    public static final String[] data = {

            "Lorem", "iPsum", "Dolor", "Site", "Amet", "Consectetur", "Adipisicing",
            "Elit", "Sed", "Do", "Eiusmod", "Tempor", "Incididunt", "Ut", "Labore", "English",
            "Doctor", "Managor", "Eliqua", "Enim", "Studio", "Minim", "Veniam", "Wuies", "Nostrud",
            "Exercitation", "Ullamco", "Labories", "Nisi", "Nasa", "Execption", "Create",
            "Customization","Adapter","Connection","Layout","Complement","Implement","Inhert",
            "Panama","Coordinates","Usually","Dialogue","Runway","Borden","Teenage","Alternate",
            "Require","Destroyed Team","Listener","Application","Overflow","Community","Stack",
            "Programmer","Helping","Developing","Uploading","Front","Job"

    };

    public static void m(String message) {
        Log.d("VIVZ", message);
    }

    public static void s(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
