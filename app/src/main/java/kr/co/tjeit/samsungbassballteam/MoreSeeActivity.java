package kr.co.tjeit.samsungbassballteam;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;

public class MoreSeeActivity extends BaseActivity {

    private android.widget.ImageView homeBtn;
    private android.widget.RelativeLayout logoutLayout;
    private android.widget.RelativeLayout changePWLayout;
    private android.widget.RelativeLayout noticeLayout;
    private android.widget.Switch sw;
    private ImageView ticketBtn;
    private android.widget.LinearLayout seasonFragLayout;
    private android.widget.LinearLayout shopFragLayout;
    private android.widget.LinearLayout memberShipFragLayout;
    private android.widget.LinearLayout moreFragLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_see);


        bindViews();
        setupEvent();
        setValuse();
    }

    @Override
    public void setValuse() {

    }

    @Override
    public void setupEvent() {

        shopFragLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, FamilyShopActivity.class);
                startActivity(intent);
            }
        });

        memberShipFragLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, MemberShipActivity.class);
                startActivity(intent);
            }
        });

        moreFragLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, MoreSeeActivity.class);
                startActivity(intent);

            }
        });

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

        logoutLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
                builder.setTitle("로그아웃 하시겠습니까?");
                builder.setCancelable(true);
                builder.setNegativeButton("예", new DialogInterface.OnClickListener(){
                    public void onClick (DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(mContext, LoginActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });

                builder.setPositiveButton("아니오", new DialogInterface.OnClickListener(){
                   public void onClick ( DialogInterface dialogInterface, int i){
                       dialogInterface.cancel();
                   }
                });

                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });
    }

    @Override
    public void bindViews() {
        this.moreFragLayout = (LinearLayout) findViewById(R.id.moreFragLayout);
        this.memberShipFragLayout = (LinearLayout) findViewById(R.id.memberShipFragLayout);
        this.shopFragLayout = (LinearLayout) findViewById(R.id.shopFragLayout);
        this.seasonFragLayout = (LinearLayout) findViewById(R.id.seasonFragLayout);
        this.sw = (Switch) findViewById(R.id.sw);
        this.noticeLayout = (RelativeLayout) findViewById(R.id.noticeLayout);
        this.changePWLayout = (RelativeLayout) findViewById(R.id.changePWLayout);
        this.logoutLayout = (RelativeLayout) findViewById(R.id.logoutLayout);
        this.ticketBtn = (ImageView) findViewById(R.id.ticketBtn);
        this.homeBtn = (ImageView) findViewById(R.id.homeBtn);
    }
}
