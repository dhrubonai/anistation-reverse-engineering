package r5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.b0;
import p5.i;
import p7.a0;

/* loaded from: classes.dex */
public final class g extends c5.a {
    public static final Parcelable.Creator<g> CREATOR = new i(10);

    /* renamed from: a, reason: collision with root package name */
    public final int f9422a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f9423b;

    public g(int i10, b0 b0Var) {
        this.f9422a = i10;
        this.f9423b = b0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.h0(parcel, 1, this.f9422a);
        a0.m0(parcel, 2, this.f9423b, i10, false);
        a0.u0(t02, parcel);
    }
}
