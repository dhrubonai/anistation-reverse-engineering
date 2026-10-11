package b2;

import android.view.Surface;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final f f1404a = new f();

    /* renamed from: b, reason: collision with root package name */
    public final v f1405b;

    /* renamed from: c, reason: collision with root package name */
    public final x f1406c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1407d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f1408e;

    /* renamed from: f, reason: collision with root package name */
    public float f1409f;

    /* renamed from: g, reason: collision with root package name */
    public float f1410g;

    /* renamed from: h, reason: collision with root package name */
    public float f1411h;

    /* renamed from: i, reason: collision with root package name */
    public float f1412i;

    /* renamed from: j, reason: collision with root package name */
    public int f1413j;

    /* renamed from: k, reason: collision with root package name */
    public long f1414k;

    /* renamed from: l, reason: collision with root package name */
    public long f1415l;

    /* renamed from: m, reason: collision with root package name */
    public long f1416m;

    /* renamed from: n, reason: collision with root package name */
    public long f1417n;
    public long o;

    /* renamed from: p, reason: collision with root package name */
    public long f1418p;

    /* renamed from: q, reason: collision with root package name */
    public long f1419q;

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            b2.f r0 = new b2.f
            r0.<init>()
            r3.f1404a = r0
            r0 = 0
            if (r4 == 0) goto L3a
            android.content.Context r4 = r4.getApplicationContext()
            int r1 = f1.b0.f3799a
            r2 = 17
            if (r1 < r2) goto L27
            java.lang.String r1 = "display"
            java.lang.Object r1 = r4.getSystemService(r1)
            android.hardware.display.DisplayManager r1 = (android.hardware.display.DisplayManager) r1
            if (r1 == 0) goto L27
            b2.w r2 = new b2.w
            r2.<init>(r1)
            goto L28
        L27:
            r2 = r0
        L28:
            if (r2 != 0) goto L3b
            java.lang.String r1 = "window"
            java.lang.Object r4 = r4.getSystemService(r1)
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            if (r4 == 0) goto L3a
            androidx.fragment.app.o r2 = new androidx.fragment.app.o
            r2.<init>(r4)
            goto L3b
        L3a:
            r2 = r0
        L3b:
            r3.f1405b = r2
            if (r2 == 0) goto L41
            b2.x r0 = b2.x.f1399e
        L41:
            r3.f1406c = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.f1414k = r0
            r3.f1415l = r0
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.f1409f = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.f1412i = r4
            r4 = 0
            r3.f1413j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.y.<init>(android.content.Context):void");
    }

    public final void a() {
        Surface surface;
        if (f1.b0.f3799a >= 30 && (surface = this.f1408e) != null && this.f1413j != Integer.MIN_VALUE && this.f1411h != 0.0f) {
            this.f1411h = 0.0f;
            u.a(surface, 0.0f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (java.lang.Math.abs(r2 - r9.f1410g) < r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0084, code lost:
    
        if (r0.f1342e >= 30) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r9 = this;
            int r0 = f1.b0.f3799a
            r1 = 30
            if (r0 < r1) goto L8f
            android.view.Surface r0 = r9.f1408e
            if (r0 != 0) goto Lc
            goto L8f
        Lc:
            b2.f r0 = r9.f1404a
            boolean r2 = r0.a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L35
            boolean r2 = r0.a()
            if (r2 == 0) goto L33
            b2.e r2 = r0.f1338a
            long r4 = r2.f1332e
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L27
            goto L2a
        L27:
            long r6 = r2.f1333f
            long r6 = r6 / r4
        L2a:
            double r4 = (double) r6
            r6 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r6 = r6 / r4
            float r2 = (float) r6
            goto L37
        L33:
            r2 = r3
            goto L37
        L35:
            float r2 = r9.f1409f
        L37:
            float r4 = r9.f1410g
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L3e
            return
        L3e:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L7f
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L7f
            boolean r1 = r0.a()
            if (r1 == 0) goto L69
            boolean r1 = r0.a()
            if (r1 == 0) goto L59
            b2.e r0 = r0.f1338a
            long r0 = r0.f1333f
            goto L5e
        L59:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L5e:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L69
            r0 = r7
            goto L6a
        L69:
            r0 = r6
        L6a:
            if (r0 == 0) goto L70
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            goto L72
        L70:
            r0 = 1065353216(0x3f800000, float:1.0)
        L72:
            float r1 = r9.f1410g
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L87
            goto L88
        L7f:
            if (r5 == 0) goto L82
            goto L88
        L82:
            int r0 = r0.f1342e
            if (r0 < r1) goto L87
            goto L88
        L87:
            r7 = r6
        L88:
            if (r7 == 0) goto L8f
            r9.f1410g = r2
            r9.c(r6)
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.y.b():void");
    }

    public final void c(boolean z9) {
        Surface surface;
        float f10;
        if (f1.b0.f3799a >= 30 && (surface = this.f1408e) != null && this.f1413j != Integer.MIN_VALUE) {
            if (this.f1407d) {
                float f11 = this.f1410g;
                if (f11 != -1.0f) {
                    f10 = f11 * this.f1412i;
                    if (z9 && this.f1411h == f10) {
                        return;
                    }
                    this.f1411h = f10;
                    u.a(surface, f10);
                }
            }
            f10 = 0.0f;
            if (z9) {
            }
            this.f1411h = f10;
            u.a(surface, f10);
        }
    }
}
