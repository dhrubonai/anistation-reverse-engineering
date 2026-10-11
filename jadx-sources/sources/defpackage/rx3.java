package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rx3 implements d31 {
    public static final cv0 b = new cv0(new rb0(new pb0((byte) 13), w64.y), new rb0(new pb0((byte) 14), w64.z));
    public final ArrayList a = new ArrayList();

    @Override // defpackage.d31
    public final long a(long j) {
        int i = 0;
        long j2 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                break;
            }
            long j3 = ((e31) arrayList.get(i)).b;
            long j4 = ((e31) arrayList.get(i)).d;
            if (j < j3) {
                if (j2 == -9223372036854775807L) {
                    j2 = j3;
                } else {
                    j2 = Math.min(j2, j3);
                }
            } else {
                if (j < j4) {
                    if (j2 == -9223372036854775807L) {
                        j2 = j4;
                    } else {
                        j2 = Math.min(j2, j4);
                    }
                }
                i++;
            }
        }
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.d31
    public final boolean b(e31 e31Var, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        long j2 = e31Var.b;
        if (j2 != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        if (e31Var.c != -9223372036854775807L) {
            z2 = true;
        } else {
            z2 = false;
        }
        io3.n(z2);
        if (j2 <= j && j < e31Var.d) {
            z3 = true;
        } else {
            z3 = false;
        }
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((e31) arrayList.get(size)).b) {
                arrayList.add(size + 1, e31Var);
                return z3;
            }
        }
        arrayList.add(0, e31Var);
        return z3;
    }

    @Override // defpackage.d31
    public final nw2 c(long j) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j >= ((e31) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    e31 e31Var = (e31) arrayList.get(i);
                    if (j >= e31Var.b && j < e31Var.d) {
                        arrayList2.add(e31Var);
                    }
                    if (j < e31Var.b) {
                        break;
                    }
                }
                o15 w = nw2.w(arrayList2, b);
                jw2 k = nw2.k();
                for (int i2 = 0; i2 < w.A; i2++) {
                    k.d(((e31) w.get(i2)).a);
                }
                return k.g();
            }
        }
        z62 z62Var = nw2.y;
        return o15.B;
    }

    @Override // defpackage.d31
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.d31
    public final long d(long j) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j >= ((e31) arrayList.get(0)).b) {
                long j2 = ((e31) arrayList.get(0)).b;
                for (int i = 0; i < arrayList.size(); i++) {
                    long j3 = ((e31) arrayList.get(i)).b;
                    long j4 = ((e31) arrayList.get(i)).d;
                    if (j4 <= j) {
                        j2 = Math.max(j2, j4);
                    } else {
                        if (j3 > j) {
                            break;
                        }
                        j2 = Math.max(j2, j3);
                    }
                }
                return j2;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.d31
    public final void e(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i < arrayList.size()) {
                long j2 = ((e31) arrayList.get(i)).b;
                if (j > j2 && j > ((e31) arrayList.get(i)).d) {
                    arrayList.remove(i);
                    i--;
                } else if (j < j2) {
                    return;
                }
                i++;
            } else {
                return;
            }
        }
    }
}
