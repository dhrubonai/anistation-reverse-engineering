package f;

/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3772a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f3773b;

    public /* synthetic */ r(g0 g0Var, int i10) {
        this.f3772a = i10;
        this.f3773b = g0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        if (g0.k0.c(r1) != false) goto L24;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r6 = this;
            r0 = 1
            int r1 = r6.f3772a
            r2 = 0
            f.g0 r3 = r6.f3773b
            switch(r1) {
                case 0: goto La;
                default: goto L9;
            }
        L9:
            goto L22
        La:
            int r1 = r3.f3696r0
            r0 = r0 & r1
            if (r0 == 0) goto L12
            r3.w(r2)
        L12:
            int r0 = r3.f3696r0
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L1d
            r0 = 108(0x6c, float:1.51E-43)
            r3.w(r0)
        L1d:
            r3.f3695q0 = r2
            r3.f3696r0 = r2
            return
        L22:
            android.widget.PopupWindow r1 = r3.N
            androidx.appcompat.widget.ActionBarContextView r4 = r3.M
            r5 = 55
            r1.showAtLocation(r4, r5, r2, r2)
            g0.l1 r1 = r3.P
            if (r1 == 0) goto L32
            r1.b()
        L32:
            boolean r1 = r3.R
            if (r1 == 0) goto L43
            android.view.ViewGroup r1 = r3.S
            if (r1 == 0) goto L43
            java.util.WeakHashMap r4 = g0.y0.f4277a
            boolean r1 = g0.k0.c(r1)
            if (r1 == 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L62
            androidx.appcompat.widget.ActionBarContextView r0 = r3.M
            r4 = 0
            r0.setAlpha(r4)
            androidx.appcompat.widget.ActionBarContextView r0 = r3.M
            g0.l1 r0 = g0.y0.a(r0)
            r0.a(r1)
            r3.P = r0
            f.t r1 = new f.t
            r1.<init>(r6, r2)
            r0.d(r1)
            goto L6c
        L62:
            androidx.appcompat.widget.ActionBarContextView r0 = r3.M
            r0.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r0 = r3.M
            r0.setVisibility(r2)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.r.run():void");
    }
}
