package b2;

import android.content.Context;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final q f1386a;

    /* renamed from: b, reason: collision with root package name */
    public final y f1387b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1388c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1389d;

    /* renamed from: g, reason: collision with root package name */
    public long f1392g;

    /* renamed from: e, reason: collision with root package name */
    public int f1390e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f1391f = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f1393h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    public long f1394i = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    public float f1395j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public f1.a f1396k = f1.a.f3794a;

    public r(Context context, q qVar, long j4) {
        this.f1386a = qVar;
        this.f1388c = j4;
        this.f1387b = new y(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
    
        if (r6 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0116, code lost:
    
        if (r6 != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0121, code lost:
    
        if (r22 >= r26) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0255 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(long r20, long r22, long r24, long r26, boolean r28, q0.w r29) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.r.a(long, long, long, long, boolean, q0.w):int");
    }

    public final boolean b(boolean z9) {
        if (z9 && this.f1390e == 3) {
            this.f1394i = -9223372036854775807L;
            return true;
        }
        if (this.f1394i == -9223372036854775807L) {
            return false;
        }
        ((f1.v) this.f1396k).getClass();
        if (SystemClock.elapsedRealtime() < this.f1394i) {
            return true;
        }
        this.f1394i = -9223372036854775807L;
        return false;
    }

    public final void c() {
        long j4;
        long j10 = this.f1388c;
        if (j10 > 0) {
            ((f1.v) this.f1396k).getClass();
            j4 = SystemClock.elapsedRealtime() + j10;
        } else {
            j4 = -9223372036854775807L;
        }
        this.f1394i = j4;
    }

    public final void d(int i10) {
        this.f1390e = Math.min(this.f1390e, i10);
    }
}
