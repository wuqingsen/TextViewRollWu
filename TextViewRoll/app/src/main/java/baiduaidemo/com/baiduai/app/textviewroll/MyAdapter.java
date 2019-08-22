package baiduaidemo.com.baiduai.app.textviewroll;

import android.support.v7.widget.RecyclerView;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Name: 吴庆森
 * Date: 2019/8/22
 * Mailbox: 1243411677@qq.com
 * Describe:
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {


    private ArrayList<String> mData;

    public MyAdapter(ArrayList<String> data) {
        this.mData = data;
    }

    public interface OnItemClickListener {
        void onItemClick(String type, int position, TextView textView);
    }

    public MyAdapter.OnItemClickListener mOnItemClickListerer;

    public void setmOnItemClickListerer(MyAdapter.OnItemClickListener listerer) {
        this.mOnItemClickListerer = listerer;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_view, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.mTv.setText(mData.get(position));
        //开始
        holder.tv_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mOnItemClickListerer.onItemClick("start", position, holder.mTv);
            }
        });
        //结束
        holder.tv_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mOnItemClickListerer.onItemClick("stop", position, holder.mTv);
            }
        });
    }


    @Override
    public int getItemCount() {
        return mData == null ? 0 : mData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_start,tv_stop;
        TextView mTv;

        public ViewHolder(View itemView) {
            super(itemView);
            mTv = (TextView) itemView.findViewById(R.id.tv_view);
            tv_start = (TextView) itemView.findViewById(R.id.tv_start);
            tv_stop = (TextView) itemView.findViewById(R.id.tv_stop);
        }
    }

}
