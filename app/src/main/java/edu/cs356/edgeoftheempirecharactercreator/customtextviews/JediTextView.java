package edu.cs356.edgeoftheempirecharactercreator.customtextviews;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.util.Log;

/**
 * @author Samuel Nuttall
 */
public class JediTextView extends AppCompatButton {
    private static final String TAG = JediTextView.class.getSimpleName();
    public JediTextView(Context context) {
        super(context);
        setFont();
    }
    public JediTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont();
    }
    public JediTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setFont();
    }

    private void setFont() {
        try
        {
            Typeface font = Typeface.createFromAsset(getContext().getAssets(), "fonts/starjedi_special_edition.ttf");
            setTypeface(font, Typeface.NORMAL);
        }
        catch (Exception ex)
        {
            Log.e(TAG, ex.getMessage());
        }

    }
}
