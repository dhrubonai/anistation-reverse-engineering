package com.unity3d.ads.core.data.model;

import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AdRefreshStateKt {
    private static final String REUSE_DURING_RELOAD_INVALIDATION_REASON = "reuse_during_reload";
    private static final String REUSE_ERROR_INVALIDATION_REASON = "reuse_error";
    private static final String REUSE_NO_FILL_INVALIDATION_REASON = "reuse_no_fill";
    private static final String REUSE_RELOADED_INVALIDATION_REASON = "reuse_reloaded";

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdRefreshState.values().length];
            try {
                iArr[AdRefreshState.REUSE_RELOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdRefreshState.REUSE_NO_FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdRefreshState.REUSE_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdRefreshState.REUSE_DURING_RELOAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getInvalidationReason(AdRefreshState adRefreshState) {
        adRefreshState.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[adRefreshState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return REUSE_DURING_RELOAD_INVALIDATION_REASON;
                    }
                    ze0.l();
                    return null;
                }
                return REUSE_ERROR_INVALIDATION_REASON;
            }
            return REUSE_NO_FILL_INVALIDATION_REASON;
        }
        return REUSE_RELOADED_INVALIDATION_REASON;
    }
}
