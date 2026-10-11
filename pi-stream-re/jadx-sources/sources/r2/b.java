package r2;

import android.os.Parcel;
import android.os.Parcelable;
import f1.b0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new q2.b(12);

    /* renamed from: a, reason: collision with root package name */
    public final long f9319a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9320b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9321c;

    public b(int i10, long j4, long j10) {
        boolean z9;
        if (j4 < j10) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.g(z9);
        this.f9319a = j4;
        this.f9320b = j10;
        this.f9321c = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f9319a == bVar.f9319a && this.f9320b == bVar.f9320b && this.f9321c == bVar.f9321c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f9319a), Long.valueOf(this.f9320b), Integer.valueOf(this.f9321c)});
    }

    public final String toString() {
        return b0.m("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f9319a), Long.valueOf(this.f9320b), Integer.valueOf(this.f9321c));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f9319a);
        parcel.writeLong(this.f9320b);
        parcel.writeInt(this.f9321c);
    }
}
