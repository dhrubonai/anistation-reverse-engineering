package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ny3 extends y2 {
    public static final Parcelable.Creator<ny3> CREATOR = new c55(8);
    public final long A;
    public final long B;
    public final String C;
    public final String D;
    public final int E;
    public final int F;
    public final int x;
    public final int y;
    public final int z;

    public ny3(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.x = i;
        this.y = i2;
        this.z = i3;
        this.A = j;
        this.B = j2;
        this.C = str;
        this.D = str2;
        this.E = i4;
        this.F = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.r0(parcel, 1, 4);
        parcel.writeInt(this.x);
        z51.r0(parcel, 2, 4);
        parcel.writeInt(this.y);
        z51.r0(parcel, 3, 4);
        parcel.writeInt(this.z);
        z51.r0(parcel, 4, 8);
        parcel.writeLong(this.A);
        z51.r0(parcel, 5, 8);
        parcel.writeLong(this.B);
        z51.m0(parcel, 6, this.C);
        z51.m0(parcel, 7, this.D);
        z51.r0(parcel, 8, 4);
        parcel.writeInt(this.E);
        z51.r0(parcel, 9, 4);
        parcel.writeInt(this.F);
        z51.t0(parcel, s0);
    }
}
