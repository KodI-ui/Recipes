package com.example.recipes;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.constraintlayout.widget.ConstraintLayout;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView view;
    Button thts;
    ConstraintLayout previewL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = findViewById(R.id.textView);
        thts = findViewById(R.id.touchAnyway);
        previewL = findViewById(R.id.layoutPreview);
        previewL.setBackgroundColor(getColor(R.color.white));
        view.setBackgroundColor(getColor(R.color.black));
        thts.setBackgroundColor(getColor(R.color.white));
        thts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PreviewActivity.class);
                startActivity(intent);
            }
        });
    }

}