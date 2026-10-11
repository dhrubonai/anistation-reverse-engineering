package v4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import p7.a0;

/* loaded from: classes.dex */
public final class a extends c5.a {
    public static final Parcelable.Creator<a> CREATOR = new b(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f10653a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10654b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f10655c;

    /* renamed from: d, reason: collision with root package name */
    public final CredentialPickerConfig f10656d;

    /* renamed from: e, reason: collision with root package name */
    public final CredentialPickerConfig f10657e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10658f;

    /* renamed from: x, reason: collision with root package name */
    public final String f10659x;

    /* renamed from: y, reason: collision with root package name */
    public final String f10660y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f10661z;

    public a(int i10, boolean z9, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z10, String str, String str2, boolean z11) {
        this.f10653a = i10;
        this.f10654b = z9;
        w7.b.s(strArr);
        this.f10655c = strArr;
        this.f10656d = credentialPickerConfig == null ? new CredentialPickerConfig(2, 1, false, true, false) : credentialPickerConfig;
        this.f10657e = credentialPickerConfig2 == null ? new CredentialPickerConfig(2, 1, false, true, false) : credentialPickerConfig2;
        if (i10 < 3) {
            this.f10658f = true;
            this.f10659x = null;
            this.f10660y = null;
        } else {
            this.f10658f = z10;
            this.f10659x = str;
            this.f10660y = str2;
        }
        this.f10661z = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.d0(parcel, 1, this.f10654b);
        a0.o0(parcel, 2, this.f10655c, false);
        a0.m0(parcel, 3, this.f10656d, i10, false);
        a0.m0(parcel, 4, this.f10657e, i10, false);
        a0.d0(parcel, 5, this.f10658f);
        a0.n0(parcel, 6, this.f10659x, false);
        a0.n0(parcel, 7, this.f10660y, false);
        a0.d0(parcel, 8, this.f10661z);
        a0.h0(parcel, 1000, this.f10653a);
        a0.u0(t02, parcel);
    }
}
