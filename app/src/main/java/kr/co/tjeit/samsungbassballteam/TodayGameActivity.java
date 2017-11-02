package kr.co.tjeit.samsungbassballteam;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import kr.co.tjeit.samsungbassballteam.fragment.FragmentDatePicker;

public class TodayGameActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today_game);
        bindViews();
        setupEvent();
        setValuse();

    }

    @Override
    public void setValuse() {

    }

    @Override
    public void setupEvent() {


    }

    @Override
    public void bindViews() {

    }
}
