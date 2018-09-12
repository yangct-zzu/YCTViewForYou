package com.yct.yctviewforyou.Customsurfaceview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class CustomSurfaceView extends SurfaceView implements SurfaceHolder.Callback,Runnable {
    public CustomSurfaceView(Context context) {
        super(context);
    }

    public CustomSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomSurfaceView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }

    @Override
    public void run() {

    }
}
