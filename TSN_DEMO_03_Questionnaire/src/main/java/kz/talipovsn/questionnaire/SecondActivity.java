package kz.talipovsn.questionnaire;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
public class SecondActivity extends AppCompatActivity {
    private EditText editText;
    private CheckBox checkBox;
    private RadioGroup radioGroup;
    private RadioButton selectRadioButton;
    private Spinner spinner;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editText = findViewById(R.id.editText);
        checkBox = findViewById(R.id.checkBox);
        radioGroup = findViewById(R.id.radioGroup);
        spinner = findViewById(R.id.spinner);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ResultActivity.class);
                selectRadioButton = findViewById(radioGroup.getCheckedRadioButtonId());
                intent.putExtra("fio", editText.getText().toString());
                intent.putExtra("gender", checkBox.isChecked() ? getString(R.string.Да) : getString(R.string.Женщина));
                intent.putExtra("edu", selectRadioButton.getText());
                intent.putExtra("country", spinner.getSelectedItem().toString());
                startActivity(intent);
            }

        });

    }

    public void onBack(View v) {
        setResult(RESULT_OK);
        finish();
    }
    public void onExit(View v) {
        finishAffinity();
    }
}
