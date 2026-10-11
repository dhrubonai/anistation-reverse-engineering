package defpackage;

import android.os.Bundle;
import android.os.IBinder;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class hy1 implements ri3, dw3, ay0 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ hy1(qn4 qn4Var, int i) {
        this.x = (byte) 0;
        this.z = qn4Var;
        this.y = i;
    }

    @Override // defpackage.ay0
    public void accept(Object obj) {
        ((fq4) obj).n0((ru) this.z, this.y);
    }

    @Override // defpackage.ri3
    public void invoke(Object obj) {
        ((io4) obj).H(((qn4) this.z).a, this.y ? 1 : 0);
    }

    @Override // defpackage.dw3
    public Object j(bu3 bu3Var, dt3 dt3Var, int i) {
        byte b = this.x;
        long j = -9223372036854775807L;
        int i2 = -1;
        boolean z = this.y;
        Object obj = this.z;
        switch (b) {
            case 1:
                try {
                    nw2 a = lb0.a((IBinder) obj);
                    jw2 k = nw2.k();
                    for (int i3 = 0; i3 < a.size(); i3++) {
                        Bundle bundle = (Bundle) a.get(i3);
                        bundle.getClass();
                        k.c(ar3.b(dt3Var.c, bundle));
                    }
                    o15 g = k.g();
                    if (!z) {
                        bu3Var.t();
                        i2 = bu3Var.t.s0();
                    }
                    if (!z) {
                        bu3Var.t();
                        j = bu3Var.t.Z0();
                    }
                    return bu3Var.o(dt3Var, g, i2, j);
                } catch (RuntimeException e) {
                    kb0.P("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
                    return wc7.v(e);
                }
            default:
                try {
                    o15 s = nw2.s(ar3.b(dt3Var.c, (Bundle) obj));
                    if (!z) {
                        bu3Var.t();
                        i2 = bu3Var.t.s0();
                    }
                    int i4 = i2;
                    if (!z) {
                        bu3Var.t();
                        j = bu3Var.t.Z0();
                    }
                    return bu3Var.o(dt3Var, s, i4, j);
                } catch (RuntimeException e2) {
                    kb0.P("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e2);
                    return wc7.v(e2);
                }
        }
    }

    public /* synthetic */ hy1(byte b, Object obj, boolean z) {
        this.x = b;
        this.z = obj;
        this.y = z;
    }
}
