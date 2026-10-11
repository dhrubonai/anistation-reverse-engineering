package w4;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p7.a0;

/* loaded from: classes.dex */
public final class j extends c5.a {
    public static final Parcelable.Creator<j> CREATOR = new v4.b(15);

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f10978a;

    public j(PendingIntent pendingIntent) {
        this.f10978a = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        return a0.q(this.f10978a, ((j) obj).f10978a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10978a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.m0(parcel, 1, this.f10978a, i10, false);
        a0.u0(t02, parcel);
    }
}
