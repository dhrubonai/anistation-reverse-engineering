package defpackage;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class y43 {
    public static final x43 d = new y43(new g53(false, false, false, false, false, true, "    ", HandleInvocationsFromAdViewer.KEY_AD_TYPE, false, true, hm0.z, true), db.k);
    public final g53 a;
    public final uj5 b;
    public final cn7 c = new cn7((byte) 18);

    public y43(g53 g53Var, uj5 uj5Var) {
        this.a = g53Var;
        this.b = uj5Var;
    }

    public final Object a(ne1 ne1Var, String str) {
        ne1Var.getClass();
        gz5 a = hz5.a(this, str);
        Object f = new zy5(this, i97.z, a, ne1Var.getDescriptor(), null).f(ne1Var);
        a.s();
        return f;
    }

    public final String b(mj5 mj5Var, Object obj) {
        mj5Var.getClass();
        fr0 fr0Var = new fr0((byte) 3, false);
        nk0 nk0Var = nk0.c;
        fr0Var.z = nk0Var.d(128);
        try {
            p63.b(this, fr0Var, mj5Var, obj);
            String fr0Var2 = fr0Var.toString();
            char[] cArr = (char[]) fr0Var.z;
            nk0Var.getClass();
            cArr.getClass();
            nk0Var.b(cArr);
            return fr0Var2;
        } catch (Throwable th) {
            nk0 nk0Var2 = nk0.c;
            char[] cArr2 = (char[]) fr0Var.z;
            nk0Var2.getClass();
            cArr2.getClass();
            nk0Var2.b(cArr2);
            throw th;
        }
    }
}
