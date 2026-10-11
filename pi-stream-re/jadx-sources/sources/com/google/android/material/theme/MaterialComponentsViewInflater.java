package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.i1;
import androidx.appcompat.widget.q;
import androidx.appcompat.widget.s;
import com.google.android.material.button.MaterialButton;
import f.j0;
import f6.a;
import m6.t;
import z5.c;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends j0 {
    @Override // f.j0
    public final q a(Context context, AttributeSet attributeSet) {
        return new t(context, attributeSet);
    }

    @Override // f.j0
    public final s b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // f.j0
    public final androidx.appcompat.widget.t c(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // f.j0
    public final i0 d(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // f.j0
    public final i1 e(Context context, AttributeSet attributeSet) {
        return new n6.a(context, attributeSet);
    }
}
