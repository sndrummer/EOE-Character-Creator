package edu.cs356.edgeoftheempirecharactercreator.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import edu.cs356.edgeoftheempirecharactercreator.R;

/**
 * Created by jalton on 10/9/18.
 */

/* This is a custom view element for displaying Career info.
 * The layout should look something like this:
 *  ---------------------------------
 *  | CAREER NAME                   |
 *  |-------------------------------|
 *  |         | - Career info in    |
 *  |  IMAGE  | - a bulleted        |
 *  |         | - list              |
 *  ---------------------------------
 */

public class CareerView extends View {

    private String mCareerName;
    private String mCareerDescription;
    private Paint mTextPaint;
    private int mTextColor;
    private float mTextHeight;

    public CareerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.CareerView,
                0, 0);

        try {
            mCareerName = a.getString(R.styleable.CareerView_careerName);
            mCareerDescription = a.getString(R.styleable.CareerView_careerDescription);
        } finally {
            a.recycle();
        }

    }

    private void init() {
        mTextPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mTextPaint.setColor(mTextColor);
        if (mTextHeight == 0) {
            mTextHeight = mTextPaint.getTextSize();
        } else {
            mTextPaint.setTextSize(mTextHeight);
        }



    }



}
