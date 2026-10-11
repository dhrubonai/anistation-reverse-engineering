package defpackage;

import android.util.Pair;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bp5 {
    public final Object a;
    public final qh6 b;
    public final ar3 c;
    public final jr3 d;
    public final Object e;
    public final uq3 f;
    public final long g;
    public final long h;
    public final long i;
    public final boolean j;
    public final boolean k;
    public final long l;
    public final long m;
    public final long n;
    public final boolean o;
    public final nw2 p;
    public final long[] q;

    public bp5(ap5 ap5Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        uq3 uq3Var = ap5Var.f;
        long j = ap5Var.g;
        int i = 0;
        if (uq3Var == null) {
            if (j == -9223372036854775807L) {
                z3 = true;
            } else {
                z3 = false;
            }
            io3.m("presentationStartTimeMs can only be set if liveConfiguration != null", z3);
            if (ap5Var.h == -9223372036854775807L) {
                z4 = true;
            } else {
                z4 = false;
            }
            io3.m("windowStartTimeMs can only be set if liveConfiguration != null", z4);
            if (ap5Var.i == -9223372036854775807L) {
                z5 = true;
            } else {
                z5 = false;
            }
            io3.m("elapsedRealtimeEpochOffsetMs can only be set if liveConfiguration != null", z5);
        } else if (j != -9223372036854775807L) {
            long j2 = ap5Var.h;
            if (j2 != -9223372036854775807L) {
                if (j2 >= j) {
                    z = true;
                } else {
                    z = false;
                }
                io3.m("windowStartTimeMs can't be less than presentationStartTimeMs", z);
            }
        }
        int size = ap5Var.p.size();
        long j3 = ap5Var.m;
        if (j3 != -9223372036854775807L) {
            if (ap5Var.l <= j3) {
                z2 = true;
            } else {
                z2 = false;
            }
            io3.m("defaultPositionUs can't be greater than durationUs", z2);
        }
        this.a = ap5Var.a;
        this.b = ap5Var.b;
        this.c = ap5Var.c;
        this.d = ap5Var.d;
        this.e = ap5Var.e;
        this.f = ap5Var.f;
        this.g = ap5Var.g;
        this.h = ap5Var.h;
        this.i = ap5Var.i;
        this.j = ap5Var.j;
        this.k = ap5Var.k;
        this.l = ap5Var.l;
        this.m = ap5Var.m;
        long j4 = ap5Var.n;
        this.n = j4;
        this.o = ap5Var.o;
        nw2 nw2Var = ap5Var.p;
        this.p = nw2Var;
        long[] jArr = new long[nw2Var.size()];
        this.q = jArr;
        if (!nw2Var.isEmpty()) {
            jArr[0] = -j4;
            while (i < size - 1) {
                long[] jArr2 = this.q;
                int i2 = i + 1;
                jArr2[i2] = jArr2[i] + ((dp5) this.p.get(i)).b;
                i = i2;
            }
        }
    }

    public final Object a(int i) {
        nw2 nw2Var = this.p;
        boolean isEmpty = nw2Var.isEmpty();
        Object obj = this.a;
        if (isEmpty) {
            return obj;
        }
        return Pair.create(obj, ((dp5) nw2Var.get(i)).a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bp5) {
                bp5 bp5Var = (bp5) obj;
                if (this.a.equals(bp5Var.a) && this.b.equals(bp5Var.b) && this.c.equals(bp5Var.c) && Objects.equals(this.d, bp5Var.d) && Objects.equals(this.e, bp5Var.e) && Objects.equals(this.f, bp5Var.f) && this.g == bp5Var.g && this.h == bp5Var.h && this.i == bp5Var.i && this.j == bp5Var.j && this.k == bp5Var.k && this.l == bp5Var.l && this.m == bp5Var.m && this.n == bp5Var.n && this.o == bp5Var.o && this.p.equals(bp5Var.p)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.c.hashCode() + ((this.b.a.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31)) * 31;
        int i = 0;
        jr3 jr3Var = this.d;
        if (jr3Var == null) {
            hashCode = 0;
        } else {
            hashCode = jr3Var.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        Object obj = this.e;
        if (obj == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = obj.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        uq3 uq3Var = this.f;
        if (uq3Var != null) {
            i = uq3Var.hashCode();
        }
        int i4 = (i3 + i) * 31;
        long j = this.g;
        int i5 = (i4 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.h;
        int i6 = (i5 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.i;
        int i7 = (((((i6 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.j ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31;
        long j4 = this.l;
        int i8 = (i7 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.m;
        int i9 = (i8 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.n;
        return this.p.hashCode() + ((((i9 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + (this.o ? 1 : 0)) * 31);
    }
}
