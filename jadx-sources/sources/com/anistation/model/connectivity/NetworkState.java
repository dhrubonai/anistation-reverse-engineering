package com.anistation.model.connectivity;

import defpackage.sv1;
import defpackage.t80;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class NetworkState {
    private static final /* synthetic */ sv1 $ENTRIES;
    private static final /* synthetic */ NetworkState[] $VALUES;
    public static final NetworkState Hidden = new NetworkState("Hidden", 0);
    public static final NetworkState Offline = new NetworkState("Offline", 1);
    public static final NetworkState BackOnline = new NetworkState("BackOnline", 2);

    private static final /* synthetic */ NetworkState[] $values() {
        return new NetworkState[]{Hidden, Offline, BackOnline};
    }

    static {
        NetworkState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = t80.D($values);
    }

    private NetworkState(String str, int i) {
    }

    public static sv1 getEntries() {
        return $ENTRIES;
    }

    public static NetworkState valueOf(String str) {
        return (NetworkState) Enum.valueOf(NetworkState.class, str);
    }

    public static NetworkState[] values() {
        return (NetworkState[]) $VALUES.clone();
    }
}
