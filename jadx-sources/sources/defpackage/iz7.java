package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class iz7 implements Comparable {
    public final long A;
    public final Object B;
    public final RuntimeException C;
    public final long x;
    public final String y;
    public final int z;

    public iz7(long j, String str, int i, long j2, Object obj) {
        boolean z;
        boolean z2;
        if (j != 0) {
            z = false;
        } else {
            z = true;
        }
        if (str == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        io3.n(z == z2);
        this.x = j;
        this.y = str;
        this.z = i;
        this.A = j2;
        this.B = obj;
        if (i == 5) {
            if (obj == null) {
                this.C = new NullPointerException("Null stringOrBytes");
                return;
            } else if (!(obj instanceof byte[]) && !(obj instanceof we7)) {
                this.C = new RuntimeException("Wrong stringOrBytes type: ".concat(String.valueOf(obj.getClass())));
                return;
            } else {
                this.C = null;
                return;
            }
        }
        this.C = null;
    }

    public final Object a() {
        int i = this.z;
        if (i != 0) {
            if (i != 1) {
                long j = this.A;
                if (i != 2) {
                    if (i != 3) {
                        Object obj = this.B;
                        if (i != 4) {
                            if (i == 5) {
                                obj.getClass();
                                try {
                                    if (obj instanceof byte[]) {
                                        return (byte[]) obj;
                                    }
                                    return ((we7) obj).m();
                                } catch (Throwable th) {
                                    RuntimeException runtimeException = this.C;
                                    if (runtimeException != null) {
                                        th.addSuppressed(runtimeException);
                                    }
                                    throw th;
                                }
                            }
                            throw new AssertionError("Impossible, this was validated when parsed or created");
                        }
                        obj.getClass();
                        return obj;
                    }
                    return Double.valueOf(Double.longBitsToDouble(j));
                }
                return Long.valueOf(j);
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        iz7 iz7Var = (iz7) obj;
        long j = iz7Var.x;
        long j2 = this.x;
        int compare = Long.compare(j2, j);
        if (compare == 0) {
            if (j2 != 0) {
                return 0;
            }
            String str = this.y;
            str.getClass();
            String str2 = iz7Var.y;
            str2.getClass();
            return str.compareTo(str2);
        }
        return compare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iz7)) {
            return false;
        }
        iz7 iz7Var = (iz7) obj;
        if (this.x == iz7Var.x && Objects.equals(this.y, iz7Var.y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.x), this.y);
    }

    public final String toString() {
        String str = this.y;
        if (str == null) {
            str = Long.toString(this.x);
        }
        String valueOf = String.valueOf(a());
        return qx1.q(new StringBuilder(String.valueOf(str).length() + 1 + valueOf.length()), str, ":", valueOf);
    }
}
