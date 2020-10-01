package com.example.nicknamegeneradorpro1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nicknamegeneradorpro1.R;
import com.example.nicknamegeneradorpro1.model.Text;
import com.example.nicknamegeneradorpro1.ui.DBManager;

import java.util.ArrayList;

public class TextAdapter extends RecyclerView.Adapter<TextAdapter.ViewHolder> {

    ArrayList<Text> ListText;
    Context context;
    DBManager dbManager;
    OnText onText;

    public TextAdapter(ArrayList<Text> listText, Context context, OnText ontext) {
        ListText = listText;
        this.context = context;
        dbManager = new DBManager(context, "", new SQL, 1);
        onText = ontext;
    }




    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = null;
        View view = inflater.inflate(R.layout.layout_textadapter, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        final Text text = ListText.get(position);
        holder.text.setText(text.getText().toString());
        holder.copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)  {
                dbManager.addText(text);
                onText.OnTextListener(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return ListText.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView text;
        Button copy;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.textadapter);
            copy = itemView.findViewById(R.id.copy);
        }
    }

    public interface OnText{
        void OnTextListener(int position);
    }
}
