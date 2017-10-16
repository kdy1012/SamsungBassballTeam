package kr.co.tjeit.samsungbassballteam;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class LoginActivity extends BaseActivity {

    Uri uri = Uri.parse("http://www.samsunglions.com/member/join_1.asp");

    private android.widget.EditText idEdt;
    private android.widget.EditText pwEdt;
    private android.widget.CheckBox autoLoginCB;
    private android.widget.Button loginBtn;
    private android.widget.Button seasonSignUpBtn;
    private android.widget.LinearLayout searchIdLayout;
    private android.widget.LinearLayout searchPwLayout;
    private android.widget.LinearLayout signUpLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        bindViews();
        setupEvent();
        setValuse();

    }

    @Override
    public void setValuse() {

    }

    @Override
    public void setupEvent() {

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (idEdt.getText().length() == 0) {
                    Toast.makeText(mContext, "아이디를 입력해주세요.", Toast.LENGTH_SHORT).show();
                } else if (pwEdt.getText().length() == 0) {
                    Toast.makeText(mContext, "비밀번호를 입력해주세요.", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(mContext, MainActivity.class);
                    startActivity(intent);
                    finish();

                }

            }
        });

        searchIdLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, SearchIDActivity.class);
                startActivity(intent);

            }
        });

        searchPwLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, SearchPWActivity.class);
                startActivity(intent);
            }
        });

        seasonSignUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, SeasonSignUpActivity.class);
                startActivity(intent);
            }
        });

        signUpLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

    }

    @Override
    public void bindViews() {
        this.signUpLayout = (LinearLayout) findViewById(R.id.signUpLayout);
        this.searchPwLayout = (LinearLayout) findViewById(R.id.searchPwLayout);
        this.searchIdLayout = (LinearLayout) findViewById(R.id.searchIdLayout);
        this.seasonSignUpBtn = (Button) findViewById(R.id.seasonSignUpBtn);
        this.loginBtn = (Button) findViewById(R.id.loginBtn);
        this.autoLoginCB = (CheckBox) findViewById(R.id.autoLoginCB);
        this.pwEdt = (EditText) findViewById(R.id.pwEdt);
        this.idEdt = (EditText) findViewById(R.id.idEdt);

    }
}
