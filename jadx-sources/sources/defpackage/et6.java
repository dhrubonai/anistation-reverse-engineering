package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.Surface;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class et6 {
    public final Context a;
    public boolean b;
    public at6 c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h = 1.0f;
    public int i = 0;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;

    public et6(Context context) {
        this.a = context;
    }

    public final void a() {
        Surface surface;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.e) != null && this.i != Integer.MIN_VALUE && this.g != 0.0f && surface.isValid()) {
            this.g = 0.0f;
            try {
                this.e.setFrameRate(0.0f, 0);
            } catch (IllegalStateException e) {
                kb0.t("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    public final void b() {
        this.o = -1L;
        this.l = -1L;
        this.n = -9223372036854775807L;
        this.j = 0L;
        this.k = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(boolean r4) {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L49
            android.view.Surface r0 = r3.e
            if (r0 == 0) goto L49
            int r1 = r3.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L49
            boolean r0 = r0.isValid()
            if (r0 != 0) goto L17
            goto L49
        L17:
            boolean r0 = r3.d
            r1 = 0
            if (r0 == 0) goto L28
            float r0 = r3.f
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L28
            float r2 = r3.h
            float r0 = r0 * r2
            goto L29
        L28:
            r0 = r1
        L29:
            if (r4 != 0) goto L32
            float r4 = r3.g
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L32
            goto L49
        L32:
            r3.g = r0
            android.view.Surface r3 = r3.e
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 != 0) goto L3c
            r4 = 0
            goto L3d
        L3c:
            r4 = 1
        L3d:
            defpackage.pu5.m(r3, r0, r4)     // Catch: java.lang.IllegalStateException -> L41
            return
        L41:
            r3 = move-exception
            java.lang.String r4 = "VideoFrameReleaseHelper"
            java.lang.String r0 = "Failed to call Surface.setFrameRate"
            defpackage.kb0.t(r4, r0, r3)
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.et6.c(boolean):void");
    }
}
