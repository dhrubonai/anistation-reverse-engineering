package r2;

import android.os.Parcel;
import android.os.Parcelable;
import c1.m0;
import c1.o0;
import c1.v;

/* loaded from: classes.dex */
public final class a implements o0 {
    public static final Parcelable.Creator<a> CREATOR = new q2.b(10);

    /* renamed from: a, reason: collision with root package name */
    public final long f9314a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9315b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9316c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9317d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9318e;

    public a(long j4, long j10, long j11, long j12, long j13) {
        this.f9314a = j4;
        this.f9315b = j10;
        this.f9316c = j11;
        this.f9317d = j12;
        this.f9318e = j13;
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
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f9314a == aVar.f9314a && this.f9315b == aVar.f9315b && this.f9316c == aVar.f9316c && this.f9317d == aVar.f9317d && this.f9318e == aVar.f9318e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return com.bumptech.glide.c.B(this.f9318e) + ((com.bumptech.glide.c.B(this.f9317d) + ((com.bumptech.glide.c.B(this.f9316c) + ((com.bumptech.glide.c.B(this.f9315b) + ((com.bumptech.glide.c.B(this.f9314a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f9314a + ", photoSize=" + this.f9315b + ", photoPresentationTimestampUs=" + this.f9316c + ", videoStartPosition=" + this.f9317d + ", videoSize=" + this.f9318e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f9314a);
        parcel.writeLong(this.f9315b);
        parcel.writeLong(this.f9316c);
        parcel.writeLong(this.f9317d);
        parcel.writeLong(this.f9318e);
    }

    public a(Parcel parcel) {
        this.f9314a = parcel.readLong();
        this.f9315b = parcel.readLong();
        this.f9316c = parcel.readLong();
        this.f9317d = parcel.readLong();
        this.f9318e = parcel.readLong();
    }
}
