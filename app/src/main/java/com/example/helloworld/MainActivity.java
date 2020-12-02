//package com.example.helloworld;
//
//import androidx.appcompat.app.AppCompatActivity;
//import android.os.Bundle;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//}
package com.example.helloworld;

        import android.graphics.Color;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
        import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;

        import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private static final int[] colourList = {Color.GREEN, Color.RED, Color.BLUE, Color.CYAN, Color.MAGENTA};
    private static final int[] fontSizeList = {15, 17, 19, 21, 23, 25, 27, 29};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button changeFontSize = findViewById(R.id.changeSize);
        Button changeFontColour = findViewById(R.id.changeColor);
        final TextView helloWorld = findViewById(R.id.headerText);

        changeFontColour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomNum = new Random().nextInt(colourList.length);
                helloWorld.setTextColor(colourList[randomNum]);
            }
        });

        changeFontSize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomNum = new Random().nextInt(fontSizeList.length);
                helloWorld.setTextSize(fontSizeList[randomNum]);
            }
        });
    }
}
