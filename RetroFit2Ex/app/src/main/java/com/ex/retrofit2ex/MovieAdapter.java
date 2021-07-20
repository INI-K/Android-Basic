package com.ex.retrofit2ex;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder>{

    private List<DailyBoxOfficeList> items;



    public MovieAdapter(List<DailyBoxOfficeList> items){
        this.items = items;
    }

    @NonNull
    @Override
    public MovieAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item , parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DailyBoxOfficeList item = items.get(position);
        holder.setItem(item, position);
        System.out.println("데이터 확인 바인딩부분 11111111 : " + items.get(position).getMovieNm());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView rank, movieNm, openDt;
        private  int positon;

        public ViewHolder(View itemView) {
            super(itemView);
            rank = itemView.findViewById(R.id.rank);
            movieNm = itemView.findViewById(R.id.movieNM);
            openDt = itemView.findViewById(R.id.openDt);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //0번째 부터 출력하지만 setItem에서 +1 처리해줌.
                    Toast.makeText(itemView.getContext(),"포지션 가져오기 : " + positon + "번째 입니다.", Toast.LENGTH_SHORT).show();
                }
            });

        }

        public void setItem(DailyBoxOfficeList item, int positon){
            rank.setText(item.getRank());
            movieNm.setText(item.getMovieNm());
            openDt.setText(item.getOpenDt());

            this.positon = positon;

            this.positon = this.positon + 1;
        }

    }

}