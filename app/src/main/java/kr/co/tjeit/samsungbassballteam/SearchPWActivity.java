package kr.co.tjeit.samsungbassballteam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class SearchPWActivity extends BaseActivity {

    private android.widget.ImageView backBtn;
    private android.widget.RelativeLayout layout01;
    private android.widget.RelativeLayout layout02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_pw);

        bindViews();
        setupEvent();
        setValuse();
    }

    @Override
    public void setValuse() {

    }

    @Override
    public void setupEvent() {
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void bindViews() {
        this.layout02 = (RelativeLayout) findViewById(R.id.layout02);
        this.layout01 = (RelativeLayout) findViewById(R.id.layout01);
        this.backBtn = (ImageView) findViewById(R.id.backBtn);
    }
}
