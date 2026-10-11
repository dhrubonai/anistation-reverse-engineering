package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class w08 {
    public static final o15 a = nw2.u("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static final boolean b(he7 he7Var, t15 t15Var, t15 t15Var2, oq5 oq5Var, char[] cArr, int i, int i2, int i3, String str, String str2, String str3, boolean z, boolean z2) {
        u08 u08Var;
        char c;
        int c2 = c(he7Var);
        if (c2 > 0 && (i2 != 1 || i != 1)) {
            cArr[c2] = '2';
        }
        if (g(he7Var, t15Var2) == ie7.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c = '3';
        } else {
            if (he7Var == he7.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i3 == 1 && oq5Var.A.equals(str)) {
                if (c2 > 0 && cArr[c2] != '2') {
                    cArr[c2] = '1';
                }
                return true;
            }
            if (t15Var.containsKey(he7Var) && (u08Var = (u08) t15Var.get(he7Var)) != null) {
                int ordinal = u08Var.ordinal();
                ie7 ie7Var = ie7.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                if (ordinal != 0) {
                    ie7 ie7Var2 = ie7.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                if (g(he7Var, t15Var2) == ie7Var2) {
                                    return e(he7Var, cArr, str2, z);
                                }
                                return f(he7Var, cArr, str3, z2);
                            }
                        } else {
                            if (g(he7Var, t15Var2) == ie7Var) {
                                return f(he7Var, cArr, str3, z2);
                            }
                            return e(he7Var, cArr, str2, z);
                        }
                    } else if (g(he7Var, t15Var2) != ie7Var2) {
                        return f(he7Var, cArr, str3, z2);
                    }
                } else if (g(he7Var, t15Var2) != ie7Var) {
                    return e(he7Var, cArr, str2, z);
                }
                c = '8';
            }
            c = '0';
        }
        if (c2 > 0 && cArr[c2] != '2') {
            cArr[c2] = c;
            return false;
        }
        return false;
    }

    public static final int c(he7 he7Var) {
        if (he7Var == he7.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (he7Var == he7.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (he7Var == he7.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        if (he7Var == he7.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE) {
            return 4;
        }
        return -1;
    }

    public static final String d(he7 he7Var, String str, String str2) {
        String str3;
        String str4 = "0";
        if (TextUtils.isEmpty(str) || str.length() < he7Var.a()) {
            str3 = "0";
        } else {
            str3 = String.valueOf(str.charAt(he7Var.a() - 1));
        }
        if (!TextUtils.isEmpty(str2) && str2.length() >= he7Var.a()) {
            str4 = String.valueOf(str2.charAt(he7Var.a() - 1));
        }
        return String.valueOf(str3).concat(String.valueOf(str4));
    }

    public static final boolean e(he7 he7Var, char[] cArr, String str, boolean z) {
        char c;
        int c2 = c(he7Var);
        boolean z2 = false;
        if (!z) {
            c = '4';
        } else if (str.length() < he7Var.a()) {
            c = '0';
        } else {
            char charAt = str.charAt(he7Var.a() - 1);
            char c3 = '1';
            if (charAt == '1') {
                z2 = true;
            }
            if (c2 > 0 && cArr[c2] != '2') {
                if (charAt != '1') {
                    c3 = '6';
                }
                cArr[c2] = c3;
            }
            return z2;
        }
        if (c2 > 0 && cArr[c2] != '2') {
            cArr[c2] = c;
        }
        return false;
    }

    public static final boolean f(he7 he7Var, char[] cArr, String str, boolean z) {
        char c;
        int c2 = c(he7Var);
        boolean z2 = false;
        if (!z) {
            c = '5';
        } else if (str.length() < he7Var.a()) {
            c = '0';
        } else {
            char charAt = str.charAt(he7Var.a() - 1);
            char c3 = '1';
            if (charAt == '1') {
                z2 = true;
            }
            if (c2 > 0 && cArr[c2] != '2') {
                if (charAt != '1') {
                    c3 = '7';
                }
                cArr[c2] = c3;
            }
            return z2;
        }
        if (c2 > 0 && cArr[c2] != '2') {
            cArr[c2] = c;
        }
        return false;
    }

    public static final ie7 g(he7 he7Var, t15 t15Var) {
        Object obj = t15Var.get(he7Var);
        if (obj == null) {
            obj = ie7.PURPOSE_RESTRICTION_UNDEFINED;
        }
        return (ie7) obj;
    }
}
