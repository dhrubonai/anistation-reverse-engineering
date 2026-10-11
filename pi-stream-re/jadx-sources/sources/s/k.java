package s;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public int f9692a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f9693b = 0;

    /* renamed from: c, reason: collision with root package name */
    public float f9694c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f9695d = Float.NaN;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f9719f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == 1) {
                this.f9694c = obtainStyledAttributes.getFloat(index, this.f9694c);
            } else if (index == 0) {
                int i11 = obtainStyledAttributes.getInt(index, this.f9692a);
                this.f9692a = i11;
                this.f9692a = m.f9709d[i11];
            } else if (index == 4) {
                this.f9693b = obtainStyledAttributes.getInt(index, this.f9693b);
            } else if (index == 3) {
                this.f9695d = obtainStyledAttributes.getFloat(index, this.f9695d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
