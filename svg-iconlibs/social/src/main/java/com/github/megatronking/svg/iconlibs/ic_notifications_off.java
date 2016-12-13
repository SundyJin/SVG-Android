package com.github.megatronking.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_notifications_off extends SVGRenderer {

    public ic_notifications_off(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(20.0f, 18.69f);
        mPath.lineTo(7.84f, 6.14f);
        mPath.lineTo(5.27f, 3.49f);
        mPath.lineTo(4.0f, 4.76f);
        mPath.rLineTo(2.8f, 2.8f);
        mPath.rLineTo(0f, 0.01f);
        mPath.rCubicTo(-0.52f, 0.99f, -0.8f, 2.16f, -0.8f, 3.42f);
        mPath.rLineTo(0f, 5.0f);
        mPath.rLineTo(-2.0f, 2.0f);
        mPath.rLineTo(0f, 1.0f);
        mPath.rLineTo(13.73f, 0f);
        mPath.rLineTo(2.0f, 2.0f);
        mPath.lineTo(21.0f, 19.72f);
        mPath.rLineTo(-1.0f, -1.03f);
        mPath.close();
        mPath.moveTo(20.0f, 18.69f);
        mPath.moveTo(12.0f, 22.0f);
        mPath.rCubicTo(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        mPath.rLineTo(-4.0f, 0f);
        mPath.rCubicTo(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        mPath.close();
        mPath.moveTo(12.0f, 22.0f);
        mPath.rMoveTo(6.0f, -7.32f);
        mPath.lineTo(18.0f, 11.0f);
        mPath.rCubicTo(0.0f, -3.08f, -1.64f, -5.64f, -4.5f, -6.32f);
        mPath.lineTo(13.5f, 4.0f);
        mPath.rCubicTo(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        mPath.rCubicTo(-0.8299999f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        mPath.rLineTo(0f, 0.68f);
        mPath.rCubicTo(-0.15f, 0.03f, -0.29f, 0.08f, -0.42f, 0.12f);
        mPath.rCubicTo(-0.1f, 0.03f, -0.2f, 0.07f, -0.3f, 0.11f);
        mPath.rLineTo(-0.01f, 0f);
        mPath.rCubicTo(-0.01f, 0.0f, -0.01f, 0.0f, -0.02f, 0.01f);
        mPath.rCubicTo(-0.23f, 0.09f, -0.46f, 0.2f, -0.68f, 0.31f);
        mPath.rCubicTo(0.0f, 0.0f, -0.01f, 0.0f, -0.01f, 0.01f);
        mPath.lineTo(18.0f, 14.68f);
        mPath.close();
        mPath.moveTo(18.0f, 14.68f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}