package w4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p7.a0;

/* loaded from: classes.dex */
public final class k extends c5.a {
    public static final Parcelable.Creator<k> CREATOR = new v4.b(16);

    /* renamed from: a, reason: collision with root package name */
    public final n f10979a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10980b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10981c;

    public k(n nVar, String str, int i10) {
        w7.b.s(nVar);
        this.f10979a = nVar;
        this.f10980b = str;
        this.f10981c = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!a0.q(this.f10979a, kVar.f10979a) || !a0.q(this.f10980b, kVar.f10980b) || this.f10981c != kVar.f10981c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10979a, this.f10980b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.m0(parcel, 1, this.f10979a, i10, false);
        a0.n0(parcel, 2, this.f10980b, false);
        a0.h0(parcel, 3, this.f10981c);
        a0.u0(t02, parcel);
    }
}
