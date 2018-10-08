package edu.cs356.edgeoftheempirecharactercreator.customtextviews;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.util.Log;

public class SWTextView extends AppCompatButton {
    private static final String TAG = JediTextView.class.getSimpleName();
    public SWTextView(Context context) {
        super(context);
        setFont();
    }
    public SWTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont();
    }
    public SWTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setFont();
    }

    private void setFont() {
        try
        {
            Typeface font = Typeface.createFromAsset(getContext().getAssets(), "fonts/teuton_mager.otf");
            setTypeface(font, Typeface.NORMAL);
        }
        catch (Exception ex)
        {
            Log.e(TAG, ex.getMessage());
        }

    }
}
