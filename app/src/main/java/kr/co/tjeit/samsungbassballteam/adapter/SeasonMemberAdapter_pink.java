package kr.co.tjeit.samsungbassballteam.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

import kr.co.tjeit.samsungbassballteam.R;
import kr.co.tjeit.samsungbassballteam.data.SeasonMemberData;

/**
 * Created by admin on 2017-10-17.
 */

public class SeasonMemberAdapter_pink extends ArrayAdapter<SeasonMemberData>{

    Context mContext;
    List<SeasonMemberData> mList;
    LayoutInflater inf;

    public SeasonMemberAdapter_pink(Context context, List<SeasonMemberData> list) {
        super(context, R.layout.season_member_list_pink_item, list);
        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            row = inf.inflate(R.layout.season_member_list_pink_item, null);
        }

        return row;
    }

    @Override
    public int getCount() {
        return 10;
    }
}
