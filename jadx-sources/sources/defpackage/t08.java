package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class t08 {
    public final HashMap a;

    public t08(Map map) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        hashMap.putAll(map);
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        o15 o15Var = w08.a;
        int i = o15Var.A;
        for (int i2 = 0; i2 < i; i2++) {
            String str = (String) o15Var.get(i2);
            HashMap hashMap = this.a;
            if (hashMap.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append("=");
                sb.append((String) hashMap.get(str));
            }
        }
        return sb.toString();
    }

    public final Bundle b() {
        String str;
        String str2;
        String str3;
        String str4;
        HashMap hashMap = this.a;
        if (UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(hashMap.get("gdprApplies")) && UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(hashMap.get("EnableAdvertiserConsentMode"))) {
            String str5 = "denied";
            if (hashMap.get("Version") == null) {
                if (!UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(hashMap.get("GoogleConsent"))) {
                    return Bundle.EMPTY;
                }
                int c = c();
                if (c < 0) {
                    return Bundle.EMPTY;
                }
                String str6 = (String) hashMap.get("PurposeConsents");
                if (TextUtils.isEmpty(str6)) {
                    return Bundle.EMPTY;
                }
                Bundle bundle = new Bundle();
                if (str6.length() > 0) {
                    if (str6.charAt(0) != '1') {
                        str4 = "denied";
                    } else {
                        str4 = "granted";
                    }
                    bundle.putString("ad_storage", str4);
                }
                if (str6.length() > 3) {
                    if (str6.charAt(2) != '1' || str6.charAt(3) != '1') {
                        str3 = "denied";
                    } else {
                        str3 = "granted";
                    }
                    bundle.putString("ad_personalization", str3);
                }
                if (str6.length() > 6 && c >= 4) {
                    if (str6.charAt(0) == '1' && str6.charAt(6) == '1') {
                        str5 = "granted";
                    }
                    bundle.putString("ad_user_data", str5);
                }
                return bundle;
            }
            if (c() >= 0) {
                Bundle bundle2 = new Bundle();
                if (true != Objects.equals(hashMap.get("AuthorizePurpose1"), UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION)) {
                    str = "denied";
                } else {
                    str = "granted";
                }
                bundle2.putString("ad_storage", str);
                if (!Objects.equals(hashMap.get("AuthorizePurpose3"), UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION) || !Objects.equals(hashMap.get("AuthorizePurpose4"), UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION)) {
                    str2 = "denied";
                } else {
                    str2 = "granted";
                }
                bundle2.putString("ad_personalization", str2);
                if (c() >= 4) {
                    if (Objects.equals(hashMap.get("AuthorizePurpose1"), UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION) && Objects.equals(hashMap.get("AuthorizePurpose7"), UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION)) {
                        str5 = "granted";
                    }
                    bundle2.putString("ad_user_data", str5);
                }
                return bundle2;
            }
        }
        return Bundle.EMPTY;
    }

    public final int c() {
        try {
            String str = (String) this.a.get("PolicyVersion");
            if (!TextUtils.isEmpty(str)) {
                return Integer.parseInt(str);
            }
            return -1;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t08)) {
            return false;
        }
        return a().equalsIgnoreCase(((t08) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a();
    }
}
