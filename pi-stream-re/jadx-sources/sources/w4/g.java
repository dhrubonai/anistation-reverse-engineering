package w4;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p7.a0;

/* loaded from: classes.dex */
public final class g extends c5.a {
    public static final Parcelable.Creator<g> CREATOR = new v4.b(7);

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f10970a;

    public g(PendingIntent pendingIntent) {
        w7.b.s(pendingIntent);
        this.f10970a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.m0(parcel, 1, this.f10970a, i10, false);
        a0.u0(t02, parcel);
    }
}
