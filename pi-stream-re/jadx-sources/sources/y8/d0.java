package y8;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class d0 implements Closeable {
    public final d0 A;
    public final long B;
    public final long C;
    public final c9.e D;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.widget.w f11691a;

    /* renamed from: b, reason: collision with root package name */
    public final x f11692b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11693c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11694d;

    /* renamed from: e, reason: collision with root package name */
    public final n f11695e;

    /* renamed from: f, reason: collision with root package name */
    public final o f11696f;

    /* renamed from: x, reason: collision with root package name */
    public final f0 f11697x;

    /* renamed from: y, reason: collision with root package name */
    public final d0 f11698y;

    /* renamed from: z, reason: collision with root package name */
    public final d0 f11699z;

    public d0(androidx.appcompat.widget.w wVar, x xVar, String str, int i10, n nVar, o oVar, f0 f0Var, d0 d0Var, d0 d0Var2, d0 d0Var3, long j4, long j10, c9.e eVar) {
        this.f11691a = wVar;
        this.f11692b = xVar;
        this.f11693c = str;
        this.f11694d = i10;
        this.f11695e = nVar;
        this.f11696f = oVar;
        this.f11697x = f0Var;
        this.f11698y = d0Var;
        this.f11699z = d0Var2;
        this.A = d0Var3;
        this.B = j4;
        this.C = j10;
        this.D = eVar;
    }

    public static String a(d0 d0Var, String str) {
        d0Var.getClass();
        String b10 = d0Var.f11696f.b(str);
        if (b10 == null) {
            return null;
        }
        return b10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        f0 f0Var = this.f11697x;
        if (f0Var != null) {
            f0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    public final boolean f() {
        int i10 = this.f11694d;
        if (200 > i10 || i10 >= 300) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "Response{protocol=" + this.f11692b + ", code=" + this.f11694d + ", message=" + this.f11693c + ", url=" + ((q) this.f11691a.f681b) + '}';
    }
}
