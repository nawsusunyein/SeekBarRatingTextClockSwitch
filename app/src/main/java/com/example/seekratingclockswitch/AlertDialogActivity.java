package com.example.seekratingclockswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class AlertDialogActivity extends AppCompatActivity {

    final CharSequence[] colors = {"Pink","Red","Yellow","Blue"};
    ArrayList<Integer> sList = new ArrayList<>();
    boolean icount[] = new boolean[colors.length];
    String msg = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);
    }

    public void showAlert(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(AlertDialogActivity.this);
        builder.setTitle("Show Alert")
                .setMessage("Are you sure you want to continue")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(AlertDialogActivity.this,"continuing...",Toast.LENGTH_LONG).show();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                      Toast.makeText(AlertDialogActivity.this,"Stop this ....",Toast.LENGTH_SHORT).show();
                    }
                });

        AlertDialog dialog = builder.create();
        dialog.show();

    }

    public void showColorListWithAlert(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(AlertDialogActivity.this);
        builder.setTitle("Choose colors")
                .setMultiChoiceItems(colors, icount, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        if(isChecked){
                            sList.add(which);
                        }else if(sList.contains(which)){
                            sList.remove(Integer.valueOf(which));
                        }
                    }
                }).setCancelable(false)
                .setPositiveButton("Show", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        msg = "";
                        for(int i = 0; i < sList.size();i++){
                            msg = msg + "\n" + (i + 1) + " : " + colors[sList.get(i)];
                        }

                        Toast.makeText(AlertDialogActivity.this,"Total " + sList.size() + " Items Selected" + "\n" + msg , Toast.LENGTH_LONG).show();
                    }
                })
                .setNegativeButton("Hide", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();

    }


}
