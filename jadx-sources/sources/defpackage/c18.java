package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c18 extends y2 {
    public static final Parcelable.Creator<c18> CREATOR = new aw7((byte) 11);
    public final Bundle A;
    public final int B;
    public final long C;
    public String D;
    public final long x;
    public byte[] y;
    public final String z;

    public c18(long j, byte[] bArr, String str, Bundle bundle, int i, long j2, String str2) {
        this.x = j;
        this.y = bArr;
        this.z = str;
        this.A = bundle;
        this.B = i;
        this.C = j2;
        this.D = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.r0(parcel, 1, 8);
        parcel.writeLong(this.x);
        z51.a0(parcel, 2, this.y);
        z51.m0(parcel, 3, this.z);
        z51.Z(parcel, 4, this.A);
        z51.r0(parcel, 5, 4);
        parcel.writeInt(this.B);
        z51.r0(parcel, 6, 8);
        parcel.writeLong(this.C);
        z51.m0(parcel, 7, this.D);
        z51.t0(parcel, s0);
    }
}
