package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yh7 extends y2 {
    public static final Parcelable.Creator<yh7> CREATOR = new c55((byte) 18);
    public long A;
    public boolean B;
    public String C;
    public final mm7 D;
    public long E;
    public mm7 F;
    public final long G;
    public final mm7 H;
    public String x;
    public String y;
    public e28 z;

    public yh7(yh7 yh7Var) {
        a34.x(yh7Var);
        this.x = yh7Var.x;
        this.y = yh7Var.y;
        this.z = yh7Var.z;
        this.A = yh7Var.A;
        this.B = yh7Var.B;
        this.C = yh7Var.C;
        this.D = yh7Var.D;
        this.E = yh7Var.E;
        this.F = yh7Var.F;
        this.G = yh7Var.G;
        this.H = yh7Var.H;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.m0(parcel, 2, this.x);
        z51.m0(parcel, 3, this.y);
        z51.l0(parcel, 4, this.z, i);
        long j = this.A;
        z51.r0(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z = this.B;
        z51.r0(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        z51.m0(parcel, 7, this.C);
        z51.l0(parcel, 8, this.D, i);
        long j2 = this.E;
        z51.r0(parcel, 9, 8);
        parcel.writeLong(j2);
        z51.l0(parcel, 10, this.F, i);
        z51.r0(parcel, 11, 8);
        parcel.writeLong(this.G);
        z51.l0(parcel, 12, this.H, i);
        z51.t0(parcel, s0);
    }

    public yh7(String str, String str2, e28 e28Var, long j, boolean z, String str3, mm7 mm7Var, long j2, mm7 mm7Var2, long j3, mm7 mm7Var3) {
        this.x = str;
        this.y = str2;
        this.z = e28Var;
        this.A = j;
        this.B = z;
        this.C = str3;
        this.D = mm7Var;
        this.E = j2;
        this.F = mm7Var2;
        this.G = j3;
        this.H = mm7Var3;
    }
}
