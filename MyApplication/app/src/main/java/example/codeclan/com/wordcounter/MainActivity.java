package example.codeclan.com.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Word word;

    private EditText inputString;
    private TextView promptText;
    private TextView result;
    private TextView details;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        word = new Word();

        setContentView(R.layout.activity_main);

        inputString = (EditText) findViewById(R.id.inputString);
        promptText = (TextView) findViewById(R.id.promptText);
        result = (TextView) findViewById(R.id.result);
        details = (TextView) findViewById(R.id.details);
        submit = (Button) findViewById(R.id.submit);
    }

    public void onSubmitBtn(View button){
        String input = inputString.getText().toString();
        word.countWords(input);
        String total = word.getListSize().toString();
        String counts = word.countOccurrences(word.getList());
        result.setText("Count: " + total);
        details.setText("Details: " + counts);
        word.getList().clear();
    }
}
