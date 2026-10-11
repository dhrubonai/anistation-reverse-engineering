package g1;

import android.os.Parcel;
import android.os.Parcelable;
import c1.m0;
import c1.o0;
import c1.v;

/* loaded from: classes.dex */
public final class c implements o0 {
    public static final Parcelable.Creator<c> CREATOR = new android.support.v4.media.a(20);

    /* renamed from: a, reason: collision with root package name */
    public final long f4299a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4300b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4301c;

    public c(long j4, long j10, long j11) {
        this.f4299a = j4;
        this.f4300b = j10;
        this.f4301c = j11;
    }

    @Override // c1.o0
    public final /* synthetic */ void a(m0 m0Var) {
    }

    @Override // c1.o0
    public final /* synthetic */ v b() {
        return null;
    }

    @Override // c1.o0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f4299a == cVar.f4299a && this.f4300b == cVar.f4300b && this.f4301c == cVar.f4301c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return com.bumptech.glide.c.B(this.f4301c) + ((com.bumptech.glide.c.B(this.f4300b) + ((com.bumptech.glide.c.B(this.f4299a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f4299a + ", modification time=" + this.f4300b + ", timescale=" + this.f4301c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f4299a);
        parcel.writeLong(this.f4300b);
        parcel.writeLong(this.f4301c);
    }

    public c(Parcel parcel) {
        this.f4299a = parcel.readLong();
        this.f4300b = parcel.readLong();
        this.f4301c = parcel.readLong();
    }
}
