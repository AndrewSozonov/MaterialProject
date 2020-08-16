package ru.andreysozonov.materialdesignproject.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ru.andreysozonov.materialdesignproject.R;
import ru.andreysozonov.materialdesignproject.model.ItemCardModel;

public class MainRecyclerAdapter extends RecyclerView.Adapter<MainRecyclerAdapter.CardViewHolder> {

    private List<ItemCardModel> itemList;

    public MainRecyclerAdapter(List mList) {
        itemList = mList;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, null);
        CardViewHolder cardViewHolder = new CardViewHolder(v);
        return cardViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        ItemCardModel itemCardModel = itemList.get(position);
        holder.imgView.setImageResource(itemCardModel.getImageId());
        holder.titleTextView.setText(itemCardModel.getTitle());
        holder.yearTextView.setText(itemCardModel.getYear());
        holder.directorTextView.setText(itemCardModel.getDirector());

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public static class CardViewHolder extends RecyclerView.ViewHolder {

        public ImageView imgView;
        public TextView titleTextView;
        public TextView yearTextView;
        private TextView directorTextView;

        public CardViewHolder(View view) {
            super(view);
            imgView = view.findViewById(R.id.card_image_view);
            titleTextView = view.findViewById(R.id.card_title_text_view);
            yearTextView = view.findViewById(R.id.card_year_text_view);
            directorTextView = view.findViewById(R.id.card_director_text_view);
        }
    }
}