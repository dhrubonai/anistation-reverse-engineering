package o5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzaj;
import com.google.android.gms.internal.fido.zzak;
import com.google.android.gms.internal.fido.zzbf;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i extends l {
    public static final Parcelable.Creator<i> CREATOR = new t0(18);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f8235a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f8236b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f8237c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f8238d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f8239e;

    public i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        w7.b.s(bArr);
        this.f8235a = bArr;
        w7.b.s(bArr2);
        this.f8236b = bArr2;
        w7.b.s(bArr3);
        this.f8237c = bArr3;
        w7.b.s(bArr4);
        this.f8238d = bArr4;
        this.f8239e = bArr5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!Arrays.equals(this.f8235a, iVar.f8235a) || !Arrays.equals(this.f8236b, iVar.f8236b) || !Arrays.equals(this.f8237c, iVar.f8237c) || !Arrays.equals(this.f8238d, iVar.f8238d) || !Arrays.equals(this.f8239e, iVar.f8239e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f8235a)), Integer.valueOf(Arrays.hashCode(this.f8236b)), Integer.valueOf(Arrays.hashCode(this.f8237c)), Integer.valueOf(Arrays.hashCode(this.f8238d)), Integer.valueOf(Arrays.hashCode(this.f8239e))});
    }

    public final String toString() {
        zzaj zza = zzak.zza(this);
        zzbf zzd = zzbf.zzd();
        byte[] bArr = this.f8235a;
        zza.zzb("keyHandle", zzd.zze(bArr, 0, bArr.length));
        zzbf zzd2 = zzbf.zzd();
        byte[] bArr2 = this.f8236b;
        zza.zzb("clientDataJSON", zzd2.zze(bArr2, 0, bArr2.length));
        zzbf zzd3 = zzbf.zzd();
        byte[] bArr3 = this.f8237c;
        zza.zzb("authenticatorData", zzd3.zze(bArr3, 0, bArr3.length));
        zzbf zzd4 = zzbf.zzd();
        byte[] bArr4 = this.f8238d;
        zza.zzb("signature", zzd4.zze(bArr4, 0, bArr4.length));
        byte[] bArr5 = this.f8239e;
        if (bArr5 != null) {
            zza.zzb("userHandle", zzbf.zzd().zze(bArr5, 0, bArr5.length));
        }
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = p7.a0.t0(20293, parcel);
        p7.a0.f0(parcel, 2, this.f8235a, false);
        p7.a0.f0(parcel, 3, this.f8236b, false);
        p7.a0.f0(parcel, 4, this.f8237c, false);
        p7.a0.f0(parcel, 5, this.f8238d, false);
        p7.a0.f0(parcel, 6, this.f8239e, false);
        p7.a0.u0(t02, parcel);
    }
}
