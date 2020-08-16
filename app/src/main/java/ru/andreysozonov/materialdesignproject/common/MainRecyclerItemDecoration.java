package ru.andreysozonov.materialdesignproject.common;

import android.graphics.Rect;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

public class MainRecyclerItemDecoration extends RecyclerView.ItemDecoration {

    private final int mSpaceHeight;

    public MainRecyclerItemDecoration(int mSpaceHeight) {
        this.mSpaceHeight = mSpaceHeight;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent,
                               RecyclerView.State state) {
        outRect.bottom = mSpaceHeight;
        outRect.top = mSpaceHeight;
        outRect.left = mSpaceHeight;
        outRect.right = mSpaceHeight;
    }
}
