package josim74.github.com.sharedpreferencepractice;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etName, etPass;
    private Button btnRegister, btnShow;
    private TextView tvUserInfo;
    private UserSharedPreference userSharedPreference;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etPass = findViewById(R.id.etPass);

        btnRegister = findViewById(R.id.btnRegister);
        btnShow = findViewById(R.id.btnShowUser);

        tvUserInfo = findViewById(R.id.tvUserInfo);

        userSharedPreference = new UserSharedPreference(this);



    }

    public void register(View view) {
        String name = etName.getText().toString();
        String pass = etPass.getText().toString();

        userSharedPreference.seveUser(name, pass);
    }

    public void showUser(View view) {
        tvUserInfo.setText(userSharedPreference.getName()+" "+userSharedPreference.getPass());
    }

    public void reset(View view) {
        userSharedPreference.resetUser();
    }
}
