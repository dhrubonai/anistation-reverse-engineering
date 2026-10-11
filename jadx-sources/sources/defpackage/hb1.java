package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hb1 extends hh6 {
    public static final hb1 F0 = new hb1(new gb1());
    public static final String G0;
    public static final String H0;
    public static final String I0;
    public static final String J0;
    public static final String K0;
    public static final String L0;
    public static final String M0;
    public static final String N0;
    public static final String O0;
    public static final String P0;
    public static final String Q0;
    public static final String R0;
    public static final String S0;
    public static final String T0;
    public static final String U0;
    public static final String V0;
    public static final String W0;
    public static final String X0;
    public static final String Y0;
    public final boolean A0;
    public final boolean B0;
    public final boolean C0;
    public final SparseArray D0;
    public final SparseBooleanArray E0;
    public final boolean w0;
    public final boolean x0;
    public final boolean y0;
    public final boolean z0;

    static {
        String str = eq6.a;
        G0 = Integer.toString(UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, 36);
        H0 = Integer.toString(1001, 36);
        I0 = Integer.toString(1002, 36);
        J0 = Integer.toString(1003, 36);
        K0 = Integer.toString(1004, 36);
        L0 = Integer.toString(1005, 36);
        M0 = Integer.toString(1006, 36);
        N0 = Integer.toString(1007, 36);
        O0 = Integer.toString(1008, 36);
        P0 = Integer.toString(1009, 36);
        Q0 = Integer.toString(1010, 36);
        R0 = Integer.toString(1011, 36);
        S0 = Integer.toString(1012, 36);
        T0 = Integer.toString(1013, 36);
        U0 = Integer.toString(1014, 36);
        V0 = Integer.toString(1015, 36);
        W0 = Integer.toString(1016, 36);
        X0 = Integer.toString(1017, 36);
        Y0 = Integer.toString(1018, 36);
    }

    public hb1(gb1 gb1Var) {
        super(gb1Var);
        this.w0 = gb1Var.J;
        this.x0 = gb1Var.K;
        this.y0 = gb1Var.L;
        this.z0 = gb1Var.M;
        this.A0 = gb1Var.N;
        this.B0 = gb1Var.O;
        this.C0 = gb1Var.P;
        this.D0 = gb1Var.Q;
        this.E0 = gb1Var.R;
    }

    @Override // defpackage.hh6
    public final gh6 a() {
        return new gb1(this);
    }

    @Override // defpackage.hh6
    public final Bundle c() {
        Bundle c = super.c();
        c.putBoolean(G0, this.w0);
        c.putBoolean(H0, false);
        c.putBoolean(I0, this.x0);
        c.putBoolean(U0, false);
        c.putBoolean(J0, this.y0);
        c.putBoolean(K0, false);
        c.putBoolean(L0, false);
        c.putBoolean(M0, false);
        c.putBoolean(V0, false);
        c.putBoolean(Y0, this.z0);
        c.putBoolean(W0, this.A0);
        c.putBoolean(N0, this.B0);
        c.putBoolean(O0, false);
        c.putBoolean(P0, this.C0);
        c.putBoolean(X0, false);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = this.D0;
            if (i < sparseArray2.size()) {
                int keyAt = sparseArray2.keyAt(i);
                for (Map.Entry entry : ((Map) sparseArray2.valueAt(i)).entrySet()) {
                    if (entry.getValue() == null) {
                        arrayList2.add((zg6) entry.getKey());
                        arrayList.add(Integer.valueOf(keyAt));
                    } else {
                        ov3.d();
                        return null;
                    }
                }
                c.putIntArray(Q0, jf7.L(arrayList));
                c.putParcelableArrayList(R0, kb0.L(arrayList2, new pb0((byte) 4)));
                SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>(sparseArray.size());
                if (sparseArray.size() <= 0) {
                    c.putSparseParcelableArray(S0, sparseArray3);
                    i++;
                } else {
                    sparseArray.keyAt(0);
                    h11.v(sparseArray.valueAt(0));
                    throw null;
                }
            } else {
                SparseBooleanArray sparseBooleanArray = this.E0;
                int[] iArr = new int[sparseBooleanArray.size()];
                for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
                    iArr[i2] = sparseBooleanArray.keyAt(i2);
                }
                c.putIntArray(T0, iArr);
                return c;
            }
        }
    }

    @Override // defpackage.hh6
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && hb1.class == obj.getClass()) {
                hb1 hb1Var = (hb1) obj;
                if (super.equals(hb1Var) && this.w0 == hb1Var.w0 && this.x0 == hb1Var.x0 && this.y0 == hb1Var.y0 && this.z0 == hb1Var.z0 && this.A0 == hb1Var.A0 && this.B0 == hb1Var.B0 && this.C0 == hb1Var.C0) {
                    SparseBooleanArray sparseBooleanArray = hb1Var.E0;
                    SparseBooleanArray sparseBooleanArray2 = this.E0;
                    int size = sparseBooleanArray2.size();
                    if (sparseBooleanArray.size() == size) {
                        int i = 0;
                        while (true) {
                            if (i < size) {
                                if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) < 0) {
                                    break;
                                }
                                i++;
                            } else {
                                SparseArray sparseArray = hb1Var.D0;
                                SparseArray sparseArray2 = this.D0;
                                int size2 = sparseArray2.size();
                                if (sparseArray.size() == size2) {
                                    for (int i2 = 0; i2 < size2; i2++) {
                                        int indexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                                        if (indexOfKey >= 0) {
                                            Map map = (Map) sparseArray2.valueAt(i2);
                                            Map map2 = (Map) sparseArray.valueAt(indexOfKey);
                                            if (map2.size() == map.size()) {
                                                for (Map.Entry entry : map.entrySet()) {
                                                    zg6 zg6Var = (zg6) entry.getKey();
                                                    if (map2.containsKey(zg6Var) && Objects.equals(entry.getValue(), map2.get(zg6Var))) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.hh6
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.w0 ? 1 : 0)) * 961) + (this.x0 ? 1 : 0)) * 961) + (this.y0 ? 1 : 0)) * 28629151) + (this.z0 ? 1 : 0)) * 31) + (this.A0 ? 1 : 0)) * 31) + (this.B0 ? 1 : 0)) * 961) + (this.C0 ? 1 : 0)) * 31;
    }
}
