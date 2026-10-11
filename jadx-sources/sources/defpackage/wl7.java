package defpackage;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wl7 {
    public static final wl7 f = new wl7((Boolean) null, 100, (Boolean) null, (String) null);
    public final int a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final EnumMap e;

    public wl7(Boolean bool, int i, Boolean bool2, String str) {
        tv7 tv7Var;
        EnumMap enumMap = new EnumMap(wv7.class);
        this.e = enumMap;
        if (bool == null) {
            tv7Var = tv7.UNINITIALIZED;
        } else if (bool.booleanValue()) {
            tv7Var = tv7.GRANTED;
        } else {
            tv7Var = tv7.DENIED;
        }
        enumMap.put((EnumMap) wv7.AD_USER_DATA, (wv7) tv7Var);
        this.a = i;
        this.b = d();
        this.c = bool2;
        this.d = str;
    }

    public static wl7 b(String str) {
        if (str != null && str.length() > 0) {
            String[] split = str.split(":");
            int parseInt = Integer.parseInt(split[0]);
            EnumMap enumMap = new EnumMap(wv7.class);
            wv7[] wv7VarArr = uv7.DMA.x;
            int length = wv7VarArr.length;
            int i = 1;
            int i2 = 0;
            while (i2 < length) {
                enumMap.put((EnumMap) wv7VarArr[i2], (wv7) xv7.e(split[i].charAt(0)));
                i2++;
                i++;
            }
            return new wl7(enumMap, parseInt, (Boolean) null, (String) null);
        }
        return f;
    }

    public static wl7 c(int i, Bundle bundle) {
        Boolean bool = null;
        if (bundle == null) {
            return new wl7((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(wv7.class);
        for (wv7 wv7Var : uv7.DMA.x) {
            enumMap.put((EnumMap) wv7Var, (wv7) xv7.d(bundle.getString(wv7Var.x)));
        }
        if (bundle.containsKey("is_dma_region")) {
            bool = Boolean.valueOf(bundle.getString("is_dma_region"));
        }
        return new wl7(enumMap, i, bool, bundle.getString("cps_display_str"));
    }

    public final tv7 a() {
        tv7 tv7Var = (tv7) this.e.get(wv7.AD_USER_DATA);
        if (tv7Var == null) {
            return tv7.UNINITIALIZED;
        }
        return tv7Var;
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        for (wv7 wv7Var : uv7.DMA.x) {
            sb.append(":");
            sb.append(xv7.h((tv7) this.e.get(wv7Var)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wl7) {
            wl7 wl7Var = (wl7) obj;
            if (this.b.equalsIgnoreCase(wl7Var.b) && Objects.equals(this.c, wl7Var.c)) {
                return Objects.equals(this.d, wl7Var.d);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode;
        Boolean bool = this.c;
        if (bool == null) {
            i = 3;
        } else if (true != bool.booleanValue()) {
            i = 13;
        } else {
            i = 7;
        }
        String str = this.d;
        if (str == null) {
            hashCode = 17;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode * 137) + this.b.hashCode() + (i * 29);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(xv7.a(this.a));
        for (wv7 wv7Var : uv7.DMA.x) {
            sb.append(",");
            sb.append(wv7Var.x);
            sb.append("=");
            tv7 tv7Var = (tv7) this.e.get(wv7Var);
            if (tv7Var == null) {
                sb.append("uninitialized");
            } else {
                int ordinal = tv7Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                sb.append("granted");
                            }
                        } else {
                            sb.append("denied");
                        }
                    } else {
                        sb.append("eu_consent_policy");
                    }
                } else {
                    sb.append("uninitialized");
                }
            }
        }
        Boolean bool = this.c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.d;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public wl7(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(wv7.class);
        this.e = enumMap2;
        enumMap2.putAll(enumMap);
        this.a = i;
        this.b = d();
        this.c = bool;
        this.d = str;
    }
}
