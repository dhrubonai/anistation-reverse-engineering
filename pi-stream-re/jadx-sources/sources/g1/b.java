package g1;

import android.os.Parcel;
import android.os.Parcelable;
import c1.m0;
import c1.o0;
import c1.v;

/* loaded from: classes.dex */
public final class b implements o0 {
    public static final Parcelable.Creator<b> CREATOR = new android.support.v4.media.a(19);

    /* renamed from: a, reason: collision with root package name */
    public final float f4297a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4298b;

    public b(float f10, float f11) {
        w7.b.f("Invalid latitude or longitude", f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f);
        this.f4297a = f10;
        this.f4298b = f11;
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
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f4297a == bVar.f4297a && this.f4298b == bVar.f4298b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f4298b).hashCode() + ((Float.valueOf(this.f4297a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f4297a + ", longitude=" + this.f4298b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f4297a);
        parcel.writeFloat(this.f4298b);
    }

    public b(Parcel parcel) {
        this.f4297a = parcel.readFloat();
        this.f4298b = parcel.readFloat();
    }
}
