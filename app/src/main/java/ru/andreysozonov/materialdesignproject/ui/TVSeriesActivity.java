package ru.andreysozonov.materialdesignproject.ui;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

import java.util.List;

import ru.andreysozonov.materialdesignproject.R;
import ru.andreysozonov.materialdesignproject.adapter.TvSeriesFragmentPageAdapter;
import ru.andreysozonov.materialdesignproject.model.ItemCardModel;
import ru.andreysozonov.materialdesignproject.model.ModelList;

public class TVSeriesActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private List<ItemCardModel> tvList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tvseries);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        initTabLayout();
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
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.nav_movies:
                finish();
                break;
            case R.id.nav_tvseries:
                finish();
                break;
            case R.id.nav_cartoons:
                finish();
                break;
            case R.id.nav_documentary:
                finish();
                break;
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void initTabLayout() {
        tvList = new ModelList().getTVList();

        TvSeriesFragment1 fragment1 = TvSeriesFragment1.newInstance(null);
        TvSeriesFragment2 fragment2 = TvSeriesFragment2.newInstance(null);
        TvSeriesFragment3 fragment3 = TvSeriesFragment3.newInstance(null);

        TvSeriesFragmentPageAdapter adapter = new TvSeriesFragmentPageAdapter(getSupportFragmentManager());
        adapter.addFragment(fragment1, tvList.get(0).getTitle());
        adapter.addFragment(fragment2, tvList.get(1).getTitle());
        adapter.addFragment(fragment3, tvList.get(2).getTitle());

        ViewPager viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);

    }
}
