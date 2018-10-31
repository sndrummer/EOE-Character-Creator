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

public class XPInfoDialogue2 extends InfoDialogue {

    private String descText;
    private Button mExitBtn;
    boolean page1;

    public XPInfoDialogue2(@NonNull Context context, String descText) {
        super(context, descText);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        page1 = true;

        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custom_dialog_xp1);
        //TextView descriptionView = findViewById(R.id.desc_text);
        //descriptionView.setMovementMethod(new ScrollingMovementMethod());
        mExitBtn = findViewById(R.id.exit_btn);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);


        mExitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchView();
            }
        });
    }

    private void switchView() {
        if (page1) {
            setContentView(R.layout.custom_dialog_xp2);
            findViewById(R.id.exit_btn).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dismiss();
                }
            });
            findViewById(R.id.back_btn).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switchView();
                }
            });
            page1 = false;
        }
        else {
            setContentView(R.layout.custom_dialog_xp1);
            findViewById(R.id.exit_btn).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switchView();
                }
            });
            page1 = true;
        }

    }
}