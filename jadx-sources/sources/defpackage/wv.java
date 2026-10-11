package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wv {
    public long a;
    public Object b;
    public Object c;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, g90] */
    public wv(long j, fr0 fr0Var) {
        this.a = j;
        this.b = fr0Var;
        ?? obj = new Object();
        obj.A = this;
        obj.z = new LinkedHashMap(0, 0.75f, true);
        obj.x = j;
        if (j > 0) {
            this.c = obj;
        } else {
            ze0.k("maxSize <= 0");
            throw null;
        }
    }

    public void a(long j, long j2) {
        ((wr6) this.b).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
        ((wr6) this.c).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
    }

    public xv b() {
        Object obj;
        boolean z;
        if (!((kf6) this.b).p() && (obj = this.c) != null) {
            if (((kf6) this.b).b(obj) != -1) {
                z = true;
            } else {
                z = false;
            }
            io3.n(z);
        }
        return new xv(this);
    }

    public void c(gx3 gx3Var, mu2 mu2Var, Map map, long j) {
        g90 g90Var = (g90) this.c;
        long j2 = g90Var.x;
        LinkedHashMap linkedHashMap = (LinkedHashMap) g90Var.z;
        if (j <= j2) {
            rz4 rz4Var = new rz4(mu2Var, map, j);
            Object put = linkedHashMap.put(gx3Var, rz4Var);
            g90Var.y = g90Var.f(gx3Var, rz4Var) + g90Var.e();
            if (put != null) {
                g90Var.y = g90Var.e() - g90Var.f(gx3Var, put);
                g90Var.a(gx3Var, put, rz4Var);
            }
            g90Var.h(g90Var.x);
            return;
        }
        Object remove = linkedHashMap.remove(gx3Var);
        if (remove != null) {
            g90Var.y = g90Var.e() - g90Var.f(gx3Var, remove);
            g90Var.a(gx3Var, remove, null);
        }
        ((fr0) this.b).r(gx3Var, mu2Var, map, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e2 A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List d() {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wv.d():java.util.List");
    }

    public wv(byte b) {
        switch (b) {
            case 1:
                this.b = new wr6();
                this.c = new wr6();
                return;
            default:
                this.a = 0L;
                this.b = kf6.a;
                this.c = null;
                return;
        }
    }
}
