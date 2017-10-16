package kr.co.tjeit.samsungbassballteam;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by the on 2017-10-16.
 */

public abstract class BaseActivity extends AppCompatActivity {

    Context mContext = this;

    public abstract void setValuse();
    public abstract void setupEvent();
    public abstract void bindViews();

}
