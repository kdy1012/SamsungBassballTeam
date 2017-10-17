package kr.co.tjeit.samsungbassballteam;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import kr.co.tjeit.samsungbassballteam.fragment.FragmentMemberInfo;

public class MemberShipActivity extends BaseActivity {

    private android.widget.ImageView homeBtn;
    private android.widget.TextView infoTxt;
    private android.widget.TextView blueTxt;
    private android.widget.TextView seasonTxt;
    private ImageView ticketBtn;
    private android.widget.FrameLayout fragLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_ship);


        bindViews();
        setupEvent();
        setValuse();
    }

    @Override
    public void setValuse() {


    }

    @Override
    public void setupEvent() {

        View.OnClickListener fragView = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (view.getId()){
                    case R.id.infoTxt:
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.fragLayout, new FragmentMemberInfo())
                                .commit();
                        infoTxt.setBackgroundResource(R.color.blue);
                        infoTxt.setTextColor(Color.parseColor("#FFFFFF"));
                        break;

                }
            }
        };

        infoTxt.setOnClickListener(fragView);

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, MainActivity.class);
                startActivity(intent);
            }
        });

        ticketBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=kr.co.ticketlink.cne"));
                startActivity(intent);
            }
        });

    }

    @Override
    public void bindViews() {
        this.fragLayout = (FrameLayout) findViewById(R.id.fragLayout);
        this.seasonTxt = (TextView) findViewById(R.id.seasonTxt);
        this.blueTxt = (TextView) findViewById(R.id.blueTxt);
        this.infoTxt = (TextView) findViewById(R.id.infoTxt);
        this.ticketBtn = (ImageView) findViewById(R.id.ticketBtn);
        this.homeBtn = (ImageView) findViewById(R.id.homeBtn);
    }
}