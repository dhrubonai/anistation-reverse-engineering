package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class z61 implements ri3, aw3, dw3, ay0 {
    public final /* synthetic */ int x;
    public final /* synthetic */ long y;
    public final /* synthetic */ Object z;

    public /* synthetic */ z61(q7 q7Var, int i, long j, long j2) {
        this.z = q7Var;
        this.x = i;
        this.y = j;
    }

    @Override // defpackage.ay0
    public void accept(Object obj) {
        boolean z;
        l26 l26Var = (l26) this.z;
        e31 e31Var = (e31) obj;
        l26Var.h.getClass();
        byte[] K = i18.K(e31Var.a, e31Var.c);
        zi4 zi4Var = l26Var.c;
        zi4Var.L(K.length, K);
        l26Var.a.e(K.length, zi4Var);
        long j = e31Var.b;
        ea2 ea2Var = l26Var.h;
        long j2 = this.y;
        if (j == -9223372036854775807L) {
            if (ea2Var.u == Long.MAX_VALUE) {
                z = true;
            } else {
                z = false;
            }
            io3.B(z);
        } else {
            long j3 = ea2Var.u;
            if (j3 == Long.MAX_VALUE) {
                j2 += j;
            } else {
                j2 = j + j3;
            }
        }
        l26Var.a.a(j2, this.x | 1, K.length, 0, null);
    }

    @Override // defpackage.aw3
    public void b(fq4 fq4Var, dt3 dt3Var) {
        gw3 gw3Var = (gw3) this.z;
        fq4Var.k(gw3Var.N(dt3Var, fq4Var, this.x), this.y);
    }

    @Override // defpackage.ri3
    public void invoke(Object obj) {
        long longValue;
        q7 q7Var = (q7) this.z;
        mr3 mr3Var = (mr3) ((r7) obj);
        HashMap hashMap = mr3Var.h;
        HashMap hashMap2 = mr3Var.i;
        jw3 jw3Var = q7Var.d;
        if (jw3Var != null) {
            String c = mr3Var.c.c(q7Var.b, jw3Var);
            Long l = (Long) hashMap2.get(c);
            Long l2 = (Long) hashMap.get(c);
            long j = 0;
            if (l == null) {
                longValue = 0;
            } else {
                longValue = l.longValue();
            }
            hashMap2.put(c, Long.valueOf(longValue + this.y));
            if (l2 != null) {
                j = l2.longValue();
            }
            hashMap.put(c, Long.valueOf(j + this.x));
        }
    }

    @Override // defpackage.dw3
    public Object j(bu3 bu3Var, dt3 dt3Var, int i) {
        int i2;
        long j;
        try {
            nw2 a = lb0.a((IBinder) this.z);
            jw2 k = nw2.k();
            for (int i3 = 0; i3 < a.size(); i3++) {
                Bundle bundle = (Bundle) a.get(i3);
                bundle.getClass();
                k.c(ar3.b(dt3Var.c, bundle));
            }
            o15 g = k.g();
            int i4 = this.x;
            if (i4 == -1) {
                bu3Var.t();
                i2 = bu3Var.t.s0();
            } else {
                i2 = i4;
            }
            if (i4 == -1) {
                bu3Var.t();
                j = bu3Var.t.Z0();
            } else {
                j = this.y;
            }
            return bu3Var.o(dt3Var, g, i2, j);
        } catch (RuntimeException e) {
            kb0.P("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
            return wc7.v(e);
        }
    }

    public /* synthetic */ z61(l26 l26Var, long j, int i) {
        this.z = l26Var;
        this.y = j;
        this.x = i;
    }

    public /* synthetic */ z61(IBinder iBinder, int i, long j) {
        this.z = iBinder;
        this.x = i;
        this.y = j;
    }
}
