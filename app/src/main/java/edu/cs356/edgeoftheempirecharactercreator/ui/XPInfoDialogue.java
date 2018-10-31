package edu.cs356.edgeoftheempirecharactercreator.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import edu.cs356.edgeoftheempirecharactercreator.R;

public class XPInfoDialogue extends InfoDialogue {

    private String descText;
    private Button mExitBtn;

    public XPInfoDialogue(@NonNull Context context, String descText) {
        super(context, descText);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custom_dialog_xp1);
        TextView descriptionView = findViewById(R.id.desc_text);
        descriptionView.setMovementMethod(new ScrollingMovementMethod());
        mExitBtn = findViewById(R.id.exit_btn);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);

        descriptionView.setText(descText);

        mExitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
    }

}
