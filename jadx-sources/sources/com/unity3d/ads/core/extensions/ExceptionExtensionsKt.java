package com.unity3d.ads.core.extensions;

import com.unity3d.services.SDKErrorHandler;
import defpackage.a34;
import defpackage.os;
import defpackage.uz5;
import defpackage.wi5;
import java.io.PrintWriter;
import java.io.StringWriter;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ExceptionExtensionsKt {
    public static final String getShortenedStackTrace(Throwable th, int i) {
        th.getClass();
        try {
            StringWriter stringWriter = new StringWriter();
            try {
                PrintWriter printWriter = new PrintWriter(stringWriter);
                try {
                    th.printStackTrace(printWriter);
                    String stringWriter2 = stringWriter.toString();
                    stringWriter2.getClass();
                    String obj = uz5.w0(stringWriter2).toString();
                    obj.getClass();
                    String r0 = wi5.r0(wi5.t0(new os(obj, (byte) 4), i), "\n", null, 62);
                    printWriter.close();
                    stringWriter.close();
                    return r0;
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    a34.C(stringWriter, th2);
                    throw th3;
                }
            }
        } catch (Throwable unused) {
            return "";
        }
    }

    public static /* synthetic */ String getShortenedStackTrace$default(Throwable th, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 15;
        }
        return getShortenedStackTrace(th, i);
    }

    public static final String retrieveUnityCrashValue(Throwable th) {
        StackTraceElement stackTraceElement;
        boolean z;
        String className;
        th.getClass();
        StackTraceElement[] stackTrace = th.getStackTrace();
        stackTrace.getClass();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i < length) {
                stackTraceElement = stackTrace[i];
                if (stackTraceElement != null && (className = stackTraceElement.getClassName()) != null) {
                    z = uz5.M(className, SDKErrorHandler.UNITY_PACKAGE, false);
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i++;
            } else {
                stackTraceElement = null;
                break;
            }
        }
        String str = "unknown";
        if (stackTraceElement == null) {
            return "unknown";
        }
        String fileName = stackTraceElement.getFileName();
        if (fileName != null) {
            str = fileName;
        }
        return str + '_' + stackTraceElement.getLineNumber();
    }
}
