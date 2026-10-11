package com.bumptech.glide;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.v0;
import androidx.lifecycle.a1;
import androidx.lifecycle.c1;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.w;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import f1.b0;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import k0.q;
import k0.r;
import k0.s;
import k9.t;
import l8.z;
import m8.y;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
import p7.a0;
import r6.h0;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final q0 f2186a = new q0();

    /* renamed from: b, reason: collision with root package name */
    public static final q0 f2187b = new q0();

    /* renamed from: c, reason: collision with root package name */
    public static final q0 f2188c = new q0();

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f2189d = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f2190e = {0, 0, 0, 1};

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f2191f = {"", "A", "B", "C"};

    /* renamed from: g, reason: collision with root package name */
    public static final char[] f2192g = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: h, reason: collision with root package name */
    public static final w1.o f2193h = new w1.o(9);

    /* renamed from: i, reason: collision with root package name */
    public static final w1.o f2194i = new w1.o(10);

    /* renamed from: j, reason: collision with root package name */
    public static final b5.c f2195j = new b5.c("is_user_verifying_platform_authenticator_available_for_credential", 1);

    /* renamed from: k, reason: collision with root package name */
    public static final b5.c f2196k = new b5.c("is_user_verifying_platform_authenticator_available", 1);

    /* renamed from: l, reason: collision with root package name */
    public static final b5.c f2197l = new b5.c("privileged_api_list_credentials", 2);

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f2198m = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static int A(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, int i11) {
        if (!E(xmlPullParser, str)) {
            return i11;
        }
        return typedArray.getInt(i10, i11);
    }

    public static String B(TypedArray typedArray, XmlResourceParser xmlResourceParser, String str, int i10) {
        if (!E(xmlResourceParser, str)) {
            return null;
        }
        return typedArray.getString(i10);
    }

    public static final int C(int i10, int i11, int i12) {
        if (i12 > 0) {
            if (i10 < i11) {
                int i13 = i11 % i12;
                if (i13 < 0) {
                    i13 += i12;
                }
                int i14 = i10 % i12;
                if (i14 < 0) {
                    i14 += i12;
                }
                int i15 = (i13 - i14) % i12;
                if (i15 < 0) {
                    i15 += i12;
                }
                return i11 - i15;
            }
            return i11;
        }
        if (i12 < 0) {
            if (i10 > i11) {
                int i16 = -i12;
                int i17 = i10 % i16;
                if (i17 < 0) {
                    i17 += i16;
                }
                int i18 = i11 % i16;
                if (i18 < 0) {
                    i18 += i16;
                }
                int i19 = (i17 - i18) % i16;
                if (i19 < 0) {
                    i19 += i16;
                }
                return i11 + i19;
            }
            return i11;
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    public static e0.g D(TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return new e0.g(s.b(textView));
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int a10 = q.a(textView);
        int d10 = q.d(textView);
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            boolean z9 = true;
            if (i10 >= 28 && (textView.getInputType() & 15) == 3) {
                byte directionality = Character.getDirectionality(s.a(r.a(k0.p.d(textView)))[0].codePointAt(0));
                if (directionality != 1 && directionality != 2) {
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                } else {
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                }
            } else {
                if (k0.p.b(textView) != 1) {
                    z9 = false;
                }
                switch (k0.p.c(textView)) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        break;
                    case zzaja.zze.zzg /* 7 */:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z9) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        } else {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            break;
                        }
                }
            }
        }
        return new e0.g(textPaint, textDirectionHeuristic, a10, d10);
    }

    public static boolean E(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    public static final z6.e F(z6.e eVar) {
        b7.c cVar;
        z6.e intercepted;
        h0.u(eVar, "<this>");
        if (eVar instanceof b7.c) {
            cVar = (b7.c) eVar;
        } else {
            cVar = null;
        }
        if (cVar != null && (intercepted = cVar.intercepted()) != null) {
            return intercepted;
        }
        return eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean G() {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            r2 = 1
            if (r0 >= r1) goto L30
            r1 = 32
            r3 = 0
            if (r0 < r1) goto L2f
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r1 = "REL"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L17
            goto L2b
        L17:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r1)
            java.lang.String r4 = "Tiramisu"
            java.lang.String r1 = r4.toUpperCase(r1)
            int r0 = r0.compareTo(r1)
            if (r0 < 0) goto L2b
            r0 = r2
            goto L2c
        L2b:
            r0 = r3
        L2c:
            if (r0 == 0) goto L2f
            goto L30
        L2f:
            r2 = r3
        L30:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.d.G():boolean");
    }

    public static boolean H(MotionEvent motionEvent, int i10) {
        if ((motionEvent.getSource() & i10) == i10) {
            return true;
        }
        return false;
    }

    public static int I(List list) {
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            int i10 = Integer.MIN_VALUE;
            while (it.hasNext()) {
                i10 = Math.max(i10, t((a8.e) it.next()));
            }
            return i10;
        }
        return 0;
    }

    public static void J(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static void K(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static TypedArray L(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static y.e O(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i10;
        boolean z9;
        int i11;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), v.a.f10338b);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(4);
                String string3 = obtainAttributes.getString(5);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(2, 1);
                int integer2 = obtainAttributes.getInteger(3, 500);
                String string4 = obtainAttributes.getString(6);
                obtainAttributes.recycle();
                if (string != null && string2 != null && string3 != null) {
                    while (xmlResourceParser.next() != 3) {
                        c0(xmlResourceParser);
                    }
                    return new y.h(new androidx.appcompat.widget.r(string, string2, string3, U(resourceId, resources)), integer, integer2, string4);
                }
                ArrayList arrayList = new ArrayList();
                while (xmlResourceParser.next() != 3) {
                    if (xmlResourceParser.getEventType() == 2) {
                        if (xmlResourceParser.getName().equals("font")) {
                            TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), v.a.f10339c);
                            int i12 = 8;
                            if (!obtainAttributes2.hasValue(8)) {
                                i12 = 1;
                            }
                            int i13 = obtainAttributes2.getInt(i12, 400);
                            if (obtainAttributes2.hasValue(6)) {
                                i10 = 6;
                            } else {
                                i10 = 2;
                            }
                            if (1 == obtainAttributes2.getInt(i10, 0)) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            int i14 = 9;
                            if (!obtainAttributes2.hasValue(9)) {
                                i14 = 3;
                            }
                            int i15 = 7;
                            if (!obtainAttributes2.hasValue(7)) {
                                i15 = 4;
                            }
                            String string5 = obtainAttributes2.getString(i15);
                            int i16 = obtainAttributes2.getInt(i14, 0);
                            if (obtainAttributes2.hasValue(5)) {
                                i11 = 5;
                            } else {
                                i11 = 0;
                            }
                            int resourceId2 = obtainAttributes2.getResourceId(i11, 0);
                            String string6 = obtainAttributes2.getString(i11);
                            obtainAttributes2.recycle();
                            while (xmlResourceParser.next() != 3) {
                                c0(xmlResourceParser);
                            }
                            arrayList.add(new y.g(i13, i16, resourceId2, string6, string5, z9));
                        } else {
                            c0(xmlResourceParser);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    return new y.f((y.g[]) arrayList.toArray(new y.g[0]));
                }
            } else {
                c0(xmlResourceParser);
            }
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x008c, code lost:
    
        if (r11 != 11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
    
        if (r11 != 11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0096, code lost:
    
        if (r11 != 8) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static c1.f P(f1.s r11) {
        /*
            r0 = 16
            int r1 = r11.i(r0)
            int r0 = r11.i(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r11.i(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r11.i(r1)
            r4 = 0
            r5 = 3
            if (r2 != r5) goto L3d
            r6 = r4
        L2b:
            int r7 = r11.i(r1)
            int r7 = r7 + r6
            boolean r6 = r11.h()
            if (r6 != 0) goto L38
            int r2 = r2 + r7
            goto L3d
        L38:
            int r7 = r7 + 1
            int r6 = r7 << 2
            goto L2b
        L3d:
            r6 = 10
            int r6 = r11.i(r6)
            boolean r7 = r11.h()
            if (r7 == 0) goto L52
            int r7 = r11.i(r5)
            if (r7 <= 0) goto L52
            r11.r(r1)
        L52:
            boolean r7 = r11.h()
            r8 = 48000(0xbb80, float:6.7262E-41)
            r9 = 44100(0xac44, float:6.1797E-41)
            if (r7 == 0) goto L60
            r7 = r8
            goto L61
        L60:
            r7 = r9
        L61:
            int r11 = r11.i(r3)
            int[] r10 = com.bumptech.glide.d.f2189d
            if (r7 != r9) goto L70
            r9 = 13
            if (r11 != r9) goto L70
            r11 = r10[r11]
            goto L9b
        L70:
            if (r7 != r8) goto L9a
            r8 = 14
            if (r11 >= r8) goto L9a
            r4 = r10[r11]
            int r6 = r6 % 5
            r8 = 1
            r9 = 8
            if (r6 == r8) goto L94
            r8 = 11
            if (r6 == r1) goto L8f
            if (r6 == r5) goto L94
            if (r6 == r3) goto L88
            goto L9a
        L88:
            if (r11 == r5) goto L98
            if (r11 == r9) goto L98
            if (r11 != r8) goto L9a
            goto L98
        L8f:
            if (r11 == r9) goto L98
            if (r11 != r8) goto L9a
            goto L98
        L94:
            if (r11 == r5) goto L98
            if (r11 != r9) goto L9a
        L98:
            int r4 = r4 + 1
        L9a:
            r11 = r4
        L9b:
            c1.f r1 = new c1.f
            r1.<init>(r2, r7, r0, r11)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.d.P(f1.s):c1.f");
    }

    public static void Q(Context context, String str) {
        if (str.equals("")) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer newSerializer = Xml.newSerializer();
            try {
                try {
                    newSerializer.setOutput(openFileOutput, null);
                    newSerializer.startDocument("UTF-8", Boolean.TRUE);
                    newSerializer.startTag(null, "locales");
                    newSerializer.attribute(null, "application_locales", str);
                    newSerializer.endTag(null, "locales");
                    newSerializer.endDocument();
                    Log.d("AppLocalesStorageHelper", "Storing App Locales : app-locales: " + str + " persisted successfully.");
                    if (openFileOutput == null) {
                        return;
                    }
                } catch (Throwable th) {
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e10) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales: ".concat(str), e10);
                if (openFileOutput == null) {
                    return;
                }
            }
            try {
                openFileOutput.close();
            } catch (IOException unused2) {
            }
        } catch (FileNotFoundException unused3) {
            Log.w("AppLocalesStorageHelper", String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"));
        }
    }

    public static String R(a8.e eVar) {
        String str = "";
        if (eVar == null) {
            return "";
        }
        String str2 = eVar.f183a;
        if (str2 != null) {
            str = str2.trim();
        }
        if (str.isEmpty()) {
            return u(eVar);
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String S(java.lang.String r3) {
        /*
            java.lang.String r0 = "AUTO"
            if (r3 != 0) goto L6
            r3 = r0
            goto L10
        L6:
            java.lang.String r3 = r3.trim()
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r3 = r3.toUpperCase(r1)
        L10:
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L53
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L1d
            goto L53
        L1d:
            java.lang.String r0 = "(\\d{3,4})"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r0 = r0.matcher(r3)
            boolean r1 = r0.find()
            if (r1 == 0) goto L3f
            r1 = 1
            java.lang.String r0 = r0.group(r1)     // Catch: java.lang.Exception -> L37
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L37
            goto L40
        L37:
            r0 = move-exception
            java.lang.String r1 = "FormatHelper"
            java.lang.String r2 = "exception"
            android.util.Log.e(r1, r2, r0)
        L3f:
            r0 = 0
        L40:
            r1 = 1080(0x438, float:1.513E-42)
            if (r0 < r1) goto L47
            java.lang.String r3 = "FHD"
            return r3
        L47:
            r1 = 720(0x2d0, float:1.009E-42)
            if (r0 < r1) goto L4e
            java.lang.String r3 = "HD"
            return r3
        L4e:
            if (r0 <= 0) goto L52
            java.lang.String r3 = "SD"
        L52:
            return r3
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.d.S(java.lang.String):java.lang.String");
    }

    public static int T(a8.e eVar) {
        int t9 = t(eVar);
        if (t9 < 0) {
            t9 = 0;
        }
        return (((t9 - 0) / 100) * 100) + 0;
    }

    public static List U(int i10, Resources resources) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (y.d.a(obtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < obtainTypedArray.length(); i11++) {
                    int resourceId = obtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i10);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (r3 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if (r2.isEmpty() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        android.util.Log.d("AppLocalesStorageHelper", "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: ".concat(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        r9.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0039, code lost:
    
        r2 = r4.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x004d, code lost:
    
        if (r3 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String V(android.content.Context r9) {
        /*
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = ""
            java.io.FileInputStream r3 = r9.openFileInput(r0)     // Catch: java.io.FileNotFoundException -> L6a
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
            java.lang.String r5 = "UTF-8"
            r4.setInput(r3, r5)     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
            int r5 = r4.getDepth()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
        L17:
            int r6 = r4.next()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
            r7 = 1
            if (r6 == r7) goto L40
            r7 = 3
            if (r6 != r7) goto L27
            int r8 = r4.getDepth()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
            if (r8 <= r5) goto L40
        L27:
            if (r6 == r7) goto L17
            r7 = 4
            if (r6 != r7) goto L2d
            goto L17
        L2d:
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
            java.lang.String r7 = "locales"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
            if (r6 == 0) goto L17
            java.lang.String r5 = "application_locales"
            r6 = 0
            java.lang.String r2 = r4.getAttributeValue(r6, r5)     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
        L40:
            if (r3 == 0) goto L50
        L42:
            r3.close()     // Catch: java.io.IOException -> L50
            goto L50
        L46:
            r9 = move-exception
            goto L64
        L48:
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r4)     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L50
            goto L42
        L50:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L60
            java.lang.String r9 = "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: "
            java.lang.String r9 = r9.concat(r2)
            android.util.Log.d(r1, r9)
            goto L63
        L60:
            r9.deleteFile(r0)
        L63:
            return r2
        L64:
            if (r3 == 0) goto L69
            r3.close()     // Catch: java.io.IOException -> L69
        L69:
            throw r9
        L6a:
            java.lang.String r9 = "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.d.V(android.content.Context):java.lang.String");
    }

    public static String W(String str) {
        if (str != null && !str.trim().isEmpty()) {
            return str.replaceAll("[^A-Za-z0-9._-]+", "_").replaceAll("_+", "_");
        }
        return "frame";
    }

    public static int X(long j4) {
        if (j4 > 2147483647L) {
            return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        if (j4 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j4;
    }

    public static final int Y(t tVar, int i10) {
        int i11;
        h0.u(tVar, "<this>");
        int i12 = i10 + 1;
        int length = tVar.f6555e.length;
        int[] iArr = tVar.f6556f;
        h0.u(iArr, "<this>");
        int i13 = length - 1;
        int i14 = 0;
        while (true) {
            if (i14 <= i13) {
                i11 = (i14 + i13) >>> 1;
                int i15 = iArr[i11];
                if (i15 < i12) {
                    i14 = i11 + 1;
                } else {
                    if (i15 <= i12) {
                        break;
                    }
                    i13 = i11 - 1;
                }
            } else {
                i11 = (-i14) - 1;
                break;
            }
        }
        if (i11 < 0) {
            return ~i11;
        }
        return i11;
    }

    public static void Z(MediaFormat mediaFormat, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer(a3.g.n("csd-", i10), ByteBuffer.wrap((byte[]) list.get(i10)));
        }
    }

    public static final void a(Throwable th, Throwable th2) {
        boolean z9;
        h0.u(th, "<this>");
        h0.u(th2, "exception");
        if (th != th2) {
            Integer num = e7.a.f3593a;
            if (num != null && num.intValue() < 19) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9) {
                th.addSuppressed(th2);
                return;
            }
            Method method = d7.a.f3238a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static void a0(TextView textView, int i10) {
        int i11;
        j(i10);
        if (Build.VERSION.SDK_INT >= 28) {
            s.c(textView, i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (k0.o.a(textView)) {
            i11 = fontMetricsInt.top;
        } else {
            i11 = fontMetricsInt.ascent;
        }
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static List b(int... iArr) {
        if (iArr.length == 0) {
            return Collections.emptyList();
        }
        return new t6.a(0, iArr.length, iArr);
    }

    public static void b0(TextView textView, int i10) {
        int i11;
        j(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (k0.o.a(textView)) {
            i11 = fontMetricsInt.bottom;
        } else {
            i11 = fontMetricsInt.descent;
        }
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    public static void c(String str) {
        if (b0.f3799a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void c0(XmlResourceParser xmlResourceParser) {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlResourceParser.next();
            if (next != 2) {
                if (next == 3) {
                    i10--;
                }
            } else {
                i10++;
            }
        }
    }

    public static String d(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d0(d2.q r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.d.d0(d2.q, boolean, boolean):boolean");
    }

    public static void e(Context context, LinearLayout linearLayout, final List list, z zVar) {
        int i10;
        int i11;
        linearLayout.removeAllViews();
        Activity activity = (Activity) context;
        final y yVar = new y(context, linearLayout, list, zVar);
        q0.o oVar = new q0.o(context, list, zVar, 13);
        boolean f10 = w8.i.f(activity);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("upcoming", "Upcoming Next Season");
        linkedHashMap.put("new", "New Episode Releases");
        linkedHashMap.put("top", "Top Airing");
        linkedHashMap.put("popular", "Most Popular");
        linkedHashMap.put("fan", "Fan Favorites");
        linkedHashMap.put("tv", "Top TV");
        linkedHashMap.put("movies", "Top Movie");
        linkedHashMap.put("spotlight", "Spotlight");
        linkedHashMap.put("ona", "Top ONA");
        linkedHashMap.put("ova", "Top OVA");
        linkedHashMap.put("special", "Top Special");
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(1);
        final int i12 = 0;
        linearLayout2.setPadding(w8.i.e(activity, 22), 0, w8.i.e(activity, 22), w8.i.e(activity, 40));
        TextView l10 = w8.i.l(activity, "Home Customize", 24, -1, 1);
        l10.setIncludeFontPadding(false);
        linearLayout2.addView(l10, new LinearLayout.LayoutParams(-1, -2));
        View l11 = w8.i.l(activity, "Drag to reorder. Changes are saved when you tap Save.", 13, w8.i.f11068h, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, w8.i.e(activity, 8), 0, w8.i.e(activity, 20));
        linearLayout2.addView(l11, layoutParams);
        final LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(1);
        a3.g.w(-1, -2, linearLayout2, linearLayout3);
        while (i12 < list.size()) {
            String str = (String) list.get(i12);
            if (linkedHashMap.containsKey(str)) {
                str = (String) linkedHashMap.get(str);
            }
            LinearLayout linearLayout4 = new LinearLayout(activity);
            linearLayout4.setGravity(16);
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            linearLayout4.setPadding(w8.i.e(activity, 16), w8.i.e(activity, 14), w8.i.e(activity, 14), w8.i.e(activity, 14));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(w8.i.e(activity, 12));
            int i13 = w8.i.f11064d;
            gradientDrawable.setColor(i13);
            linearLayout4.setBackground(gradientDrawable);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            if (i12 > 0) {
                layoutParams2.topMargin = w8.i.e(activity, 8);
            }
            linearLayout4.setLayoutParams(layoutParams2);
            linearLayout4.setFocusable(true);
            linearLayout4.setTag(Integer.valueOf(i12));
            TextView l12 = w8.i.l(activity, "⋮⋮", 20, w8.i.f11068h, 0);
            l12.setGravity(17);
            l12.setIncludeFontPadding(false);
            linearLayout4.addView(l12, new LinearLayout.LayoutParams(w8.i.e(activity, 28), -2));
            TextView l13 = w8.i.l(activity, str, 15, -1, 1);
            l13.setIncludeFontPadding(false);
            l13.setPadding(w8.i.e(activity, 10), 0, 0, 0);
            a3.g.v(0, -2, 1.0f, linearLayout4, l13);
            if (f10) {
                if (i12 == 0) {
                    i10 = i13;
                } else {
                    i10 = w8.i.f11065e;
                }
                TextView l14 = w8.i.l(activity, "▲", 14, i10, 1);
                l14.setGravity(17);
                l14.setPadding(w8.i.e(activity, 10), w8.i.e(activity, 8), w8.i.e(activity, 10), w8.i.e(activity, 8));
                final int i14 = 0;
                l14.setIncludeFontPadding(false);
                if (i12 > 0) {
                    l14.setOnClickListener(new View.OnClickListener() { // from class: k8.b
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i15 = i14;
                            y yVar2 = yVar;
                            List list2 = list;
                            int i16 = i12;
                            switch (i15) {
                                case 0:
                                    Collections.swap(list2, i16, i16 - 1);
                                    yVar2.a(new ArrayList(list2));
                                    return;
                                default:
                                    Collections.swap(list2, i16, i16 + 1);
                                    yVar2.a(new ArrayList(list2));
                                    return;
                            }
                        }
                    });
                }
                w8.i.b(l14);
                linearLayout4.addView(l14, new LinearLayout.LayoutParams(-2, -2));
                if (i12 == list.size() - 1) {
                    i11 = i13;
                } else {
                    i11 = w8.i.f11065e;
                }
                TextView l15 = w8.i.l(activity, "▼", 14, i11, 1);
                l15.setGravity(17);
                l15.setPadding(w8.i.e(activity, 10), w8.i.e(activity, 8), w8.i.e(activity, 10), w8.i.e(activity, 8));
                l15.setIncludeFontPadding(false);
                final int i15 = 1;
                if (i12 < list.size() - 1) {
                    l15.setOnClickListener(new View.OnClickListener() { // from class: k8.b
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i152 = i15;
                            y yVar2 = yVar;
                            List list2 = list;
                            int i16 = i12;
                            switch (i152) {
                                case 0:
                                    Collections.swap(list2, i16, i16 - 1);
                                    yVar2.a(new ArrayList(list2));
                                    return;
                                default:
                                    Collections.swap(list2, i16, i16 + 1);
                                    yVar2.a(new ArrayList(list2));
                                    return;
                            }
                        }
                    });
                }
                w8.i.b(l15);
                linearLayout4.addView(l15, new LinearLayout.LayoutParams(-2, -2));
            }
            if (!f10) {
                linearLayout4.setOnLongClickListener(new k8.c());
                linearLayout4.setOnDragListener(new View.OnDragListener() { // from class: k8.d
                    @Override // android.view.View.OnDragListener
                    public final boolean onDrag(View view, DragEvent dragEvent) {
                        int action = dragEvent.getAction();
                        if (action == 1) {
                            return true;
                        }
                        if (action != 3) {
                            if (action != 4) {
                                if (action != 5) {
                                    if (action == 6) {
                                        view.setAlpha(1.0f);
                                        return true;
                                    }
                                } else {
                                    view.setAlpha(0.4f);
                                    return true;
                                }
                            } else {
                                ViewParent parent = view.getParent();
                                if (!(parent instanceof LinearLayout)) {
                                    return true;
                                }
                                LinearLayout linearLayout5 = (LinearLayout) parent;
                                for (int i16 = 0; i16 < linearLayout5.getChildCount(); i16++) {
                                    linearLayout5.getChildAt(i16).setAlpha(1.0f);
                                }
                                return true;
                            }
                        } else {
                            ViewParent parent2 = view.getParent();
                            if (parent2 instanceof LinearLayout) {
                                LinearLayout linearLayout6 = (LinearLayout) parent2;
                                for (int i17 = 0; i17 < linearLayout6.getChildCount(); i17++) {
                                    linearLayout6.getChildAt(i17).setAlpha(1.0f);
                                }
                            }
                            View view2 = (View) dragEvent.getLocalState();
                            if (view2 != null) {
                                Integer num = (Integer) view2.getTag();
                                Integer num2 = (Integer) view.getTag();
                                if (num != null && num2 != null) {
                                    int intValue = num.intValue();
                                    int intValue2 = num2.intValue();
                                    if (intValue == intValue2 || intValue < 0) {
                                        return true;
                                    }
                                    List list2 = list;
                                    if (intValue >= list2.size() || intValue2 < 0 || intValue2 >= list2.size()) {
                                        return true;
                                    }
                                    Collections.swap(list2, intValue, intValue2);
                                    yVar.a(new ArrayList(list2));
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                });
            }
            linearLayout3.addView(linearLayout4);
            i12++;
            linkedHashMap = linkedHashMap2;
        }
        if (!f10) {
            linearLayout3.setOnDragListener(new View.OnDragListener() { // from class: k8.e
                @Override // android.view.View.OnDragListener
                public final boolean onDrag(View view, DragEvent dragEvent) {
                    Integer num;
                    int action = dragEvent.getAction();
                    if (action == 1) {
                        return true;
                    }
                    LinearLayout linearLayout5 = linearLayout3;
                    int i16 = 0;
                    if (action != 3) {
                        if (action == 4) {
                            while (i16 < linearLayout5.getChildCount()) {
                                linearLayout5.getChildAt(i16).setAlpha(1.0f);
                                i16++;
                            }
                            return true;
                        }
                    } else {
                        View view2 = (View) dragEvent.getLocalState();
                        if (view2 != null && (num = (Integer) view2.getTag()) != null) {
                            int intValue = num.intValue();
                            float y9 = dragEvent.getY();
                            int childCount = linearLayout5.getChildCount();
                            while (true) {
                                if (i16 >= childCount) {
                                    break;
                                }
                                if (linearLayout5.getChildAt(i16).getVisibility() == 0) {
                                    if (y9 < (r4.getHeight() / 2) + r4.getTop()) {
                                        childCount = i16;
                                        break;
                                    }
                                }
                                i16++;
                            }
                            if (intValue == childCount || childCount < 0) {
                                return true;
                            }
                            List list2 = list;
                            if (childCount > list2.size()) {
                                return true;
                            }
                            String str2 = (String) list2.remove(intValue);
                            if (childCount > intValue) {
                                childCount--;
                            }
                            list2.add(childCount, str2);
                            yVar.a(new ArrayList(list2));
                            return true;
                        }
                    }
                    return false;
                }
            });
        }
        LinearLayout linearLayout5 = new LinearLayout(activity);
        linearLayout5.setGravity(17);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(0, w8.i.e(activity, 24), 0, 0);
        linearLayout2.addView(linearLayout5, layoutParams3);
        TextView l16 = w8.i.l(activity, "Reset to default", 14, w8.i.f11068h, 1);
        l16.setGravity(17);
        l16.setPadding(w8.i.e(activity, 20), w8.i.e(activity, 14), w8.i.e(activity, 20), w8.i.e(activity, 14));
        w8.i.b(l16);
        l16.setOnClickListener(new h8.r(14, list, yVar));
        linearLayout5.addView(l16, new LinearLayout.LayoutParams(-2, -2));
        a3.g.v(0, -2, 1.0f, linearLayout5, new TextView(activity));
        TextView l17 = w8.i.l(activity, "Save", 16, -1, 1);
        l17.setGravity(17);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(w8.i.e(activity, 10));
        gradientDrawable2.setColor(w8.i.f11065e);
        l17.setBackground(gradientDrawable2);
        l17.setPadding(w8.i.e(activity, 36), w8.i.e(activity, 14), w8.i.e(activity, 36), w8.i.e(activity, 14));
        w8.i.b(l17);
        l17.setOnClickListener(new j8.c(oVar, 2));
        linearLayout5.addView(l17, new LinearLayout.LayoutParams(-2, -2));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(0, w8.i.e(context, 16), 0, 0);
        linearLayout.addView(linearLayout2, layoutParams4);
    }

    public static int[] e0(Collection collection) {
        if (collection instanceof t6.a) {
            t6.a aVar = (t6.a) collection;
            return Arrays.copyOfRange(aVar.f10045a, aVar.f10046b, aVar.f10047c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = array[i10];
            obj.getClass();
            iArr[i10] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static String f(int i10, boolean z9, int i11, int i12, int[] iArr, int i13) {
        char c6;
        Object[] objArr = new Object[5];
        objArr[0] = f2191f[i10];
        objArr[1] = Integer.valueOf(i11);
        objArr[2] = Integer.valueOf(i12);
        if (z9) {
            c6 = 'H';
        } else {
            c6 = 'L';
        }
        objArr[3] = Character.valueOf(c6);
        objArr[4] = Integer.valueOf(i13);
        StringBuilder sb = new StringBuilder(b0.m("hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb.toString();
    }

    public static String f0(a8.h hVar) {
        String str = hVar.f199b;
        if (str != null) {
            if (hVar.B) {
                return "DASH";
            }
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.contains(".mpd")) {
                return "DASH";
            }
            if (lowerCase.contains(".m3u8")) {
                return "HLS";
            }
            return "MP4";
        }
        return "MP4";
    }

    public static ArrayList g(List list, ArrayList arrayList) {
        Object orDefault;
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (intValue >= 0 && intValue < list.size()) {
                a8.h hVar = (a8.h) list.get(intValue);
                String str = hVar.f204x;
                if (str == null || str.isEmpty()) {
                    str = "Source";
                }
                orDefault = linkedHashMap.getOrDefault(str, 0);
                int intValue2 = ((Integer) orDefault).intValue() + 1;
                linkedHashMap.put(str, Integer.valueOf(intValue2));
                arrayList2.add(str + " " + intValue2 + " • " + f0(hVar));
            }
        }
        return arrayList2;
    }

    public static ActionMode.Callback g0(ActionMode.Callback callback) {
        if ((callback instanceof k0.t) && Build.VERSION.SDK_INT >= 26) {
            return ((k0.t) callback).f6307a;
        }
        return callback;
    }

    public static String h(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i10 = 0; i10 < length; i10++) {
            char[] cArr = f2192g;
            sb.append(cArr[(bArr[i10] & 240) >>> 4]);
            sb.append(cArr[bArr[i10] & 15]);
        }
        return sb.toString();
    }

    public static String h0(a8.e eVar) {
        if (eVar == null) {
            return "";
        }
        return "You are watching " + eVar.f183a;
    }

    public static void i(String str, boolean z9) {
        if (z9) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static ActionMode.Callback i0(ActionMode.Callback callback, TextView textView) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && i10 <= 27 && !(callback instanceof k0.t) && callback != null) {
            return new k0.t(callback, textView);
        }
        return callback;
    }

    public static void j(int i10) {
        if (i10 >= 0) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0175 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0296 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0224  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j0(android.content.Context r19, k.a r20, k3.e r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.d.j0(android.content.Context, k.a, k3.e, boolean):void");
    }

    public static void k(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    public static final void l(int i10) {
        boolean z9 = true;
        if (i10 < 1) {
            z9 = false;
        }
        if (z9) {
        } else {
            throw new IllegalArgumentException(a3.g.n("Expected positive parallelism level, but got ", i10).toString());
        }
    }

    public static int m(long j4) {
        boolean z9;
        int i10 = (int) j4;
        if (i10 == j4) {
            z9 = true;
        } else {
            z9 = false;
        }
        h0.l(z9, "Out of range: %s", j4);
        return i10;
    }

    public static int n(int i10, int i11) {
        boolean z9;
        if (i11 <= 1073741823) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return Math.min(Math.max(i10, i11), 1073741823);
        }
        throw new IllegalArgumentException(a0.M("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i11), 1073741823));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final z6.e o(Object obj, z6.e eVar, h7.p pVar) {
        h0.u(pVar, "<this>");
        h0.u(eVar, "completion");
        if (pVar instanceof b7.a) {
            return ((b7.a) pVar).create(obj, eVar);
        }
        z6.i context = eVar.getContext();
        if (context == z6.j.f12080a) {
            return new a7.b(obj, eVar, pVar);
        }
        return new a7.c(eVar, context, pVar, obj);
    }

    public static final o0 p(y0.c cVar) {
        s0 s0Var;
        Bundle bundle;
        h0.u(cVar, "<this>");
        n3.g gVar = (n3.g) cVar.a(f2186a);
        if (gVar != null) {
            c1 c1Var = (c1) cVar.a(f2187b);
            if (c1Var != null) {
                Bundle bundle2 = (Bundle) cVar.a(f2188c);
                String str = (String) cVar.a(q0.f1129b);
                if (str != null) {
                    n3.d b10 = gVar.getSavedStateRegistry().b();
                    if (b10 instanceof s0) {
                        s0Var = (s0) b10;
                    } else {
                        s0Var = null;
                    }
                    if (s0Var != null) {
                        int i10 = 1;
                        t0 t0Var = (t0) new a1(c1Var, new v0(i10)).b(t0.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
                        o0 o0Var = (o0) t0Var.f1144a.get(str);
                        if (o0Var == null) {
                            Class[] clsArr = o0.f1119f;
                            s0Var.b();
                            Bundle bundle3 = s0Var.f1142c;
                            if (bundle3 != null) {
                                bundle = bundle3.getBundle(str);
                            } else {
                                bundle = null;
                            }
                            Bundle bundle4 = s0Var.f1142c;
                            if (bundle4 != null) {
                                bundle4.remove(str);
                            }
                            Bundle bundle5 = s0Var.f1142c;
                            if (bundle5 == null || !bundle5.isEmpty()) {
                                i10 = 0;
                            }
                            if (i10 != 0) {
                                s0Var.f1142c = null;
                            }
                            o0 l10 = j6.e.l(bundle, bundle2);
                            t0Var.f1144a.put(str, l10);
                            return l10;
                        }
                        return o0Var;
                    }
                    throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    public static String q(List list, int i10) {
        String str = "Source";
        if (i10 < 0 || i10 >= list.size()) {
            return "Source";
        }
        a8.h hVar = (a8.h) list.get(i10);
        String str2 = hVar.f204x;
        if (str2 != null && !str2.isEmpty()) {
            str = str2;
        }
        StringBuilder a10 = p.j.a(str, " • ");
        a10.append(f0(hVar));
        return a10.toString();
    }

    public static final void r(n3.g gVar) {
        boolean z9;
        h0.u(gVar, "<this>");
        androidx.lifecycle.o oVar = ((w) gVar.getLifecycle()).f1156c;
        if (oVar != androidx.lifecycle.o.INITIALIZED && oVar != androidx.lifecycle.o.CREATED) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            if (gVar.getSavedStateRegistry().b() == null) {
                s0 s0Var = new s0(gVar.getSavedStateRegistry(), (c1) gVar);
                gVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", s0Var);
                gVar.getLifecycle().a(new androidx.lifecycle.e(s0Var));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static void s() {
        if (b0.f3799a >= 18) {
            Trace.endSection();
        }
    }

    public static int t(a8.e eVar) {
        if (eVar == null) {
            return 0;
        }
        return Math.max(0, Math.round(eVar.f186d));
    }

    public static String u(a8.e eVar) {
        String str = "";
        if (eVar == null) {
            return "";
        }
        String str2 = eVar.f187e;
        if (str2 != null) {
            str = str2.trim();
        }
        if (str.isEmpty()) {
            return eVar.f183a;
        }
        return str;
    }

    public static String v(long j4) {
        long max = Math.max(0L, j4 / 1000);
        return String.format(Locale.US, "%02d:%02d", Long.valueOf(max / 60), Long.valueOf(max % 60));
    }

    public static void w(int i10, f1.t tVar) {
        tVar.D(7);
        byte[] bArr = tVar.f3858a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i10 >> 16) & 255);
        bArr[5] = (byte) ((i10 >> 8) & 255);
        bArr[6] = (byte) (i10 & 255);
    }

    public static final Class x(m7.b bVar) {
        h0.u(bVar, "<this>");
        Class a10 = ((i7.c) bVar).a();
        if (!a10.isPrimitive()) {
            return a10;
        }
        String name = a10.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.class;
                }
                return a10;
            case 104431:
                if (name.equals("int")) {
                    return Integer.class;
                }
                return a10;
            case 3039496:
                if (name.equals("byte")) {
                    return Byte.class;
                }
                return a10;
            case 3052374:
                if (name.equals("char")) {
                    return Character.class;
                }
                return a10;
            case 3327612:
                if (name.equals("long")) {
                    return Long.class;
                }
                return a10;
            case 3625364:
                if (name.equals("void")) {
                    return Void.class;
                }
                return a10;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.class;
                }
                return a10;
            case 97526364:
                if (name.equals("float")) {
                    return Float.class;
                }
                return a10;
            case 109413500:
                if (name.equals("short")) {
                    return Short.class;
                }
                return a10;
            default:
                return a10;
        }
    }

    public static y.c y(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10) {
        y.c cVar;
        boolean E = E(xmlPullParser, str);
        Object obj = null;
        int i11 = 0;
        if (E) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i10, typedValue);
            int i12 = typedValue.type;
            if (i12 >= 28 && i12 <= 31) {
                return new y.c(typedValue.data, obj, obj);
            }
            try {
                cVar = y.c.b(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
            } catch (Exception e10) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e10);
                cVar = null;
            }
            if (cVar != null) {
                return cVar;
            }
        }
        return new y.c(i11, obj, obj);
    }

    public static float z(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, float f10) {
        if (!E(xmlPullParser, str)) {
            return f10;
        }
        return typedArray.getFloat(i10, f10);
    }

    public abstract void M(Throwable th);

    public abstract void N(i.g gVar);
}
