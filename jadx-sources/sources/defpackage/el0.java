package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class el0 implements Iterable, j73 {
    public final char x;
    public final char y;

    static {
        new el0((char) 1, (char) 0);
    }

    public el0(char c, char c2) {
        this.x = c;
        this.y = (char) x97.E(c, c2, 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof el0) {
            if (!isEmpty() || !((el0) obj).isEmpty()) {
                el0 el0Var = (el0) obj;
                if (this.x == el0Var.x && this.y == el0Var.y) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.x * 31) + this.y;
    }

    public final boolean isEmpty() {
        if (this.x > this.y) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new dl0(this.x, this.y);
    }

    public final String toString() {
        return this.x + ".." + this.y;
    }
}
