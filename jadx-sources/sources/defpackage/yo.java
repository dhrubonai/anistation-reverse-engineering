package defpackage;

import android.text.SegmentFinder;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yo extends SegmentFinder {
    public final /* synthetic */ y23 a;

    public yo(y23 y23Var) {
        this.a = y23Var;
    }

    public final int nextEndBoundary(int i) {
        return this.a.D(i);
    }

    public final int nextStartBoundary(int i) {
        return this.a.r(i);
    }

    public final int previousEndBoundary(int i) {
        return this.a.t(i);
    }

    public final int previousStartBoundary(int i) {
        return this.a.C(i);
    }
}
