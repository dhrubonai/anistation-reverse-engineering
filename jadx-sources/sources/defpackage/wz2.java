package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wz2 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;

    public wz2(Context context, hp0 hp0Var, oe2 oe2Var, ts6 ts6Var, Executor executor, ac1 ac1Var, boolean z, boolean z2, boolean z3) {
        this.b = context;
        this.c = hp0Var;
        this.d = oe2Var;
        this.e = ts6Var;
        this.g = executor;
        this.f = ac1Var;
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        this.a = z2;
        vz2 vz2Var = new vz2(new a12(oe2Var, ts6Var, z, z2));
        sparseArray.put(1, vz2Var);
        sparseArray.put(4, vz2Var);
        sparseArray.put(2, new vz2(new u60(oe2Var, ts6Var, z3)));
        sparseArray.put(3, new vz2(new b86(oe2Var, ts6Var)));
    }

    public static ij3 a(gj4 gj4Var, long j, long j2) {
        hj3 hj3Var = new hj3(gj4Var.a, gj4Var.b, j);
        iy5 iy5Var = gj4Var.d;
        hj3Var.f = iy5Var.z;
        hj3Var.g = iy5Var.A;
        hj3Var.c = j2;
        hj3Var.d = iy5Var.y;
        return new ij3(hj3Var);
    }

    public void b() {
        io3.B(this.a);
        Uri uri = (Uri) this.e;
        uri.getClass();
        Uri.Builder buildUpon = uri.buildUpon();
        cn7 cn7Var = (cn7) this.f;
        cn7Var.getClass();
        ol2 ol2Var = (ol2) cn7Var.x;
        io3.B(ol2Var.k);
        String str = ol2Var.l;
        String valueOf = String.valueOf(ol2Var.c.D());
        io3.s("_HLS_pathway", str);
        io3.s("_HLS_throughput", valueOf);
        for (Map.Entry entry : new TreeMap(t15.j(2, new Object[]{"_HLS_pathway", str, "_HLS_throughput", valueOf}, null)).entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        Map map = Collections.EMPTY_MAP;
        Uri build = buildUpon.build();
        build.getClass();
        gj4 gj4Var = new gj4(((h5) this.b).H(), new v41(build, 0L, 1, null, map, 0L, -1L, null, 0), 8, new qc5((byte) 2));
        dn0 dn0Var = (dn0) this.j;
        dn0Var.getClass();
        dn0Var.T(gj4Var, (sn3) this.c, 0);
    }

    public void c() {
        SparseArray sparseArray = (SparseArray) this.h;
        for (int i = 0; i < sparseArray.size(); i++) {
            vz2 vz2Var = (vz2) sparseArray.get(sparseArray.keyAt(i));
            if (!vz2Var.d) {
                vz2Var.d = true;
                vz2Var.a.i();
                oa1 oa1Var = vz2Var.b;
                if (oa1Var != null) {
                    oa1Var.release();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b3  */
    /* JADX WARN: Type inference failed for: r4v10, types: [ue2, java.lang.Object, mn0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(int r20, defpackage.bb2 r21) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wz2.d(int, bb2):void");
    }

    public wz2(h5 h5Var) {
        this.b = h5Var;
        this.c = new sn3((Object) this, (byte) 19);
        this.d = new k46(new Handler(eq6.z(), null));
    }
}
