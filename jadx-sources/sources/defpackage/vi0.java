package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vi0 extends cj0 {
    public final int i;
    public final boolean j;
    public final boolean k;
    public List o;
    public List p;
    public byte q;
    public byte r;
    public boolean s;
    public boolean t;
    public byte u;
    public byte v;
    public boolean x;
    public long y;
    public static final int[] z = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final zi4 h = new zi4();
    public final ArrayList m = new ArrayList();
    public ui0 n = new ui0(0, 4);
    public int w = 0;
    public final long l = 16000000;

    public vi0(String str, int i) {
        int i2;
        if ("application/x-mp4-cea-608".equals(str)) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        this.i = i2;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        kb0.O("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.k = false;
                        this.j = false;
                    } else {
                        this.k = true;
                        this.j = true;
                    }
                } else {
                    this.k = false;
                    this.j = true;
                }
            } else {
                this.k = true;
                this.j = false;
            }
        } else {
            this.k = false;
            this.j = false;
        }
        l(0);
        k();
        this.x = true;
        this.y = -9223372036854775807L;
    }

    @Override // defpackage.cj0
    public final dj0 f() {
        List list = this.o;
        this.p = list;
        list.getClass();
        return new dj0(list);
    }

    @Override // defpackage.cj0, defpackage.m61
    public final void flush() {
        super.flush();
        this.o = null;
        this.p = null;
        l(0);
        this.r = (byte) 4;
        this.n.h = (byte) 4;
        k();
        this.s = false;
        this.t = false;
        this.u = (byte) 0;
        this.v = (byte) 0;
        this.w = 0;
        this.x = true;
        this.y = -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:125:0x01c3. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:160:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[SYNTHETIC] */
    @Override // defpackage.cj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.aj0 r15) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vi0.g(aj0):void");
    }

    @Override // defpackage.cj0, defpackage.m61
    /* renamed from: h */
    public final bj0 c() {
        bj0 bj0Var;
        bj0 c = super.c();
        if (c != null) {
            return c;
        }
        long j = this.l;
        if (j != -9223372036854775807L) {
            long j2 = this.y;
            if (j2 != -9223372036854775807L && this.e - j2 >= j && (bj0Var = (bj0) this.b.pollFirst()) != null) {
                this.o = Collections.EMPTY_LIST;
                this.y = -9223372036854775807L;
                dj0 f = f();
                long j3 = this.e;
                bj0Var.z = j3;
                bj0Var.B = f;
                bj0Var.C = j3;
                return bj0Var;
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.cj0
    public final boolean i() {
        if (this.o != this.p) {
            return true;
        }
        return false;
    }

    public final ArrayList j() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            b31 c = ((ui0) arrayList.get(i2)).c(Integer.MIN_VALUE);
            arrayList2.add(c);
            if (c != null) {
                i = Math.min(i, c.i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            b31 b31Var = (b31) arrayList2.get(i3);
            if (b31Var != null) {
                if (b31Var.i != i) {
                    b31Var = ((ui0) arrayList.get(i3)).c(i);
                    b31Var.getClass();
                }
                arrayList3.add(b31Var);
            }
        }
        return arrayList3;
    }

    public final void k() {
        ui0 ui0Var = this.n;
        ui0Var.g = this.q;
        ui0Var.a.clear();
        ui0Var.b.clear();
        ui0Var.c.setLength(0);
        ui0Var.d = 15;
        ui0Var.e = 0;
        ui0Var.f = 0;
        ArrayList arrayList = this.m;
        arrayList.clear();
        arrayList.add(this.n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(int i) {
        byte b = this.q;
        if (b != i) {
            this.q = i;
            if (i == 3) {
                int i2 = 0;
                while (true) {
                    ArrayList arrayList = this.m;
                    if (i2 < arrayList.size()) {
                        ((ui0) arrayList.get(i2)).g = i;
                        i2++;
                    } else {
                        return;
                    }
                }
            } else {
                k();
                if (b != 3 && i != 1 && i != 0) {
                    return;
                }
                this.o = Collections.EMPTY_LIST;
            }
        }
    }

    @Override // defpackage.cj0, defpackage.m61
    public final void release() {
    }
}
