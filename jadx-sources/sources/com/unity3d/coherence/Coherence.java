package com.unity3d.coherence;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.PowerManager;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import defpackage.h11;
import defpackage.ov3;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
final class Coherence {
    private static final String BLOB_SUBDIR = "unity_coherence_blobs";
    private static final int BLOB_TIER_CACHE = 0;
    private static final int BLOB_TIER_DURABLE = 1;
    static final int MAX_EXPR_BYTES = 4096;
    static final int MAX_LETS = 16;
    static final int MAX_LISTING_BYTES = 32768;
    static final int MAX_PATH_SEGMENTS = 32;
    private static final Set<String> SETTINGS_GETTERS;
    private static final Set<String> SETTINGS_ROOTS;
    private static volatile String sGpuModel;
    private final ApplicationInfo applicationInfo;
    private volatile Intent batteryIntent;
    private final Object blobLock = new Object();
    private final Context context;
    private final String installerPackage;
    private final PackageInfo packageInfo;
    private final SharedPreferences prefs;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("android.provider.Settings$Global");
        hashSet.add("android.provider.Settings$Secure");
        hashSet.add("android.provider.Settings$System");
        SETTINGS_ROOTS = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.addAll(Arrays.asList("getInt", "getString", "getFloat", "getLong"));
        SETTINGS_GETTERS = Collections.unmodifiableSet(hashSet2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x003a
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    public Coherence(android.content.Context r7, android.content.SharedPreferences r8) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r6.blobLock = r0
            r6.context = r7
            r6.prefs = r8
            r8 = 0
            android.content.pm.PackageManager r0 = r7.getPackageManager()     // Catch: java.lang.Exception -> L38
            java.lang.String r1 = r7.getPackageName()     // Catch: java.lang.Exception -> L38
            r2 = 0
            android.content.pm.PackageInfo r3 = r0.getPackageInfo(r1, r2)     // Catch: java.lang.Exception -> L38
            android.content.pm.ApplicationInfo r2 = r0.getApplicationInfo(r1, r2)     // Catch: java.lang.Exception -> L36
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L3a
            r5 = 30
            if (r4 < r5) goto L31
            android.content.pm.InstallSourceInfo r0 = defpackage.y3.f(r0, r1)     // Catch: java.lang.Exception -> L3a
            if (r0 == 0) goto L3a
            java.lang.String r0 = defpackage.y3.l(r0)     // Catch: java.lang.Exception -> L3a
            goto L3b
        L31:
            java.lang.String r0 = r0.getInstallerPackageName(r1)     // Catch: java.lang.Exception -> L3a
            goto L3b
        L36:
            r2 = r8
            goto L3a
        L38:
            r2 = r8
            r3 = r2
        L3a:
            r0 = r8
        L3b:
            r6.packageInfo = r3
            r6.applicationInfo = r2
            r6.installerPackage = r0
            com.unity3d.coherence.a r0 = new com.unity3d.coherence.a     // Catch: java.lang.Exception -> L51
            r0.<init>(r6)     // Catch: java.lang.Exception -> L51
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch: java.lang.Exception -> L51
            java.lang.String r2 = "android.intent.action.BATTERY_CHANGED"
            r1.<init>(r2)     // Catch: java.lang.Exception -> L51
            android.content.Intent r8 = r7.registerReceiver(r0, r1)     // Catch: java.lang.Exception -> L51
        L51:
            r6.batteryIntent = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.coherence.Coherence.<init>(android.content.Context, android.content.SharedPreferences):void");
    }

    private static void appendVarint(ByteArrayOutputStream byteArrayOutputStream, long j) {
        while (((-128) & j) != 0) {
            byteArrayOutputStream.write((int) ((j & 127) | 128));
            j >>>= 7;
        }
        byteArrayOutputStream.write((int) (j & 127));
    }

    private static int assignabilityScore(Class<?> cls, Object obj) {
        if (obj == null) {
            if (cls.isPrimitive()) {
                return -1;
            }
            return 1;
        }
        if (obj instanceof String) {
            if (cls == String.class) {
                return 100;
            }
            if (cls == CharSequence.class) {
                return 60;
            }
            if (cls != Object.class) {
                return -1;
            }
            return 40;
        }
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            if (cls == Long.TYPE || cls == Long.class) {
                return 100;
            }
            if (cls != Integer.TYPE && cls != Integer.class) {
                if (cls != Short.TYPE && cls != Short.class) {
                    if (cls != Byte.TYPE && cls != Byte.class) {
                        if (cls == Double.TYPE || cls == Double.class) {
                            return 60;
                        }
                        if (cls != Float.TYPE && cls != Float.class) {
                            if (cls == Number.class) {
                                return 50;
                            }
                            if (cls != Object.class) {
                                return -1;
                            }
                            return 40;
                        }
                        return 55;
                    }
                    if (longValue < -128 || longValue > 127) {
                        return -1;
                    }
                    return 70;
                }
                if (longValue < -32768 || longValue > 32767) {
                    return -1;
                }
                return 80;
            }
            if (longValue < -2147483648L || longValue > 2147483647L) {
                return -1;
            }
            return 90;
        }
        if (obj instanceof Boolean) {
            if (cls == Boolean.TYPE || cls == Boolean.class) {
                return 100;
            }
            if (cls != Object.class) {
                return -1;
            }
            return 40;
        }
        if (!cls.isInstance(obj)) {
            return -1;
        }
        if (cls == obj.getClass()) {
            return 100;
        }
        return 50;
    }

    private static boolean atomicReplace(File file, File file2) {
        try {
            Files.move(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
            return true;
        } catch (IOException | UnsupportedOperationException unused) {
            if (file.renameTo(file2)) {
                return true;
            }
            if (!file2.exists() || !file2.delete()) {
                return false;
            }
            return file.renameTo(file2);
        }
    }

    private File blobBaseDir(int i) {
        File cacheDir;
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            cacheDir = this.context.getFilesDir();
        } else {
            cacheDir = this.context.getCacheDir();
        }
        if (cacheDir == null) {
            return null;
        }
        File file = new File(cacheDir, BLOB_SUBDIR);
        if (!file.isDirectory() && !file.mkdirs()) {
            return null;
        }
        return file;
    }

    private File blobFile(int i, String str) {
        File blobBaseDir = blobBaseDir(i);
        if (blobBaseDir != null && str != null && !str.isEmpty()) {
            return new File(blobBaseDir, blobFilenameForKey(str));
        }
        return null;
    }

    private static String blobFilenameForKey(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(str.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder(digest.length * 2);
            for (byte b : digest) {
                sb.append(String.format("%02x", Integer.valueOf(b & 255)));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            ov3.k("SHA-256 unavailable", e);
            return null;
        }
    }

    private static Object[] coerceArgs(Class<?>[] clsArr, List<Object> list) {
        Object[] objArr = new Object[clsArr.length];
        for (int i = 0; i < clsArr.length; i++) {
            Object obj = list.get(i);
            Class<?> cls = clsArr[i];
            if (obj == null) {
                if (cls.isPrimitive()) {
                    return null;
                }
                objArr[i] = null;
            } else if (obj instanceof Long) {
                long longValue = ((Long) obj).longValue();
                if (cls != Integer.TYPE && cls != Integer.class) {
                    if (cls != Short.TYPE && cls != Short.class) {
                        if (cls != Byte.TYPE && cls != Byte.class) {
                            if (cls != Float.TYPE && cls != Float.class) {
                                if (cls != Double.TYPE && cls != Double.class) {
                                    objArr[i] = obj;
                                } else {
                                    objArr[i] = Double.valueOf(longValue);
                                }
                            } else {
                                objArr[i] = Float.valueOf((float) longValue);
                            }
                        } else {
                            objArr[i] = Byte.valueOf((byte) longValue);
                        }
                    } else {
                        objArr[i] = Short.valueOf((short) longValue);
                    }
                } else {
                    objArr[i] = Integer.valueOf((int) longValue);
                }
            } else {
                objArr[i] = obj;
            }
        }
        return objArr;
    }

    private Object dispatchSegment(Object obj, String str) {
        int indexOf = str.indexOf(40);
        if (indexOf == -1) {
            return resolveFieldOrZeroArgMethod(obj, str);
        }
        String substring = str.substring(0, indexOf);
        String extractStringArg = extractStringArg(str);
        if (extractStringArg == null) {
            return null;
        }
        return resolveMethodWithStringArg(obj, substring, extractStringArg);
    }

    private Object dispatchSegmentV2(Object obj, String str, Map<String, Object> map) {
        List<Object> parseAndEvalArgs;
        int indexOf = str.indexOf(40);
        if (indexOf == -1) {
            return resolveFieldOrZeroArgMethod(obj, str);
        }
        String substring = str.substring(0, indexOf);
        int lastIndexOf = str.lastIndexOf(41);
        if (lastIndexOf < indexOf || (parseAndEvalArgs = parseAndEvalArgs(str.substring(indexOf + 1, lastIndexOf), map)) == null) {
            return null;
        }
        return resolveMethodWithArgs(obj, substring, parseAndEvalArgs);
    }

    private static byte[] encodeRepeatedInt32(int i, List<Integer> list) {
        if (list.isEmpty()) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            appendVarint(byteArrayOutputStream, it.next().intValue() & 4294967295L);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        appendVarint(byteArrayOutputStream2, (i << 3) | 2);
        appendVarint(byteArrayOutputStream2, byteArray.length);
        byteArrayOutputStream2.write(byteArray, 0, byteArray.length);
        return byteArrayOutputStream2.toByteArray();
    }

    private static byte[] encodeRepeatedString(int i, List<String> list) {
        if (list.isEmpty()) {
            return null;
        }
        long j = (i << 3) | 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            byte[] bytes = it.next().getBytes(StandardCharsets.UTF_8);
            appendVarint(byteArrayOutputStream, j);
            appendVarint(byteArrayOutputStream, bytes.length);
            byteArrayOutputStream.write(bytes, 0, bytes.length);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray.length <= 0) {
            return null;
        }
        return byteArray;
    }

    private Object evalSingleArgInside(String str, Map<String, Object> map) {
        int indexOf = str.indexOf(40);
        int lastIndexOf = str.lastIndexOf(41);
        if (indexOf != -1 && lastIndexOf >= indexOf) {
            return evaluateExpr(str.substring(indexOf + 1, lastIndexOf), map);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00dc, code lost:
    
        if (r1 == null) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Object evaluateExpr(java.lang.String r8, java.util.Map<java.lang.String, java.lang.Object> r9) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.coherence.Coherence.evaluateExpr(java.lang.String, java.util.Map):java.lang.Object");
    }

    public static String extractStringArg(String str) {
        int i;
        char charAt;
        int indexOf = str.indexOf(40);
        int lastIndexOf = str.lastIndexOf(41);
        if (indexOf != -1 && lastIndexOf != -1 && lastIndexOf >= indexOf) {
            String trim = str.substring(indexOf + 1, lastIndexOf).trim();
            if (trim.length() >= 2 && trim.startsWith("\"") && trim.endsWith("\"")) {
                String substring = trim.substring(1, trim.length() - 1);
                StringBuilder sb = new StringBuilder(substring.length());
                int i2 = 0;
                while (i2 < substring.length()) {
                    char charAt2 = substring.charAt(i2);
                    if (charAt2 == '\\' && (i = i2 + 1) < substring.length() && ((charAt = substring.charAt(i)) == '\"' || charAt == '\\')) {
                        sb.append(charAt);
                        i2 = i;
                    } else {
                        sb.append(charAt2);
                    }
                    i2++;
                }
                return sb.toString();
            }
        }
        return null;
    }

    /* JADX WARN: Finally extract failed */
    private HttpResult httpExecute(String str, String str2, String str3, byte[] bArr) {
        HttpURLConnection httpURLConnection;
        Throwable th;
        InputStream inputStream;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
            try {
                httpURLConnection.setRequestMethod(str);
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(30000);
                if (str3 != null) {
                    for (String str4 : str3.split("\r\n")) {
                        int indexOf = str4.indexOf(58);
                        if (indexOf > 0) {
                            httpURLConnection.setRequestProperty(str4.substring(0, indexOf).trim(), str4.substring(indexOf + 1).trim());
                        }
                    }
                }
                if (bArr != null && bArr.length > 0) {
                    httpURLConnection.setDoOutput(true);
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    try {
                        outputStream.write(bArr);
                        outputStream.close();
                    } finally {
                    }
                }
                HttpResult httpResult = new HttpResult();
                int responseCode = httpURLConnection.getResponseCode();
                httpResult.status = responseCode;
                if (responseCode >= 400) {
                    inputStream = httpURLConnection.getErrorStream();
                } else {
                    inputStream = httpURLConnection.getInputStream();
                }
                if (inputStream != null) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            byte[] bArr2 = new byte[4096];
                            while (true) {
                                int read = inputStream.read(bArr2);
                                if (read == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr2, 0, read);
                            }
                            httpResult.body = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                        } catch (Throwable th2) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } finally {
                        inputStream.close();
                    }
                }
                httpURLConnection.disconnect();
                return httpResult;
            } catch (IOException unused) {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return null;
            } catch (Throwable th4) {
                th = th4;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (IOException unused2) {
            httpURLConnection = null;
        } catch (Throwable th5) {
            httpURLConnection = null;
            th = th5;
        }
    }

    private static Object invokeBestOverload(Class<?> cls, String str, List<Object> list, Object obj) {
        int matchSpecificity;
        int i = Integer.MIN_VALUE;
        Method method = null;
        boolean z = false;
        for (Method method2 : cls.getMethods()) {
            if (method2.getName().equals(str)) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                if (parameterTypes.length == list.size() && (matchSpecificity = matchSpecificity(parameterTypes, list)) >= 0) {
                    if (matchSpecificity > i) {
                        z = false;
                        method = method2;
                        i = matchSpecificity;
                    } else if (matchSpecificity == i) {
                        z = true;
                    }
                }
            }
        }
        if (method != null && !z) {
            try {
                Object[] coerceArgs = coerceArgs(method.getParameterTypes(), list);
                if (coerceArgs == null) {
                    return null;
                }
                return method.invoke(obj, coerceArgs);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return null;
    }

    private static boolean isBalancedOuterParen(String str) {
        if (str.length() < 2) {
            return false;
        }
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (z) {
                z = false;
            } else if (z2) {
                if (charAt == '\\') {
                    z = true;
                } else if (charAt == '\"') {
                    z2 = false;
                }
            } else if (charAt == '\"') {
                z2 = true;
            } else if (charAt == '(') {
                i++;
            } else if (charAt == ')' && i - 1 == 0 && i2 < str.length() - 1) {
                return false;
            }
        }
        if (i != 0) {
            return false;
        }
        return true;
    }

    private static boolean isValidIdent(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        char charAt = str.charAt(0);
        if (!Character.isLetter(charAt) && charAt != '_') {
            return false;
        }
        for (int i = 1; i < str.length(); i++) {
            char charAt2 = str.charAt(i);
            if (!Character.isLetterOrDigit(charAt2) && charAt2 != '_' && charAt2 != '$') {
                return false;
            }
        }
        return true;
    }

    private static String join(List<String> list, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        for (int i3 = i; i3 < i2; i3++) {
            if (i3 > i) {
                sb.append('.');
            }
            sb.append(list.get(i3));
        }
        return sb.toString();
    }

    private static boolean looksLikeInt(String str) {
        int i;
        if (str == null || str.isEmpty()) {
            return false;
        }
        if (str.charAt(0) == '-') {
            i = 1;
        } else {
            i = 0;
        }
        if (i >= str.length()) {
            return false;
        }
        while (i < str.length()) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    private static int matchSpecificity(Class<?>[] clsArr, List<Object> list) {
        int i = 0;
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            int assignabilityScore = assignabilityScore(clsArr[i2], list.get(i2));
            if (assignabilityScore < 0) {
                return -1;
            }
            i += assignabilityScore;
        }
        return i;
    }

    private static String methodDescriptor(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        sb.append('(');
        Class<?>[] parameterTypes = method.getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(parameterTypes[i].getName());
        }
        sb.append("):");
        sb.append(method.getReturnType().getName());
        return sb.toString();
    }

    private List<Object> parseAndEvalArgs(String str, Map<String, Object> map) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        List<String> splitOnTopLevel = splitOnTopLevel(',', trim, false);
        ArrayList arrayList = new ArrayList(splitOnTopLevel.size());
        Iterator<String> it = splitOnTopLevel.iterator();
        while (it.hasNext()) {
            String trim2 = it.next().trim();
            int i = topLevelLabelColonIdx(trim2);
            if (i > 0 && isValidIdent(trim2.substring(0, i).trim())) {
                trim2 = trim2.substring(i + 1).trim();
            }
            arrayList.add(evaluateExpr(trim2, map));
        }
        return arrayList;
    }

    public static String parseStringLiteral(String str) {
        int i;
        StringBuilder sb = new StringBuilder(str.length() - 2);
        int length = str.length() - 1;
        int i2 = 1;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt == '\\' && (i = i2 + 1) < length) {
                char charAt2 = str.charAt(i);
                if (charAt2 != '\"') {
                    if (charAt2 != '0') {
                        if (charAt2 != '\\') {
                            if (charAt2 != 'n') {
                                if (charAt2 != 'r') {
                                    if (charAt2 == 't') {
                                        sb.append('\t');
                                    }
                                } else {
                                    sb.append('\r');
                                }
                            } else {
                                sb.append('\n');
                            }
                        } else {
                            sb.append('\\');
                        }
                    } else {
                        sb.append((char) 0);
                    }
                } else {
                    sb.append('\"');
                }
                i2 = i;
                i2++;
            }
            sb.append(charAt);
            i2++;
        }
        return sb.toString();
    }

    /* JADX WARN: Finally extract failed */
    private static String queryGlRenderer() {
        EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
        EGLDisplay eglGetCurrentDisplay = EGL14.eglGetCurrentDisplay();
        EGLSurface eglGetCurrentSurface = EGL14.eglGetCurrentSurface(12377);
        EGLSurface eglGetCurrentSurface2 = EGL14.eglGetCurrentSurface(12378);
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        String str = "";
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            return "";
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            return "";
        }
        try {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            if (EGL14.eglChooseConfig(eglGetDisplay, new int[]{12352, 4, 12339, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                if (eglCreateContext == EGL14.EGL_NO_CONTEXT) {
                    return "";
                }
                try {
                    EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfigArr[0], new int[]{12375, 1, 12374, 1, 12344}, 0);
                    if (eglCreatePbufferSurface == EGL14.EGL_NO_SURFACE) {
                        EGL14.eglDestroyContext(eglGetDisplay, eglCreateContext);
                        return "";
                    }
                    try {
                        EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
                        String glGetString = GLES20.glGetString(7937);
                        if (glGetString != null) {
                            str = glGetString;
                        }
                        if (eglGetCurrentContext != EGL14.EGL_NO_CONTEXT && eglGetCurrentDisplay != EGL14.EGL_NO_DISPLAY) {
                            EGL14.eglMakeCurrent(eglGetCurrentDisplay, eglGetCurrentSurface, eglGetCurrentSurface2, eglGetCurrentContext);
                        } else {
                            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                            EGL14.eglMakeCurrent(eglGetDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                        }
                        EGL14.eglDestroySurface(eglGetDisplay, eglCreatePbufferSurface);
                        EGL14.eglDestroyContext(eglGetDisplay, eglCreateContext);
                        return str;
                    } catch (Throwable th) {
                        if (eglGetCurrentContext != EGL14.EGL_NO_CONTEXT && eglGetCurrentDisplay != EGL14.EGL_NO_DISPLAY) {
                            EGL14.eglMakeCurrent(eglGetCurrentDisplay, eglGetCurrentSurface, eglGetCurrentSurface2, eglGetCurrentContext);
                        } else {
                            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
                            EGL14.eglMakeCurrent(eglGetDisplay, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
                        }
                        EGL14.eglDestroySurface(eglGetDisplay, eglCreatePbufferSurface);
                        throw th;
                    }
                } catch (Throwable th2) {
                    EGL14.eglDestroyContext(eglGetDisplay, eglCreateContext);
                    throw th2;
                }
            }
            return "";
        } finally {
            EGL14.eglTerminate(eglGetDisplay);
        }
    }

    private static Object resolveFieldOrZeroArgMethod(Object obj, String str) {
        Class<?> cls;
        boolean z = obj instanceof Class;
        if (z) {
            cls = (Class) obj;
        } else {
            cls = obj.getClass();
        }
        if (z) {
            obj = null;
        }
        try {
            try {
                return cls.getField(str).get(obj);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        } catch (IllegalAccessException unused2) {
            return null;
        } catch (NoSuchFieldException unused3) {
            return cls.getMethod(str, null).invoke(obj, null);
        }
    }

    private Object resolveMethodWithArgs(Object obj, String str, List<Object> list) {
        Class<?> cls;
        boolean z = obj instanceof Class;
        if (z) {
            cls = (Class) obj;
        } else {
            cls = obj.getClass();
        }
        if (z) {
            obj = null;
        }
        if (obj == null && SETTINGS_ROOTS.contains(cls.getName()) && SETTINGS_GETTERS.contains(str) && (list.isEmpty() || !(list.get(0) instanceof ContentResolver))) {
            ArrayList arrayList = new ArrayList(list.size() + 1);
            arrayList.add(this.context.getContentResolver());
            arrayList.addAll(list);
            Object invokeBestOverload = invokeBestOverload(cls, str, arrayList, null);
            if (invokeBestOverload != null) {
                return invokeBestOverload;
            }
        }
        return invokeBestOverload(cls, str, list, obj);
    }

    private Object resolveMethodWithStringArg(Object obj, String str, String str2) {
        Class<?> cls;
        boolean z = obj instanceof Class;
        if (z) {
            cls = (Class) obj;
        } else {
            cls = obj.getClass();
        }
        if (z) {
            obj = null;
        }
        if (obj == null && SETTINGS_ROOTS.contains(cls.getName()) && SETTINGS_GETTERS.contains(str)) {
            try {
                return cls.getMethod(str, ContentResolver.class, String.class).invoke(null, this.context.getContentResolver(), str2);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
        try {
            return cls.getMethod(str, String.class).invoke(obj, str2);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            return null;
        }
    }

    public static List<String> splitOnTopLevel(char c, String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (z2) {
                sb.append(charAt);
                z2 = false;
            } else if (z3) {
                if (charAt == '\\') {
                    z2 = true;
                } else if (charAt == '\"') {
                    z3 = false;
                }
                sb.append(charAt);
            } else if (charAt == '\"') {
                sb.append(charAt);
                z3 = true;
            } else if (charAt == '(') {
                i++;
                sb.append(charAt);
            } else if (charAt == ')') {
                if (i > 0) {
                    i--;
                }
                sb.append(charAt);
            } else if (charAt == c && i == 0) {
                if (z || sb.length() > 0) {
                    arrayList.add(sb.toString());
                }
                sb.setLength(0);
            } else {
                sb.append(charAt);
            }
        }
        if (!z && sb.length() <= 0) {
            return arrayList;
        }
        arrayList.add(sb.toString());
        return arrayList;
    }

    public static List<String> tokenize(String str) {
        return splitOnTopLevel('.', str, false);
    }

    private static int topLevelEqualsIdx(String str) {
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (z) {
                z = false;
            } else if (z2) {
                if (charAt == '\\') {
                    z = true;
                } else if (charAt == '\"') {
                    z2 = false;
                }
            } else if (charAt == '\"') {
                z2 = true;
            } else if (charAt == '(') {
                i++;
            } else if (charAt == ')') {
                if (i > 0) {
                    i--;
                }
            } else if (charAt == '=' && i == 0) {
                return i2;
            }
        }
        return -1;
    }

    private static int topLevelLabelColonIdx(String str) {
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (z) {
                z = false;
            } else if (z2) {
                if (charAt == '\\') {
                    z = true;
                } else if (charAt == '\"') {
                    z2 = false;
                }
            } else if (charAt == '\"') {
                z2 = true;
            } else if (charAt == '(') {
                i++;
            } else if (charAt == ')') {
                if (i > 0) {
                    i--;
                }
            } else if (i != 0) {
                continue;
            } else {
                if (charAt == ':') {
                    return i2;
                }
                if (charAt == '.' || charAt == ',') {
                    return -1;
                }
            }
        }
        return -1;
    }

    public boolean blobDelete(int i, String str) {
        File blobFile = blobFile(i, str);
        if (blobFile == null) {
            return false;
        }
        if (blobFile.delete()) {
            return true;
        }
        return !blobFile.exists();
    }

    public byte[] blobGet(int i, String str) {
        File blobFile = blobFile(i, str);
        if (blobFile != null && blobFile.exists()) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(blobFile, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
                try {
                    long length = randomAccessFile.length();
                    if (length > 2147483647L) {
                        randomAccessFile.close();
                        return null;
                    }
                    byte[] bArr = new byte[(int) length];
                    randomAccessFile.readFully(bArr);
                    randomAccessFile.close();
                    return bArr;
                } finally {
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public boolean blobSet(int i, String str, byte[] bArr) {
        File blobFile = blobFile(i, str);
        if (blobFile == null) {
            return false;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        File file = new File(blobFile.getParentFile(), blobFile.getName() + ".tmp");
        synchronized (this.blobLock) {
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        if (bArr.length > 0) {
                            fileOutputStream.write(bArr);
                        }
                        fileOutputStream.getFD().sync();
                        fileOutputStream.close();
                        if (!atomicReplace(file, blobFile)) {
                            file.delete();
                            return false;
                        }
                        return true;
                    } finally {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                    }
                } finally {
                }
            } catch (IOException unused) {
                file.delete();
                return false;
            }
        }
    }

    public Object evaluateJvmExpression(String str) {
        if (str == null || str.isEmpty() || str.length() > 4096) {
            return null;
        }
        try {
            List<String> splitOnTopLevel = splitOnTopLevel(';', str, true);
            if (!splitOnTopLevel.isEmpty() && splitOnTopLevel.size() <= 17) {
                HashMap hashMap = new HashMap();
                Iterator<String> it = splitOnTopLevel.iterator();
                Object obj = null;
                while (it.hasNext()) {
                    String trim = it.next().trim();
                    if (!trim.isEmpty()) {
                        if (!trim.startsWith("let ") && !trim.startsWith("let\t")) {
                            obj = evaluateExpr(trim, hashMap);
                        }
                        int i = topLevelEqualsIdx(trim);
                        if (i < 0) {
                            return null;
                        }
                        String trim2 = trim.substring(3, i).trim();
                        if (!isValidIdent(trim2)) {
                            return null;
                        }
                        hashMap.put(trim2, evaluateExpr(trim.substring(i + 1).trim(), hashMap));
                    }
                }
                return obj;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public String generateUuid() {
        return UUID.randomUUID().toString();
    }

    /* JADX WARN: Finally extract failed */
    public int httpDownloadToBlob(String str, String str2, int i, String str3) {
        HttpURLConnection httpURLConnection;
        File blobFile = blobFile(i, str3);
        if (blobFile == null) {
            return -1;
        }
        File file = new File(blobFile.getParentFile(), blobFile.getName() + ".tmp");
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            } catch (IOException unused) {
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setConnectTimeout(30000);
            httpURLConnection.setReadTimeout(30000);
            if (str2 != null) {
                for (String str4 : str2.split("\r\n")) {
                    int indexOf = str4.indexOf(58);
                    if (indexOf > 0) {
                        httpURLConnection.setRequestProperty(str4.substring(0, indexOf).trim(), str4.substring(indexOf + 1).trim());
                    }
                }
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode >= 200 && responseCode < 300) {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (inputStream == null) {
                    httpURLConnection.disconnect();
                    return -1;
                }
                synchronized (this.blobLock) {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                            }
                            fileOutputStream.getFD().sync();
                            fileOutputStream.close();
                            inputStream.close();
                            if (!atomicReplace(file, blobFile)) {
                                file.delete();
                                httpURLConnection.disconnect();
                                return -1;
                            }
                            httpURLConnection.disconnect();
                            return responseCode;
                        } catch (Throwable th2) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        inputStream.close();
                        throw th4;
                    }
                }
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                try {
                    do {
                    } while (errorStream.read(new byte[4096]) != -1);
                    errorStream.close();
                } catch (Throwable th5) {
                    errorStream.close();
                    throw th5;
                }
            }
            httpURLConnection.disconnect();
            return responseCode;
        } catch (IOException unused2) {
            httpURLConnection2 = httpURLConnection;
            file.delete();
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            return -1;
        } catch (Throwable th6) {
            th = th6;
            httpURLConnection2 = httpURLConnection;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            throw th;
        }
    }

    public HttpResult httpGet(String str, String str2) {
        return httpExecute("GET", str, str2, null);
    }

    public HttpResult httpPost(String str, String str2, byte[] bArr) {
        return httpExecute("POST", str, str2, bArr);
    }

    public String kvGet(String str) {
        return this.prefs.getString(str, null);
    }

    public boolean kvSet(String str, String str2) {
        this.prefs.edit().putString(str, str2).apply();
        return true;
    }

    public byte[] platformQueryBytes(int i) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        int i2 = 0;
        try {
            if (i != 107) {
                if (i != 111) {
                    if (i != 112) {
                        return null;
                    }
                    LocaleList locales = this.context.getResources().getConfiguration().getLocales();
                    ArrayList arrayList = new ArrayList(locales.size());
                    while (i2 < locales.size()) {
                        arrayList.add(locales.get(i2).toString());
                        i2++;
                    }
                    return encodeRepeatedString(87, arrayList);
                }
                InputMethodManager inputMethodManager = (InputMethodManager) this.context.getSystemService("input_method");
                if (inputMethodManager == null) {
                    return null;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator<InputMethodInfo> it = inputMethodManager.getInputMethodList().iterator();
                while (it.hasNext()) {
                    Iterator<InputMethodSubtype> it2 = inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true).iterator();
                    while (it2.hasNext()) {
                        String locale = it2.next().getLocale();
                        if (!locale.isEmpty()) {
                            linkedHashSet.add(locale);
                        }
                    }
                }
                return encodeRepeatedString(86, new ArrayList(linkedHashSet));
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) this.context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            while (i2 <= 6) {
                try {
                    if (networkCapabilities.hasTransport(i2)) {
                        arrayList2.add(Integer.valueOf(i2));
                    }
                } catch (Exception unused) {
                }
                i2++;
            }
            return encodeRepeatedInt32(63, arrayList2);
        } catch (Exception unused2) {
            return null;
        }
    }

    public Long platformQueryInt(int i) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        try {
            switch (i) {
                case 100:
                    ApplicationInfo applicationInfo = this.applicationInfo;
                    if (applicationInfo == null) {
                        return null;
                    }
                    if ((applicationInfo.flags & 2) != 0) {
                        j2 = 1;
                    } else {
                        j2 = 0;
                    }
                    return Long.valueOf(j2);
                case 101:
                    try {
                        Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
                        return 1L;
                    } catch (ClassNotFoundException unused) {
                        return 0L;
                    }
                case 102:
                case 112:
                case 113:
                case 115:
                case 120:
                case 140:
                case 141:
                case 142:
                case 149:
                default:
                    return null;
                case 103:
                    PackageInfo packageInfo = this.packageInfo;
                    if (packageInfo == null) {
                        return null;
                    }
                    return Long.valueOf(packageInfo.getLongVersionCode());
                case 104:
                    return Long.valueOf(Build.VERSION.SDK_INT);
                case 105:
                    return Long.valueOf(Runtime.getRuntime().availableProcessors());
                case 106:
                    TelephonyManager telephonyManager = (TelephonyManager) this.context.getSystemService("phone");
                    if (telephonyManager != null) {
                        j3 = telephonyManager.getPhoneType();
                    } else {
                        j3 = 0;
                    }
                    return Long.valueOf(j3);
                case 107:
                    String str = System.getenv(AndroidStaticDeviceInfoDataSource.ENVIRONMENT_VARIABLE_PATH);
                    if (str != null) {
                        for (String str2 : str.split(":")) {
                            if (new File(str2, AndroidStaticDeviceInfoDataSource.BINARY_SU).exists()) {
                                return 1L;
                            }
                        }
                    }
                    return 0L;
                case 108:
                    return Long.valueOf(Settings.Global.getInt(this.context.getContentResolver(), "adb_enabled", 0));
                case 109:
                    Intent intent = this.batteryIntent;
                    if (intent == null) {
                        return 0L;
                    }
                    if (intent.getIntExtra("plugged", -1) == 2) {
                        j4 = 1;
                    } else {
                        j4 = 0;
                    }
                    return Long.valueOf(j4);
                case 110:
                    if (Settings.Global.getInt(this.context.getContentResolver(), "stay_on_while_plugged_in", 0) != 0) {
                        j5 = 1;
                    } else {
                        j5 = 0;
                    }
                    return Long.valueOf(j5);
                case 111:
                    String externalStorageState = Environment.getExternalStorageState();
                    if (!"mounted".equals(externalStorageState) && !"mounted_ro".equals(externalStorageState)) {
                        j6 = 0;
                        return Long.valueOf(j6);
                    }
                    j6 = 1;
                    return Long.valueOf(j6);
                case 114:
                    return 0L;
                case 116:
                    return Long.valueOf(this.context.getResources().getDisplayMetrics().densityDpi);
                case 117:
                    return Long.valueOf(this.context.getResources().getDisplayMetrics().widthPixels);
                case 118:
                    return Long.valueOf(this.context.getResources().getDisplayMetrics().heightPixels);
                case 119:
                    int i2 = this.context.getResources().getConfiguration().uiMode & 48;
                    if (i2 == 32) {
                        return 2L;
                    }
                    if (i2 == 16) {
                        return 1L;
                    }
                    return 0L;
                case 121:
                    ConnectivityManager connectivityManager = (ConnectivityManager) this.context.getSystemService("connectivity");
                    if (connectivityManager == null) {
                        return 0L;
                    }
                    if (connectivityManager.getActiveNetwork() != null) {
                        j7 = 1;
                    } else {
                        j7 = 0;
                    }
                    return Long.valueOf(j7);
                case 122:
                    ConnectivityManager connectivityManager2 = (ConnectivityManager) this.context.getSystemService("connectivity");
                    if (connectivityManager2 == null || (activeNetwork = connectivityManager2.getActiveNetwork()) == null || (networkCapabilities = connectivityManager2.getNetworkCapabilities(activeNetwork)) == null) {
                        return 0L;
                    }
                    if (networkCapabilities.hasTransport(1)) {
                        return 1L;
                    }
                    networkCapabilities.hasTransport(0);
                    return 0L;
                case 123:
                    ConnectivityManager connectivityManager3 = (ConnectivityManager) this.context.getSystemService("connectivity");
                    if (connectivityManager3 == null) {
                        return 0L;
                    }
                    if (connectivityManager3.isActiveNetworkMetered()) {
                        j8 = 1;
                    } else {
                        j8 = 0;
                    }
                    return Long.valueOf(j8);
                case 124:
                    return Long.valueOf(Settings.Global.getInt(this.context.getContentResolver(), "airplane_mode_on", 0));
                case 125:
                    return Long.valueOf(new StatFs(Environment.getDataDirectory().getPath()).getTotalBytes());
                case 126:
                    return Long.valueOf(new StatFs(Environment.getDataDirectory().getPath()).getAvailableBytes());
                case 127:
                    ActivityManager activityManager = (ActivityManager) this.context.getSystemService("activity");
                    if (activityManager == null) {
                        return null;
                    }
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    return Long.valueOf(memoryInfo.totalMem);
                case 128:
                    ActivityManager activityManager2 = (ActivityManager) this.context.getSystemService("activity");
                    if (activityManager2 == null) {
                        return null;
                    }
                    ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
                    activityManager2.getMemoryInfo(memoryInfo2);
                    return Long.valueOf(memoryInfo2.availMem);
                case 129:
                    return Long.valueOf(Runtime.getRuntime().freeMemory());
                case 130:
                    return Long.valueOf(Runtime.getRuntime().totalMemory());
                case 131:
                    return Long.valueOf(SystemClock.uptimeMillis());
                case 132:
                    return Long.valueOf(SystemClock.elapsedRealtime());
                case 133:
                    AudioManager audioManager = (AudioManager) this.context.getSystemService("audio");
                    if (audioManager == null) {
                        return null;
                    }
                    int streamVolume = audioManager.getStreamVolume(3);
                    int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                    if (streamMaxVolume > 0) {
                        j9 = (streamVolume * 100) / streamMaxVolume;
                    } else {
                        j9 = 0;
                    }
                    return Long.valueOf(j9);
                case 134:
                    if (this.batteryIntent == null) {
                        return null;
                    }
                    return Long.valueOf(r0.getIntExtra("status", -1));
                case 135:
                    PowerManager powerManager = (PowerManager) this.context.getSystemService("power");
                    if (powerManager != null && powerManager.isPowerSaveMode()) {
                        j10 = 1;
                    } else {
                        j10 = 0;
                    }
                    return Long.valueOf(j10);
                case 136:
                    if (this.batteryIntent == null) {
                        return null;
                    }
                    return Long.valueOf(r0.getIntExtra("plugged", -1));
                case 137:
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    if (runningAppProcessInfo.importance <= 100) {
                        j11 = 1;
                    } else {
                        j11 = 0;
                    }
                    return Long.valueOf(j11);
                case 138:
                    AudioManager audioManager2 = (AudioManager) this.context.getSystemService("audio");
                    if (audioManager2 != null && audioManager2.isWiredHeadsetOn()) {
                        j12 = 1;
                    } else {
                        j12 = 0;
                    }
                    return Long.valueOf(j12);
                case 139:
                    return Long.valueOf(TimeZone.getDefault().getOffset(System.currentTimeMillis()) / UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT);
                case 143:
                    try {
                        return Long.valueOf(Settings.Secure.getInt(this.context.getContentResolver(), AndroidDynamicDeviceInfoDataSource.SETTING_ACCESSIBILITY_DISPLAY_INVERSION_ENABLED, 0));
                    } catch (Exception unused2) {
                        return 0L;
                    }
                case 144:
                    return Long.valueOf(this.context.getResources().getConfiguration().fontScale * 1000.0f);
                case 145:
                    try {
                        return Long.valueOf(Settings.Global.getFloat(this.context.getContentResolver(), "animator_duration_scale", 1.0f) * 1000.0f);
                    } catch (Exception unused3) {
                        return 1000L;
                    }
                case 146:
                    DisplayMetrics displayMetrics = this.context.getResources().getDisplayMetrics();
                    float f = displayMetrics.xdpi;
                    if (f > 0.0f) {
                        float f2 = displayMetrics.ydpi;
                        if (f2 > 0.0f) {
                            double d = displayMetrics.widthPixels / f;
                            double d2 = displayMetrics.heightPixels / f2;
                            return Long.valueOf((long) (Math.sqrt((d2 * d2) + (d * d)) * 1000.0d));
                        }
                    }
                    return null;
                case 147:
                    int i3 = Settings.System.getInt(this.context.getContentResolver(), "screen_brightness", -1);
                    if (i3 < 0) {
                        return null;
                    }
                    return Long.valueOf((i3 * 1000) / 255);
                case 148:
                    Intent intent2 = this.batteryIntent;
                    if (intent2 == null) {
                        return null;
                    }
                    int intExtra = intent2.getIntExtra("level", -1);
                    int intExtra2 = intent2.getIntExtra("scale", -1);
                    if (intExtra >= 0 && intExtra2 > 0) {
                        return Long.valueOf((intExtra * 1000) / intExtra2);
                    }
                    return null;
                case 150:
                    if (Build.VERSION.SDK_INT >= 30) {
                        try {
                            return Long.valueOf(((Number) Class.forName("android.os.ext.SdkExtensions").getMethod("getExtensionVersion", Integer.TYPE).invoke(null, 30)).longValue());
                        } catch (Exception unused4) {
                        }
                    }
                    return 0L;
                case 151:
                    return Long.valueOf(Runtime.getRuntime().maxMemory());
                case 152:
                    try {
                        if (Settings.Secure.getInt(this.context.getContentResolver(), AndroidDynamicDeviceInfoDataSource.SETTING_ACCESSIBILITY_DISPLAY_DALTONIZER_ENABLED, 0) != 0) {
                            j = 1;
                        } else {
                            j = 0;
                        }
                        return Long.valueOf(j);
                    } catch (Exception unused5) {
                        return 0L;
                    }
            }
        } catch (SecurityException | Exception unused6) {
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0111 A[ADDED_TO_REGION, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String platformQueryString(int r4) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.coherence.Coherence.platformQueryString(int):java.lang.String");
    }

    public Boolean reflectBool(String str) {
        Object resolvePath = resolvePath(str);
        if (resolvePath instanceof Boolean) {
            return (Boolean) resolvePath;
        }
        return null;
    }

    public Double reflectDouble(String str) {
        Object resolvePath = resolvePath(str);
        if (resolvePath instanceof Number) {
            return Double.valueOf(((Number) resolvePath).doubleValue());
        }
        return null;
    }

    public Boolean reflectEvalBool(String str) {
        Object evaluateJvmExpression = evaluateJvmExpression(str);
        if (evaluateJvmExpression instanceof Boolean) {
            return (Boolean) evaluateJvmExpression;
        }
        return null;
    }

    public Long reflectEvalInt(String str) {
        Object evaluateJvmExpression = evaluateJvmExpression(str);
        if (evaluateJvmExpression instanceof Number) {
            return Long.valueOf(((Number) evaluateJvmExpression).longValue());
        }
        return null;
    }

    public String reflectEvalString(String str) {
        Object evaluateJvmExpression = evaluateJvmExpression(str);
        if (evaluateJvmExpression instanceof String) {
            return (String) evaluateJvmExpression;
        }
        return null;
    }

    public Long reflectInt(String str) {
        Object resolvePath = resolvePath(str);
        if (resolvePath instanceof Number) {
            return Long.valueOf(((Number) resolvePath).longValue());
        }
        return null;
    }

    public String reflectListJvm(String str) {
        Class<?> cls;
        boolean z;
        boolean z2;
        Object evaluateJvmExpression = evaluateJvmExpression(str);
        if (evaluateJvmExpression == null) {
            return null;
        }
        if (evaluateJvmExpression instanceof Class) {
            cls = (Class) evaluateJvmExpression;
        } else {
            cls = evaluateJvmExpression.getClass();
        }
        StringBuilder sb = new StringBuilder();
        Field[] fields = cls.getFields();
        int length = fields.length;
        int i = 0;
        while (true) {
            z = true;
            if (i < length) {
                String str2 = "F\t" + fields[i].getName() + "\n";
                if (str2.length() + sb.length() > 32768) {
                    z2 = true;
                    break;
                }
                sb.append(str2);
                i++;
            } else {
                z2 = false;
                break;
            }
        }
        if (!z2) {
            for (Method method : cls.getMethods()) {
                String k = h11.k(new StringBuilder("M\t"), methodDescriptor(method), "\n");
                if (k.length() + sb.length() > 32768) {
                    break;
                }
                sb.append(k);
            }
        }
        z = z2;
        if (z) {
            sb.append("...\n");
        }
        return sb.toString();
    }

    public String reflectString(String str) {
        Object resolvePath = resolvePath(str);
        if (resolvePath instanceof String) {
            return (String) resolvePath;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        if (r1 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object resolvePath(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L90
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto Lb
            goto L90
        Lb:
            java.util.List r8 = tokenize(r8)
            boolean r1 = r8.isEmpty()
            if (r1 != 0) goto L90
            int r1 = r8.size()
            r2 = 32
            if (r1 <= r2) goto L1f
            goto L90
        L1f:
            r1 = 0
            java.lang.Object r2 = r8.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "context"
            boolean r3 = r3.equals(r2)
            r4 = 1
            if (r3 == 0) goto L32
            android.content.Context r1 = r7.context
            goto L79
        L32:
            java.lang.String r3 = "stickyIntent("
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L4f
            java.lang.String r1 = extractStringArg(r2)
            if (r1 != 0) goto L41
            return r0
        L41:
            android.content.Context r2 = r7.context     // Catch: java.lang.Throwable -> L4e
            android.content.IntentFilter r3 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L4e
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L4e
            android.content.Intent r1 = r2.registerReceiver(r0, r3)     // Catch: java.lang.Throwable -> L4e
            if (r1 != 0) goto L79
        L4e:
            return r0
        L4f:
            int r2 = r8.size()
        L53:
            r3 = -1
            if (r2 < r4) goto L74
            int r5 = r2 + (-1)
            java.lang.Object r5 = r8.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r6 = 40
            int r5 = r5.indexOf(r6)
            if (r5 == r3) goto L67
            goto L71
        L67:
            java.lang.String r3 = join(r8, r1, r2)
            java.lang.Class r1 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L71
            r4 = r2
            goto L76
        L71:
            int r2 = r2 + (-1)
            goto L53
        L74:
            r1 = r0
            r4 = r3
        L76:
            if (r1 != 0) goto L79
            return r0
        L79:
            int r2 = r8.size()
            if (r4 >= r2) goto L8f
            if (r1 != 0) goto L82
            return r0
        L82:
            java.lang.Object r2 = r8.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r7.dispatchSegment(r1, r2)
            int r4 = r4 + 1
            goto L79
        L8f:
            return r1
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.coherence.Coherence.resolvePath(java.lang.String):java.lang.Object");
    }
}
