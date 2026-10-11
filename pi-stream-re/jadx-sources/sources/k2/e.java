package k2;

import d2.a0;
import d2.b0;
import d2.c0;
import d2.w;

/* loaded from: classes.dex */
public final class e extends w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f6431b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f6432c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, b0 b0Var, b0 b0Var2) {
        super(b0Var);
        this.f6432c = fVar;
        this.f6431b = b0Var2;
    }

    @Override // d2.w, d2.b0
    public final a0 j(long j4) {
        a0 j10 = this.f6431b.j(j4);
        c0 c0Var = j10.f3091a;
        long j11 = c0Var.f3112a;
        long j12 = c0Var.f3113b;
        long j13 = this.f6432c.f6433a;
        c0 c0Var2 = new c0(j11, j12 + j13);
        c0 c0Var3 = j10.f3092b;
        return new a0(c0Var2, new c0(c0Var3.f3112a, c0Var3.f3113b + j13));
    }
}
