package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.InitializationConfigurationInternal;
import com.unity3d.ads.core.data.repository.SessionRepository;
import defpackage.a34;
import defpackage.q71;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidGetIsModulesInitEnabled implements GetIsModulesInitEnabled {
    public static final Companion Companion = new Companion(null);
    public static final String ENABLE_MODULES_INIT_KEY = "enable_modules_init";
    public static final String ENABLE_MODULES_INIT_VALUE = "true";
    private final SessionRepository sessionRepository;

    public AndroidGetIsModulesInitEnabled(SessionRepository sessionRepository) {
        sessionRepository.getClass();
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.GetIsModulesInitEnabled
    public boolean invoke() {
        String str;
        Map<String, String> extras;
        InitializationConfigurationInternal initializationConfiguration = this.sessionRepository.getInitializationConfiguration();
        if (initializationConfiguration != null && (extras = initializationConfiguration.getExtras()) != null) {
            str = extras.get(ENABLE_MODULES_INIT_KEY);
        } else {
            str = null;
        }
        return a34.i(str, ENABLE_MODULES_INIT_VALUE);
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
