package com.example.myview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class MyView(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) :
    View(context, attrs, defStyleAttr) {

    val size=200

    val paint:Paint=Paint().apply {
        isAntiAlias=true
        style=Paint.Style.FILL
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        val widthSize=MeasureSpec.getSize(widthMeasureSpec)
        val widthMode=MeasureSpec.getMode(widthMeasureSpec)
        val heightSize=MeasureSpec.getSize(heightMeasureSpec)
        val heightMode=MeasureSpec.getMode(heightMeasureSpec)
        if(widthMode==MeasureSpec.AT_MOST&&heightMode==MeasureSpec.AT_MOST)
        {
            setMeasuredDimension(size,size)
        }
        else if(widthMode==MeasureSpec.AT_MOST)
        {
            setMeasuredDimension(size,heightSize)
        }
        else  if(heightMode==MeasureSpec.AT_MOST)
        {
            setMeasuredDimension(widthSize,size)
        }
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
        
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val width=width.toFloat()
        val height=height.toFloat()
        val side= minOf(width,height)
        val left=width-side
        val top=height-side
        paint.color=Color.BLUE
        canvas?.drawRect(left,top,left+side,width+side,paint)
        val xx=left+side/2
        val yy=top+side/2
        paint.color=Color.RED
        canvas?.drawCircle(xx,yy,side/2,paint)
    }
}