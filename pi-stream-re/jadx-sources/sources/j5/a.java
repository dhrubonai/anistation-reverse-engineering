package j5;

import a3.g;
import android.animation.TimeInterpolator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Typeface;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.StrictMode;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import androidx.lifecycle.u;
import c1.q0;
import com.bumptech.glide.c;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import d2.g0;
import f1.o;
import f1.s;
import f1.t;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.MappedByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import k0.d;
import k0.e;
import k3.m;
import l1.f0;
import msr.pistream.app.R;
import p7.a0;
import q0.v;
import r.f;
import r6.h0;
import w.p;
import z.h;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static Context f6143a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f6144b;

    /* renamed from: c, reason: collision with root package name */
    public static long f6145c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f6146d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f6147e;

    /* renamed from: f, reason: collision with root package name */
    public static Boolean f6148f;

    /* renamed from: g, reason: collision with root package name */
    public static Boolean f6149g;

    /* renamed from: h, reason: collision with root package name */
    public static Boolean f6150h;

    /* renamed from: r, reason: collision with root package name */
    public static String f6159r;

    /* renamed from: s, reason: collision with root package name */
    public static int f6160s;

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f6151i = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f6152j = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f6153k = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f6154l = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f6155m = {5, 8, 10, 12};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f6156n = {6, 9, 12, 15};
    public static final int[] o = {2, 4, 6, 8};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f6157p = {9, 11, 13, 16};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f6158q = {5, 8, 10, 12};

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f6161t = {112, 114, 111, 0};

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f6162u = {112, 114, 109, 0};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f6163v = new int[0];

    /* renamed from: w, reason: collision with root package name */
    public static final Object[] f6164w = new Object[0];

    /* renamed from: x, reason: collision with root package name */
    public static final float[][] f6165x = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: y, reason: collision with root package name */
    public static final float[][] f6166y = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: z, reason: collision with root package name */
    public static final float[] f6167z = {95.047f, 100.0f, 108.883f};
    public static final float[][] A = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static Intent A(Context context, ComponentName componentName) {
        String B = B(context, componentName);
        if (B == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), B);
        if (B(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static String B(Context context, ComponentName componentName) {
        int i10;
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            i10 = 269222528;
        } else if (i11 >= 24) {
            i10 = 787072;
        } else {
            i10 = 640;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i10);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            return context.getPackageName() + string;
        }
        return string;
    }

    public static int[] C(String str) {
        boolean z9;
        int i10;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i11 = indexOf4 + 2;
        if (i11 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i11) == '/') {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            i10 = str.indexOf(47, indexOf4 + 3);
            if (i10 == -1 || i10 > indexOf2) {
                i10 = indexOf2;
            }
        } else {
            i10 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i10;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static int D(int i10) {
        if (i10 != 1) {
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 != 8) {
                if (i10 == 16) {
                    return 4;
                }
                if (i10 != 32) {
                    if (i10 != 64) {
                        if (i10 != 128) {
                            if (i10 == 256) {
                                return 8;
                            }
                            throw new IllegalArgumentException(g.n("type needs to be >= FIRST and <= LAST, type=", i10));
                        }
                        return 7;
                    }
                    return 6;
                }
                return 5;
            }
            return 3;
        }
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int E(String str) {
        char c6;
        if (str == null) {
            return -1;
        }
        String o6 = q0.o(str);
        o6.getClass();
        switch (o6.hashCode()) {
            case -2123537834:
                if (o6.equals("audio/eac3-joc")) {
                    c6 = 0;
                    break;
                }
                c6 = 65535;
                break;
            case -1662384011:
                if (o6.equals("video/mp2p")) {
                    c6 = 1;
                    break;
                }
                c6 = 65535;
                break;
            case -1662384007:
                if (o6.equals("video/mp2t")) {
                    c6 = 2;
                    break;
                }
                c6 = 65535;
                break;
            case -1662095187:
                if (o6.equals("video/webm")) {
                    c6 = 3;
                    break;
                }
                c6 = 65535;
                break;
            case -1606874997:
                if (o6.equals("audio/amr-wb")) {
                    c6 = 4;
                    break;
                }
                c6 = 65535;
                break;
            case -1487464690:
                if (o6.equals("image/heif")) {
                    c6 = 5;
                    break;
                }
                c6 = 65535;
                break;
            case -1487394660:
                if (o6.equals("image/jpeg")) {
                    c6 = 6;
                    break;
                }
                c6 = 65535;
                break;
            case -1487018032:
                if (o6.equals("image/webp")) {
                    c6 = 7;
                    break;
                }
                c6 = 65535;
                break;
            case -1248337486:
                if (o6.equals("application/mp4")) {
                    c6 = '\b';
                    break;
                }
                c6 = 65535;
                break;
            case -1079884372:
                if (o6.equals("video/x-msvideo")) {
                    c6 = '\t';
                    break;
                }
                c6 = 65535;
                break;
            case -1004728940:
                if (o6.equals("text/vtt")) {
                    c6 = '\n';
                    break;
                }
                c6 = 65535;
                break;
            case -879272239:
                if (o6.equals("image/bmp")) {
                    c6 = 11;
                    break;
                }
                c6 = 65535;
                break;
            case -879258763:
                if (o6.equals("image/png")) {
                    c6 = '\f';
                    break;
                }
                c6 = 65535;
                break;
            case -387023398:
                if (o6.equals("audio/x-matroska")) {
                    c6 = '\r';
                    break;
                }
                c6 = 65535;
                break;
            case -43467528:
                if (o6.equals("application/webm")) {
                    c6 = 14;
                    break;
                }
                c6 = 65535;
                break;
            case 13915911:
                if (o6.equals("video/x-flv")) {
                    c6 = 15;
                    break;
                }
                c6 = 65535;
                break;
            case 187078296:
                if (o6.equals("audio/ac3")) {
                    c6 = 16;
                    break;
                }
                c6 = 65535;
                break;
            case 187078297:
                if (o6.equals("audio/ac4")) {
                    c6 = 17;
                    break;
                }
                c6 = 65535;
                break;
            case 187078669:
                if (o6.equals("audio/amr")) {
                    c6 = 18;
                    break;
                }
                c6 = 65535;
                break;
            case 187090232:
                if (o6.equals("audio/mp4")) {
                    c6 = 19;
                    break;
                }
                c6 = 65535;
                break;
            case 187091926:
                if (o6.equals("audio/ogg")) {
                    c6 = 20;
                    break;
                }
                c6 = 65535;
                break;
            case 187099443:
                if (o6.equals("audio/wav")) {
                    c6 = 21;
                    break;
                }
                c6 = 65535;
                break;
            case 1331848029:
                if (o6.equals("video/mp4")) {
                    c6 = 22;
                    break;
                }
                c6 = 65535;
                break;
            case 1503095341:
                if (o6.equals("audio/3gpp")) {
                    c6 = 23;
                    break;
                }
                c6 = 65535;
                break;
            case 1504578661:
                if (o6.equals("audio/eac3")) {
                    c6 = 24;
                    break;
                }
                c6 = 65535;
                break;
            case 1504619009:
                if (o6.equals("audio/flac")) {
                    c6 = 25;
                    break;
                }
                c6 = 65535;
                break;
            case 1504824762:
                if (o6.equals("audio/midi")) {
                    c6 = 26;
                    break;
                }
                c6 = 65535;
                break;
            case 1504831518:
                if (o6.equals("audio/mpeg")) {
                    c6 = 27;
                    break;
                }
                c6 = 65535;
                break;
            case 1505118770:
                if (o6.equals("audio/webm")) {
                    c6 = 28;
                    break;
                }
                c6 = 65535;
                break;
            case 2039520277:
                if (o6.equals("video/x-matroska")) {
                    c6 = 29;
                    break;
                }
                c6 = 65535;
                break;
            default:
                c6 = 65535;
                break;
        }
        switch (c6) {
            case 0:
            case 16:
            case 24:
                return 0;
            case 1:
                return 10;
            case 2:
                return 11;
            case 3:
            case '\r':
            case 14:
            case 28:
            case 29:
                return 6;
            case 4:
            case 18:
            case 23:
                return 3;
            case 5:
                return 20;
            case 6:
                return 14;
            case zzaja.zze.zzg /* 7 */:
                return 18;
            case '\b':
            case 19:
            case 22:
                return 8;
            case '\t':
                return 16;
            case '\n':
                return 13;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return 19;
            case '\f':
                return 17;
            case 15:
                return 5;
            case 17:
                return 1;
            case 20:
                return 9;
            case 21:
                return 12;
            case 25:
                return 4;
            case 26:
                return 15;
            case 27:
                return 7;
            default:
                return -1;
        }
    }

    public static int F(Map map) {
        String str;
        List list = (List) map.get("Content-Type");
        if (list != null && !list.isEmpty()) {
            str = (String) list.get(0);
        } else {
            str = null;
        }
        return E(str);
    }

    public static int G(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (!lastPathSegment.endsWith(".ac3") && !lastPathSegment.endsWith(".ec3")) {
            if (lastPathSegment.endsWith(".ac4")) {
                return 1;
            }
            if (!lastPathSegment.endsWith(".adts") && !lastPathSegment.endsWith(".aac")) {
                if (lastPathSegment.endsWith(".amr")) {
                    return 3;
                }
                if (lastPathSegment.endsWith(".flac")) {
                    return 4;
                }
                if (lastPathSegment.endsWith(".flv")) {
                    return 5;
                }
                if (!lastPathSegment.endsWith(".mid") && !lastPathSegment.endsWith(".midi") && !lastPathSegment.endsWith(".smf")) {
                    if (!lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".webm")) {
                        if (lastPathSegment.endsWith(".mp3")) {
                            return 7;
                        }
                        if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) && !lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                            if (!lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".opus")) {
                                if (!lastPathSegment.endsWith(".ps") && !lastPathSegment.endsWith(".mpeg") && !lastPathSegment.endsWith(".mpg") && !lastPathSegment.endsWith(".m2p")) {
                                    if (!lastPathSegment.endsWith(".ts") && !lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                                        if (!lastPathSegment.endsWith(".wav") && !lastPathSegment.endsWith(".wave")) {
                                            if (!lastPathSegment.endsWith(".vtt") && !lastPathSegment.endsWith(".webvtt")) {
                                                if (!lastPathSegment.endsWith(".jpg") && !lastPathSegment.endsWith(".jpeg")) {
                                                    if (lastPathSegment.endsWith(".avi")) {
                                                        return 16;
                                                    }
                                                    if (lastPathSegment.endsWith(".png")) {
                                                        return 17;
                                                    }
                                                    if (lastPathSegment.endsWith(".webp")) {
                                                        return 18;
                                                    }
                                                    if (!lastPathSegment.endsWith(".bmp") && !lastPathSegment.endsWith(".dib")) {
                                                        if (!lastPathSegment.endsWith(".heic")) {
                                                            return -1;
                                                        }
                                                        return 20;
                                                    }
                                                    return 19;
                                                }
                                                return 14;
                                            }
                                            return 13;
                                        }
                                        return 12;
                                    }
                                    return 11;
                                }
                                return 10;
                            }
                            return 9;
                        }
                        return 8;
                    }
                    return 6;
                }
                return 15;
            }
            return 2;
        }
        return 0;
    }

    public static int H(float f10) {
        boolean z9;
        float f11;
        boolean z10;
        float f12;
        if (f10 < 1.0f) {
            return -16777216;
        }
        if (f10 > 99.0f) {
            return -1;
        }
        float f13 = (f10 + 16.0f) / 116.0f;
        if (f10 > 8.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            f11 = f13 * f13 * f13;
        } else {
            f11 = f10 / 903.2963f;
        }
        float f14 = f13 * f13 * f13;
        if (f14 > 0.008856452f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f12 = f14;
        } else {
            f12 = ((f13 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z10) {
            f14 = ((f13 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f6167z;
        return z.a.a(f12 * fArr[0], f11 * fArr[1], f14 * fArr[2]);
    }

    public static boolean I() {
        try {
            if (f6146d == null) {
                return f0.w();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f6146d == null) {
                f6145c = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f6146d = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f6146d.invoke(null, Long.valueOf(f6145c))).booleanValue();
        } catch (Exception e10) {
            if (e10 instanceof InvocationTargetException) {
                Throwable cause = e10.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            Log.v("Trace", "Unable to call isTagEnabled via reflection", e10);
            return false;
        }
    }

    public static boolean J(String str, String str2) {
        if (str.startsWith(str2.concat("(")) && str.endsWith(")")) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r0 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean K(android.content.Context r4) {
        /*
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            java.lang.Boolean r1 = j5.a.f6147e
            if (r1 != 0) goto L14
            java.lang.String r1 = "android.hardware.type.watch"
            boolean r0 = r0.hasSystemFeature(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            j5.a.f6147e = r0
        L14:
            java.lang.Boolean r0 = j5.a.f6147e
            boolean r0 = r0.booleanValue()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L29
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r0 < r3) goto L26
            r0 = r2
            goto L27
        L26:
            r0 = r1
        L27:
            if (r0 == 0) goto L59
        L29:
            java.lang.Boolean r0 = j5.a.f6148f
            if (r0 != 0) goto L3d
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.String r0 = "cn.google"
            boolean r4 = r4.hasSystemFeature(r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            j5.a.f6148f = r4
        L3d:
            java.lang.Boolean r4 = j5.a.f6148f
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L5a
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r4 < r0) goto L4d
            r0 = r2
            goto L4e
        L4d:
            r0 = r1
        L4e:
            if (r0 == 0) goto L59
            r0 = 30
            if (r4 < r0) goto L56
            r4 = r2
            goto L57
        L56:
            r4 = r1
        L57:
            if (r4 == 0) goto L5a
        L59:
            return r2
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.a.K(android.content.Context):boolean");
    }

    public static float L(int i10) {
        float pow;
        float f10 = i10 / 255.0f;
        if (f10 <= 0.04045f) {
            pow = f10 / 12.92f;
        } else {
            pow = (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    public static Typeface M(Configuration configuration, Typeface typeface) {
        int i10;
        int i11;
        int weight;
        int i12;
        Typeface create;
        if (Build.VERSION.SDK_INT >= 31) {
            i10 = configuration.fontWeightAdjustment;
            if (i10 != Integer.MAX_VALUE) {
                i11 = configuration.fontWeightAdjustment;
                if (i11 != 0 && typeface != null) {
                    weight = typeface.getWeight();
                    i12 = configuration.fontWeightAdjustment;
                    create = Typeface.create(typeface, c.k(i12 + weight, 1, 1000), typeface.isItalic());
                    return create;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static int N(int i10, int i11, int i12) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 4) {
                    return i11 + i12;
                }
                throw new IllegalStateException(g.n("Unexpected flag: ", i10));
            }
            return i11;
        }
        throw new IllegalStateException("HOT methods are not stored in the bitmap");
    }

    public static float O(EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return e.c(edgeEffect, f10, f11);
        }
        d.a(edgeEffect, f10, f11);
        return f10;
    }

    public static int P(s sVar, int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 3 && sVar.h(); i11++) {
            i10++;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 += 1 << iArr[i13];
        }
        return sVar.i(iArr[i10]) + i12;
    }

    public static r0.b Q(MappedByteBuffer mappedByteBuffer) {
        long j4;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        v vVar = new v(0, duplicate);
        vVar.i(4);
        ByteBuffer byteBuffer = vVar.f8963a;
        int i10 = byteBuffer.getShort() & 65535;
        if (i10 <= 100) {
            vVar.i(6);
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    int i12 = byteBuffer.getInt();
                    vVar.i(4);
                    j4 = vVar.h();
                    vVar.i(4);
                    if (1835365473 == i12) {
                        break;
                    }
                    i11++;
                } else {
                    j4 = -1;
                    break;
                }
            }
            if (j4 != -1) {
                vVar.i((int) (j4 - byteBuffer.position()));
                vVar.i(12);
                long h10 = vVar.h();
                for (int i13 = 0; i13 < h10; i13++) {
                    int i14 = byteBuffer.getInt();
                    long h11 = vVar.h();
                    vVar.h();
                    if (1164798569 == i14 || 1701669481 == i14) {
                        duplicate.position((int) (h11 + j4));
                        r0.b bVar = new r0.b();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        bVar.b(duplicate.position() + duplicate.getInt(duplicate.position()), duplicate);
                        return bVar;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    public static int[] R(ByteArrayInputStream byteArrayInputStream, int i10) {
        int[] iArr = new int[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += q6.g.W(byteArrayInputStream);
            iArr[i12] = i11;
        }
        return iArr;
    }

    public static k3.b[] S(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, k3.b[] bVarArr) {
        byte[] bArr3 = a0.f8660z;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(a0.f8655u, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int V = (int) q6.g.V(fileInputStream, 1);
                    byte[] O = q6.g.O(fileInputStream, (int) q6.g.V(fileInputStream, 4), (int) q6.g.V(fileInputStream, 4));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(O);
                        try {
                            k3.b[] T = T(byteArrayInputStream, V, bVarArr);
                            byteArrayInputStream.close();
                            return T;
                        } catch (Throwable th) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    throw new IllegalStateException("Content found after the end of file");
                }
                throw new IllegalStateException("Unsupported meta version");
            }
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (Arrays.equals(bArr, a0.A)) {
            int W = q6.g.W(fileInputStream);
            byte[] O2 = q6.g.O(fileInputStream, (int) q6.g.V(fileInputStream, 4), (int) q6.g.V(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(O2);
                try {
                    k3.b[] U = U(byteArrayInputStream2, bArr2, W, bVarArr);
                    byteArrayInputStream2.close();
                    return U;
                } catch (Throwable th3) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported meta version");
    }

    public static k3.b[] T(ByteArrayInputStream byteArrayInputStream, int i10, k3.b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new k3.b[0];
        }
        if (i10 == bVarArr.length) {
            String[] strArr = new String[i10];
            int[] iArr = new int[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int W = q6.g.W(byteArrayInputStream);
                iArr[i11] = q6.g.W(byteArrayInputStream);
                strArr[i11] = new String(q6.g.M(byteArrayInputStream, W), StandardCharsets.UTF_8);
            }
            for (int i12 = 0; i12 < i10; i12++) {
                k3.b bVar = bVarArr[i12];
                if (bVar.f6444b.equals(strArr[i12])) {
                    int i13 = iArr[i12];
                    bVar.f6447e = i13;
                    bVar.f6450h = R(byteArrayInputStream, i13);
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return bVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static k3.b[] U(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i10, k3.b[] bVarArr) {
        k3.b bVar;
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new k3.b[0];
        }
        if (i10 == bVarArr.length) {
            for (int i11 = 0; i11 < i10; i11++) {
                q6.g.W(byteArrayInputStream);
                String str2 = new String(q6.g.M(byteArrayInputStream, q6.g.W(byteArrayInputStream)), StandardCharsets.UTF_8);
                long V = q6.g.V(byteArrayInputStream, 4);
                int W = q6.g.W(byteArrayInputStream);
                if (bVarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    for (int i12 = 0; i12 < bVarArr.length; i12++) {
                        if (bVarArr[i12].f6444b.equals(str)) {
                            bVar = bVarArr[i12];
                            break;
                        }
                    }
                }
                bVar = null;
                if (bVar != null) {
                    bVar.f6446d = V;
                    int[] R = R(byteArrayInputStream, W);
                    if (Arrays.equals(bArr, a0.f8659y)) {
                        bVar.f6447e = W;
                        bVar.f6450h = R;
                    }
                } else {
                    throw new IllegalStateException("Missing profile key: ".concat(str2));
                }
            }
            return bVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static long V(int i10, int i11, t tVar) {
        boolean z9;
        boolean z10;
        tVar.G(i10);
        if (tVar.f3860c - tVar.f3859b < 5) {
            return -9223372036854775807L;
        }
        int f10 = tVar.f();
        if ((8388608 & f10) != 0 || ((2096896 & f10) >> 8) != i11) {
            return -9223372036854775807L;
        }
        if ((f10 & 32) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 && tVar.v() >= 7 && tVar.f3860c - tVar.f3859b >= 7) {
            if ((tVar.v() & 16) == 16) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                tVar.d(new byte[6], 0, 6);
                return ((r1[3] & 255) << 1) | ((r1[0] & 255) << 25) | ((r1[1] & 255) << 17) | ((r1[2] & 255) << 9) | ((r1[4] & 255) >> 7);
            }
        }
        return -9223372036854775807L;
    }

    public static k3.b[] W(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, a0.f8656v)) {
            int V = (int) q6.g.V(fileInputStream, 1);
            byte[] O = q6.g.O(fileInputStream, (int) q6.g.V(fileInputStream, 4), (int) q6.g.V(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(O);
                try {
                    k3.b[] X = X(byteArrayInputStream, str, V);
                    byteArrayInputStream.close();
                    return X;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported version");
    }

    public static k3.b[] X(ByteArrayInputStream byteArrayInputStream, String str, int i10) {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new k3.b[0];
        }
        k3.b[] bVarArr = new k3.b[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int W = q6.g.W(byteArrayInputStream);
            int W2 = q6.g.W(byteArrayInputStream);
            bVarArr[i11] = new k3.b(str, new String(q6.g.M(byteArrayInputStream, W), StandardCharsets.UTF_8), q6.g.V(byteArrayInputStream, 4), W2, (int) q6.g.V(byteArrayInputStream, 4), (int) q6.g.V(byteArrayInputStream, 4), new int[W2], new TreeMap());
        }
        for (int i12 = 0; i12 < i10; i12++) {
            k3.b bVar = bVarArr[i12];
            int available = byteArrayInputStream.available() - bVar.f6448f;
            int i13 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = bVar.f6451i;
                if (available2 <= available) {
                    break;
                }
                i13 += q6.g.W(byteArrayInputStream);
                treeMap.put(Integer.valueOf(i13), 1);
                for (int W3 = q6.g.W(byteArrayInputStream); W3 > 0; W3--) {
                    q6.g.W(byteArrayInputStream);
                    int V = (int) q6.g.V(byteArrayInputStream, 1);
                    if (V != 6 && V != 7) {
                        while (V > 0) {
                            q6.g.V(byteArrayInputStream, 1);
                            for (int V2 = (int) q6.g.V(byteArrayInputStream, 1); V2 > 0; V2--) {
                                q6.g.W(byteArrayInputStream);
                            }
                            V--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() == available) {
                bVar.f6450h = R(byteArrayInputStream, bVar.f6447e);
                int i14 = bVar.f6449g;
                BitSet valueOf = BitSet.valueOf(q6.g.M(byteArrayInputStream, ((((i14 * 2) + 8) - 1) & (-8)) / 8));
                for (int i15 = 0; i15 < i14; i15++) {
                    int i16 = 2;
                    if (!valueOf.get(N(2, i15, i14))) {
                        i16 = 0;
                    }
                    if (valueOf.get(N(4, i15, i14))) {
                        i16 |= 4;
                    }
                    if (i16 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i15));
                        if (num == null) {
                            num = 0;
                        }
                        treeMap.put(Integer.valueOf(i15), Integer.valueOf(i16 | num.intValue()));
                    }
                }
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return bVarArr;
    }

    public static String Y(StringBuilder sb, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (i10 >= i11) {
            return sb.toString();
        }
        if (sb.charAt(i10) == '/') {
            i10++;
        }
        int i15 = i10;
        int i16 = i15;
        while (i15 <= i11) {
            if (i15 == i11) {
                i12 = i15;
            } else if (sb.charAt(i15) == '/') {
                i12 = i15 + 1;
            } else {
                i15++;
            }
            int i17 = i16 + 1;
            if (i15 == i17 && sb.charAt(i16) == '.') {
                sb.delete(i16, i12);
                i11 -= i12 - i16;
            } else {
                if (i15 == i16 + 2 && sb.charAt(i16) == '.' && sb.charAt(i17) == '.') {
                    i13 = sb.lastIndexOf("/", i16 - 2) + 1;
                    if (i13 > i10) {
                        i14 = i13;
                    } else {
                        i14 = i10;
                    }
                    sb.delete(i14, i12);
                    i11 -= i12 - i14;
                } else {
                    i13 = i15 + 1;
                }
                i16 = i13;
            }
            i15 = i16;
        }
        return sb.toString();
    }

    public static String Z(String str, String str2) {
        int i10;
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] C = C(str2);
        if (C[0] != -1) {
            sb.append(str2);
            Y(sb, C[1], C[2]);
            return sb.toString();
        }
        int[] C2 = C(str);
        if (C[3] == 0) {
            sb.append((CharSequence) str, 0, C2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (C[2] == 0) {
            sb.append((CharSequence) str, 0, C2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i11 = C[1];
        if (i11 != 0) {
            int i12 = C2[0] + 1;
            sb.append((CharSequence) str, 0, i12);
            sb.append(str2);
            return Y(sb, C[1] + i12, i12 + C[2]);
        }
        if (str2.charAt(i11) == '/') {
            sb.append((CharSequence) str, 0, C2[1]);
            sb.append(str2);
            int i13 = C2[1];
            return Y(sb, i13, C[2] + i13);
        }
        int i14 = C2[0] + 2;
        int i15 = C2[1];
        if (i14 < i15 && i15 == C2[2]) {
            sb.append((CharSequence) str, 0, i15);
            sb.append('/');
            sb.append(str2);
            int i16 = C2[1];
            return Y(sb, i16, C[2] + i16 + 1);
        }
        int lastIndexOf = str.lastIndexOf(47, C2[2] - 1);
        if (lastIndexOf == -1) {
            i10 = C2[1];
        } else {
            i10 = lastIndexOf + 1;
        }
        sb.append((CharSequence) str, 0, i10);
        sb.append(str2);
        return Y(sb, C2[1], i10 + C[2]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x0252, code lost:
    
        if (r2.f8813b == r8) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ed, code lost:
    
        if (r4.f8813b == r12) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x047e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x06bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0714 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x057f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(q.f r37, p.e r38, int r39) {
        /*
            Method dump skipped, instructions count: 1824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.a.a(q.f, p.e, int):void");
    }

    public static int a0(Context context, int i10, int i11) {
        TypedValue a02 = q6.g.a0(context, i10);
        if (a02 != null && a02.type == 16) {
            return a02.data;
        }
        return i11;
    }

    public static int b(int i10, int i11, int[] iArr) {
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else if (i15 > i11) {
                i12 = i14 - 1;
            } else {
                return i14;
            }
        }
        return ~i13;
    }

    public static TimeInterpolator b0(Context context, int i10, Interpolator interpolator) {
        boolean z9;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!J(valueOf, "cubic-bezier") && !J(valueOf, "path")) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9) {
                if (J(valueOf, "cubic-bezier")) {
                    String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                    if (split.length == 4) {
                        return i0.a.b(v(split, 0), v(split, 1), v(split, 2), v(split, 3));
                    }
                    throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
                }
                if (J(valueOf, "path")) {
                    return i0.a.c(p(valueOf.substring(5, valueOf.length() - 1)));
                }
                throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
            }
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
    }

    public static int c(long[] jArr, int i10, long j4) {
        int i11 = i10 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            long j10 = jArr[i13];
            if (j10 < j4) {
                i12 = i13 + 1;
            } else if (j10 > j4) {
                i11 = i13 - 1;
            } else {
                return i13;
            }
        }
        return ~i12;
    }

    public static Uri c0(String str, String str2) {
        return Uri.parse(Z(str, str2));
    }

    public static void d(int i10, int i11) {
        GLES20.glBindTexture(i10, i11);
        g();
        GLES20.glTexParameteri(i10, 10240, 9729);
        g();
        GLES20.glTexParameteri(i10, 10241, 9729);
        g();
        GLES20.glTexParameteri(i10, 10242, 33071);
        g();
        GLES20.glTexParameteri(i10, 10243, 33071);
        g();
    }

    public static final void d0(View view, androidx.activity.s sVar) {
        h0.u(view, "<this>");
        h0.u(sVar, "onBackPressedDispatcherOwner");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, sVar);
    }

    public static ArrayList e(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static final void e0(View view, u uVar) {
        h0.u(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, uVar);
    }

    public static boolean f(h[] hVarArr, h[] hVarArr2) {
        if (hVarArr == null || hVarArr2 == null || hVarArr.length != hVarArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < hVarArr.length; i10++) {
            h hVar = hVarArr[i10];
            char c6 = hVar.f11863a;
            h hVar2 = hVarArr2[i10];
            if (c6 != hVar2.f11863a || hVar.f11864b.length != hVar2.f11864b.length) {
                return false;
            }
        }
        return true;
    }

    public static int f0(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i10});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static void g() {
        StringBuilder sb = new StringBuilder();
        boolean z9 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z9) {
                sb.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x" + Integer.toHexString(glGetError);
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            z9 = true;
        }
        if (!z9) {
        } else {
            throw new f1.h(sb.toString());
        }
    }

    public static String g0(String str) {
        boolean z9;
        boolean z10;
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt >= 'A' && charAt <= 'Z') {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c6 = charArray[i10];
                    if (c6 >= 'A' && c6 <= 'Z') {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        charArray[i10] = (char) (c6 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static void h(String str, boolean z9) {
        if (z9) {
        } else {
            throw new f1.h(str);
        }
    }

    public static String h0(String str) {
        boolean z9;
        boolean z10;
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt >= 'a' && charAt <= 'z') {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c6 = charArray[i10];
                    if (c6 >= 'a' && c6 <= 'z') {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        charArray[i10] = (char) (c6 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static void i(long j4, t tVar, g0[] g0VarArr) {
        int i10;
        int i11;
        boolean z9;
        while (true) {
            boolean z10 = true;
            if (tVar.f3860c - tVar.f3859b > 1) {
                int i12 = 0;
                while (true) {
                    if (tVar.f3860c - tVar.f3859b == 0) {
                        i10 = -1;
                        break;
                    }
                    int v9 = tVar.v();
                    i12 += v9;
                    if (v9 != 255) {
                        i10 = i12;
                        break;
                    }
                }
                int i13 = 0;
                while (true) {
                    if (tVar.f3860c - tVar.f3859b == 0) {
                        i13 = -1;
                        break;
                    }
                    int v10 = tVar.v();
                    i13 += v10;
                    if (v10 != 255) {
                        break;
                    }
                }
                int i14 = tVar.f3859b;
                int i15 = i14 + i13;
                if (i13 != -1 && i13 <= tVar.f3860c - i14) {
                    if (i10 == 4 && i13 >= 8) {
                        int v11 = tVar.v();
                        int A2 = tVar.A();
                        if (A2 == 49) {
                            i11 = tVar.f();
                        } else {
                            i11 = 0;
                        }
                        int v12 = tVar.v();
                        if (A2 == 47) {
                            tVar.H(1);
                        }
                        if (v11 == 181 && ((A2 == 49 || A2 == 47) && v12 == 3)) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (A2 == 49) {
                            if (i11 != 1195456820) {
                                z10 = false;
                            }
                            z9 &= z10;
                        }
                        if (z9) {
                            j(j4, tVar, g0VarArr);
                        }
                    }
                } else {
                    o.f("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i15 = tVar.f3860c;
                }
                tVar.G(i15);
            } else {
                return;
            }
        }
    }

    public static boolean i0(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, k3.b[] bVarArr) {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = a0.f8655u;
        int i10 = 0;
        if (Arrays.equals(bArr, bArr2)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                q6.g.u0(byteArrayOutputStream2, bVarArr.length);
                int i11 = 2;
                int i12 = 2;
                for (k3.b bVar : bVarArr) {
                    q6.g.t0(byteArrayOutputStream2, bVar.f6445c, 4);
                    q6.g.t0(byteArrayOutputStream2, bVar.f6446d, 4);
                    q6.g.t0(byteArrayOutputStream2, bVar.f6449g, 4);
                    String t9 = t(bVar.f6443a, bVar.f6444b, bArr2);
                    int length2 = t9.getBytes(StandardCharsets.UTF_8).length;
                    q6.g.u0(byteArrayOutputStream2, length2);
                    i12 = i12 + 4 + 4 + 4 + 2 + (length2 * 1);
                    byteArrayOutputStream2.write(t9.getBytes(StandardCharsets.UTF_8));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i12 == byteArray.length) {
                    m mVar = new m(1, byteArray, false);
                    byteArrayOutputStream2.close();
                    arrayList2.add(mVar);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i13 = 0;
                    for (int i14 = 0; i14 < bVarArr.length; i14++) {
                        try {
                            k3.b bVar2 = bVarArr[i14];
                            q6.g.u0(byteArrayOutputStream3, i14);
                            q6.g.u0(byteArrayOutputStream3, bVar2.f6447e);
                            i13 = i13 + 2 + 2 + (bVar2.f6447e * 2);
                            j0(byteArrayOutputStream3, bVar2);
                        } finally {
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    if (i13 == byteArray2.length) {
                        m mVar2 = new m(3, byteArray2, true);
                        byteArrayOutputStream3.close();
                        arrayList2.add(mVar2);
                        byteArrayOutputStream2 = new ByteArrayOutputStream();
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < bVarArr.length) {
                            try {
                                k3.b bVar3 = bVarArr[i15];
                                Iterator it = bVar3.f6451i.entrySet().iterator();
                                int i17 = i10;
                                while (it.hasNext()) {
                                    i17 |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                try {
                                    l0(byteArrayOutputStream4, bVar3);
                                    byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                    byteArrayOutputStream4.close();
                                    byteArrayOutputStream4 = new ByteArrayOutputStream();
                                    try {
                                        m0(byteArrayOutputStream4, bVar3);
                                        byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                                        byteArrayOutputStream4.close();
                                        q6.g.u0(byteArrayOutputStream2, i15);
                                        int length3 = byteArray3.length + i11 + byteArray4.length;
                                        int i18 = i16 + 2 + 4;
                                        ArrayList arrayList4 = arrayList3;
                                        q6.g.t0(byteArrayOutputStream2, length3, 4);
                                        q6.g.u0(byteArrayOutputStream2, i17);
                                        byteArrayOutputStream2.write(byteArray3);
                                        byteArrayOutputStream2.write(byteArray4);
                                        i16 = i18 + length3;
                                        i15++;
                                        arrayList3 = arrayList4;
                                        i10 = 0;
                                        i11 = 2;
                                    } finally {
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream2.toByteArray();
                        if (i16 == byteArray5.length) {
                            m mVar3 = new m(4, byteArray5, true);
                            byteArrayOutputStream2.close();
                            arrayList2.add(mVar3);
                            long j4 = 4;
                            long size = j4 + j4 + 4 + (arrayList2.size() * 16);
                            q6.g.t0(byteArrayOutputStream, arrayList2.size(), 4);
                            int i19 = 0;
                            while (i19 < arrayList2.size()) {
                                m mVar4 = (m) arrayList2.get(i19);
                                q6.g.t0(byteArrayOutputStream, g.i(mVar4.f6464a), 4);
                                q6.g.t0(byteArrayOutputStream, size, 4);
                                boolean z9 = mVar4.f6466c;
                                byte[] bArr3 = mVar4.f6465b;
                                if (z9) {
                                    long length4 = bArr3.length;
                                    byte[] j10 = q6.g.j(bArr3);
                                    arrayList = arrayList5;
                                    arrayList.add(j10);
                                    q6.g.t0(byteArrayOutputStream, j10.length, 4);
                                    q6.g.t0(byteArrayOutputStream, length4, 4);
                                    length = j10.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr3);
                                    q6.g.t0(byteArrayOutputStream, bArr3.length, 4);
                                    q6.g.t0(byteArrayOutputStream, 0L, 4);
                                    length = bArr3.length;
                                }
                                size += length;
                                i19++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i20 = 0; i20 < arrayList6.size(); i20++) {
                                byteArrayOutputStream.write((byte[]) arrayList6.get(i20));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i16 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray.length);
            } finally {
                try {
                    byteArrayOutputStream2.close();
                    throw th;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        }
        byte[] bArr4 = a0.f8656v;
        if (Arrays.equals(bArr, bArr4)) {
            byte[] n9 = n(bVarArr, bArr4);
            q6.g.t0(byteArrayOutputStream, bVarArr.length, 1);
            q6.g.t0(byteArrayOutputStream, n9.length, 4);
            byte[] j11 = q6.g.j(n9);
            q6.g.t0(byteArrayOutputStream, j11.length, 4);
            byteArrayOutputStream.write(j11);
            return true;
        }
        byte[] bArr5 = a0.f8658x;
        if (Arrays.equals(bArr, bArr5)) {
            q6.g.t0(byteArrayOutputStream, bVarArr.length, 1);
            for (k3.b bVar4 : bVarArr) {
                int size2 = bVar4.f6451i.size() * 4;
                String t10 = t(bVar4.f6443a, bVar4.f6444b, bArr5);
                q6.g.u0(byteArrayOutputStream, t10.getBytes(StandardCharsets.UTF_8).length);
                q6.g.u0(byteArrayOutputStream, bVar4.f6450h.length);
                q6.g.t0(byteArrayOutputStream, size2, 4);
                q6.g.t0(byteArrayOutputStream, bVar4.f6445c, 4);
                byteArrayOutputStream.write(t10.getBytes(StandardCharsets.UTF_8));
                Iterator it2 = bVar4.f6451i.keySet().iterator();
                while (it2.hasNext()) {
                    q6.g.u0(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                    q6.g.u0(byteArrayOutputStream, 0);
                }
                for (int i21 : bVar4.f6450h) {
                    q6.g.u0(byteArrayOutputStream, i21);
                }
            }
            return true;
        }
        byte[] bArr6 = a0.f8657w;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] n10 = n(bVarArr, bArr6);
            q6.g.t0(byteArrayOutputStream, bVarArr.length, 1);
            q6.g.t0(byteArrayOutputStream, n10.length, 4);
            byte[] j12 = q6.g.j(n10);
            q6.g.t0(byteArrayOutputStream, j12.length, 4);
            byteArrayOutputStream.write(j12);
            return true;
        }
        byte[] bArr7 = a0.f8659y;
        if (Arrays.equals(bArr, bArr7)) {
            q6.g.u0(byteArrayOutputStream, bVarArr.length);
            for (k3.b bVar5 : bVarArr) {
                String t11 = t(bVar5.f6443a, bVar5.f6444b, bArr7);
                q6.g.u0(byteArrayOutputStream, t11.getBytes(StandardCharsets.UTF_8).length);
                TreeMap treeMap = bVar5.f6451i;
                q6.g.u0(byteArrayOutputStream, treeMap.size());
                q6.g.u0(byteArrayOutputStream, bVar5.f6450h.length);
                q6.g.t0(byteArrayOutputStream, bVar5.f6445c, 4);
                byteArrayOutputStream.write(t11.getBytes(StandardCharsets.UTF_8));
                Iterator it3 = treeMap.keySet().iterator();
                while (it3.hasNext()) {
                    q6.g.u0(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                }
                for (int i22 : bVar5.f6450h) {
                    q6.g.u0(byteArrayOutputStream, i22);
                }
            }
            return true;
        }
        return false;
    }

    public static void j(long j4, t tVar, g0[] g0VarArr) {
        boolean z9;
        boolean z10;
        int v9 = tVar.v();
        if ((v9 & 64) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            return;
        }
        tVar.H(1);
        int i10 = (v9 & 31) * 3;
        int i11 = tVar.f3859b;
        for (g0 g0Var : g0VarArr) {
            tVar.G(i11);
            g0Var.f(i10, tVar);
            if (j4 != -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            w7.b.u(z10);
            g0Var.d(j4, 1, i10, 0, null);
        }
    }

    public static void j0(ByteArrayOutputStream byteArrayOutputStream, k3.b bVar) {
        int i10 = 0;
        for (int i11 : bVar.f6450h) {
            Integer valueOf = Integer.valueOf(i11);
            q6.g.u0(byteArrayOutputStream, valueOf.intValue() - i10);
            i10 = valueOf.intValue();
        }
    }

    public static float[] k(float[] fArr, int i10) {
        if (i10 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int i11 = i10 - 0;
                int min = Math.min(i11, length - 0);
                float[] fArr2 = new float[i11];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public static void k0(ByteArrayOutputStream byteArrayOutputStream, k3.b bVar, String str) {
        q6.g.u0(byteArrayOutputStream, str.getBytes(StandardCharsets.UTF_8).length);
        q6.g.u0(byteArrayOutputStream, bVar.f6447e);
        q6.g.t0(byteArrayOutputStream, bVar.f6448f, 4);
        q6.g.t0(byteArrayOutputStream, bVar.f6445c, 4);
        q6.g.t0(byteArrayOutputStream, bVar.f6449g, 4);
        byteArrayOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[EDGE_INSN: B:15:0x004b->B:16:0x004b BREAK  A[LOOP:0: B:5:0x002a->B:32:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[LOOP:0: B:5:0x002a->B:32:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static q0.n l(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lc
            q0.d r0 = new q0.d
            r0.<init>()
            goto L11
        Lc:
            q0.c r0 = new q0.c
            r0.<init>()
        L11:
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            java.lang.String r2 = "Package manager required to locate emoji font provider"
            com.bumptech.glide.d.k(r1, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.content.action.LOAD_EMOJI_FONT"
            r2.<init>(r3)
            r3 = 0
            java.util.List r2 = r1.queryIntentContentProviders(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L2a:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r2.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ProviderInfo r4 = r4.providerInfo
            if (r4 == 0) goto L46
            android.content.pm.ApplicationInfo r6 = r4.applicationInfo
            if (r6 == 0) goto L46
            int r6 = r6.flags
            r7 = 1
            r6 = r6 & r7
            if (r6 != r7) goto L46
            goto L47
        L46:
            r7 = r3
        L47:
            if (r7 == 0) goto L2a
            goto L4b
        L4a:
            r4 = r5
        L4b:
            if (r4 != 0) goto L4e
            goto L7c
        L4e:
            java.lang.String r2 = r4.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L76
            java.lang.String r4 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L76
            android.content.pm.Signature[] r0 = r0.q(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L76
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L76
            r1.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L76
            int r6 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L76
        L5c:
            if (r3 >= r6) goto L6a
            r7 = r0[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L76
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L76
            r1.add(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L76
            int r3 = r3 + 1
            goto L5c
        L6a:
            java.util.List r0 = java.util.Collections.singletonList(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L76
            androidx.appcompat.widget.r r1 = new androidx.appcompat.widget.r     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L76
            java.lang.String r3 = "emojicompat-emoji-font"
            r1.<init>(r2, r4, r3, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L76
            goto L7d
        L76:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
        L7c:
            r1 = r5
        L7d:
            if (r1 != 0) goto L80
            goto L85
        L80:
            q0.n r5 = new q0.n
            r5.<init>(r8, r1)
        L85:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.a.l(android.content.Context):q0.n");
    }

    public static void l0(ByteArrayOutputStream byteArrayOutputStream, k3.b bVar) {
        byte[] bArr = new byte[((((bVar.f6449g * 2) + 8) - 1) & (-8)) / 8];
        for (Map.Entry entry : bVar.f6451i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i10 = intValue2 & 2;
            int i11 = bVar.f6449g;
            if (i10 != 0) {
                int N = N(2, intValue, i11);
                int i12 = N / 8;
                bArr[i12] = (byte) ((1 << (N % 8)) | bArr[i12]);
            }
            if ((intValue2 & 4) != 0) {
                int N2 = N(4, intValue, i11);
                int i13 = N2 / 8;
                bArr[i13] = (byte) ((1 << (N2 % 8)) | bArr[i13]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static FloatBuffer m(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static void m0(ByteArrayOutputStream byteArrayOutputStream, k3.b bVar) {
        int i10 = 0;
        for (Map.Entry entry : bVar.f6451i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                q6.g.u0(byteArrayOutputStream, intValue - i10);
                q6.g.u0(byteArrayOutputStream, 0);
                i10 = intValue;
            }
        }
    }

    public static byte[] n(k3.b[] bVarArr, byte[] bArr) {
        int i10 = 0;
        int i11 = 0;
        for (k3.b bVar : bVarArr) {
            i11 += (((((bVar.f6449g * 2) + 8) - 1) & (-8)) / 8) + (bVar.f6447e * 2) + t(bVar.f6443a, bVar.f6444b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + bVar.f6448f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i11);
        if (Arrays.equals(bArr, a0.f8657w)) {
            int length = bVarArr.length;
            while (i10 < length) {
                k3.b bVar2 = bVarArr[i10];
                k0(byteArrayOutputStream, bVar2, t(bVar2.f6443a, bVar2.f6444b, bArr));
                m0(byteArrayOutputStream, bVar2);
                j0(byteArrayOutputStream, bVar2);
                l0(byteArrayOutputStream, bVar2);
                i10++;
            }
        } else {
            for (k3.b bVar3 : bVarArr) {
                k0(byteArrayOutputStream, bVar3, t(bVar3.f6443a, bVar3.f6444b, bArr));
            }
            int length2 = bVarArr.length;
            while (i10 < length2) {
                k3.b bVar4 = bVarArr[i10];
                m0(byteArrayOutputStream, bVar4);
                j0(byteArrayOutputStream, bVar4);
                l0(byteArrayOutputStream, bVar4);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == i11) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i11);
    }

    public static float n0() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x008a, code lost:
    
        if (r13 == 0) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097 A[Catch: NumberFormatException -> 0x00bc, LOOP:3: B:29:0x006c->B:40:0x0097, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00bc, blocks: (B:26:0x0059, B:29:0x006c, B:31:0x0072, B:36:0x0080, B:40:0x0097, B:44:0x009c, B:49:0x00ac, B:61:0x00b1), top: B:25:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009c A[Catch: NumberFormatException -> 0x00bc, TryCatch #0 {NumberFormatException -> 0x00bc, blocks: (B:26:0x0059, B:29:0x006c, B:31:0x0072, B:36:0x0080, B:40:0x0097, B:44:0x009c, B:49:0x00ac, B:61:0x00b1), top: B:25:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ac A[Catch: NumberFormatException -> 0x00bc, TryCatch #0 {NumberFormatException -> 0x00bc, blocks: (B:26:0x0059, B:29:0x006c, B:31:0x0072, B:36:0x0080, B:40:0x0097, B:44:0x009c, B:49:0x00ac, B:61:0x00b1), top: B:25:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static z.h[] o(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.a.o(java.lang.String):z.h[]");
    }

    public static Path p(String str) {
        Path path = new Path();
        h[] o6 = o(str);
        if (o6 != null) {
            try {
                h.b(o6, path);
                return path;
            } catch (RuntimeException e10) {
                throw new RuntimeException(f.d("Error in parsing ", str), e10);
            }
        }
        return null;
    }

    public static h[] q(h[] hVarArr) {
        if (hVarArr == null) {
            return null;
        }
        h[] hVarArr2 = new h[hVarArr.length];
        for (int i10 = 0; i10 < hVarArr.length; i10++) {
            hVarArr2[i10] = new h(hVarArr[i10]);
        }
        return hVarArr2;
    }

    public static boolean r(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z9 = true;
            for (File file2 : listFiles) {
                if (r(file2) && z9) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            }
            return z9;
        }
        file.delete();
        return true;
    }

    public static boolean s(String str, String str2) {
        char c6;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length != str2.length()) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (str.charAt(i10) != str2.charAt(i10) && ((c6 = (char) ((r4 | ' ') - 97)) >= 26 || c6 != ((char) ((r5 | ' ') - 97)))) {
                return false;
            }
        }
        return true;
    }

    public static String t(String str, String str2, byte[] bArr) {
        Object obj;
        byte[] bArr2 = a0.f8659y;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = a0.f8658x;
        String str3 = "!";
        if (!equals && !Arrays.equals(bArr, bArr3)) {
            obj = "!";
        } else {
            obj = ":";
        }
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                str2 = str2.replace("!", ":");
            }
            return str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (!str2.contains("!") && !str2.contains(":")) {
            if (str2.endsWith(".apk")) {
                return str2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
                str3 = ":";
            }
            return g.t(sb, str3, str2);
        }
        if ("!".equals(obj)) {
            return str2.replace(":", "!");
        }
        if (":".equals(obj)) {
            str2 = str2.replace("!", ":");
        }
        return str2;
    }

    public static float u(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return e.b(edgeEffect);
        }
        return 0.0f;
    }

    public static float v(String[] strArr, int i10) {
        float parseFloat = Float.parseFloat(strArr[i10]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static String w() {
        String str;
        String processName;
        if (f6159r == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                f6159r = processName;
            } else {
                int i10 = f6160s;
                if (i10 == 0) {
                    i10 = Process.myPid();
                    f6160s = i10;
                }
                String str2 = null;
                BufferedReader bufferedReader = null;
                BufferedReader bufferedReader2 = null;
                if (i10 > 0) {
                    try {
                        String str3 = "/proc/" + i10 + "/cmdline";
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            BufferedReader bufferedReader3 = new BufferedReader(new FileReader(str3));
                            try {
                                String readLine = bufferedReader3.readLine();
                                w7.b.s(readLine);
                                str = readLine.trim();
                            } catch (IOException unused) {
                                str = null;
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader3;
                                q6.g.i(bufferedReader2);
                                throw th;
                            }
                            bufferedReader = bufferedReader3;
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (IOException unused2) {
                        str = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    q6.g.i(bufferedReader);
                    str2 = str;
                }
                f6159r = str2;
            }
        }
        return f6159r;
    }

    public static s x(byte[] bArr) {
        boolean z9;
        byte b10 = bArr[0];
        if (b10 != Byte.MAX_VALUE && b10 != 100 && b10 != 64 && b10 != 113) {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b11 = copyOf[0];
            if (b11 != -2 && b11 != -1 && b11 != 37 && b11 != -14 && b11 != -24) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9) {
                for (int i10 = 0; i10 < copyOf.length - 1; i10 += 2) {
                    byte b12 = copyOf[i10];
                    int i11 = i10 + 1;
                    copyOf[i10] = copyOf[i11];
                    copyOf[i11] = b12;
                }
            }
            s sVar = new s(copyOf, 0, (Object) null);
            if (copyOf[0] == 31) {
                s sVar2 = new s(copyOf, 0, (Object) null);
                while (sVar2.b() >= 16) {
                    sVar2.r(2);
                    int i12 = sVar2.i(14) & 16383;
                    int min = Math.min(8 - sVar.f3853d, 14);
                    int i13 = sVar.f3853d;
                    int i14 = (8 - i13) - min;
                    byte[] bArr2 = sVar.f3851b;
                    int i15 = sVar.f3852c;
                    byte b13 = (byte) (((65280 >> i13) | ((1 << i14) - 1)) & bArr2[i15]);
                    bArr2[i15] = b13;
                    int i16 = 14 - min;
                    bArr2[i15] = (byte) (b13 | ((i12 >>> i16) << i14));
                    int i17 = i15 + 1;
                    while (i16 > 8) {
                        i16 -= 8;
                        sVar.f3851b[i17] = (byte) (i12 >>> i16);
                        i17++;
                    }
                    int i18 = 8 - i16;
                    byte[] bArr3 = sVar.f3851b;
                    byte b14 = (byte) (bArr3[i17] & ((1 << i18) - 1));
                    bArr3[i17] = b14;
                    bArr3[i17] = (byte) (((i12 & ((1 << i16) - 1)) << i18) | b14);
                    sVar.r(14);
                    sVar.a();
                }
            }
            sVar.n(copyOf, copyOf.length);
            return sVar;
        }
        return new s(bArr, 0, (Object) null);
    }

    public static long y(byte b10, byte b11) {
        int i10;
        int i11 = b10 & 255;
        int i12 = i11 & 3;
        if (i12 != 0) {
            i10 = 2;
            if (i12 != 1 && i12 != 2) {
                i10 = b11 & 63;
            }
        } else {
            i10 = 1;
        }
        int i13 = i11 >> 3;
        return i10 * (i13 >= 16 ? 2500 << r0 : i13 >= 12 ? 10000 << (r0 & 1) : (i13 & 3) == 3 ? 60000 : 10000 << r0);
    }

    public static Intent z(Activity activity) {
        Intent a10 = p.a(activity);
        if (a10 != null) {
            return a10;
        }
        try {
            String B = B(activity, activity.getComponentName());
            if (B == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, B);
            try {
                if (B(activity, componentName) == null) {
                    return Intent.makeMainActivity(componentName);
                }
                return new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + B + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
