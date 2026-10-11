package k1;

import c1.e1;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f6322a;

    /* renamed from: b, reason: collision with root package name */
    public final e1 f6323b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6324c;

    /* renamed from: d, reason: collision with root package name */
    public final v1.w f6325d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6326e;

    /* renamed from: f, reason: collision with root package name */
    public final e1 f6327f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6328g;

    /* renamed from: h, reason: collision with root package name */
    public final v1.w f6329h;

    /* renamed from: i, reason: collision with root package name */
    public final long f6330i;

    /* renamed from: j, reason: collision with root package name */
    public final long f6331j;

    public b(long j4, e1 e1Var, int i10, v1.w wVar, long j10, e1 e1Var2, int i11, v1.w wVar2, long j11, long j12) {
        this.f6322a = j4;
        this.f6323b = e1Var;
        this.f6324c = i10;
        this.f6325d = wVar;
        this.f6326e = j10;
        this.f6327f = e1Var2;
        this.f6328g = i11;
        this.f6329h = wVar2;
        this.f6330i = j11;
        this.f6331j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f6322a == bVar.f6322a && this.f6324c == bVar.f6324c && this.f6326e == bVar.f6326e && this.f6328g == bVar.f6328g && this.f6330i == bVar.f6330i && this.f6331j == bVar.f6331j && q6.g.x(this.f6323b, bVar.f6323b) && q6.g.x(this.f6325d, bVar.f6325d) && q6.g.x(this.f6327f, bVar.f6327f) && q6.g.x(this.f6329h, bVar.f6329h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f6322a), this.f6323b, Integer.valueOf(this.f6324c), this.f6325d, Long.valueOf(this.f6326e), this.f6327f, Integer.valueOf(this.f6328g), this.f6329h, Long.valueOf(this.f6330i), Long.valueOf(this.f6331j)});
    }
}
