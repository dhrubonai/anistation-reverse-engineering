package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.ActionCodeUrl;
import com.google.firebase.auth.EmailAuthCredential;
import e5.a;
import org.json.JSONObject;
import w7.b;

/* loaded from: classes.dex */
public class zzaeo implements zzacr {
    private static final String zza = "zzaeo";
    private static final a zzb = new a(zza, new String[0]);
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;

    public zzaeo(EmailAuthCredential emailAuthCredential, String str, String str2) {
        String zzc = emailAuthCredential.zzc();
        b.o(zzc);
        this.zzc = zzc;
        String zze = emailAuthCredential.zze();
        b.o(zze);
        this.zzd = zze;
        this.zze = str;
        this.zzf = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacr
    public final String zza() {
        String str;
        ActionCodeUrl parseLink = ActionCodeUrl.parseLink(this.zzd);
        String str2 = null;
        if (parseLink != null) {
            str = parseLink.getCode();
        } else {
            str = null;
        }
        if (parseLink != null) {
            str2 = parseLink.zza();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zzc);
        if (str != null) {
            jSONObject.put("oobCode", str);
        }
        if (str2 != null) {
            jSONObject.put("tenantId", str2);
        }
        String str3 = this.zze;
        if (str3 != null) {
            jSONObject.put("idToken", str3);
        }
        String str4 = this.zzf;
        if (str4 != null) {
            zzahb.zza(jSONObject, "captchaResp", str4);
        } else {
            zzahb.zza(jSONObject);
        }
        return jSONObject.toString();
    }
}
