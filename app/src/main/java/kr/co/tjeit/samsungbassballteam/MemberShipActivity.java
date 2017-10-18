package kr.co.tjeit.samsungbassballteam;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import kr.co.tjeit.samsungbassballteam.fragment.FragmentBlueMember;
import kr.co.tjeit.samsungbassballteam.fragment.FragmentMemberInfo;
import kr.co.tjeit.samsungbassballteam.fragment.FragmentSeasonMember;

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
                                .commitNow();
                        infoTxt.setBackgroundResource(R.color.blue);
                        infoTxt.setTextColor(Color.parseColor("#FFFFFF"));

                        blueTxt.setBackgroundResource(R.color.white);
                        blueTxt.setTextColor(Color.parseColor("#3B46AE"));

                        seasonTxt.setBackgroundResource(R.color.white);
                        seasonTxt.setTextColor(Color.parseColor("#3B46AE"));
                        break;

                    case R.id.blueTxt:
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.fragLayout, new FragmentBlueMember())
                                .commit();
                        blueTxt.setBackgroundResource(R.color.blue);
                        blueTxt.setTextColor(Color.parseColor("#FFFFFF"));

                        infoTxt.setBackgroundResource(R.color.white);
                        infoTxt.setTextColor(Color.parseColor("#3B46AE"));

                        seasonTxt.setBackgroundResource(R.color.white);
                        seasonTxt.setTextColor(Color.parseColor("#3B46AE"));
                        break;

                    case R.id.seasonTxt:
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.fragLayout, new FragmentSeasonMember())
                                .commit();
                        blueTxt.setBackgroundResource(R.color.white);
                        blueTxt.setTextColor(Color.parseColor("#3B46AE"));

                        infoTxt.setBackgroundResource(R.color.white);
                        infoTxt.setTextColor(Color.parseColor("#3B46AE"));

                        seasonTxt.setBackgroundResource(R.color.blue);
                        seasonTxt.setTextColor(Color.parseColor("#FFFFFF"));
                        break;

                }
            }
        };

        infoTxt.setOnClickListener(fragView);
        blueTxt.setOnClickListener(fragView);
        seasonTxt.setOnClickListener(fragView);

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
