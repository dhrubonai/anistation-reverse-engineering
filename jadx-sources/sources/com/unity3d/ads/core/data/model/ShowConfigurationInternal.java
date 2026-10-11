package com.unity3d.ads.core.data.model;

import defpackage.a34;
import defpackage.ot1;
import defpackage.q71;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ShowConfigurationInternal {
    private final String customRewardString;
    private final Map<String, String> extras;

    public /* synthetic */ ShowConfigurationInternal(String str, Map map, int i, q71 q71Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ot1.x : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShowConfigurationInternal copy$default(ShowConfigurationInternal showConfigurationInternal, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = showConfigurationInternal.customRewardString;
        }
        if ((i & 2) != 0) {
            map = showConfigurationInternal.extras;
        }
        return showConfigurationInternal.copy(str, map);
    }

    public final String component1() {
        return this.customRewardString;
    }

    public final Map<String, String> component2() {
        return this.extras;
    }

    public final ShowConfigurationInternal copy(String str, Map<String, String> map) {
        map.getClass();
        return new ShowConfigurationInternal(str, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowConfigurationInternal)) {
            return false;
        }
        ShowConfigurationInternal showConfigurationInternal = (ShowConfigurationInternal) obj;
        if (a34.i(this.customRewardString, showConfigurationInternal.customRewardString) && a34.i(this.extras, showConfigurationInternal.extras)) {
            return true;
        }
        return false;
    }

    public final String getCustomRewardString() {
        return this.customRewardString;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public int hashCode() {
        int hashCode;
        String str = this.customRewardString;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.extras.hashCode() + (hashCode * 31);
    }

    public String toString() {
        return "ShowConfigurationInternal(customRewardString=" + this.customRewardString + ", extras=" + this.extras + ')';
    }

    public ShowConfigurationInternal(String str, Map<String, String> map) {
        map.getClass();
        this.customRewardString = str;
        this.extras = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShowConfigurationInternal() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
