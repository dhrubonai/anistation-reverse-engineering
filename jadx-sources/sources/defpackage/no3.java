package defpackage;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class no3 implements vg6 {
    public final ql0 a;
    public final SparseArray b;
    public final long c;
    public final int d;

    public no3(SparseArray sparseArray, long j, int i, long j2, long j3) {
        ql0 ql0Var;
        int i2;
        this.b = sparseArray;
        this.c = j;
        this.d = i;
        List list = (List) sparseArray.get(i);
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            int[] iArr = new int[size];
            long[] jArr = new long[size];
            long[] jArr2 = new long[size];
            long[] jArr3 = new long[size];
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                mo3 mo3Var = (mo3) list.get(i4);
                jArr3[i4] = mo3Var.x;
                jArr[i4] = mo3Var.y;
            }
            while (true) {
                i2 = size - 1;
                if (i3 >= i2) {
                    break;
                }
                int i5 = i3 + 1;
                iArr[i3] = (int) (jArr[i5] - jArr[i3]);
                jArr2[i3] = jArr3[i5] - jArr3[i3];
                i3 = i5;
            }
            int i6 = i2;
            while (i6 > 0 && jArr3[i6] >= j) {
                i6--;
            }
            iArr[i6] = (int) ((j2 + j3) - jArr[i6]);
            jArr2[i6] = j - jArr3[i6];
            if (i6 < i2) {
                kb0.O("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i7 = i6 + 1;
                iArr = Arrays.copyOf(iArr, i7);
                jArr = Arrays.copyOf(jArr, i7);
                jArr2 = Arrays.copyOf(jArr2, i7);
                jArr3 = Arrays.copyOf(jArr3, i7);
            }
            ql0Var = new ql0(iArr, jArr, jArr2, jArr3);
        } else {
            ql0Var = null;
        }
        this.a = ql0Var;
    }

    @Override // defpackage.hf5
    public final boolean b() {
        List list = (List) this.b.get(this.d);
        if (list != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.vg6
    public final gf5 d(int i, long j) {
        int i2;
        int i3;
        SparseArray sparseArray = this.b;
        List list = (List) sparseArray.get(i);
        if ((list == null || list.isEmpty()) && i != (i2 = this.d)) {
            list = (List) sparseArray.get(i2);
        }
        if (list != null && !list.isEmpty()) {
            int d = eq6.d(list, new mo3(j, -1L, -1L), false);
            if (d != -1) {
                mo3 mo3Var = (mo3) list.get(d);
                long j2 = mo3Var.x;
                jf5 jf5Var = new jf5(j2, mo3Var.y);
                if (j2 < j && (i3 = d + 1) < list.size()) {
                    mo3 mo3Var2 = (mo3) list.get(i3);
                    return new gf5(jf5Var, new jf5(mo3Var2.x, mo3Var2.y));
                }
                return new gf5(jf5Var, jf5Var);
            }
            mo3 mo3Var3 = (mo3) list.get(0);
            jf5 jf5Var2 = new jf5(mo3Var3.x, mo3Var3.y);
            return new gf5(jf5Var2, jf5Var2);
        }
        jf5 jf5Var3 = jf5.c;
        return new gf5(jf5Var3, jf5Var3);
    }

    @Override // defpackage.hf5
    public final gf5 f(long j) {
        ql0 ql0Var = this.a;
        if (ql0Var != null) {
            return ql0Var.f(j);
        }
        jf5 jf5Var = jf5.c;
        return new gf5(jf5Var, jf5Var);
    }

    @Override // defpackage.hf5
    public final long h() {
        return this.c;
    }
}
