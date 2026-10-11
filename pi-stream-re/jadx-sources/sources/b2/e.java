package b2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public long f1328a;

    /* renamed from: b, reason: collision with root package name */
    public long f1329b;

    /* renamed from: c, reason: collision with root package name */
    public long f1330c;

    /* renamed from: d, reason: collision with root package name */
    public long f1331d;

    /* renamed from: e, reason: collision with root package name */
    public long f1332e;

    /* renamed from: f, reason: collision with root package name */
    public long f1333f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f1334g = new boolean[15];

    /* renamed from: h, reason: collision with root package name */
    public int f1335h;

    public final boolean a() {
        if (this.f1331d > 15 && this.f1335h == 0) {
            return true;
        }
        return false;
    }

    public final void b(long j4) {
        long j10 = this.f1331d;
        if (j10 == 0) {
            this.f1328a = j4;
        } else if (j10 == 1) {
            long j11 = j4 - this.f1328a;
            this.f1329b = j11;
            this.f1333f = j11;
            this.f1332e = 1L;
        } else {
            long j12 = j4 - this.f1330c;
            int i10 = (int) (j10 % 15);
            long abs = Math.abs(j12 - this.f1329b);
            boolean[] zArr = this.f1334g;
            if (abs <= 1000000) {
                this.f1332e++;
                this.f1333f += j12;
                if (zArr[i10]) {
                    zArr[i10] = false;
                    this.f1335h--;
                }
            } else if (!zArr[i10]) {
                zArr[i10] = true;
                this.f1335h++;
            }
        }
        this.f1331d++;
        this.f1330c = j4;
    }

    public final void c() {
        this.f1331d = 0L;
        this.f1332e = 0L;
        this.f1333f = 0L;
        this.f1335h = 0;
        Arrays.fill(this.f1334g, false);
    }
}
