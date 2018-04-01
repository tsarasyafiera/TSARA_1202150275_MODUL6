package com.example.android.tsara_1202150275_modul6;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class AdapterComment extends  RecyclerView.Adapter<AdapterComment.CommentHolder>{
    Context cntx;
    List<DBcomment> list;
    //Constructor adapter
    public AdapterComment(Context cntx, List<DBcomment> list) {
        this.cntx = cntx;
        this.list = list;
    }

    //Return ViewHolder dari Recyclerview
    @Override
    public CommentHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CommentHolder(LayoutInflater.from(cntx).inflate(R.layout.comment, parent, false));
    }

    //Mengikat nilai dari list dengan view
    @Override
    public void onBindViewHolder(CommentHolder holder, int position) {
        DBcomment cur = list.get(position);
        holder.user.setText(cur.getUser());
        holder.comment.setText(cur.getComment());
    }

    //Mendapatkan jumlah item pada recyclerview
    @Override
    public int getItemCount() {
        return list.size();
    }

    //Subclass sebagai viewholder
    class CommentHolder extends RecyclerView.ViewHolder{
        TextView user, comment;
        public CommentHolder(View itemView) {
            super(itemView);
            user = itemView.findViewById(R.id.yangkomen);
            comment = itemView.findViewById(R.id.komennya);
        }
    }
}

