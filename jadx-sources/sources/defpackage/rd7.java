package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rd7 implements Iterator {
    public final /* synthetic */ byte x;
    public int y = 0;
    public final /* synthetic */ AbstractSet z;

    public /* synthetic */ rd7(AbstractSet abstractSet, byte b) {
        this.x = b;
        this.z = abstractSet;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.x;
        AbstractSet abstractSet = this.z;
        switch (b) {
            case 0:
                sd7 sd7Var = (sd7) abstractSet;
                if (this.y >= sd7Var.c() - sd7Var.b()) {
                    return false;
                }
                return true;
            default:
                if (this.y >= ((tb8) ((es) abstractSet).y).e) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.x;
        AbstractSet abstractSet = this.z;
        switch (b) {
            case 0:
                int i = this.y;
                sd7 sd7Var = (sd7) abstractSet;
                if (i < sd7Var.c() - sd7Var.b()) {
                    ud7 ud7Var = sd7Var.y;
                    Object obj = ud7Var.x[sd7Var.b() + i];
                    this.y = i + 1;
                    return obj;
                }
                qi2.e();
                return null;
            default:
                int i2 = this.y;
                this.y = i2 + 1;
                tb8 tb8Var = (tb8) ((es) abstractSet).y;
                return tb8Var.d(tb8Var.d[i2] & 31);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.x) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
