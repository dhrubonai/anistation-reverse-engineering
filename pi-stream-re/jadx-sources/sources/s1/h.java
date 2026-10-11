package s1;

import android.content.Context;

/* loaded from: classes.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9792a;

    /* renamed from: b, reason: collision with root package name */
    public int f9793b = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9794c = true;

    public h(Context context) {
        this.f9792a = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        if (r3 != false) goto L18;
     */
    @Override // s1.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final s1.k e(s1.i r5) {
        /*
            r4 = this;
            int r0 = f1.b0.f3799a
            r1 = 23
            r2 = 28
            if (r0 < r1) goto L57
            int r1 = r4.f9793b
            r3 = 1
            if (r1 == r3) goto L2a
            if (r1 != 0) goto L57
            r1 = 31
            if (r0 < r1) goto L14
            goto L28
        L14:
            android.content.Context r1 = r4.f9792a
            if (r1 == 0) goto L27
            if (r0 < r2) goto L27
            android.content.pm.PackageManager r0 = r1.getPackageManager()
            java.lang.String r1 = "com.amazon.hardware.tv_screen"
            boolean r0 = r0.hasSystemFeature(r1)
            if (r0 == 0) goto L27
            goto L28
        L27:
            r3 = 0
        L28:
            if (r3 == 0) goto L57
        L2a:
            c1.v r0 = r5.f9797c
            java.lang.String r0 = r0.f1935m
            int r0 = c1.q0.i(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Creating an asynchronous MediaCodec adapter for track type "
            r1.<init>(r2)
            java.lang.String r2 = f1.b0.F(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "DMCodecAdapterFactory"
            f1.o.e(r2, r1)
            i4.v r1 = new i4.v
            r1.<init>(r0)
            boolean r0 = r4.f9794c
            r1.f5380b = r0
            s1.c r5 = r1.e(r5)
            return r5
        L57:
            j6.e r0 = new j6.e
            r0.<init>(r2)
            s1.k r5 = r0.e(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.h.e(s1.i):s1.k");
    }
}
