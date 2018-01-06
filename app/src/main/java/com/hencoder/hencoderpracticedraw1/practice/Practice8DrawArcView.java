package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        Paint paint = new Paint();

        canvas.drawArc(0, 0,
                300, 200,
                -10, -170,
                false, paint);

        canvas.drawArc(0, 0,
                300, 200,
                10, 100,
                true, paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(0, 0,
                300, 200,
                120, 170,
                false, paint);

//        canvas.drawArc(100, 100,
//                500, 300,
//                10, 90,
//                false, paint);
    }
}
