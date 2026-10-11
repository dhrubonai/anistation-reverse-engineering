package w7;

import a3.g;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.y2;
import com.google.android.gms.internal.base.zaq;
import f1.r;
import f1.t;
import h1.h;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import msr.pistream.app.R;
import p6.k;
import q3.o;
import r.f;
import r6.h0;
import r6.i1;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final d0.b f11021a = new d0.b(0);

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f11022b = {R.attr.colorPrimary};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f11023c = {R.attr.colorPrimaryVariant};

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f11024d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f11025e = {android.R.attr.theme, R.attr.theme};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f11026f = {R.attr.materialThemeOverlay};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f11027g = {android.R.attr.name, android.R.attr.tint, android.R.attr.height, android.R.attr.width, android.R.attr.alpha, android.R.attr.autoMirrored, android.R.attr.tintMode, android.R.attr.viewportWidth, android.R.attr.viewportHeight};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f11028h = {android.R.attr.name, android.R.attr.pivotX, android.R.attr.pivotY, android.R.attr.scaleX, android.R.attr.scaleY, android.R.attr.rotation, android.R.attr.translateX, android.R.attr.translateY};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f11029i = {android.R.attr.name, android.R.attr.fillColor, android.R.attr.pathData, android.R.attr.strokeColor, android.R.attr.strokeWidth, android.R.attr.trimPathStart, android.R.attr.trimPathEnd, android.R.attr.trimPathOffset, android.R.attr.strokeLineCap, android.R.attr.strokeLineJoin, android.R.attr.strokeMiterLimit, android.R.attr.strokeAlpha, android.R.attr.fillAlpha, android.R.attr.fillType};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f11030j = {android.R.attr.name, android.R.attr.pathData, android.R.attr.fillType};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f11031k = {android.R.attr.drawable};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f11032l = {android.R.attr.name, android.R.attr.animation};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f11033m = {android.R.attr.interpolator, android.R.attr.duration, android.R.attr.startOffset, android.R.attr.repeatCount, android.R.attr.repeatMode, android.R.attr.valueFrom, android.R.attr.valueTo, android.R.attr.valueType};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f11034n = {android.R.attr.ordering};
    public static final int[] o = {android.R.attr.valueFrom, android.R.attr.valueTo, android.R.attr.valueType, android.R.attr.propertyName};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f11035p = {android.R.attr.value, android.R.attr.interpolator, android.R.attr.valueType, android.R.attr.fraction};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f11036q = {android.R.attr.propertyName, android.R.attr.pathData, android.R.attr.propertyXName, android.R.attr.propertyYName};

    /* renamed from: r, reason: collision with root package name */
    public static Constructor f11037r;

    /* renamed from: s, reason: collision with root package name */
    public static Method f11038s;

    /* renamed from: t, reason: collision with root package name */
    public static Method f11039t;

    public static void B(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static void C(h hVar) {
        if (hVar != null) {
            try {
                hVar.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0341, code lost:
    
        r1 = new android.animation.Animator[r13.size()];
        r2 = r13.iterator();
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0350, code lost:
    
        if (r2.hasNext() == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0352, code lost:
    
        r1[r14] = (android.animation.Animator) r2.next();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x035e, code lost:
    
        if (r33 != 0) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0360, code lost:
    
        r32.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0364, code lost:
    
        r32.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0367, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x033d, code lost:
    
        if (r32 == null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x033f, code lost:
    
        if (r13 == null) goto L177;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0316  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.Animator D(android.content.Context r27, android.content.res.Resources r28, android.content.res.Resources.Theme r29, android.content.res.XmlResourceParser r30, android.util.AttributeSet r31, android.animation.AnimatorSet r32, int r33) {
        /*
            Method dump skipped, instructions count: 872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.b.D(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.content.res.XmlResourceParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    public static Keyframe F(Keyframe keyframe, float f10) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f10);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f10);
        }
        return Keyframe.ofObject(f10);
    }

    public static Drawable G(Context context, int i10) {
        return y2.d().f(context, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0096 A[LOOP:1: B:13:0x0053->B:27:0x0096, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a A[EDGE_INSN: B:28:0x009a->B:29:0x009a BREAK  A[LOOP:1: B:13:0x0053->B:27:0x0096], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static d0.h H(android.content.Context r22, androidx.appcompat.widget.r r23) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.b.H(android.content.Context, androidx.appcompat.widget.r):d0.h");
    }

    public static PropertyValuesHolder I(TypedArray typedArray, int i10, int i11, int i12, String str) {
        boolean z9;
        int i13;
        boolean z10;
        int i14;
        boolean z11;
        r3.e eVar;
        int i15;
        int i16;
        int i17;
        float f10;
        PropertyValuesHolder ofFloat;
        float f11;
        float f12;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i11);
        int i18 = 1;
        if (peekValue != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            i13 = peekValue.type;
        } else {
            i13 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i12);
        if (peekValue2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i14 = peekValue2.type;
        } else {
            i14 = 0;
        }
        if (i10 == 4) {
            if ((z9 && J(i13)) || (z10 && J(i14))) {
                i10 = 3;
            } else {
                i10 = 0;
            }
        }
        if (i10 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (i10 == 2) {
            String string = typedArray.getString(i11);
            String string2 = typedArray.getString(i12);
            z.h[] o6 = j5.a.o(string);
            z.h[] o9 = j5.a.o(string2);
            if (o6 == null && o9 == null) {
                return null;
            }
            if (o6 != null) {
                o oVar = new o(i18);
                if (o9 != null) {
                    if (j5.a.f(o6, o9)) {
                        ofObject = PropertyValuesHolder.ofObject(str, oVar, o6, o9);
                    } else {
                        throw new InflateException(" Can't morph from " + string + " to " + string2);
                    }
                } else {
                    ofObject = PropertyValuesHolder.ofObject(str, oVar, o6);
                }
                return ofObject;
            }
            if (o9 == null) {
                return null;
            }
            return PropertyValuesHolder.ofObject(str, new o(i18), o9);
        }
        if (i10 == 3) {
            eVar = r3.e.f9337a;
        } else {
            eVar = null;
        }
        if (z11) {
            if (z9) {
                if (i13 == 5) {
                    f11 = typedArray.getDimension(i11, 0.0f);
                } else {
                    f11 = typedArray.getFloat(i11, 0.0f);
                }
                if (z10) {
                    if (i14 == 5) {
                        f12 = typedArray.getDimension(i12, 0.0f);
                    } else {
                        f12 = typedArray.getFloat(i12, 0.0f);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, f11, f12);
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, f11);
                }
            } else {
                if (i14 == 5) {
                    f10 = typedArray.getDimension(i12, 0.0f);
                } else {
                    f10 = typedArray.getFloat(i12, 0.0f);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, f10);
            }
            propertyValuesHolder = ofFloat;
        } else if (z9) {
            if (i13 == 5) {
                i16 = (int) typedArray.getDimension(i11, 0.0f);
            } else if (J(i13)) {
                i16 = typedArray.getColor(i11, 0);
            } else {
                i16 = typedArray.getInt(i11, 0);
            }
            if (z10) {
                if (i14 == 5) {
                    i17 = (int) typedArray.getDimension(i12, 0.0f);
                } else if (J(i14)) {
                    i17 = typedArray.getColor(i12, 0);
                } else {
                    i17 = typedArray.getInt(i12, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i16, i17);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i16);
            }
        } else if (z10) {
            if (i14 == 5) {
                i15 = (int) typedArray.getDimension(i12, 0.0f);
            } else if (J(i14)) {
                i15 = typedArray.getColor(i12, 0);
            } else {
                i15 = typedArray.getInt(i12, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i15);
        }
        if (propertyValuesHolder != null && eVar != null) {
            propertyValuesHolder.setEvaluator(eVar);
            return propertyValuesHolder;
        }
        return propertyValuesHolder;
    }

    public static boolean J(int i10) {
        return i10 >= 28 && i10 <= 31;
    }

    public static boolean K(Uri uri) {
        if (uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }

    public static long L(Context context, Uri uri) {
        ContentResolver contentResolver = context.getContentResolver();
        long j4 = 0;
        Cursor cursor = null;
        try {
            try {
                cursor = contentResolver.query(uri, new String[]{"_size"}, null, null, null);
                if (cursor.moveToFirst() && !cursor.isNull(0)) {
                    j4 = cursor.getLong(0);
                }
            } catch (Exception e10) {
                Log.w("DocumentFile", "Failed query: " + e10);
            }
            return j4;
        } finally {
            B(cursor);
        }
    }

    public static ValueAnimator M(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator3;
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        boolean z9;
        int i10;
        boolean z10;
        int i11;
        TypedArray L = com.bumptech.glide.d.L(resources, theme, attributeSet, f11033m);
        TypedArray L2 = com.bumptech.glide.d.L(resources, theme, attributeSet, f11036q);
        if (objectAnimator == null) {
            valueAnimator = new ValueAnimator();
        } else {
            valueAnimator = objectAnimator;
        }
        long A = com.bumptech.glide.d.A(L, xmlResourceParser, "duration", 1, 300);
        int i12 = 0;
        long A2 = com.bumptech.glide.d.A(L, xmlResourceParser, "startOffset", 2, 0);
        int A3 = com.bumptech.glide.d.A(L, xmlResourceParser, "valueType", 7, 4);
        if (com.bumptech.glide.d.E(xmlResourceParser, "valueFrom") && com.bumptech.glide.d.E(xmlResourceParser, "valueTo")) {
            if (A3 == 4) {
                TypedValue peekValue = L.peekValue(5);
                if (peekValue != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    i10 = peekValue.type;
                } else {
                    i10 = 0;
                }
                TypedValue peekValue2 = L.peekValue(6);
                if (peekValue2 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i11 = peekValue2.type;
                } else {
                    i11 = 0;
                }
                if ((z9 && J(i10)) || (z10 && J(i11))) {
                    A3 = 3;
                } else {
                    A3 = 0;
                }
            }
            PropertyValuesHolder I = I(L, A3, 5, 6, "");
            if (I != null) {
                valueAnimator.setValues(I);
            }
        }
        valueAnimator.setDuration(A);
        valueAnimator.setStartDelay(A2);
        valueAnimator.setRepeatCount(com.bumptech.glide.d.A(L, xmlResourceParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(com.bumptech.glide.d.A(L, xmlResourceParser, "repeatMode", 4, 1));
        if (L2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator;
            String B = com.bumptech.glide.d.B(L2, xmlResourceParser, "pathData", 1);
            if (B != null) {
                String B2 = com.bumptech.glide.d.B(L2, xmlResourceParser, "propertyXName", 2);
                String B3 = com.bumptech.glide.d.B(L2, xmlResourceParser, "propertyYName", 3);
                if (B2 == null && B3 == null) {
                    throw new InflateException(L2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path p3 = j5.a.p(B);
                PathMeasure pathMeasure = new PathMeasure(p3, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f10 = 0.0f;
                do {
                    f10 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f10));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(p3, false);
                int min = Math.min(100, ((int) (f10 / 0.5f)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f11 = f10 / (min - 1);
                valueAnimator2 = valueAnimator;
                typedArray = L;
                int i13 = 0;
                float f12 = 0.0f;
                while (true) {
                    propertyValuesHolder = null;
                    if (i12 >= min) {
                        break;
                    }
                    int i14 = min;
                    pathMeasure2.getPosTan(f12 - ((Float) arrayList.get(i13)).floatValue(), fArr3, null);
                    fArr[i12] = fArr3[0];
                    fArr2[i12] = fArr3[1];
                    f12 += f11;
                    int i15 = i13 + 1;
                    if (i15 < arrayList.size() && f12 > ((Float) arrayList.get(i15)).floatValue()) {
                        pathMeasure2.nextContour();
                        i13 = i15;
                    }
                    i12++;
                    min = i14;
                }
                if (B2 != null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofFloat(B2, fArr);
                } else {
                    propertyValuesHolder2 = null;
                }
                if (B3 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(B3, fArr2);
                }
                if (propertyValuesHolder2 == null) {
                    i12 = 0;
                    objectAnimator2.setValues(propertyValuesHolder);
                } else {
                    i12 = 0;
                    if (propertyValuesHolder == null) {
                        objectAnimator2.setValues(propertyValuesHolder2);
                    } else {
                        objectAnimator2.setValues(propertyValuesHolder2, propertyValuesHolder);
                    }
                }
            } else {
                valueAnimator2 = valueAnimator;
                typedArray = L;
                objectAnimator2.setPropertyName(com.bumptech.glide.d.B(L2, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator;
            typedArray = L;
        }
        if (!com.bumptech.glide.d.E(xmlResourceParser, "interpolator")) {
            typedArray2 = typedArray;
        } else {
            typedArray2 = typedArray;
            i12 = typedArray2.getResourceId(i12, i12);
        }
        if (i12 > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(AnimationUtils.loadInterpolator(context, i12));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray2.recycle();
        if (L2 != null) {
            L2.recycle();
        }
        return valueAnimator3;
    }

    public static TypedArray N(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        k(context, attributeSet, i10, i11);
        y(context, attributeSet, iArr, i10, i11, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
    }

    public static r Q(byte[] bArr) {
        UUID[] uuidArr;
        t tVar = new t(bArr);
        if (tVar.f3860c < 32) {
            return null;
        }
        tVar.G(0);
        int i10 = tVar.f3860c - tVar.f3859b;
        int f10 = tVar.f();
        if (f10 != i10) {
            f1.o.f("PsshAtomUtil", "Advertised atom size (" + f10 + ") does not match buffer size: " + i10);
            return null;
        }
        int f11 = tVar.f();
        if (f11 != 1886614376) {
            g.A("Atom type is not pssh: ", f11, "PsshAtomUtil");
            return null;
        }
        int f12 = (tVar.f() >> 24) & 255;
        if (f12 > 1) {
            g.A("Unsupported pssh version: ", f12, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(tVar.o(), tVar.o());
        if (f12 == 1) {
            int y9 = tVar.y();
            uuidArr = new UUID[y9];
            for (int i11 = 0; i11 < y9; i11++) {
                uuidArr[i11] = new UUID(tVar.o(), tVar.o());
            }
        } else {
            uuidArr = null;
        }
        int y10 = tVar.y();
        int i12 = tVar.f3860c - tVar.f3859b;
        if (y10 != i12) {
            f1.o.f("PsshAtomUtil", "Atom data size (" + y10 + ") does not match the bytes left: " + i12);
            return null;
        }
        byte[] bArr2 = new byte[y10];
        tVar.d(bArr2, 0, y10);
        return new r(uuid, f12, bArr2, uuidArr);
    }

    public static byte[] R(UUID uuid, byte[] bArr) {
        r Q = Q(bArr);
        if (Q == null) {
            return null;
        }
        Object obj = Q.f3847b;
        if (!uuid.equals((UUID) obj)) {
            f1.o.f("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + ((UUID) obj) + ".");
            return null;
        }
        return (byte[]) Q.f3848c;
    }

    public static void S() {
        if (f11037r == null || f11038s == null || f11039t == null) {
            Class<?> cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
            f11037r = cls.getConstructor(new Class[0]);
            f11038s = cls.getMethod("setRotationDegrees", Float.TYPE);
            f11039t = cls.getMethod("build", new Class[0]);
        }
    }

    public static String T(Context context, Uri uri, String str) {
        Cursor cursor;
        Throwable th;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            try {
                try {
                    if (cursor.moveToFirst() && !cursor.isNull(0)) {
                        String string = cursor.getString(0);
                        B(cursor);
                        return string;
                    }
                    B(cursor);
                    return null;
                } catch (Exception e10) {
                    e = e10;
                    Log.w("DocumentFile", "Failed query: " + e);
                    B(cursor);
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                B(cursor);
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            cursor = null;
        } catch (Throwable th3) {
            cursor = null;
            th = th3;
            B(cursor);
            throw th;
        }
    }

    public static a0 U(t tVar) {
        tVar.H(1);
        int x9 = tVar.x();
        long j4 = tVar.f3859b + x9;
        int i10 = x9 / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long o6 = tVar.o();
            if (o6 == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = o6;
            jArr2[i11] = tVar.o();
            tVar.H(2);
            i11++;
        }
        tVar.H((int) (j4 - tVar.f3859b));
        return new a0(14, jArr, jArr2);
    }

    public static void V(Drawable drawable, int i10) {
        a0.b.g(drawable, i10);
    }

    public static void W(Drawable drawable, ColorStateList colorStateList) {
        a0.b.h(drawable, colorStateList);
    }

    public static void X(Drawable drawable, PorterDuff.Mode mode) {
        a0.b.i(drawable, mode);
    }

    public static Bundle Y(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(b.class.getClassLoader());
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static Context Z(Context context, AttributeSet attributeSet, int i10, int i11) {
        boolean z9;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f11026f, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        if ((context instanceof i.e) && ((i.e) context).f5183a == resourceId) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (resourceId != 0 && !z9) {
            i.e eVar = new i.e(context, resourceId);
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f11025e);
            int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
            int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
            obtainStyledAttributes2.recycle();
            if (resourceId2 == 0) {
                resourceId2 = resourceId3;
            }
            if (resourceId2 != 0) {
                eVar.getTheme().applyStyle(resourceId2, true);
            }
            return eVar;
        }
        return context;
    }

    public static final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", kVar.f8623a);
            bundle.putLong("event_timestamp", kVar.f8624b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    public static final int b(char c6) {
        boolean z9;
        boolean z10;
        boolean z11 = true;
        if ('0' <= c6 && c6 < ':') {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return c6 - '0';
        }
        char c10 = 'a';
        if ('a' <= c6 && c6 < 'g') {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            c10 = 'A';
            if ('A' > c6 || c6 >= 'G') {
                z11 = false;
            }
            if (!z11) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c6);
            }
        }
        return (c6 - c10) + 10;
    }

    public static byte[] d(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int i10;
        int i11;
        if (bArr != null) {
            i10 = bArr.length;
        } else {
            i10 = 0;
        }
        int i12 = i10 + 32;
        if (uuidArr != null) {
            i12 += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i12);
        allocate.putInt(i12);
        allocate.putInt(1886614376);
        if (uuidArr != null) {
            i11 = 16777216;
        } else {
            i11 = 0;
        }
        allocate.putInt(i11);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        } else {
            allocate.putInt(0);
        }
        return allocate.array();
    }

    public static void e(Object obj, StringBuilder sb) {
        int lastIndexOf;
        if (obj == null) {
            sb.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static void f(String str, boolean z9) {
        if (z9) {
        } else {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void g(boolean z9) {
        if (z9) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void h(boolean z9, String str) {
        if (z9) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static void i(String str, boolean z9) {
        if (z9) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static void j(boolean z9) {
        if (z9) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void k(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s5.a.A, i10, i11);
        boolean z9 = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z9) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                z(context, f11023c, "Theme.MaterialComponents");
            }
        }
        z(context, f11022b, "Theme.AppCompat");
    }

    public static void l(zaq zaqVar) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != zaqVar.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            throw new IllegalStateException("Must be called on " + zaqVar.getLooper().getThread().getName() + " thread, but got " + str + ".");
        }
    }

    public static void m(int i10, int i11) {
        if (i10 >= 0 && i10 < i11) {
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void n(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static void o(String str) {
        if (!TextUtils.isEmpty(str)) {
        } else {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void p(String str) {
        boolean z9;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    public static void q(Object obj) {
        if (obj != null) {
        } else {
            throw new NullPointerException("Argument must not be null");
        }
    }

    public static void r(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    public static void s(Object obj) {
        if (obj != null) {
        } else {
            throw new NullPointerException("null reference");
        }
    }

    public static void t(String str, boolean z9) {
        if (z9) {
        } else {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void u(boolean z9) {
        if (z9) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static void v(String str, boolean z9) {
        if (z9) {
        } else {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void w(Object obj) {
        if (obj != null) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static void x(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r0.getResourceId(0, -1) != (-1)) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void y(android.content.Context r4, android.util.AttributeSet r5, int[] r6, int r7, int r8, int... r9) {
        /*
            int[] r0 = s5.a.A
            android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r5, r0, r7, r8)
            r1 = 2
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L12
            r0.recycle()
            return
        L12:
            int r1 = r9.length
            r3 = -1
            if (r1 != 0) goto L1d
            int r4 = r0.getResourceId(r2, r3)
            if (r4 == r3) goto L38
            goto L37
        L1d:
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r6, r7, r8)
            int r5 = r9.length
            r6 = r2
        L23:
            if (r6 >= r5) goto L34
            r7 = r9[r6]
            int r7 = r4.getResourceId(r7, r3)
            if (r7 != r3) goto L31
            r4.recycle()
            goto L38
        L31:
            int r6 = r6 + 1
            goto L23
        L34:
            r4.recycle()
        L37:
            r2 = 1
        L38:
            r0.recycle()
            if (r2 == 0) goto L3e
            return
        L3e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.b.y(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    public static void z(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean z9 = false;
        int i10 = 0;
        while (true) {
            if (i10 < iArr.length) {
                if (!obtainStyledAttributes.hasValue(i10)) {
                    obtainStyledAttributes.recycle();
                    break;
                }
                i10++;
            } else {
                obtainStyledAttributes.recycle();
                z9 = true;
                break;
            }
        }
        if (z9) {
        } else {
            throw new IllegalArgumentException(f.e("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        }
    }

    public abstract List A(String str, List list);

    public abstract Map E();

    public abstract void O(int i10);

    public abstract void P(Typeface typeface, boolean z9);

    public i1 c() {
        h0.p(2, "expectedValuesPerKey");
        return new i1(this);
    }
}
