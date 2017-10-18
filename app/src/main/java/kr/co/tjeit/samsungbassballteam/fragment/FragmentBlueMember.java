package kr.co.tjeit.samsungbassballteam.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;

import kr.co.tjeit.samsungbassballteam.R;

/**
 * Created by the on 2017-10-17.
 */

public class FragmentBlueMember extends Fragment {

    Uri telUri = Uri.parse("tel:053-780-3313");

    private android.widget.LinearLayout callLayout;
    private android.widget.TabWidget tabs;
    private android.widget.LinearLayout tab1;
    private android.widget.LinearLayout tab2;
    private android.widget.FrameLayout tabcontent;
    private android.widget.TabHost tapHost01;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_blue_member, container, false);
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

    }

    private void setupEvents() {

        callLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, telUri);
                startActivity(intent);            }
        });

        tapHost01.setup() ;

        // 첫 번째 Tab.
        TabHost.TabSpec ts1 = tapHost01.newTabSpec("Tab Spec 1") ;
        ts1.setContent(R.id.tab1) ;
        ts1.setIndicator("Why?") ;
        tapHost01.addTab(ts1)  ;

        // 두 번째 Tab.
        TabHost.TabSpec ts2 = tapHost01.newTabSpec("Tab Spec 2") ;
        ts2.setContent(R.id.tab2) ;
        ts2.setIndicator("가입방법") ;
        tapHost01.addTab(ts2) ;

    }
}
