package kz.talipovsn.questionnaire;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button secondButton; // Добавленная вторая кнопка
    private ImageView imageView; // Добавленная картинка
    private TextView textView; // Добавленный текст

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        secondButton = findViewById(R.id.secondButton);
        imageView = findViewById(R.id.image);
        textView = findViewById(R.id.text);

        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        // Установка изображения
        imageView.setImageResource(R.drawable.image); // Замените "your_image" на имя ресурса вашей картинки

        // Установка текста
        textView.setText("Вам предстоит пройти небольшую анкету для поступления в наш ВУЗ. Отвечайте честно");
    }
}
