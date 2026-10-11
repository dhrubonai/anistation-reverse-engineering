package com.unity3d.ads.core.log;

import android.util.Log;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.CreateFile;
import defpackage.q71;
import defpackage.sb2;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class UnityLogger implements Logger {
    public static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "UnityAds";
    private LogLevelInternal _fileLogLevel;
    private LogLevelInternal _userLogLevel;
    private final SessionRepository sessionRepository;

    public UnityLogger(SessionRepository sessionRepository, CreateFile createFile) {
        sessionRepository.getClass();
        createFile.getClass();
        this.sessionRepository = sessionRepository;
        this._userLogLevel = LogLevelInternal.INFO;
        try {
            if (createFile.invoke("/data/local/tmp/UnityAdsForceDebugMode").exists()) {
                this._fileLogLevel = LogLevelInternal.TRACE;
                debug("Unity logger initialized in TRACE mode");
            }
        } catch (Throwable unused) {
            Log.w(LOG_TAG, "An issue occurred reading: /data/local/tmp/UnityAdsForceDebugMode");
        }
    }

    private final boolean canLog(int i) {
        if (i >= getLogLevel().toAndroidLogLevel()) {
            return true;
        }
        return false;
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void debug(sb2 sb2Var) {
        sb2Var.getClass();
        if (!canLog(3)) {
            return;
        }
        debug((String) sb2Var.invoke());
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void error(String str, Throwable th) {
        str.getClass();
        if (!canLog(6)) {
            return;
        }
        Log.e(LOG_TAG, str, th);
    }

    @Override // com.unity3d.ads.core.log.Logger
    public LogLevelInternal getLogLevel() {
        if (this.sessionRepository.isNativeConfigReady() && this.sessionRepository.getNativeConfiguration().getDebugSettings().getEnableTracing()) {
            return LogLevelInternal.TRACE;
        }
        LogLevelInternal logLevelInternal = this._fileLogLevel;
        if (logLevelInternal == null) {
            return this._userLogLevel;
        }
        return logLevelInternal;
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void info(String str) {
        str.getClass();
        if (!canLog(4)) {
            return;
        }
        Log.i(LOG_TAG, str);
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void setLogLevel(LogLevelInternal logLevelInternal) {
        logLevelInternal.getClass();
        this._userLogLevel = logLevelInternal;
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void trace(sb2 sb2Var) {
        sb2Var.getClass();
        if (!canLog(2)) {
            return;
        }
        Log.v(LOG_TAG, (String) sb2Var.invoke());
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

    @Override // com.unity3d.ads.core.log.Logger
    public void debug(String str) {
        str.getClass();
        if (canLog(3)) {
            Log.d(LOG_TAG, str);
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void trace(String str, Throwable th) {
        str.getClass();
        if (canLog(2)) {
            Log.v(LOG_TAG, str, th);
        }
    }
}
