package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class o0 extends c5.a {
    public static final Parcelable.Creator<o0> CREATOR = new t0(12);

    /* renamed from: a, reason: collision with root package name */
    public final int f8265a;

    /* renamed from: b, reason: collision with root package name */
    public final short f8266b;

    /* renamed from: c, reason: collision with root package name */
    public final short f8267c;

    public o0(int i10, short s9, short s10) {
        this.f8265a = i10;
        this.f8266b = s9;
        this.f8267c = s10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        if (this.f8265a != o0Var.f8265a || this.f8266b != o0Var.f8266b || this.f8267c != o0Var.f8267c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8265a), Short.valueOf(this.f8266b), Short.valueOf(this.f8267c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = p7.a0.t0(20293, parcel);
        p7.a0.h0(parcel, 1, this.f8265a);
        parcel.writeInt(262146);
        parcel.writeInt(this.f8266b);
        parcel.writeInt(262147);
        parcel.writeInt(this.f8267c);
        p7.a0.u0(t02, parcel);
    }
}
