package com.unity3d.ads.core.log;

import defpackage.ov3;
import defpackage.sb2;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface Logger {

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void error$default(Logger logger, String str, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    th = null;
                }
                logger.error(str, th);
                return;
            }
            ov3.g("Super calls with default arguments not supported in this target, function: error");
        }

        public static /* synthetic */ void trace$default(Logger logger, String str, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    th = null;
                }
                logger.trace(str, th);
                return;
            }
            ov3.g("Super calls with default arguments not supported in this target, function: trace");
        }
    }

    void debug(String str);

    void debug(sb2 sb2Var);

    void error(String str, Throwable th);

    LogLevelInternal getLogLevel();

    void info(String str);

    void setLogLevel(LogLevelInternal logLevelInternal);

    void trace(String str, Throwable th);

    void trace(sb2 sb2Var);
}
