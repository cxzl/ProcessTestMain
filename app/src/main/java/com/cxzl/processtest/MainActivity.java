package com.cxzl.processtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.cxzl.processtest.processset.ProcessSetActivity000;
import com.cxzl.processtest.processset.ProcessSetActivity001;
import com.cxzl.processtest.processset.ProcessSetActivity002;
import com.cxzl.processtest.processset.ProcessSetActivity010;
import com.cxzl.processtest.processset.ProcessSetActivity011;
import com.cxzl.processtest.processset.ProcessSetActivity012;
import com.cxzl.processtest.processset.ProcessSetActivity100;
import com.cxzl.processtest.processset.ProcessSetActivity101;
import com.cxzl.processtest.processset.ProcessSetActivity102;
import com.cxzl.processtest.processset.ProcessSetActivity110;
import com.cxzl.processtest.processset.ProcessSetActivity111;
import com.cxzl.processtest.processset.ProcessSetActivity112;

public class MainActivity extends AppCompatActivity {
    public static final int START_STANDARD = 0;
    public static final int START_SINGLEINSTANCE = 1;
    public int startModel = START_STANDARD;

    public static final int MULTI_PROCESS_OFF = 0;
    public static final int MULTI_PROCESS_ON = 1;
    public int multiProcess = MULTI_PROCESS_OFF;

    public static final int PROCESS_DEFUALT = 0;
    public static final int PROCESS_PRIVATE = 1;
    public static final int PROCESS_PUBLIC = 2;
    public int process = PROCESS_DEFUALT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRadio();
        initClick();
    }

    private void initRadio(){
        RadioGroup radioGroup = findViewById(R.id.rg_start);
        radioGroup.check(R.id.rb_standard);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.rb_standard:
                        startModel = START_STANDARD;
                        break;
                    case R.id.rb_singleinstance:
                        startModel = START_SINGLEINSTANCE;
                        break;
                }
            }
        });

        RadioGroup radioGroup1 = findViewById(R.id.rg_multiprocess);
        radioGroup1.check(R.id.rb_multprocess_off);
        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.rb_multprocess_off:
                        multiProcess = MULTI_PROCESS_OFF;
                        break;
                    case R.id.rb_multprocess_on:
                        multiProcess = MULTI_PROCESS_ON;
                        break;
                }
            }
        });

        RadioGroup radioGroup2 = findViewById(R.id.rg_process);
        radioGroup2.check(R.id.rb_process_default);
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.rb_process_default:
                        process = PROCESS_DEFUALT;
                        break;
                    case R.id.rb_process_private:
                        process = PROCESS_PRIVATE;
                        break;
                    case R.id.rb_process_public:
                        process = PROCESS_PUBLIC;
                        break;
                }
            }
        });
    }

    private void initClick(){
        TextView tvClick = findViewById(R.id.tv_click);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                String activityCode = "" + startModel + multiProcess + process;
                switch (activityCode){
                    case "000":
                        i = new Intent(MainActivity.this,ProcessSetActivity000.class);
                        startActivity(i);
                        break;
                    case "001":
                        i = new Intent(MainActivity.this,ProcessSetActivity001.class);
                        startActivity(i);
                        break;
                    case "002":
                        i = new Intent(MainActivity.this,ProcessSetActivity002.class);
                        startActivity(i);
                        break;
                    case "010":
                        i = new Intent(MainActivity.this, ProcessSetActivity010.class);
                        startActivity(i);
                        break;
                    case "011":
                        i = new Intent(MainActivity.this,ProcessSetActivity011.class);
                        startActivity(i);
                        break;
                    case "012":
                        i = new Intent(MainActivity.this,ProcessSetActivity012.class);
                        startActivity(i);
                        break;
                    case "100":
                        i = new Intent(MainActivity.this, ProcessSetActivity100.class);
                        startActivity(i);
                        break;
                    case "101":
                        i = new Intent(MainActivity.this,ProcessSetActivity101.class);
                        startActivity(i);
                        break;
                    case "102":
                        i = new Intent(MainActivity.this,ProcessSetActivity102.class);
                        startActivity(i);
                        break;
                    case "110":
                        i = new Intent(MainActivity.this,ProcessSetActivity110.class);
                        startActivity(i);
                        break;
                    case "111":
                        i = new Intent(MainActivity.this,ProcessSetActivity111.class);
                        startActivity(i);
                        break;
                    case "112":
                        i = new Intent(MainActivity.this,ProcessSetActivity112.class);
                        startActivity(i);
                        break;
                }
            }
        };
        tvClick.setOnClickListener(onClickListener);
    }
}
