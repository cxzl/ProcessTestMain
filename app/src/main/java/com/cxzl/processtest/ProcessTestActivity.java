package com.cxzl.processtest;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

public class ProcessTestActivity extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_processtest);
        TextView tvProcess = findViewById(R.id.tv_process);
        String processAppName = PidNameUtil.getAppName(this);
        tvProcess.setText("当前进程是："+ android.os.Process.myPid()+",\n当前进程名是："+processAppName
        +"，\n当前activity的hashCode:"+this.hashCode());
    }
}
