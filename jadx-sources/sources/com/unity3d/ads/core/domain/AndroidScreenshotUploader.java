package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.log.Logger;
import defpackage.n11;
import defpackage.pn6;
import defpackage.q71;
import defpackage.tl7;
import defpackage.vz0;
import defpackage.w11;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidScreenshotUploader {
    public static final String CONTENT_TYPE_HEADER = "Content-Type";
    public static final Companion Companion = new Companion(null);
    public static final String SCREENSHOT_PATH = "adviewer/screenshots";
    public static final String SESSION_TOKEN_HEADER = "uads_session_token";
    private static final int UPLOAD_TIMEOUT_MS = 10000;
    private final HttpClientProvider httpClientProvider;
    private final n11 ioDispatcher;
    private final Logger logger;
    private final SessionRepository sessionRepository;

    public AndroidScreenshotUploader(n11 n11Var, HttpClientProvider httpClientProvider, SessionRepository sessionRepository, Logger logger) {
        n11Var.getClass();
        httpClientProvider.getClass();
        sessionRepository.getClass();
        logger.getClass();
        this.ioDispatcher = n11Var;
        this.httpClientProvider = httpClientProvider;
        this.sessionRepository = sessionRepository;
        this.logger = logger;
    }

    public final Object invoke(String str, byte[] bArr, String str2, vz0 vz0Var) {
        Object V = tl7.V(this.ioDispatcher, new AndroidScreenshotUploader$invoke$2(this, str, bArr, str2, null), vz0Var);
        if (V == w11.x) {
            return V;
        }
        return pn6.a;
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
