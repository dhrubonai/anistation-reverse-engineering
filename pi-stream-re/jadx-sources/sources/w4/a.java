package w4;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p7.a0;

/* loaded from: classes.dex */
public final class a extends c5.a {
    public static final Parcelable.Creator<a> CREATOR = new v4.b(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f10944a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10945b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10946c;

    /* renamed from: d, reason: collision with root package name */
    public final List f10947d;

    /* renamed from: e, reason: collision with root package name */
    public final GoogleSignInAccount f10948e;

    /* renamed from: f, reason: collision with root package name */
    public final PendingIntent f10949f;

    public a(String str, String str2, String str3, ArrayList arrayList, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent) {
        this.f10944a = str;
        this.f10945b = str2;
        this.f10946c = str3;
        w7.b.s(arrayList);
        this.f10947d = arrayList;
        this.f10949f = pendingIntent;
        this.f10948e = googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!a0.q(this.f10944a, aVar.f10944a) || !a0.q(this.f10945b, aVar.f10945b) || !a0.q(this.f10946c, aVar.f10946c) || !a0.q(this.f10947d, aVar.f10947d) || !a0.q(this.f10949f, aVar.f10949f) || !a0.q(this.f10948e, aVar.f10948e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10944a, this.f10945b, this.f10946c, this.f10947d, this.f10949f, this.f10948e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.n0(parcel, 1, this.f10944a, false);
        a0.n0(parcel, 2, this.f10945b, false);
        a0.n0(parcel, 3, this.f10946c, false);
        a0.p0(parcel, 4, this.f10947d);
        a0.m0(parcel, 5, this.f10948e, i10, false);
        a0.m0(parcel, 6, this.f10949f, i10, false);
        a0.u0(t02, parcel);
    }
}
