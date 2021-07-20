package com.EX.recyclerviewex;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SimpleTextAdapter extends RecyclerView.Adapter<SimpleTextAdapter.ViewHolder> {

    private ArrayList<String> mData = null;


    // 뷰홀더 클래스(뷰홀더 정의)
    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView mText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            //뷰객체 참조
            mText = itemView.findViewById(R.id.text1);
        }
    }
        //기본 생성자
        SimpleTextAdapter(ArrayList<String> list) {
        mData = list;
    }

    @NonNull
    @Override

    // onCreateViewHolder() - 아이템 뷰를 위한 뷰홀더 객체 생성하여 리턴.
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.recyclerview_item, parent, false);
        SimpleTextAdapter.ViewHolder viewHolder = new SimpleTextAdapter.ViewHolder(view);

        return viewHolder;
    }

    // onBindViewHolder() - position에 해당하는 데이터를 뷰홀더의 아이템뷰에 표시.
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        System.out.println("말이 되냐 이게.? : " + mData.get(position));

        String text = mData.get(position);

        holder.mText.setText(text);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}
