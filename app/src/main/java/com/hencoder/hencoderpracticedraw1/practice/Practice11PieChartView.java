package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        Paint mPaint = new Paint();
        mPaint.setColor(Color.parseColor("#9C27B0"));
        canvas.drawArc(200,100,800,700,0,9,true,mPaint);
        mPaint.setColor(Color.parseColor("#9E9E9E"));
        canvas.drawArc(200,100,800,700,10,10,true,mPaint);
        mPaint.setColor(Color.parseColor("#009688"));
        canvas.drawArc(200,100,800,700,21,54,true,mPaint);
        mPaint.setColor(Color.parseColor("#2196F3"));
        canvas.drawArc(200,100,800,700,76,100,true,mPaint);
        mPaint.setColor(Color.parseColor("#FFC107"));
        canvas.drawArc(200,100,800,700,314,45,true,mPaint);


        mPaint.setColor(Color.parseColor("#F44336"));
        canvas.drawArc(180,80,780,680,177,135,true,mPaint);
    }
}
