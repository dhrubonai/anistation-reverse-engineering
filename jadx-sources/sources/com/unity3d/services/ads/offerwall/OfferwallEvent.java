package com.unity3d.services.ads.offerwall;

import defpackage.sv1;
import defpackage.t80;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class OfferwallEvent {
    private static final /* synthetic */ sv1 $ENTRIES;
    private static final /* synthetic */ OfferwallEvent[] $VALUES;
    public static final OfferwallEvent REQUEST_SUCCESS = new OfferwallEvent("REQUEST_SUCCESS", 0);
    public static final OfferwallEvent REQUEST_FAILED = new OfferwallEvent("REQUEST_FAILED", 1);
    public static final OfferwallEvent ON_CONTENT_READY = new OfferwallEvent("ON_CONTENT_READY", 2);
    public static final OfferwallEvent ON_CONTENT_SHOW = new OfferwallEvent("ON_CONTENT_SHOW", 3);
    public static final OfferwallEvent ON_CONTENT_DISMISS = new OfferwallEvent("ON_CONTENT_DISMISS", 4);
    public static final OfferwallEvent SHOW_FAILED = new OfferwallEvent("SHOW_FAILED", 5);

    private static final /* synthetic */ OfferwallEvent[] $values() {
        return new OfferwallEvent[]{REQUEST_SUCCESS, REQUEST_FAILED, ON_CONTENT_READY, ON_CONTENT_SHOW, ON_CONTENT_DISMISS, SHOW_FAILED};
    }

    static {
        OfferwallEvent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = t80.D($values);
    }

    private OfferwallEvent(String str, int i) {
    }

    public static sv1 getEntries() {
        return $ENTRIES;
    }

    public static OfferwallEvent valueOf(String str) {
        return (OfferwallEvent) Enum.valueOf(OfferwallEvent.class, str);
    }

    public static OfferwallEvent[] values() {
        return (OfferwallEvent[]) $VALUES.clone();
    }
}
