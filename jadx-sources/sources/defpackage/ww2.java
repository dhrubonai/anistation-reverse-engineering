package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ww2 extends zw2 {
    public final /* synthetic */ byte A;
    public final /* synthetic */ xw2 B;

    public /* synthetic */ ww2(xw2 xw2Var, byte b) {
        this.A = b;
        this.B = xw2Var;
    }

    @Override // defpackage.gw2
    public final int c(Object[] objArr, int i) {
        return b().c(objArr, i);
    }

    @Override // defpackage.gw2, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.A;
        xw2 xw2Var = this.B;
        switch (b) {
            case 0:
                if (obj instanceof yb4) {
                    yb4 yb4Var = (yb4) obj;
                    if (yb4Var.a() > 0) {
                        if (((u15) xw2Var).B.b(yb4Var.a) == yb4Var.a()) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return ((u15) xw2Var).contains(obj);
        }
    }

    @Override // defpackage.gw2
    public final boolean h() {
        switch (this.A) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.zw2, java.util.Collection, java.util.Set
    public int hashCode() {
        switch (this.A) {
            case 0:
                return this.B.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: i */
    public final ho6 iterator() {
        return b().listIterator(0);
    }

    @Override // defpackage.zw2
    public final nw2 n() {
        return new wx2(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        byte b = this.A;
        xw2 xw2Var = this.B;
        switch (b) {
            case 0:
                return xw2Var.j().size();
            default:
                return ((u15) xw2Var).B.c;
        }
    }
}
