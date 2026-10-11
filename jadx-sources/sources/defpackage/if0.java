package defpackage;

import java.util.ArrayList;
import java.util.TreeSet;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class if0 {
    public final int a;
    public final String b;
    public final TreeSet c = new TreeSet();
    public final ArrayList d = new ArrayList();
    public r71 e;

    public if0(int i, String str, r71 r71Var) {
        this.a = i;
        this.b = str;
        this.e = r71Var;
    }

    public final long a(long j, long j2) {
        boolean z;
        boolean z2 = true;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        if (j2 < 0) {
            z2 = false;
        }
        io3.n(z2);
        mp5 b = b(j, j2);
        long j3 = b.z;
        long j4 = Long.MAX_VALUE;
        if (!b.A) {
            if (j3 == -1) {
                j3 = Long.MAX_VALUE;
            }
            return -Math.min(j3, j2);
        }
        long j5 = j + j2;
        if (j5 >= 0) {
            j4 = j5;
        }
        long j6 = b.y + j3;
        if (j6 < j4) {
            for (mp5 mp5Var : this.c.tailSet(b, false)) {
                long j7 = mp5Var.y;
                if (j7 > j6) {
                    break;
                }
                j6 = Math.max(j6, j7 + mp5Var.z);
                if (j6 >= j4) {
                    break;
                }
            }
        }
        return Math.min(j6 - j, j2);
    }

    public final mp5 b(long j, long j2) {
        long j3 = j2;
        mp5 mp5Var = new mp5(this.b, j, -1L, -9223372036854775807L, null);
        TreeSet treeSet = this.c;
        mp5 mp5Var2 = (mp5) treeSet.floor(mp5Var);
        if (mp5Var2 != null && mp5Var2.y + mp5Var2.z > j) {
            return mp5Var2;
        }
        mp5 mp5Var3 = (mp5) treeSet.ceiling(mp5Var);
        if (mp5Var3 != null) {
            long j4 = mp5Var3.y - j;
            if (j3 == -1) {
                j3 = j4;
            } else {
                j3 = Math.min(j4, j3);
            }
        }
        return new mp5(this.b, j, j3, -9223372036854775807L, null);
    }

    public final boolean c(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return false;
            }
            hf0 hf0Var = (hf0) arrayList.get(i);
            long j3 = hf0Var.a;
            long j4 = hf0Var.b;
            if (j4 == -1) {
                if (j >= j3) {
                    return true;
                }
            } else if (j2 != -1 && j3 <= j && j + j2 <= j3 + j4) {
                return true;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && if0.class == obj.getClass()) {
                if0 if0Var = (if0) obj;
                if (this.a == if0Var.a && this.b.equals(if0Var.b) && this.c.equals(if0Var.c) && this.e.equals(if0Var.e)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode() + zo5.i(this.b, this.a * 31, 31);
    }
}
