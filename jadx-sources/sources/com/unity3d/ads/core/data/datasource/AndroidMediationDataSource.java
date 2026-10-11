package com.unity3d.ads.core.data.datasource;

import com.unity3d.services.core.misc.JsonStorage;
import defpackage.q71;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidMediationDataSource implements MediationDataSource {
    public static final Companion Companion = new Companion(null);
    private static final String MEDIATION_ADAPTER_VERSION = "adapter_version";
    public static final String MEDIATION_ADAPTER_VERSION_KEY = "mediation.adapter_version.value";
    private static final String MEDIATION_NAME = "name";
    public static final String MEDIATION_NAME_KEY = "mediation.name.value";
    private static final String MEDIATION_STORAGE_NAME = "mediation";
    private static final String MEDIATION_VALUE = "value";
    private static final String MEDIATION_VERSION = "version";
    public static final String MEDIATION_VERSION_KEY = "mediation.version.value";
    private final JsonStorage storage;

    public AndroidMediationDataSource(JsonStorage jsonStorage) {
        jsonStorage.getClass();
        this.storage = jsonStorage;
    }

    @Override // com.unity3d.ads.core.data.datasource.MediationDataSource
    public String getAdapterVersion() {
        Object obj = this.storage.get(MEDIATION_ADAPTER_VERSION_KEY);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @Override // com.unity3d.ads.core.data.datasource.MediationDataSource
    public String getName() {
        Object obj = this.storage.get(MEDIATION_NAME_KEY);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @Override // com.unity3d.ads.core.data.datasource.MediationDataSource
    public String getVersion() {
        Object obj = this.storage.get(MEDIATION_VERSION_KEY);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        private Companion() {
        }
    }
}
