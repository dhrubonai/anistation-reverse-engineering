package m3;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public c0 f7230a = null;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7231b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final long f7232c = 120;

    /* renamed from: d, reason: collision with root package name */
    public final long f7233d = 120;

    /* renamed from: e, reason: collision with root package name */
    public final long f7234e = 250;

    /* renamed from: f, reason: collision with root package name */
    public final long f7235f = 250;

    public static void b(a1 a1Var) {
        RecyclerView recyclerView;
        int i10 = a1Var.f7162j & 14;
        if (!a1Var.h() && (i10 & 4) == 0 && (recyclerView = a1Var.f7169r) != null) {
            recyclerView.I(a1Var);
        }
    }

    public abstract boolean a(a1 a1Var, a1 a1Var2, z1.h hVar, z1.h hVar2);

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(m3.a1 r10) {
        /*
            r9 = this;
            m3.c0 r0 = r9.f7230a
            if (r0 == 0) goto Lb0
            r1 = 1
            r10.o(r1)
            m3.a1 r2 = r10.f7160h
            r3 = 0
            if (r2 == 0) goto L13
            m3.a1 r2 = r10.f7161i
            if (r2 != 0) goto L13
            r10.f7160h = r3
        L13:
            r10.f7161i = r3
            int r2 = r10.f7162j
            r2 = r2 & 16
            r3 = 0
            if (r2 == 0) goto L1e
            r2 = r1
            goto L1f
        L1e:
            r2 = r3
        L1f:
            if (r2 != 0) goto Lb0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f7186a
            r0.h0()
            m3.c r2 = r0.f1238f
            k2.c r4 = r2.f7182b
            m3.c0 r5 = r2.f7181a
            int r6 = r2.f7184d
            android.view.View r7 = r10.f7153a
            if (r6 != r1) goto L3f
            android.view.View r1 = r2.f7185e
            if (r1 != r7) goto L37
            goto L65
        L37:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            r10.<init>(r0)
            throw r10
        L3f:
            r8 = 2
            if (r6 == r8) goto La8
            r2.f7184d = r8     // Catch: java.lang.Throwable -> La4
            androidx.recyclerview.widget.RecyclerView r6 = r5.f7186a     // Catch: java.lang.Throwable -> La4
            int r6 = r6.indexOfChild(r7)     // Catch: java.lang.Throwable -> La4
            r8 = -1
            if (r6 != r8) goto L51
            r2.k(r7)     // Catch: java.lang.Throwable -> La4
            goto L60
        L51:
            boolean r8 = r4.d(r6)     // Catch: java.lang.Throwable -> La4
            if (r8 == 0) goto L63
            r4.f(r6)     // Catch: java.lang.Throwable -> La4
            r2.k(r7)     // Catch: java.lang.Throwable -> La4
            r5.i(r6)     // Catch: java.lang.Throwable -> La4
        L60:
            r2.f7184d = r3
            goto L66
        L63:
            r2.f7184d = r3
        L65:
            r1 = r3
        L66:
            if (r1 == 0) goto L93
            m3.a1 r2 = androidx.recyclerview.widget.RecyclerView.L(r7)
            a3.h r4 = r0.f1232c
            r4.m(r2)
            r4.j(r2)
            boolean r2 = androidx.recyclerview.widget.RecyclerView.R0
            if (r2 == 0) goto L93
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "after removing animated view: "
            r2.<init>(r4)
            r2.append(r7)
            java.lang.String r4 = ", "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "RecyclerView"
            android.util.Log.d(r4, r2)
        L93:
            r2 = r1 ^ 1
            r0.i0(r2)
            if (r1 != 0) goto Lb0
            boolean r10 = r10.l()
            if (r10 == 0) goto Lb0
            r0.removeDetachedView(r7, r3)
            goto Lb0
        La4:
            r10 = move-exception
            r2.f7184d = r3
            throw r10
        La8:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            r10.<init>(r0)
            throw r10
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.h0.c(m3.a1):void");
    }

    public abstract void d(a1 a1Var);

    public abstract void e();

    public abstract boolean f();
}
