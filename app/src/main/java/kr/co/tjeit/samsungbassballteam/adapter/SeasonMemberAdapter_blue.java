package kr.co.tjeit.samsungbassballteam.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import kr.co.tjeit.samsungbassballteam.R;
import kr.co.tjeit.samsungbassballteam.data.SeasonMemberData;

/**
 * Created by admin on 2017-10-17.
 */

public class SeasonMemberAdapter_blue extends ArrayAdapter<SeasonMemberData> {

    Context mContext;
    List<SeasonMemberData> mList;
    LayoutInflater inf;

    public SeasonMemberAdapter_blue(Context context, List<SeasonMemberData> list) {
        super(context, R.layout.season_member_list_blue_item, list);
        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            row = inf.inflate(R.layout.season_member_list_blue_item, null);
        }

        TextView roomNameTxt = (TextView) row.findViewById(R.id.roomNameTxt);
        TextView beforeSaleCostTxt = (TextView) row.findViewById(R.id.beforeSaleCostTxt);
        TextView allRoomTxt = (TextView) row.findViewById(R.id.allRoomTxt);
        TextView costTxt = (TextView) row.findViewById(R.id.costTxt);
        TextView roomTxt = (TextView) row.findViewById(R.id.roomTxt);

        return row;
    }

    @Override
    public int getCount() {

        return 10;
    }
}
