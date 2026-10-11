package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class di0 extends y2 {
    public static final Parcelable.Creator<di0> CREATOR;
    public static final qw7 P = new qw7(false);
    public static final my7 Q = new my7(0);
    public static final zh0 R;
    public final aa3 A;
    public final boolean B;
    public final zh0 C;
    public final boolean D;
    public final double E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final List I;
    public final boolean J;
    public final boolean K;
    public final qw7 L;
    public my7 M;
    public final boolean N;
    public final boolean O;
    public final String x;
    public final ArrayList y;
    public final boolean z;

    static {
        new nb4().a();
        R = new zh0("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, null, false, false);
        CREATOR = new aw7((byte) 9);
    }

    public di0(String str, ArrayList arrayList, boolean z, aa3 aa3Var, boolean z2, zh0 zh0Var, boolean z3, double d, boolean z4, boolean z5, boolean z6, ArrayList arrayList2, boolean z7, boolean z8, qw7 qw7Var, my7 my7Var, boolean z9, boolean z10) {
        int size;
        this.x = true == TextUtils.isEmpty(str) ? "" : str;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        ArrayList arrayList3 = new ArrayList(size);
        this.y = arrayList3;
        if (size > 0) {
            arrayList3.addAll(arrayList);
        }
        this.z = z;
        this.A = aa3Var == null ? new aa3() : aa3Var;
        this.B = z2;
        this.C = zh0Var;
        this.D = z3;
        this.E = d;
        this.F = z4;
        this.G = z5;
        this.H = z6;
        this.I = arrayList2;
        this.J = z7;
        this.K = z8;
        this.L = qw7Var;
        this.M = my7Var;
        this.N = z9;
        this.O = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.m0(parcel, 2, this.x);
        z51.n0(parcel, 3, Collections.unmodifiableList(this.y));
        z51.r0(parcel, 4, 4);
        parcel.writeInt(this.z ? 1 : 0);
        z51.l0(parcel, 5, this.A, i);
        z51.r0(parcel, 6, 4);
        parcel.writeInt(this.B ? 1 : 0);
        z51.l0(parcel, 7, this.C, i);
        z51.r0(parcel, 8, 4);
        parcel.writeInt(this.D ? 1 : 0);
        z51.r0(parcel, 9, 8);
        parcel.writeDouble(this.E);
        z51.r0(parcel, 10, 4);
        parcel.writeInt(this.F ? 1 : 0);
        z51.r0(parcel, 11, 4);
        parcel.writeInt(this.G ? 1 : 0);
        z51.r0(parcel, 12, 4);
        parcel.writeInt(this.H ? 1 : 0);
        z51.n0(parcel, 13, Collections.unmodifiableList(this.I));
        z51.r0(parcel, 14, 4);
        parcel.writeInt(this.J ? 1 : 0);
        z51.r0(parcel, 15, 4);
        parcel.writeInt(0);
        z51.r0(parcel, 16, 4);
        parcel.writeInt(this.K ? 1 : 0);
        z51.l0(parcel, 17, this.L, i);
        z51.l0(parcel, 18, this.M, i);
        z51.r0(parcel, 19, 4);
        parcel.writeInt(this.N ? 1 : 0);
        z51.r0(parcel, 20, 4);
        parcel.writeInt(this.O ? 1 : 0);
        z51.t0(parcel, s0);
    }
}
