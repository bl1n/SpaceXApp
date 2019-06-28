package com.lft.spacex.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.lft.spacex.R;
import com.lft.spacex.ui.companyInfo.CompanyInfoActivity;
import com.lft.spacex.ui.history.EventsActivity;
import com.lft.spacex.ui.launches.LaunchesActivity;

// TODO: 28.06.2019 add RoomDatabase
// TODO: 28.06.2019 add Moxy

public class MainActivity extends AppCompatActivity {
    private Button mBtnLaunches;
    private Button mBtnHistory;
    private Button mBtnCompanyInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_layout);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mBtnLaunches = findViewById(R.id.start_btn_launches);
        mBtnLaunches.setOnClickListener(v -> startActivity(new Intent(this, LaunchesActivity.class)));
        mBtnHistory = findViewById(R.id.start_btn_history);
        mBtnHistory.setOnClickListener(v -> startActivity(new Intent(this, EventsActivity.class)));
        mBtnCompanyInfo = findViewById(R.id.start_btn_ci);
        mBtnCompanyInfo.setOnClickListener(v -> startActivity(new Intent(this, CompanyInfoActivity.class)));
    }
}
