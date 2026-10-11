package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import defpackage.ov3;
import defpackage.q23;
import defpackage.qx1;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public final int m;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.m = -1;
        new SparseIntArray();
        new SparseIntArray();
        SparseIntArray sparseIntArray = new SparseIntArray();
        new SparseIntArray();
        new Rect();
        int i3 = q23.D(context, attributeSet, i, i2).b;
        if (i3 == this.m) {
            return;
        }
        if (i3 >= 1) {
            this.m = i3;
            sparseIntArray.clear();
        } else {
            ze0.k(qx1.h(i3, "Span count should be at least 1. Provided "));
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Y(boolean z) {
        if (!z) {
            super.Y(false);
        } else {
            ov3.g("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
    }
}
