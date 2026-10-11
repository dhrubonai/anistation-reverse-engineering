package com.unity3d.ads;

import defpackage.ot1;
import defpackage.q71;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ShowConfiguration {
    private final String customRewardString;
    private final Map<String, String> extras;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Builder {
        private String customRewardString;
        private Map<String, String> extras = ot1.x;

        public final ShowConfiguration build() {
            return new ShowConfiguration(this.customRewardString, this.extras, null);
        }

        public final Builder withCustomRewardString(String str) {
            str.getClass();
            this.customRewardString = str;
            return this;
        }

        public final Builder withExtras(Map<String, String> map) {
            map.getClass();
            this.extras = map;
            return this;
        }
    }

    public /* synthetic */ ShowConfiguration(String str, Map map, int i, q71 q71Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ot1.x : map);
    }

    public final String getCustomRewardString() {
        return this.customRewardString;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    private ShowConfiguration(String str, Map<String, String> map) {
        this.customRewardString = str;
        this.extras = map;
    }

    public /* synthetic */ ShowConfiguration(String str, Map map, q71 q71Var) {
        this(str, map);
    }
}
