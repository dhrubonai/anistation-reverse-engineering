package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class na6 extends zx5 {
    public CharSequence c;
    public List d;
    public nd6 e;
    public xd6 f;
    public boolean g;
    public boolean h;
    public float i;
    public float j;
    public ia3 k;
    public p82 l;
    public long m;
    public bd6 n;

    public na6() {
        super(mt5.h().g());
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.m = sx0.b(0, 0, 0, 0, 15);
    }

    @Override // defpackage.zx5
    public final void a(zx5 zx5Var) {
        zx5Var.getClass();
        na6 na6Var = (na6) zx5Var;
        this.c = na6Var.c;
        this.d = na6Var.d;
        this.e = na6Var.e;
        this.f = na6Var.f;
        this.g = na6Var.g;
        this.h = na6Var.h;
        this.i = na6Var.i;
        this.j = na6Var.j;
        this.k = na6Var.k;
        this.l = na6Var.l;
        this.m = na6Var.m;
        this.n = na6Var.n;
    }

    @Override // defpackage.zx5
    public final zx5 b() {
        return new na6();
    }

    public final String toString() {
        CharSequence charSequence = this.c;
        List list = this.d;
        nd6 nd6Var = this.e;
        xd6 xd6Var = this.f;
        boolean z = this.g;
        boolean z2 = this.h;
        float f = this.i;
        float f2 = this.j;
        ia3 ia3Var = this.k;
        p82 p82Var = this.l;
        String l = rx0.l(this.m);
        bd6 bd6Var = this.n;
        StringBuilder sb = new StringBuilder("CacheRecord(visualText=");
        sb.append((Object) charSequence);
        sb.append(", annotations=");
        sb.append(list);
        sb.append(", composition=");
        sb.append(nd6Var);
        sb.append(", textStyle=");
        sb.append(xd6Var);
        sb.append(", singleLine=");
        sb.append(z);
        sb.append(", softWrap=");
        sb.append(z2);
        sb.append(", densityValue=");
        h11.x(sb, f, ", fontScale=", f2, ", layoutDirection=");
        sb.append(ia3Var);
        sb.append(", fontFamilyResolver=");
        sb.append(p82Var);
        sb.append(", constraints=");
        sb.append(l);
        sb.append(", layoutResult=");
        sb.append(bd6Var);
        sb.append(")");
        return sb.toString();
    }
}
