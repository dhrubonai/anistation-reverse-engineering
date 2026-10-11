package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import c5.a;
import i5.b;
import org.json.JSONException;
import org.json.JSONObject;
import p7.a0;

/* loaded from: classes.dex */
public class zzafm extends a implements zzacq<zzafm> {
    public static final Parcelable.Creator<zzafm> CREATOR = new zzafl();
    private static final String zza = "zzafm";
    private String zzb;
    private String zzc;
    private Long zzd;
    private String zze;
    private Long zzf;

    public zzafm() {
        this.zzf = Long.valueOf(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacq
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzafm zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = b.a(jSONObject.optString("refresh_token"));
            this.zzc = b.a(jSONObject.optString("access_token"));
            this.zzd = Long.valueOf(jSONObject.optLong("expires_in", 0L));
            this.zze = b.a(jSONObject.optString("token_type"));
            this.zzf = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahb.zza(e10, zza, str);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.n0(parcel, 2, this.zzb, false);
        a0.n0(parcel, 3, this.zzc, false);
        a0.l0(parcel, 4, Long.valueOf(zza()));
        a0.n0(parcel, 5, this.zze, false);
        a0.l0(parcel, 6, Long.valueOf(this.zzf.longValue()));
        a0.u0(t02, parcel);
    }

    public final long zza() {
        Long l10 = this.zzd;
        if (l10 == null) {
            return 0L;
        }
        return l10.longValue();
    }

    public final long zzb() {
        return this.zzf.longValue();
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.zzb);
            jSONObject.put("access_token", this.zzc);
            jSONObject.put("expires_in", this.zzd);
            jSONObject.put("token_type", this.zze);
            jSONObject.put("issued_at", this.zzf);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.d(zza, "Failed to convert GetTokenResponse to JSON");
            throw new zzxv(e10);
        }
    }

    public final boolean zzg() {
        if (System.currentTimeMillis() + 300000 < (this.zzd.longValue() * 1000) + this.zzf.longValue()) {
            return true;
        }
        return false;
    }

    public static zzafm zzb(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzafm zzafmVar = new zzafm();
            zzafmVar.zzb = jSONObject.optString("refresh_token", null);
            zzafmVar.zzc = jSONObject.optString("access_token", null);
            zzafmVar.zzd = Long.valueOf(jSONObject.optLong("expires_in"));
            zzafmVar.zze = jSONObject.optString("token_type", null);
            zzafmVar.zzf = Long.valueOf(jSONObject.optLong("issued_at"));
            return zzafmVar;
        } catch (JSONException e10) {
            Log.d(zza, "Failed to read GetTokenResponse from JSONObject");
            throw new zzxv(e10);
        }
    }

    public final void zzc(String str) {
        w7.b.o(str);
        this.zzb = str;
    }

    public zzafm(String str, String str2, Long l10, String str3) {
        this(str, str2, l10, str3, Long.valueOf(System.currentTimeMillis()));
    }

    public zzafm(String str, String str2, Long l10, String str3, Long l11) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = l10;
        this.zze = str3;
        this.zzf = l11;
    }

    public final String zzd() {
        return this.zzb;
    }
}
