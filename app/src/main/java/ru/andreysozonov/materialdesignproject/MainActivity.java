package ru.andreysozonov.materialdesignproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

import ru.andreysozonov.materialdesignproject.adapter.MainRecyclerAdapter;
import ru.andreysozonov.materialdesignproject.common.MainRecyclerItemDecoration;
import ru.andreysozonov.materialdesignproject.model.ItemCardModel;
import ru.andreysozonov.materialdesignproject.model.ModelList;
import ru.andreysozonov.materialdesignproject.ui.TVSeriesActivity;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private AppBarConfiguration mAppBarConfiguration;
    private RecyclerView recyclerView;
    private ModelList modelList;
    private List<ItemCardModel> moviesList;
    private MainRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_movies, R.id.nav_tvseries, R.id.nav_cartoons,
                R.id.nav_documentary, R.id.nav_share, R.id.nav_favorites)
                .setDrawerLayout(drawer)
                .build();

        modelList = new ModelList();
        initRecyclerView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.nav_movies:
                moviesList.clear();
                moviesList.addAll(modelList.getMoviesList());
                adapter.notifyDataSetChanged();
                break;
            case R.id.nav_tvseries:
                startTvSeriesActivity();
                /*moviesList.clear();
                moviesList.addAll(modelList.getTVList());
                adapter.notifyDataSetChanged();*/
                break;
            case R.id.nav_cartoons:
                moviesList.clear();
                moviesList.addAll(modelList.getCartoonList());
                adapter.notifyDataSetChanged();
                break;
            case R.id.nav_documentary:
                moviesList.clear();
                moviesList.addAll(modelList.getDocumentaryList());
                adapter.notifyDataSetChanged();
                break;
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void initRecyclerView() {

        recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        moviesList = modelList.getMoviesList();
        adapter = new MainRecyclerAdapter(moviesList);
        recyclerView.addItemDecoration(new MainRecyclerItemDecoration(30));
        recyclerView.setAdapter(adapter);
    }

    private void startTvSeriesActivity() {

        Intent intent = new Intent(this, TVSeriesActivity.class);
        startActivity(intent);
    }
}
