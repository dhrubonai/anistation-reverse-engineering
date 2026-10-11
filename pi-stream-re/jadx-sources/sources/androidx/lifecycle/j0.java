package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class j0 implements u {

    /* renamed from: z, reason: collision with root package name */
    public static final j0 f1099z = new j0();

    /* renamed from: a, reason: collision with root package name */
    public int f1100a;

    /* renamed from: b, reason: collision with root package name */
    public int f1101b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f1104e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1102c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1103d = true;

    /* renamed from: f, reason: collision with root package name */
    public final w f1105f = new w(this);

    /* renamed from: x, reason: collision with root package name */
    public final androidx.activity.b f1106x = new androidx.activity.b(this, 4);

    /* renamed from: y, reason: collision with root package name */
    public final i0 f1107y = new i0(this);

    public final void a() {
        int i10 = this.f1101b + 1;
        this.f1101b = i10;
        if (i10 == 1) {
            if (this.f1102c) {
                this.f1105f.e(n.ON_RESUME);
                this.f1102c = false;
            } else {
                Handler handler = this.f1104e;
                r6.h0.q(handler);
                handler.removeCallbacks(this.f1106x);
            }
        }
    }

    @Override // androidx.lifecycle.u
    public final p getLifecycle() {
        return this.f1105f;
    }
}
