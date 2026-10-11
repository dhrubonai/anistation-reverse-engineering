package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import defpackage.io3;
import defpackage.og5;
import defpackage.q05;
import defpackage.q23;
import defpackage.ze0;
import java.util.ArrayList;
import java.util.BitSet;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends q23 {
    public final int i;
    public final og5[] j;
    public final io3 k;
    public final io3 l;
    public final int m;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.i = -1;
        new Rect();
        q05 D = q23.D(context, attributeSet, i, i2);
        int i3 = D.a;
        if (i3 != 0 && i3 != 1) {
            ze0.k("invalid orientation.");
            throw null;
        }
        if (i3 != this.m) {
            this.m = i3;
            io3 io3Var = this.k;
            this.k = this.l;
            this.l = io3Var;
        }
        int i4 = D.b;
        if (i4 != this.i) {
            this.i = i4;
            new BitSet(this.i);
            this.j = new og5[this.i];
            for (int i5 = 0; i5 < this.i; i5++) {
                og5[] og5VarArr = this.j;
                og5 og5Var = new og5((byte) 1);
                new ArrayList();
                og5VarArr[i5] = og5Var;
            }
        }
        this.k = io3.H(this, this.m);
        this.l = io3.H(this, 1 - this.m);
    }
}
