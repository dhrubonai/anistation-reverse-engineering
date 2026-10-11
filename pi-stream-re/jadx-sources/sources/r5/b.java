package r5;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.s;
import p5.i;
import p7.a0;

/* loaded from: classes.dex */
public final class b extends c5.a implements s {
    public static final Parcelable.Creator<b> CREATOR = new i(8);

    /* renamed from: a, reason: collision with root package name */
    public final int f9417a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9418b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f9419c;

    public b(int i10, int i11, Intent intent) {
        this.f9417a = i10;
        this.f9418b = i11;
        this.f9419c = intent;
    }

    @Override // com.google.android.gms.common.api.s
    public final Status getStatus() {
        if (this.f9418b == 0) {
            return Status.f2356f;
        }
        return Status.A;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.h0(parcel, 1, this.f9417a);
        a0.h0(parcel, 2, this.f9418b);
        a0.m0(parcel, 3, this.f9419c, i10, false);
        a0.u0(t02, parcel);
    }
}
