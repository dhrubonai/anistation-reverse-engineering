package r2;

import android.os.Parcel;
import android.os.Parcelable;
import c1.m0;
import c1.o0;
import c1.v;

/* loaded from: classes.dex */
public final class d implements o0 {
    public static final Parcelable.Creator<d> CREATOR = new q2.b(13);

    /* renamed from: a, reason: collision with root package name */
    public final float f9323a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9324b;

    public d(int i10, float f10) {
        this.f9323a = f10;
        this.f9324b = i10;
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
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f9323a == dVar.f9323a && this.f9324b == dVar.f9324b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f9323a).hashCode() + 527) * 31) + this.f9324b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f9323a + ", svcTemporalLayerCount=" + this.f9324b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f9323a);
        parcel.writeInt(this.f9324b);
    }

    public d(Parcel parcel) {
        this.f9323a = parcel.readFloat();
        this.f9324b = parcel.readInt();
    }
}
