package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import i5.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzafv implements zzacq<zzafv> {
    private static final String zza = "zzafv";
    private String zzb;
    private String zzc;
    private String zzd;
    private zzafq zze;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacq
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzafv zza(String str) {
        String str2;
        char c6;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = b.a(jSONObject.optString("email"));
            this.zzc = b.a(jSONObject.optString("newEmail"));
            int optInt = jSONObject.optInt("reqType");
            if (optInt != 1) {
                switch (optInt) {
                    case 4:
                        str2 = "VERIFY_EMAIL";
                        break;
                    case 5:
                        str2 = "RECOVER_EMAIL";
                        break;
                    case 6:
                        str2 = "EMAIL_SIGNIN";
                        break;
                    case zzaja.zze.zzg /* 7 */:
                        str2 = "VERIFY_AND_CHANGE_EMAIL";
                        break;
                    case 8:
                        str2 = "REVERT_SECOND_FACTOR_ADDITION";
                        break;
                    default:
                        str2 = null;
                        break;
                }
            } else {
                str2 = "PASSWORD_RESET";
            }
            this.zzd = str2;
            if (TextUtils.isEmpty(str2)) {
                String optString = jSONObject.optString("requestType");
                switch (optString.hashCode()) {
                    case -1874510116:
                        if (optString.equals("REVERT_SECOND_FACTOR_ADDITION")) {
                            c6 = 5;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case -1452371317:
                        if (optString.equals("PASSWORD_RESET")) {
                            c6 = 1;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case -1341836234:
                        if (optString.equals("VERIFY_EMAIL")) {
                            c6 = 0;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case -1099157829:
                        if (optString.equals("VERIFY_AND_CHANGE_EMAIL")) {
                            c6 = 3;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 870738373:
                        if (optString.equals("EMAIL_SIGNIN")) {
                            c6 = 2;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 970484929:
                        if (optString.equals("RECOVER_EMAIL")) {
                            c6 = 4;
                            break;
                        }
                        c6 = 65535;
                        break;
                    default:
                        c6 = 65535;
                        break;
                }
                this.zzd = (c6 == 0 || c6 == 1 || c6 == 2 || c6 == 3 || c6 == 4 || c6 == 5) ? optString : null;
            }
            if (jSONObject.has("mfaInfo")) {
                this.zze = zzafq.zza(jSONObject.optJSONObject("mfaInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahb.zza(e10, zza, str);
        }
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }

    public final boolean zze() {
        if (this.zzb != null) {
            return true;
        }
        return false;
    }

    public final boolean zzf() {
        if (this.zze != null) {
            return true;
        }
        return false;
    }

    public final boolean zzg() {
        if (this.zzc != null) {
            return true;
        }
        return false;
    }

    public final boolean zzh() {
        if (this.zzd != null) {
            return true;
        }
        return false;
    }

    public final zzafq zza() {
        return this.zze;
    }

    public final String zzb() {
        return this.zzb;
    }
}
