package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public class d13 implements Iterable, j73 {
    public final int x;
    public final int y;
    public final int z;

    public d13(int i, int i2, int i3) {
        if (i3 != 0) {
            if (i3 != Integer.MIN_VALUE) {
                this.x = i;
                this.y = x97.E(i, i2, i3);
                this.z = i3;
                return;
            }
            ze0.k("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        ze0.k("Step must be non-zero.");
        throw null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d13) {
            if (!isEmpty() || !((d13) obj).isEmpty()) {
                d13 d13Var = (d13) obj;
                if (this.x == d13Var.x && this.y == d13Var.y && this.z == d13Var.z) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.x * 31) + this.y) * 31) + this.z;
    }

    public boolean isEmpty() {
        int i = this.y;
        int i2 = this.z;
        int i3 = this.x;
        if (i2 > 0) {
            if (i3 <= i) {
                return false;
            }
            return true;
        }
        if (i3 >= i) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new e13(this.x, this.y, this.z);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.y;
        int i2 = this.z;
        int i3 = this.x;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
