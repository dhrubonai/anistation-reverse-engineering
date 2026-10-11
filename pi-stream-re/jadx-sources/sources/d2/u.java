package d2;

/* loaded from: classes.dex */
public class u implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3192a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3193b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3194c;

    public /* synthetic */ u(Object obj, int i10, long j4) {
        this.f3192a = i10;
        this.f3194c = obj;
        this.f3193b = j4;
    }

    @Override // d2.b0
    public final boolean g() {
        switch (this.f3192a) {
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // d2.b0
    public final a0 j(long j4) {
        long j10;
        int i10 = this.f3192a;
        int i11 = 1;
        Object obj = this.f3194c;
        switch (i10) {
            case 0:
                v vVar = (v) obj;
                w7.b.w(vVar.f3205k);
                androidx.appcompat.widget.a0 a0Var = vVar.f3205k;
                long[] jArr = (long[]) a0Var.f403b;
                long[] jArr2 = (long[]) a0Var.f404c;
                int f10 = f1.b0.f(jArr, f1.b0.i((vVar.f3199e * j4) / 1000000, 0L, vVar.f3204j - 1), false);
                long j11 = 0;
                if (f10 == -1) {
                    j10 = 0;
                } else {
                    j10 = jArr[f10];
                }
                if (f10 != -1) {
                    j11 = jArr2[f10];
                }
                long j12 = (j10 * 1000000) / ((v) obj).f3199e;
                long j13 = this.f3193b;
                c0 c0Var = new c0(j12, j11 + j13);
                if (j12 != j4 && f10 != jArr.length - 1) {
                    int i12 = f10 + 1;
                    return new a0(c0Var, new c0((jArr[i12] * 1000000) / ((v) obj).f3199e, j13 + jArr2[i12]));
                }
                return new a0(c0Var, c0Var);
            case 1:
                return (a0) obj;
            default:
                f2.b bVar = (f2.b) obj;
                a0 b10 = bVar.f3879i[0].b(j4);
                while (true) {
                    f2.e[] eVarArr = bVar.f3879i;
                    if (i11 < eVarArr.length) {
                        a0 b11 = eVarArr[i11].b(j4);
                        if (b11.f3091a.f3113b < b10.f3091a.f3113b) {
                            b10 = b11;
                        }
                        i11++;
                    } else {
                        return b10;
                    }
                }
        }
    }

    @Override // d2.b0
    public final long l() {
        switch (this.f3192a) {
            case 0:
                return ((v) this.f3194c).b();
            default:
                return this.f3193b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(long j4) {
        this(j4, 0L);
        this.f3192a = 1;
    }

    public u(long j4, long j10) {
        this.f3192a = 1;
        this.f3193b = j4;
        c0 c0Var = j10 == 0 ? c0.f3111c : new c0(0L, j10);
        this.f3194c = new a0(c0Var, c0Var);
    }
}
