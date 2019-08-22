package baiduaidemo.com.baiduai.app.textviewroll;

import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private ArrayList<String> listRoll;
    int height = 10;
    private TextView tv_content;
    private int textHeight = 0;

    private Timer timer;
    private Handler handler;
    private TimerTask timerTask;
    private int delayTime = 100;
    private int priodTime = 50;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setAdapter();

        handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                if (msg.what == 1) {
                    if (tv_content != null) {
                        tv_content.scrollTo(0, height + 2);
                        height = height + 2;
                    } else {
                        stopTimer();
                    }

                }
            }
        };
    }

    private void setAdapter() {
        recyclerView = findViewById(R.id.recyclerView);
        listRoll = new ArrayList<>();
        listRoll.add("色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分");
        listRoll.add("傅撒旦傅撒旦发射射点手动阀十分色发射点法大手动阀十分");
        listRoll.add("手动阀十分色色发射点法大师手动阀十分色色发射点法大师傅撒旦发射点色发射点法大师傅撒旦发射点发射点发射点手动阀十分色色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分傅撒旦发射点色发射点法大师傅撒旦发射点发射点发射点手动阀十分色色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分");
        listRoll.add("色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分");
        listRoll.add("色发射点法大师傅撒旦发射点发射手动阀十分色色发射点法大师傅撒旦发射点色发射点法大师傅撒旦发射点发射点发射点手动阀十分色色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分手动阀十分色色发射点法大师傅撒旦发射点色发射点法大师傅撒旦发射点发射点发射点手动阀十分色色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分手动阀十分色色发射点法大师傅撒旦发射点色发射点法大师傅撒旦发射点发射点发射点手动阀十分色色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分");
        listRoll.add("色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分色发射点法大师傅撒旦发射点发射点发射点手动阀十分");


        MyAdapter myAdapter = new MyAdapter(listRoll);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter.setmOnItemClickListerer(new MyAdapter.OnItemClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onItemClick(String type, int position, TextView textView) {
                if (type.equals("start")) {
                    stopTimer();
                    startTimer(textView);
                } else if (type.equals("stop")) {
                    stopTimer();
                }
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void startTimer(final TextView textView) {
        tv_content = textView;
        textView.setMovementMethod(ScrollingMovementMethod.getInstance());

        textHeight = tv_content.getMeasuredHeight();//高度

        textView.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                if (textHeight > oldScrollY) {
                    ViewGroup.LayoutParams params = tv_content.getLayoutParams();
                    params.height = textHeight - oldScrollY;
                    tv_content.setLayoutParams(params);
                }
            }
        });

        if (timerTask == null) {
            timerTask = new TimerTask() {
                public void run() {
                    Message message = new Message();
                    message.what = 1;
                    handler.sendMessage(message);
                }
            };
        }

        if (timer == null) {
            timer = new Timer(true);
        }

        if (timer != null && timerTask != null) {
            timer.schedule(timerTask, delayTime, priodTime);
        }
    }

    private void stopTimer() {
        if (tv_content != null) {
            ViewGroup.LayoutParams params = tv_content.getLayoutParams();

            params.height = textHeight;
            tv_content.setLayoutParams(params);
            tv_content.scrollTo(0, 0);
        }

        height = 10;
        if (timer != null) {
            timer.cancel();
            timer = null;
        }
        if (timerTask != null) {
            timerTask.cancel();
            timerTask = null;
        }
    }

}
