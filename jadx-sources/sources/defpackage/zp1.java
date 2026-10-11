package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class zp1 implements ni5, aq1 {
    public final /* synthetic */ byte a;
    public final ni5 b;
    public final int c;

    public zp1(ni5 ni5Var, int i, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = ni5Var;
                this.c = i;
                if (i >= 0) {
                    return;
                }
                v71.j("count must be non-negative, but was ", i, 46);
                throw null;
            default:
                ni5Var.getClass();
                this.b = ni5Var;
                this.c = i;
                if (i >= 0) {
                    return;
                }
                v71.j("count must be non-negative, but was ", i, 46);
                throw null;
        }
    }

    @Override // defpackage.aq1
    public final ni5 a(int i) {
        byte b = this.a;
        ni5 ni5Var = this.b;
        int i2 = this.c;
        switch (b) {
            case 0:
                int i3 = i2 + i;
                if (i3 < 0) {
                    return new zp1(this, i, (byte) 1);
                }
                return new s06(ni5Var, i2, i3);
            default:
                if (i < i2) {
                    return new zp1(ni5Var, i, (byte) 1);
                }
                return this;
        }
    }

    @Override // defpackage.aq1
    public final ni5 b(int i) {
        byte b = this.a;
        ni5 ni5Var = this.b;
        int i2 = this.c;
        switch (b) {
            case 0:
                int i3 = i2 + i;
                if (i3 < 0) {
                    return new zp1(this, i, (byte) 0);
                }
                return new zp1(ni5Var, i3, (byte) 0);
            default:
                if (i >= i2) {
                    return st1.a;
                }
                return new s06(ni5Var, i, i2);
        }
    }

    @Override // defpackage.ni5
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new yp1(this);
            default:
                return new yp1(this, (byte) 0);
        }
    }
}
