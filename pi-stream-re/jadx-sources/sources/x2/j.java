package x2;

import androidx.appcompat.widget.a0;
import d2.g0;
import d2.r;
import f1.t;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: b, reason: collision with root package name */
    public g0 f11118b;

    /* renamed from: c, reason: collision with root package name */
    public r f11119c;

    /* renamed from: d, reason: collision with root package name */
    public h f11120d;

    /* renamed from: e, reason: collision with root package name */
    public long f11121e;

    /* renamed from: f, reason: collision with root package name */
    public long f11122f;

    /* renamed from: g, reason: collision with root package name */
    public long f11123g;

    /* renamed from: h, reason: collision with root package name */
    public int f11124h;

    /* renamed from: i, reason: collision with root package name */
    public int f11125i;

    /* renamed from: k, reason: collision with root package name */
    public long f11127k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11128l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11129m;

    /* renamed from: a, reason: collision with root package name */
    public final f f11117a = new f();

    /* renamed from: j, reason: collision with root package name */
    public a0 f11126j = new a0(16, (Object) null);

    public void a(long j4) {
        this.f11123g = j4;
    }

    public abstract long b(t tVar);

    public abstract boolean c(t tVar, long j4, a0 a0Var);

    public void d(boolean z9) {
        if (z9) {
            this.f11126j = new a0(16, (Object) null);
            this.f11122f = 0L;
            this.f11124h = 0;
        } else {
            this.f11124h = 1;
        }
        this.f11121e = -1L;
        this.f11123g = 0L;
    }
}
