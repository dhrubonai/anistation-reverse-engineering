package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class bv0 {
    public static final tq1 a = new tq1(new zu0((byte) 0), (byte) 1);
    public static final tq1 b = new tq1(new zu0((byte) 1), (byte) 1);
    public static final tq1 c = new tq1(new zu0((byte) 6), (byte) 1);
    public static final tq1 d = new tq1(new zu0((byte) 7), (byte) 1);
    public static final tq1 e = new tq1(new zu0((byte) 8), (byte) 1);
    public static final tq1 f = new tq1(new zu0((byte) 9), (byte) 1);
    public static final tq1 g = new tq1(new zu0((byte) 10), (byte) 1);
    public static final tq1 h = new tq1(new zu0((byte) 12), (byte) 1);
    public static final tq1 i = new tq1(new zu0((byte) 13), (byte) 1);
    public static final tq1 j = new tq1(new zu0((byte) 14), (byte) 1);
    public static final tq1 k = new tq1(new zu0((byte) 11), (byte) 1);
    public static final tq1 l = new tq1(new zu0((byte) 15), (byte) 1);
    public static final tq1 m = new tq1(new zu0((byte) 16), (byte) 1);
    public static final tq1 n = new tq1(new zu0((byte) 17), (byte) 1);
    public static final tq1 o = new tq1(new zu0((byte) 18), (byte) 1);
    public static final tq1 p;
    public static final tq1 q;
    public static final tq1 r;
    public static final tq1 s;
    public static final tq1 t;
    public static final tq1 u;
    public static final tq1 v;
    public static final tq1 w;
    public static final tq1 x;
    public static final tq1 y;

    static {
        new d46(new zu0((byte) 23));
        p = new tq1(new zu0((byte) 19), (byte) 1);
        q = new tq1(new zu0((byte) 20), (byte) 1);
        r = new tq1(new zu0((byte) 21), (byte) 1);
        s = new tq1(new zu0((byte) 22), (byte) 1);
        t = new tq1(new zu0((byte) 2), (byte) 1);
        u = new tq1(new zu0((byte) 3), (byte) 1);
        v = new tq1(new zu0((byte) 4), (byte) 1);
        w = new tq1(new zu0((byte) 5), (byte) 1);
        x = new tq1(new vj1((byte) 13), (byte) 0);
        y = new tq1(new vj1((byte) 6), (byte) 1);
    }

    public static final void a(kh4 kh4Var, wf wfVar, os0 os0Var, kd2 kd2Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        kd2Var.f0(1925803616);
        if (kd2Var.f(kh4Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (kd2Var.f(wfVar)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (kd2Var.h(os0Var)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5;
        if ((i8 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i8 & 1, z)) {
            oa oaVar = (oa) kh4Var;
            mw4 a2 = a.a(oaVar.getAccessibilityManager());
            mw4 a3 = b.a(oaVar.getAutofill());
            mw4 a4 = d.a(oaVar.m158getAutofillManager());
            mw4 a5 = c.a(oaVar.getAutofillTree());
            mw4 a6 = e.a(oaVar.getClipboardManager());
            mw4 a7 = f.a(oaVar.getClipboard());
            mw4 a8 = h.a(oaVar.getDensity());
            mw4 a9 = i.a(oaVar.getFocusOwner());
            mw4 a10 = j.a(oaVar.getFontLoader());
            a10.g = false;
            mw4 a11 = k.a(oaVar.getFontFamilyResolver());
            a11.g = false;
            mw4 a12 = l.a(oaVar.getHapticFeedBack());
            int i9 = i8 & 14;
            if (i9 != 4) {
                z2 = false;
            } else {
                z2 = true;
            }
            Object Q = kd2Var.Q();
            q18 q18Var = au0.a;
            if (z2 || Q == q18Var) {
                Q = new y9(oaVar, (byte) 5);
                kd2Var.n0(Q);
            }
            mw4 c2 = m.c((ub2) Q);
            mw4 a13 = n.a(oaVar.getLayoutDirection());
            if (i9 != 4) {
                z3 = false;
            } else {
                z3 = true;
            }
            Object Q2 = kd2Var.Q();
            if (z3 || Q2 == q18Var) {
                Q2 = new y9(oaVar, (byte) 6);
                kd2Var.n0(Q2);
            }
            mw4 c3 = p.c((ub2) Q2);
            if (i9 != 4) {
                z4 = false;
            } else {
                z4 = true;
            }
            Object Q3 = kd2Var.Q();
            if (z4 || Q3 == q18Var) {
                Q3 = new y9(oaVar, (byte) 7);
                kd2Var.n0(Q3);
            }
            mw4 c4 = q.c((ub2) Q3);
            if (i9 != 4) {
                z5 = false;
            } else {
                z5 = true;
            }
            Object Q4 = kd2Var.Q();
            boolean z7 = z5;
            byte b2 = 8;
            if (z7 || Q4 == q18Var) {
                Q4 = new y9(oaVar, b2);
                kd2Var.n0(Q4);
            }
            mw4 c5 = r.c((ub2) Q4);
            mw4 a14 = s.a(wfVar);
            mw4 a15 = t.a(oaVar.getViewConfiguration());
            mw4 a16 = u.a(oaVar.getWindowInfo());
            if (i9 != 4) {
                z6 = false;
            } else {
                z6 = true;
            }
            Object Q5 = kd2Var.Q();
            if (z6 || Q5 == q18Var) {
                Q5 = new y9(oaVar, (byte) 9);
                kd2Var.n0(Q5);
            }
            kb0.c(new mw4[]{a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, c2, a13, c3, c4, c5, a14, a15, a16, w.c((ub2) Q5), g.a(oaVar.getGraphicsContext()), bk3.a.a(oaVar.getRetainedValuesStore()), o.a(oaVar.getLocaleList())}, os0Var, kd2Var, 8 | ((i8 >> 3) & 112));
        } else {
            kd2Var.Y();
        }
        zz4 u2 = kd2Var.u();
        if (u2 != null) {
            u2.d = new df((Object) kh4Var, (Object) wfVar, os0Var, i2, (byte) 5);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
