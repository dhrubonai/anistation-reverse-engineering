package com.unity3d.services.core.properties;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class MadeWithUnityDetector {
    private static final boolean MADE_WITH_UNITY = detect();
    public static final String UNITY_PLAYER_CLASS_NAME = "com.unity3d.player.UnityPlayer";

    private static boolean detect() {
        try {
            Class.forName(UNITY_PLAYER_CLASS_NAME);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean isMadeWithUnity() {
        return MADE_WITH_UNITY;
    }
}
