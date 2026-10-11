package defpackage;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sd7 extends AbstractSet {
    public final int x;
    public final /* synthetic */ ud7 y;

    public sd7(ud7 ud7Var, int i) {
        this.y = ud7Var;
        this.x = i;
    }

    public final int b() {
        int i = this.x;
        if (i == -1) {
            return 0;
        }
        return this.y.y[i];
    }

    public final int c() {
        return this.y.y[this.x + 1];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        w66 w66Var;
        int b = b();
        int c = c();
        if (this.x == -1) {
            w66Var = ud7.C;
        } else {
            w66Var = wd7.b;
        }
        if (Arrays.binarySearch(this.y.x, b, c, obj, w66Var) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new rd7(this, (byte) 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return c() - b();
    }
}
