package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hq0 implements l11, Serializable {
    public final l11 x;
    public final j11 y;

    public hq0(j11 j11Var, l11 l11Var) {
        l11Var.getClass();
        this.x = l11Var;
        this.y = j11Var;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (obj instanceof hq0) {
                hq0 hq0Var = (hq0) obj;
                int i = 2;
                hq0 hq0Var2 = hq0Var;
                int i2 = 2;
                while (true) {
                    l11 l11Var = hq0Var2.x;
                    if (l11Var instanceof hq0) {
                        hq0Var2 = (hq0) l11Var;
                    } else {
                        hq0Var2 = null;
                    }
                    if (hq0Var2 == null) {
                        break;
                    }
                    i2++;
                }
                hq0 hq0Var3 = this;
                while (true) {
                    l11 l11Var2 = hq0Var3.x;
                    if (l11Var2 instanceof hq0) {
                        hq0Var3 = (hq0) l11Var2;
                    } else {
                        hq0Var3 = null;
                    }
                    if (hq0Var3 == null) {
                        break;
                    }
                    i++;
                }
                if (i2 == i) {
                    while (true) {
                        j11 j11Var = this.y;
                        if (!a34.i(hq0Var.get(j11Var.getKey()), j11Var)) {
                            z = false;
                            break;
                        }
                        l11 l11Var3 = this.x;
                        if (l11Var3 instanceof hq0) {
                            this = (hq0) l11Var3;
                        } else {
                            l11Var3.getClass();
                            j11 j11Var2 = (j11) l11Var3;
                            z = a34.i(hq0Var.get(j11Var2.getKey()), j11Var2);
                            break;
                        }
                    }
                    if (z) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.l11
    public final Object fold(Object obj, ic2 ic2Var) {
        return ic2Var.invoke(this.x.fold(obj, ic2Var), this.y);
    }

    @Override // defpackage.l11
    public final j11 get(k11 k11Var) {
        k11Var.getClass();
        while (true) {
            j11 j11Var = this.y.get(k11Var);
            if (j11Var != null) {
                return j11Var;
            }
            l11 l11Var = this.x;
            if (l11Var instanceof hq0) {
                this = (hq0) l11Var;
            } else {
                return l11Var.get(k11Var);
            }
        }
    }

    public final int hashCode() {
        return this.y.hashCode() + this.x.hashCode();
    }

    @Override // defpackage.l11
    public final l11 minusKey(k11 k11Var) {
        k11Var.getClass();
        j11 j11Var = this.y;
        j11 j11Var2 = j11Var.get(k11Var);
        l11 l11Var = this.x;
        if (j11Var2 != null) {
            return l11Var;
        }
        l11 minusKey = l11Var.minusKey(k11Var);
        if (minusKey == l11Var) {
            return this;
        }
        if (minusKey == it1.x) {
            return j11Var;
        }
        return new hq0(j11Var, minusKey);
    }

    @Override // defpackage.l11
    public final l11 plus(l11 l11Var) {
        l11Var.getClass();
        if (l11Var == it1.x) {
            return this;
        }
        return (l11) l11Var.fold(this, new st0((byte) 4));
    }

    public final String toString() {
        return qx1.p(new StringBuilder("["), (String) fold("", new vs0((byte) 24)), ']');
    }
}
