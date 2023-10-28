package com.example.myapplicationcon;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText litersInput;
    private Button convertButton;
    private TextView cupsResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        litersInput = findViewById(R.id.litersInput);
        convertButton = findViewById(R.id.convertButton);
        cupsResult = findViewById(R.id.cupsResult);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String litersText = litersInput.getText().toString();
                if (!litersText.isEmpty()) {
                    double liters = Double.parseDouble(litersText);
                    double cups = liters * 4.22675; // 1 liter = 4.22675 cups
                    cupsResult.setText(String.format("%.2f cups", cups));
                } else {
                    cupsResult.setText("Please enter a value in liters.");
                }
            }
        });
    }
}
