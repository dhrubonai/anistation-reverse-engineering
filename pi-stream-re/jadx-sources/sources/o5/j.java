package o5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzaj;
import com.google.android.gms.internal.fido.zzak;
import com.google.android.gms.internal.fido.zzbf;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j extends l {
    public static final Parcelable.Creator<j> CREATOR = new t0(19);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f8242a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f8243b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f8244c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f8245d;

    public j(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        w7.b.s(bArr);
        this.f8242a = bArr;
        w7.b.s(bArr2);
        this.f8243b = bArr2;
        w7.b.s(bArr3);
        this.f8244c = bArr3;
        w7.b.s(strArr);
        this.f8245d = strArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!Arrays.equals(this.f8242a, jVar.f8242a) || !Arrays.equals(this.f8243b, jVar.f8243b) || !Arrays.equals(this.f8244c, jVar.f8244c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f8242a)), Integer.valueOf(Arrays.hashCode(this.f8243b)), Integer.valueOf(Arrays.hashCode(this.f8244c))});
    }

    public final String toString() {
        zzaj zza = zzak.zza(this);
        zzbf zzd = zzbf.zzd();
        byte[] bArr = this.f8242a;
        zza.zzb("keyHandle", zzd.zze(bArr, 0, bArr.length));
        zzbf zzd2 = zzbf.zzd();
        byte[] bArr2 = this.f8243b;
        zza.zzb("clientDataJSON", zzd2.zze(bArr2, 0, bArr2.length));
        zzbf zzd3 = zzbf.zzd();
        byte[] bArr3 = this.f8244c;
        zza.zzb("attestationObject", zzd3.zze(bArr3, 0, bArr3.length));
        zza.zzb("transports", Arrays.toString(this.f8245d));
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = p7.a0.t0(20293, parcel);
        p7.a0.f0(parcel, 2, this.f8242a, false);
        p7.a0.f0(parcel, 3, this.f8243b, false);
        p7.a0.f0(parcel, 4, this.f8244c, false);
        p7.a0.o0(parcel, 5, this.f8245d, false);
        p7.a0.u0(t02, parcel);
    }
}
