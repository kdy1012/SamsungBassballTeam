package kr.co.tjeit.samsungbassballteam;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import kr.co.tjeit.samsungbassballteam.adapter.FamilyShopAdapter;
import kr.co.tjeit.samsungbassballteam.data.FamilyShop;

public class FamilyShopActivity extends BaseActivity {

    FamilyShopAdapter familyShopAdapter;
    List<FamilyShop> familyShopList = new ArrayList<>();

    String[] area = {"전체지역", "대구 중구", "대구 동구", "대구 서구", "대구 남구", "대구 북구"};
    String[] sectors = {"제조", "서비스", "의료", "금융"};

    private android.widget.ImageView homeBtn;
    private android.widget.ImageView ticketBtn;
    private android.widget.RelativeLayout allAreaLayout;
    private android.widget.RelativeLayout allSectorsLayout;
    private android.widget.RadioButton radio01;
    private android.widget.RadioButton radio02;
    private android.widget.RadioGroup radioGroup;
    private android.widget.TextView numberTxt;
    private android.widget.ListView listView;
    private android.widget.Spinner araeSpinner;
    private android.widget.Spinner sectorsSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_shop);
        bindViews();
        setValuse();
        setupEvent();

    }

    @Override
    public void setValuse() {

        familyShopAdapter = new FamilyShopAdapter(mContext, familyShopList);
        listView.setAdapter(familyShopAdapter);

        ArrayAdapter<String> list01;
        list01 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, area);
        araeSpinner.setAdapter(list01);

        ArrayAdapter<String> list02;
        list02 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, sectors);
        sectorsSpinner.setAdapter(list02);
    }

    @Override
    public void setupEvent() {


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
        this.listView = (ListView) findViewById(R.id.listView);
        this.numberTxt = (TextView) findViewById(R.id.numberTxt);
        this.radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        this.radio02 = (RadioButton) findViewById(R.id.radio02);
        this.radio01 = (RadioButton) findViewById(R.id.radio01);
        this.allSectorsLayout = (RelativeLayout) findViewById(R.id.allSectorsLayout);
        this.sectorsSpinner = (Spinner) findViewById(R.id.sectorsSpinner);
        this.allAreaLayout = (RelativeLayout) findViewById(R.id.allAreaLayout);
        this.araeSpinner = (Spinner) findViewById(R.id.araeSpinner);
        this.ticketBtn = (ImageView) findViewById(R.id.ticketBtn);
        this.homeBtn = (ImageView) findViewById(R.id.homeBtn);
    }
}
