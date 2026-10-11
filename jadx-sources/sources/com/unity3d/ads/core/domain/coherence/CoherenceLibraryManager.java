package com.unity3d.ads.core.domain.coherence;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface CoherenceLibraryManager {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int EVENT_ID_DEFAULT = 1;
    public static final int EVENT_ID_INITIALIZATION = 0;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int EVENT_ID_DEFAULT = 1;
        public static final int EVENT_ID_INITIALIZATION = 0;

        private Companion() {
        }
    }

    byte[] executeWasmData();

    byte[] getCommonAttributes(int i);

    void initialize(byte[] bArr);
}
