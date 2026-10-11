package r5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.c0;
import p5.i;
import p7.a0;

/* loaded from: classes.dex */
public final class h extends c5.a {
    public static final Parcelable.Creator<h> CREATOR = new i(11);

    /* renamed from: a, reason: collision with root package name */
    public final int f9424a;

    /* renamed from: b, reason: collision with root package name */
    public final b5.a f9425b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f9426c;

    public h(int i10, b5.a aVar, c0 c0Var) {
        this.f9424a = i10;
        this.f9425b = aVar;
        this.f9426c = c0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.h0(parcel, 1, this.f9424a);
        a0.m0(parcel, 2, this.f9425b, i10, false);
        a0.m0(parcel, 3, this.f9426c, i10, false);
        a0.u0(t02, parcel);
    }
}
