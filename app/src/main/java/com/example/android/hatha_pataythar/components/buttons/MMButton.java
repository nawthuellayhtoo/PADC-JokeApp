package com.example.android.hatha_pataythar.components.buttons;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

import com.example.android.hatha_pataythar.utils.MMFontUtils;

/**
 * Created by nawthuellay on 25/06/2016.
 */
public class MMButton extends Button {
    public MMButton(Context context) {
        super(context);
        if (!isInEditMode())
            MMFontUtils.setMMFont(this);
    }

    public MMButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (!isInEditMode())
            MMFontUtils.setMMFont(this);
    }

    public MMButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        if (!isInEditMode())
            MMFontUtils.setMMFont(this);
    }
}
