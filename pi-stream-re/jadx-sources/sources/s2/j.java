package s2;

import android.os.Parcel;
import android.os.Parcelable;
import f1.t;

/* loaded from: classes.dex */
public final class j extends b {
    public static final Parcelable.Creator<j> CREATOR = new q2.b(18);

    /* renamed from: a, reason: collision with root package name */
    public final long f9884a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9885b;

    public j(long j4, long j10) {
        this.f9884a = j4;
        this.f9885b = j10;
    }

    public static long d(long j4, t tVar) {
        long v9 = tVar.v();
        if ((128 & v9) != 0) {
            return 8589934591L & ((((v9 & 1) << 32) | tVar.w()) + j4);
        }
        return -9223372036854775807L;
    }

    @Override // s2.b
    public final String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.f9884a + ", playbackPositionUs= " + this.f9885b + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f9884a);
        parcel.writeLong(this.f9885b);
    }
}
