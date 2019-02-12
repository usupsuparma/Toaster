package com.example.toaster;

import android.content.Context;
import android.widget.Toast;

public class Toaster {

    public static void toaster(Context context, String messageText ,int leng ){
        Toast.makeText(context, messageText, leng).show();
    }
}
