package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pc1 implements l11 {
    public final l11 x;

    public pc1(l11 l11Var) {
        this.x = l11Var;
    }

    public final boolean equals(Object obj) {
        return a34.i(this.x, obj);
    }

    @Override // defpackage.l11
    public final Object fold(Object obj, ic2 ic2Var) {
        return this.x.fold(obj, ic2Var);
    }

    @Override // defpackage.l11
    public final j11 get(k11 k11Var) {
        return this.x.get(k11Var);
    }

    public final int hashCode() {
        return this.x.hashCode();
    }

    @Override // defpackage.l11
    public final l11 minusKey(k11 k11Var) {
        n11 n11Var;
        l11 minusKey = this.x.minusKey(k11Var);
        int i = lq6.b;
        h95 h95Var = h95.B;
        j11 j11Var = get(h95Var);
        n11 n11Var2 = null;
        if (j11Var instanceof n11) {
            n11Var = (n11) j11Var;
        } else {
            n11Var = null;
        }
        j11 j11Var2 = minusKey.get(h95Var);
        if (j11Var2 instanceof n11) {
            n11Var2 = (n11) j11Var2;
        }
        if ((n11Var instanceof qc1) && n11Var != n11Var2) {
            ((qc1) n11Var).z = 0;
        }
        return new pc1(minusKey);
    }

    @Override // defpackage.l11
    public final l11 plus(l11 l11Var) {
        n11 n11Var;
        l11 plus = this.x.plus(l11Var);
        int i = lq6.b;
        h95 h95Var = h95.B;
        j11 j11Var = get(h95Var);
        n11 n11Var2 = null;
        if (j11Var instanceof n11) {
            n11Var = (n11) j11Var;
        } else {
            n11Var = null;
        }
        j11 j11Var2 = plus.get(h95Var);
        if (j11Var2 instanceof n11) {
            n11Var2 = (n11) j11Var2;
        }
        if ((n11Var instanceof qc1) && n11Var != n11Var2) {
            ((qc1) n11Var).z = 0;
        }
        return new pc1(plus);
    }

    public final String toString() {
        return "ForwardingCoroutineContext(delegate=" + this.x + ")";
    }
}
