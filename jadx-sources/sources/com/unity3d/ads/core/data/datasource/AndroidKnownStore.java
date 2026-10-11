package com.unity3d.ads.core.data.datasource;

import defpackage.sv1;
import defpackage.t80;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidKnownStore {
    private static final /* synthetic */ sv1 $ENTRIES;
    private static final /* synthetic */ AndroidKnownStore[] $VALUES;
    private final String packageName;
    public static final AndroidKnownStore GOOGLE = new AndroidKnownStore("GOOGLE", 0, "com.android.vending");
    public static final AndroidKnownStore GOOGLE_MARKET = new AndroidKnownStore("GOOGLE_MARKET", 1, "com.google.market");
    public static final AndroidKnownStore AMAZON = new AndroidKnownStore("AMAZON", 2, "com.amazon.venezia");
    public static final AndroidKnownStore SAMSUNG = new AndroidKnownStore("SAMSUNG", 3, "com.sec.android.app.samsungapps");
    public static final AndroidKnownStore XIAOMI = new AndroidKnownStore("XIAOMI", 4, "com.xiaomi.market");
    public static final AndroidKnownStore HUAWEI = new AndroidKnownStore("HUAWEI", 5, "com.huawei.appmarket");
    public static final AndroidKnownStore OPPO = new AndroidKnownStore("OPPO", 6, "com.oppo.market");
    public static final AndroidKnownStore VIVO = new AndroidKnownStore("VIVO", 7, "com.bbk.appstore");
    public static final AndroidKnownStore UNKNOWN = new AndroidKnownStore("UNKNOWN", 8, "unknown");

    private static final /* synthetic */ AndroidKnownStore[] $values() {
        return new AndroidKnownStore[]{GOOGLE, GOOGLE_MARKET, AMAZON, SAMSUNG, XIAOMI, HUAWEI, OPPO, VIVO, UNKNOWN};
    }

    static {
        AndroidKnownStore[] $values = $values();
        $VALUES = $values;
        $ENTRIES = t80.D($values);
    }

    private AndroidKnownStore(String str, int i, String str2) {
        this.packageName = str2;
    }

    public static sv1 getEntries() {
        return $ENTRIES;
    }

    public static AndroidKnownStore valueOf(String str) {
        return (AndroidKnownStore) Enum.valueOf(AndroidKnownStore.class, str);
    }

    public static AndroidKnownStore[] values() {
        return (AndroidKnownStore[]) $VALUES.clone();
    }

    public final String getPackageName() {
        return this.packageName;
    }
}
