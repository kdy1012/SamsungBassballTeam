package kr.co.tjeit.samsungbassballteam.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TabHost;
import android.widget.TabWidget;

import java.util.ArrayList;
import java.util.List;

import kr.co.tjeit.samsungbassballteam.R;
import kr.co.tjeit.samsungbassballteam.adapter.SeasonMemberAdapter_blue;
import kr.co.tjeit.samsungbassballteam.adapter.SeasonMemberAdapter_pink;
import kr.co.tjeit.samsungbassballteam.data.SeasonMemberData;

/**
 * Created by admin on 2017-10-17.
 */

public class FragmentSeasonMember extends android.support.v4.app.Fragment {

    Uri telUri = Uri.parse("tel:053-780-3313");

    SeasonMemberAdapter_blue seasonMemberAdapter_blue;
    SeasonMemberAdapter_pink seasonMemberAdapter_pink;

    List<SeasonMemberData> seasonMemberDatas = new ArrayList<>();

    private int mSelectedRadioPosition;
    private RadioButton radioButton;

    private LinearLayout callLayout;
    private TabWidget tabs;
    private LinearLayout tab1;
    private LinearLayout tab2;
    private FrameLayout tabcontent;
    private TabHost tapHost01;
    private android.widget.RadioButton radio01;
    private android.widget.RadioButton radio02;
    private android.widget.RadioGroup radioGroup;
    private android.widget.ListView ListView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_season_member, container, false);
        this.ListView = (android.widget.ListView) v.findViewById(R.id.ListView);
        this.radioGroup = (RadioGroup) v.findViewById(R.id.radioGroup);
        this.radio02 = (RadioButton) v.findViewById(R.id.radio02);
        this.radio01 = (RadioButton) v.findViewById(R.id.radio01);
        this.tapHost01 = (TabHost) v.findViewById(R.id.tapHost01);
        this.tabcontent = (FrameLayout) v.findViewById(android.R.id.tabcontent);
        this.tab2 = (LinearLayout) v.findViewById(R.id.tab2);
        this.tab1 = (LinearLayout) v.findViewById(R.id.tab1);
        this.tabs = (TabWidget) v.findViewById(android.R.id.tabs);
        this.callLayout = (LinearLayout) v.findViewById(R.id.callLayout);

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setupEvents();
        setValues();
    }

    private void setValues() {
        seasonMemberAdapter_pink = new SeasonMemberAdapter_pink(getActivity(), seasonMemberDatas);
        ListView.setAdapter(seasonMemberAdapter_pink);

        seasonMemberAdapter_blue = new SeasonMemberAdapter_blue(getActivity(), seasonMemberDatas);
//        ListView.setAdapter(seasonMemberAdapter_blue);

    }

    private void setupEvents() {

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int checkId) {
                if (checkId == R.id.radio01){
                    ListView.setAdapter(seasonMemberAdapter_pink);
                }
                else if (checkId == R.id.radio02) {
                    ListView.setAdapter(seasonMemberAdapter_blue);
                }
            }
        });

        callLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, telUri);
                startActivity(intent);
            }
        });

        tapHost01.setup();

        // 첫 번째 Tab.
        TabHost.TabSpec ts1 = tapHost01.newTabSpec("Tab Spec 1");
        ts1.setContent(R.id.tab1);
        ts1.setIndicator("Why?");
        tapHost01.addTab(ts1);

        // 두 번째 Tab.
        TabHost.TabSpec ts2 = tapHost01.newTabSpec("Tab Spec 2");
        ts2.setContent(R.id.tab2);
        ts2.setIndicator("연간회원권");
        tapHost01.addTab(ts2);

    }
}
