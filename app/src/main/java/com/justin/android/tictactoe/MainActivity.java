package com.justin.android.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get the Table
        TableLayout table = (TableLayout)findViewById(R.id.table);

        // get the rows
        TableRow row1 = (TableRow)table.getChildAt(0);
        TableRow row2 = (TableRow)table.getChildAt(1);
        TableRow row3 = (TableRow)table.getChildAt(2);

        // get the boxes in the first row
        ImageButton grid1A = (ImageButton) row1.getChildAt(0);
        ImageButton grid1B = (ImageButton) row1.getChildAt(1);
        ImageButton grid1C = (ImageButton) row1.getChildAt(2);

        // get the boxes in the second row
        ImageButton grid2A = (ImageButton) row2.getChildAt(0);
        ImageButton grid2B = (ImageButton) row2.getChildAt(1);
        ImageButton grid2C = (ImageButton) row2.getChildAt(2);

        // get the boxes in the three row
        ImageButton grid3A = (ImageButton) row3.getChildAt(0);
        ImageButton grid3B = (ImageButton) row3.getChildAt(1);
        ImageButton grid3C = (ImageButton) row3.getChildAt(2);



    }

    public void replaceImage(View view) {
        ImageButton gridImage = (ImageButton) view;
        gridImage.setScaleType(ImageView.ScaleType.FIT_XY);
        gridImage.setImageResource(R.drawable.black_cross);
    }

}
