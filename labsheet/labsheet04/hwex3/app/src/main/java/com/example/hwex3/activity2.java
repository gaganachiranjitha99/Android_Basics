package com.example.hwex3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activity2 extends AppCompatActivity {

    EditText txtcolour;
    Button searchbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        txtcolour = (EditText) findViewById(R.id.txtcolourcode);
        searchbtn = (Button) findViewById(R.id.btnsearch);

        searchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String colourCode = txtcolour.getText().toString();
                String cylinderInfo = getCylinderInfo(colourCode);

                Intent intent = new Intent();
                intent.putExtra("CYLINDERINFO",cylinderInfo);
                setResult(RESULT_OK,intent);
                

            }
        });


    }

    private String getCylinderInfo(String colourCode) {

        String fcylinderInfo;

        switch (colourCode) {

            case "red":
                fcylinderInfo = "Red cylinder";
                break;
            case "green":
                fcylinderInfo = "Green cylinder";
                break;

            case "blue":
                fcylinderInfo = "Blue cylinder";
                break;
            case "pink":
                fcylinderInfo = "Pink cylinder";
                break;
            case "white":
                fcylinderInfo = "White cylinder";
                break;
            default:
                fcylinderInfo = "colour code not found";
                break;

        }
        return fcylinderInfo;
    }
}