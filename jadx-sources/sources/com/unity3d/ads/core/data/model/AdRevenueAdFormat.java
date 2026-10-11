package com.unity3d.ads.core.data.model;

import defpackage.q71;
import defpackage.sv1;
import defpackage.t80;
import defpackage.y45;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AdRevenueAdFormat {
    private static final /* synthetic */ sv1 $ENTRIES;
    private static final /* synthetic */ AdRevenueAdFormat[] $VALUES;
    public static final Companion Companion;
    public static final AdRevenueAdFormat BANNER = new AdRevenueAdFormat("BANNER", 0);
    public static final AdRevenueAdFormat MREC = new AdRevenueAdFormat("MREC", 1);
    public static final AdRevenueAdFormat INTERSTITIAL = new AdRevenueAdFormat("INTERSTITIAL", 2);
    public static final AdRevenueAdFormat REWARDED = new AdRevenueAdFormat("REWARDED", 3);
    public static final AdRevenueAdFormat NATIVE = new AdRevenueAdFormat("NATIVE", 4);

    private static final /* synthetic */ AdRevenueAdFormat[] $values() {
        return new AdRevenueAdFormat[]{BANNER, MREC, INTERSTITIAL, REWARDED, NATIVE};
    }

    static {
        AdRevenueAdFormat[] $values = $values();
        $VALUES = $values;
        $ENTRIES = t80.D($values);
        Companion = new Companion(null);
    }

    private AdRevenueAdFormat(String str, int i) {
    }

    public static sv1 getEntries() {
        return $ENTRIES;
    }

    public static AdRevenueAdFormat valueOf(String str) {
        return (AdRevenueAdFormat) Enum.valueOf(AdRevenueAdFormat.class, str);
    }

    public static AdRevenueAdFormat[] values() {
        return (AdRevenueAdFormat[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final AdRevenueAdFormat fromString(String str) {
            Object y45Var;
            Object obj = null;
            if (str == null) {
                return null;
            }
            try {
                String upperCase = str.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                y45Var = AdRevenueAdFormat.valueOf(upperCase);
            } catch (Throwable th) {
                y45Var = new y45(th);
            }
            if (!(y45Var instanceof y45)) {
                obj = y45Var;
            }
            return (AdRevenueAdFormat) obj;
        }

        private Companion() {
        }
    }
}
