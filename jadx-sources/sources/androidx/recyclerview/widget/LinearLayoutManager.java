package androidx.recyclerview.widget;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.io3;
import defpackage.q05;
import defpackage.q23;
import defpackage.qx1;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class LinearLayoutManager extends q23 {
    public final int i;
    public final io3 j;
    public final boolean k;
    public boolean l = false;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.i = 1;
        this.k = false;
        q05 D = q23.D(context, attributeSet, i, i2);
        int i3 = D.a;
        if (i3 != 0 && i3 != 1) {
            ze0.k(qx1.h(i3, "invalid orientation:"));
            throw null;
        }
        if (i3 != this.i || this.j == null) {
            this.j = io3.H(this, i3);
            this.i = i3;
        }
        boolean z = D.c;
        if (z != this.k) {
            this.k = z;
        }
        Y(D.d);
    }

    public void Y(boolean z) {
        if (this.l == z) {
            return;
        }
        this.l = z;
    }
}
