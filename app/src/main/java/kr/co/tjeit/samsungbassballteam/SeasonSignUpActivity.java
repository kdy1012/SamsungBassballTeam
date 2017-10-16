package kr.co.tjeit.samsungbassballteam;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SeasonSignUpActivity extends BaseActivity {

    Uri uri = Uri.parse("http://www.ticketlink.co.kr/sports/baseball/event/1");

    private android.widget.ImageView backBtn;
    private android.widget.TextView seasonSignUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_season_sign_up);

        bindViews();
        setupEvent();
        setValuse();
    }

    @Override
    public void setValuse() {

    }

    @Override
    public void setupEvent() {
        seasonSignUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void bindViews() {
        this.seasonSignUpBtn = (TextView) findViewById(R.id.seasonSignUpBtn);
        this.backBtn = (ImageView) findViewById(R.id.backBtn);
    }
}
