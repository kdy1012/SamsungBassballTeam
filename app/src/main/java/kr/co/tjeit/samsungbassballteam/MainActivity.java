package kr.co.tjeit.samsungbassballteam;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends BaseActivity {

    Uri telUri = Uri.parse("tel://1688-0747");
    Uri ticketlinkUri = Uri.parse("https://play.google.com/store/apps/details?id=kr.co.ticketlink.cne");

    private android.widget.ImageView homeBtn;
    private android.widget.ImageView wishListBtn;
    private android.widget.ImageView myInfoImg;
    private android.widget.RelativeLayout ticketReserveLayout;
    private android.widget.RelativeLayout reserveCheckLayout;
    private android.widget.LinearLayout todayGameLayout;
    private android.widget.LinearLayout betelInfoLayout;
    private android.widget.LinearLayout myPageLayout;
    private android.widget.LinearLayout gameInfoLayout;
    private android.widget.LinearLayout ticketInfoLayout;
    private android.widget.LinearLayout eventsLayout;
    private android.widget.ImageView img01;
    private android.widget.ImageView img02;
    private android.widget.LinearLayout callLayout;
    private android.widget.LinearLayout seasonFragLayout;
    private android.widget.LinearLayout eventsFragLayout;
    private android.widget.LinearLayout shopFragLayout;
    private android.widget.LinearLayout memberShipFragLayout;
    private android.widget.LinearLayout moreFragLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        setupEvent();
        setValuse();
    }

    @Override
    public void setValuse() {


    }

    @Override
    public void setupEvent() {

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

        View.OnClickListener ticketLink = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, ticketlinkUri);
                startActivity(intent);
            }
        };

        ticketReserveLayout.setOnClickListener(ticketLink);
        reserveCheckLayout.setOnClickListener(ticketLink);


        callLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, telUri);
                startActivity(intent);
            }
        });



    }

    @Override
    public void bindViews() {
        this.moreFragLayout = (LinearLayout) findViewById(R.id.moreFragLayout);
        this.memberShipFragLayout = (LinearLayout) findViewById(R.id.memberShipFragLayout);
        this.shopFragLayout = (LinearLayout) findViewById(R.id.shopFragLayout);
        this.eventsFragLayout = (LinearLayout) findViewById(R.id.eventsFragLayout);
        this.seasonFragLayout = (LinearLayout) findViewById(R.id.seasonFragLayout);
        this.callLayout = (LinearLayout) findViewById(R.id.callLayout);
        this.img02 = (ImageView) findViewById(R.id.img02);
        this.img01 = (ImageView) findViewById(R.id.img01);
        this.eventsLayout = (LinearLayout) findViewById(R.id.eventsLayout);
        this.ticketInfoLayout = (LinearLayout) findViewById(R.id.ticketInfoLayout);
        this.gameInfoLayout = (LinearLayout) findViewById(R.id.gameInfoLayout);
        this.myPageLayout = (LinearLayout) findViewById(R.id.myPageLayout);
        this.betelInfoLayout = (LinearLayout) findViewById(R.id.betelInfoLayout);
        this.todayGameLayout = (LinearLayout) findViewById(R.id.todayGameLayout);
        this.reserveCheckLayout = (RelativeLayout) findViewById(R.id.reserveCheckLayout);
        this.ticketReserveLayout = (RelativeLayout) findViewById(R.id.ticketReserveLayout);
        this.myInfoImg = (ImageView) findViewById(R.id.myInfoImg);
        this.wishListBtn = (ImageView) findViewById(R.id.wishListBtn);
        this.homeBtn = (ImageView) findViewById(R.id.homeBtn);
    }
}
