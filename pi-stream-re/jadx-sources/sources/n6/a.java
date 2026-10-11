package n6;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.i1;
import q6.g;
import w7.b;

/* loaded from: classes.dex */
public final class a extends i1 {
    public a(Context context, AttributeSet attributeSet) {
        super(b.Z(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = getContext();
        if (g.b0(context2, msr.pistream.app.R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = s5.a.f9915q;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int m5 = m(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (!(m5 != -1)) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    l(resourceId, theme);
                }
            }
        }
    }

    public static int m(Context context, TypedArray typedArray, int... iArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < iArr.length && i10 < 0; i11++) {
            int i12 = iArr[i11];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i12, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i10 = dimensionPixelSize;
            } else {
                i10 = typedArray.getDimensionPixelSize(i12, -1);
            }
        }
        return i10;
    }

    public final void l(int i10, Resources.Theme theme) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i10, s5.a.f9914p);
        int m5 = m(getContext(), obtainStyledAttributes, 1, 2);
        obtainStyledAttributes.recycle();
        if (m5 >= 0) {
            setLineHeight(m5);
        }
    }

    @Override // androidx.appcompat.widget.i1, android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (g.b0(context, msr.pistream.app.R.attr.textAppearanceLineHeightEnabled, true)) {
            l(i10, context.getTheme());
        }
    }
}
