package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class so7 extends y2 {
    public static final Parcelable.Creator<so7> CREATOR = new an7(13);
    public final Bundle A;
    public final String B;
    public final long x;
    public final long y;
    public final boolean z;

    public so7(long j, long j2, boolean z, Bundle bundle, String str) {
        this.x = j;
        this.y = j2;
        this.z = z;
        this.A = bundle;
        this.B = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.r0(parcel, 1, 8);
        parcel.writeLong(this.x);
        z51.r0(parcel, 2, 8);
        parcel.writeLong(this.y);
        z51.r0(parcel, 3, 4);
        parcel.writeInt(this.z ? 1 : 0);
        z51.Z(parcel, 7, this.A);
        z51.m0(parcel, 8, this.B);
        z51.t0(parcel, s0);
    }
}
