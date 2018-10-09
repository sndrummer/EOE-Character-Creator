package edu.cs356.edgeoftheempirecharactercreator.ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import edu.cs356.edgeoftheempirecharactercreator.R;

public class InfoDialogue extends Dialog {

    private String descText;
    private Button mExitBtn;

    public InfoDialogue(@NonNull Context context, String descText) {
        super(context);
        this.descText = descText;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custom_dialog);
        TextView descriptionView = findViewById(R.id.desc_text);
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
