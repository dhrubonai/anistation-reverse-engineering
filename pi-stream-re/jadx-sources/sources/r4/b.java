package r4;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p7.a0;

/* loaded from: classes.dex */
public final class b extends c5.a {
    public static final Parcelable.Creator<b> CREATOR = new v4.b(28);

    /* renamed from: a, reason: collision with root package name */
    public final int f9407a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9408b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9409c;

    /* renamed from: d, reason: collision with root package name */
    public final Account f9410d;

    public b(int i10, int i11, String str, Account account) {
        this.f9407a = i10;
        this.f9408b = i11;
        this.f9409c = str;
        if (account == null && !TextUtils.isEmpty(str)) {
            this.f9410d = new Account(str, "com.google");
        } else {
            this.f9410d = account;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.h0(parcel, 1, this.f9407a);
        a0.h0(parcel, 2, this.f9408b);
        a0.n0(parcel, 3, this.f9409c, false);
        a0.m0(parcel, 4, this.f9410d, i10, false);
        a0.u0(t02, parcel);
    }
}
