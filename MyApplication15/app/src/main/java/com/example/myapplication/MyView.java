package com.example.myview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import java.util.Collection;

public class MyView extends View {
    Paint mPaint;
    public MyView(Context context) {
        super( context );
        init();
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super( context, attrs );
        init();
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super( context, attrs, defStyleAttr );
        init();
    }

    private void init()
    {
        mPaint=new Paint(Color.TRANSPARENT);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure( widthMeasureSpec, heightMeasureSpec );
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout( changed, left, top, right, bottom );
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw( canvas );
        int size=Math.max(getWidth(),getHeight());
        canvas.drawCircle(getWidth()/2,getHeight()/2,size/2,mPaint);
    }
}
