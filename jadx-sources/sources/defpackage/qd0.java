package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qd0 implements Iterator {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte x = 2;
    public int y = 0;
    public final int z;

    public qd0(we7 we7Var) {
        this.A = we7Var;
        this.z = we7Var.c();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.x) {
            case 0:
                if (this.y < this.z) {
                    return true;
                }
                return false;
            case 1:
                if (this.y < this.z) {
                    return true;
                }
                return false;
            default:
                if (this.y < this.z) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.x;
        Object obj = this.A;
        int i = this.z;
        switch (b) {
            case 0:
                int i2 = this.y;
                if (i2 < i) {
                    this.y = i2 + 1;
                    return Byte.valueOf(((xd0) obj).h(i2));
                }
                qi2.e();
                return null;
            case 1:
                int i3 = this.y;
                if (i3 < i) {
                    this.y = i3 + 1;
                    return Byte.valueOf(((we7) obj).b(i3));
                }
                qi2.e();
                return null;
            default:
                int i4 = this.y;
                if (i4 < i) {
                    this.y = i4 + 1;
                    return Byte.valueOf(((d98) obj).c(i4));
                }
                qi2.e();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.x) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public qd0(d98 d98Var) {
        this.A = d98Var;
        this.z = d98Var.d();
    }

    public qd0(xd0 xd0Var) {
        this.A = xd0Var;
        this.z = xd0Var.size();
    }
}
