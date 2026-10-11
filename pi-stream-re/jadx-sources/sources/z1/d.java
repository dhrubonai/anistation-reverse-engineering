package z1;

import f1.b0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public int f11895c;

    /* renamed from: d, reason: collision with root package name */
    public int f11896d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11893a = true;

    /* renamed from: b, reason: collision with root package name */
    public final int f11894b = 65536;

    /* renamed from: e, reason: collision with root package name */
    public int f11897e = 0;

    /* renamed from: f, reason: collision with root package name */
    public a[] f11898f = new a[100];

    public final synchronized void a(int i10) {
        boolean z9;
        if (i10 < this.f11895c) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f11895c = i10;
        if (z9) {
            b();
        }
    }

    public final synchronized void b() {
        int i10 = this.f11895c;
        int i11 = this.f11894b;
        int i12 = b0.f3799a;
        int max = Math.max(0, (((i10 + i11) - 1) / i11) - this.f11896d);
        int i13 = this.f11897e;
        if (max >= i13) {
            return;
        }
        Arrays.fill(this.f11898f, max, i13, (Object) null);
        this.f11897e = max;
    }
}
