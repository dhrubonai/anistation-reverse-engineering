package p7;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.appcompat.widget.h4;
import androidx.appcompat.widget.j4;
import androidx.appcompat.widget.o3;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract class a0 {
    public static boolean C = true;

    /* renamed from: a, reason: collision with root package name */
    public static Field f8636a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f8637b = false;

    /* renamed from: c, reason: collision with root package name */
    public static Class f8638c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f8639d = false;

    /* renamed from: e, reason: collision with root package name */
    public static Field f8640e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f8641f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Field f8642g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f8643h = false;

    /* renamed from: i, reason: collision with root package name */
    public static Boolean f8644i = null;

    /* renamed from: k, reason: collision with root package name */
    public static f.c f8646k = null;

    /* renamed from: s, reason: collision with root package name */
    public static volatile boolean f8653s = true;

    /* renamed from: j, reason: collision with root package name */
    public static final f.c f8645j = new f.c(null, null, null, 18, 0);

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f8647l = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f8648m = {44100, 48000, 32000};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f8649n = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] o = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f8650p = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f8651q = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f8652r = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: t, reason: collision with root package name */
    public static final Object[] f8654t = new Object[0];

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f8655u = {48, 49, 53, 0};

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f8656v = {48, 49, 48, 0};

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f8657w = {48, 48, 57, 0};

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f8658x = {48, 48, 53, 0};

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f8659y = {48, 48, 49, 0};

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f8660z = {48, 48, 49, 0};
    public static final byte[] A = {48, 48, 50, 0};
    public static final String[] B = {"standard", "accelerate", "decelerate", "linear"};

    public static int A(y3.h hVar, InputStream inputStream, List list) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new e4.v(inputStream, hVar);
        }
        inputStream.mark(5242880);
        return B(list, new androidx.appcompat.widget.a0(24, inputStream, hVar));
    }

    public static int B(List list, v3.h hVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int a10 = hVar.a((v3.e) list.get(i10));
            if (a10 != -1) {
                return a10;
            }
        }
        return -1;
    }

    public static Task C(Intent intent) {
        z4.a aVar;
        GoogleSignInAccount googleSignInAccount;
        e5.a aVar2 = a5.j.f107a;
        Status status = Status.f2358y;
        if (intent == null) {
            aVar = new z4.a(null, status);
        } else {
            Status status2 = (Status) intent.getParcelableExtra("googleSignInStatus");
            GoogleSignInAccount googleSignInAccount2 = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
            if (googleSignInAccount2 == null) {
                if (status2 != null) {
                    status = status2;
                }
                aVar = new z4.a(null, status);
            } else {
                aVar = new z4.a(googleSignInAccount2, Status.f2356f);
            }
        }
        Status status3 = aVar.f12055a;
        if (status3.d() && (googleSignInAccount = aVar.f12056b) != null) {
            return Tasks.forResult(googleSignInAccount);
        }
        return Tasks.forException(s(status3));
    }

    public static String D(int i10) {
        switch (i10) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
            case 12:
            default:
                return a3.g.n("unknown status code: ", i10);
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case zzaja.zze.zzg /* 7 */:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static File E(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i10 = 0; i10 < 100; i10++) {
            File file = new File(cacheDir, str + i10);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static ImageHeaderParser$ImageType F(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ImageHeaderParser$ImageType a10 = ((v3.e) list.get(i10)).a(byteBuffer);
                p4.b.c(byteBuffer);
                if (a10 != ImageHeaderParser$ImageType.UNKNOWN) {
                    return a10;
                }
            } catch (Throwable th) {
                p4.b.c(byteBuffer);
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static ImageHeaderParser$ImageType G(y3.h hVar, InputStream inputStream, List list) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new e4.v(inputStream, hVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ImageHeaderParser$ImageType d10 = ((v3.e) list.get(i10)).d(inputStream);
                inputStream.reset();
                if (d10 != ImageHeaderParser$ImageType.UNKNOWN) {
                    return d10;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static boolean H(XmlPullParser xmlPullParser, String str) {
        boolean z9;
        if (xmlPullParser.getEventType() == 3) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean I(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }

    public static boolean J(View view) {
        WeakHashMap weakHashMap = g0.y0.f4277a;
        if (g0.i0.d(view) == 1) {
            return true;
        }
        return false;
    }

    public static boolean K(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 2) {
            return true;
        }
        return false;
    }

    public static boolean L(XmlPullParser xmlPullParser, String str) {
        if (K(xmlPullParser) && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    public static String M(String str, Object... objArr) {
        int indexOf;
        String str2;
        int i10 = 0;
        for (int i11 = 0; i11 < objArr.length; i11++) {
            Object obj = objArr[i11];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e10) {
                    String str3 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str3, (Throwable) e10);
                    str2 = "<" + str3 + " threw " + e10.getClass().getName() + ">";
                }
            }
            objArr[i11] = str2;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i12 = 0;
        while (i10 < objArr.length && (indexOf = str.indexOf("%s", i12)) != -1) {
            sb.append((CharSequence) str, i12, indexOf);
            sb.append(objArr[i10]);
            i12 = indexOf + 2;
            i10++;
        }
        sb.append((CharSequence) str, i12, str.length());
        if (i10 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb.append(", ");
                sb.append(objArr[i13]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static Drawable N(Context context, int i10, Resources.Theme theme) {
        if (theme != null) {
            i.e eVar = new i.e(context, theme);
            eVar.a(theme.getResources().getConfiguration());
            context = eVar;
        }
        return w7.b.G(context, i10);
    }

    public static MappedByteBuffer O(Context context, Uri uri) {
        try {
            ParcelFileDescriptor a10 = z.o.a(context.getContentResolver(), uri, "r", null);
            if (a10 == null) {
                if (a10 != null) {
                    a10.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(a10.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    a10.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static void P(y2.d dVar, int i10, f1.c cVar) {
        long b10 = dVar.b(i10);
        List c6 = dVar.c(b10);
        if (c6.isEmpty()) {
            return;
        }
        if (i10 != dVar.d() - 1) {
            long b11 = dVar.b(i10 + 1) - dVar.b(i10);
            if (b11 > 0) {
                cVar.accept(new y2.a(c6, b10, b11));
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    public static PorterDuff.Mode Q(int i10, PorterDuff.Mode mode) {
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 9) {
                    switch (i10) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static void R(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j4 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) arrayList.get(i10);
            j4 = Math.max(j4, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j4);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static int S(int i10, f1.t tVar) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return tVar.v() + 1;
            case zzaja.zze.zzg /* 7 */:
                return tVar.A() + 1;
            case 8:
            case 9:
            case 10:
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }

    public static void T(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = textInputLayout.getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = drawable.mutate();
            a0.b.h(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public static void U(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z9;
        WeakHashMap weakHashMap = g0.y0.f4277a;
        boolean a10 = g0.g0.a(checkableImageButton);
        boolean z10 = false;
        int i10 = 1;
        if (onLongClickListener != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (a10 || z9) {
            z10 = true;
        }
        checkableImageButton.setFocusable(z10);
        checkableImageButton.setClickable(a10);
        checkableImageButton.setPressable(a10);
        checkableImageButton.setLongClickable(z9);
        if (!z10) {
            i10 = 2;
        }
        g0.h0.s(checkableImageButton, i10);
    }

    public static void V(View view, j6.g gVar) {
        boolean z9;
        d6.a aVar = gVar.f6194a.f6175b;
        if (aVar != null && aVar.f3233a) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            float f10 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap weakHashMap = g0.y0.f4277a;
                f10 += g0.n0.i((View) parent);
            }
            j6.f fVar = gVar.f6194a;
            if (fVar.f6186m != f10) {
                fVar.f6186m = f10;
                gVar.m();
            }
        }
    }

    public static void W(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            h4.a(view, charSequence);
            return;
        }
        j4 j4Var = j4.B;
        if (j4Var != null && j4Var.f542a == view) {
            j4.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            j4 j4Var2 = j4.C;
            if (j4Var2 != null && j4Var2.f542a == view) {
                j4Var2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new j4(view, charSequence);
    }

    public static void X(ViewGroup viewGroup, boolean z9) {
        if (Build.VERSION.SDK_INT >= 29) {
            l1.f0.u(viewGroup, z9);
        } else if (C) {
            try {
                l1.f0.u(viewGroup, z9);
            } catch (NoSuchMethodError unused) {
                C = false;
            }
        }
    }

    public static final Object[] Y(Collection collection) {
        r6.h0.u(collection, "collection");
        int size = collection.size();
        Object[] objArr = f8654t;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr2 = new Object[size];
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    objArr2[i10] = it.next();
                    if (i11 >= objArr2.length) {
                        if (it.hasNext()) {
                            int i12 = ((i11 * 3) + 1) >>> 1;
                            if (i12 <= i11) {
                                i12 = 2147483645;
                                if (i11 >= 2147483645) {
                                    throw new OutOfMemoryError();
                                }
                            }
                            objArr2 = Arrays.copyOf(objArr2, i12);
                            r6.h0.s(objArr2, "copyOf(...)");
                        } else {
                            return objArr2;
                        }
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr2, i11);
                        r6.h0.s(copyOf, "copyOf(...)");
                        return copyOf;
                    }
                    i10 = i11;
                }
            } else {
                return objArr;
            }
        } else {
            return objArr;
        }
    }

    public static final Object[] Z(Collection collection, Object[] objArr) {
        Object[] objArr2;
        r6.h0.u(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i10 = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            r6.h0.r(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int i11 = i10 + 1;
            objArr2[i10] = it.next();
            if (i11 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i12 = ((i11 * 3) + 1) >>> 1;
                if (i12 <= i11) {
                    i12 = 2147483645;
                    if (i11 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i12);
                r6.h0.s(objArr2, "copyOf(...)");
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i11] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i11);
                r6.h0.s(copyOf, "copyOf(...)");
                return copyOf;
            }
            i10 = i11;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, Object obj, int i10, int i11) {
        for (Object obj2 : spannableStringBuilder.getSpans(i10, i11, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i10 && spannableStringBuilder.getSpanEnd(obj2) == i11 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i10, i11, 33);
    }

    public static String a0(int i10) {
        return f1.b0.m("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10)), Double.valueOf(Color.alpha(i10) / 255.0d));
    }

    public static void b(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList != null && colorStateList.isStateful()) {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                a0.b.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            } else {
                a0.b.h(drawable, colorStateList);
            }
            if (mode != null) {
                a0.b.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[LOOP:0: B:14:0x0054->B:16:0x005a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b0(y2.d r13, f.r0 r14, f1.c r15) {
        /*
            long r0 = r14.f3775a
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto Le
            r4 = r5
            goto L27
        Le:
            int r4 = r13.a(r0)
            r6 = -1
            if (r4 != r6) goto L1a
            int r4 = r13.d()
            goto L27
        L1a:
            if (r4 <= 0) goto L27
            int r6 = r4 + (-1)
            long r7 = r13.b(r6)
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 != 0) goto L27
            r4 = r6
        L27:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L52
            java.util.List r7 = r13.c(r0)
            long r2 = r13.b(r4)
            boolean r6 = r7.isEmpty()
            if (r6 != 0) goto L52
            int r6 = r13.d()
            if (r4 >= r6) goto L52
            long r8 = r14.f3775a
            int r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r6 >= 0) goto L52
            y2.a r12 = new y2.a
            long r10 = r2 - r8
            r6 = r12
            r6.<init>(r7, r8, r10)
            r15.accept(r12)
            r2 = 1
            goto L53
        L52:
            r2 = r5
        L53:
            r3 = r4
        L54:
            int r6 = r13.d()
            if (r3 >= r6) goto L60
            P(r13, r3, r15)
            int r3 = r3 + 1
            goto L54
        L60:
            boolean r14 = r14.f3776b
            if (r14 == 0) goto L89
            if (r2 == 0) goto L68
            int r4 = r4 + (-1)
        L68:
            if (r5 >= r4) goto L70
            P(r13, r5, r15)
            int r5 = r5 + 1
            goto L68
        L70:
            if (r2 == 0) goto L89
            y2.a r14 = new y2.a
            java.util.List r7 = r13.c(r0)
            long r8 = r13.b(r4)
            long r2 = r13.b(r4)
            long r10 = r0 - r2
            r6 = r14
            r6.<init>(r7, r8, r10)
            r15.accept(r14)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.a0.b0(y2.d, f.r0, f1.c):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0098, code lost:
    
        if (r7 == r18.f3200f) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a5, code lost:
    
        if ((r17.v() * 1000) == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b4, code lost:
    
        if (r4 == r3) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(f1.t r17, d2.v r18, int r19, d2.t r20) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.a0.c(f1.t, d2.v, int, d2.t):boolean");
    }

    public static final String c0(z6.e eVar) {
        Object F;
        if (eVar instanceof t7.i) {
            return eVar.toString();
        }
        try {
            F = eVar + '@' + z(eVar);
        } catch (Throwable th) {
            F = r6.h0.F(th);
        }
        if (w6.d.a(F) != null) {
            F = eVar.getClass().getName() + '@' + z(eVar);
        }
        return (String) F;
    }

    public static void d(String str, boolean z9) {
        if (z9) {
        } else {
            throw c1.r0.a(str, null);
        }
    }

    public static void d0(Parcel parcel, int i10, boolean z9) {
        parcel.writeInt(i10 | 262144);
        parcel.writeInt(z9 ? 1 : 0);
    }

    public static void e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void e0(Parcel parcel, int i10, Bundle bundle, boolean z9) {
        if (bundle == null) {
            if (z9) {
                parcel.writeInt(i10 | 0);
            }
        } else {
            int t02 = t0(i10, parcel);
            parcel.writeBundle(bundle);
            u0(t02, parcel);
        }
    }

    public static int f(m3.w0 w0Var, m3.z zVar, View view, View view2, m3.k0 k0Var, boolean z9) {
        if (k0Var.v() != 0 && w0Var.b() != 0 && view != null && view2 != null) {
            if (!z9) {
                return Math.abs(m3.k0.F(view) - m3.k0.F(view2)) + 1;
            }
            return Math.min(zVar.i(), zVar.b(view2) - zVar.d(view));
        }
        return 0;
    }

    public static void f0(Parcel parcel, int i10, byte[] bArr, boolean z9) {
        if (bArr == null) {
            if (z9) {
                parcel.writeInt(i10 | 0);
            }
        } else {
            int t02 = t0(i10, parcel);
            parcel.writeByteArray(bArr);
            u0(t02, parcel);
        }
    }

    public static int g(m3.w0 w0Var, m3.z zVar, View view, View view2, m3.k0 k0Var, boolean z9, boolean z10) {
        int max;
        if (k0Var.v() == 0 || w0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(m3.k0.F(view), m3.k0.F(view2));
        int max2 = Math.max(m3.k0.F(view), m3.k0.F(view2));
        if (z10) {
            max = Math.max(0, (w0Var.b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z9) {
            return max;
        }
        return Math.round((max * (Math.abs(zVar.b(view2) - zVar.d(view)) / (Math.abs(m3.k0.F(view) - m3.k0.F(view2)) + 1))) + (zVar.h() - zVar.d(view)));
    }

    public static void g0(Parcel parcel, int i10, Double d10) {
        if (d10 == null) {
            return;
        }
        parcel.writeInt(i10 | 524288);
        parcel.writeDouble(d10.doubleValue());
    }

    public static int h(m3.w0 w0Var, m3.z zVar, View view, View view2, m3.k0 k0Var, boolean z9) {
        if (k0Var.v() != 0 && w0Var.b() != 0 && view != null && view2 != null) {
            if (!z9) {
                return w0Var.b();
            }
            return (int) (((zVar.b(view2) - zVar.d(view)) / (Math.abs(m3.k0.F(view) - m3.k0.F(view2)) + 1)) * w0Var.b());
        }
        return 0;
    }

    public static void h0(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | 262144);
        parcel.writeInt(i11);
    }

    public static ImageView.ScaleType i(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                return ImageView.ScaleType.CENTER;
                            }
                            return ImageView.ScaleType.CENTER_INSIDE;
                        }
                        return ImageView.ScaleType.CENTER_CROP;
                    }
                    return ImageView.ScaleType.FIT_END;
                }
                return ImageView.ScaleType.FIT_CENTER;
            }
            return ImageView.ScaleType.FIT_START;
        }
        return ImageView.ScaleType.FIT_XY;
    }

    public static void i0(Parcel parcel, int i10, int[] iArr, boolean z9) {
        if (iArr == null) {
            if (z9) {
                parcel.writeInt(i10 | 0);
            }
        } else {
            int t02 = t0(i10, parcel);
            parcel.writeIntArray(iArr);
            u0(t02, parcel);
        }
    }

    public static boolean j(File file, Resources resources, int i10) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i10);
            try {
                boolean k10 = k(file, inputStream);
                e(inputStream);
                return k10;
            } catch (Throwable th) {
                th = th;
                e(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static void j0(Parcel parcel, int i10, Integer num) {
        if (num == null) {
            return;
        }
        parcel.writeInt(i10 | 262144);
        parcel.writeInt(num.intValue());
    }

    public static boolean k(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
            fileOutputStream = fileOutputStream2;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    e(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
            }
        } catch (IOException e11) {
            e = e11;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            e(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            e(fileOutputStream);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static void k0(Parcel parcel, int i10, long j4) {
        parcel.writeInt(i10 | 524288);
        parcel.writeLong(j4);
    }

    public static com.bumptech.glide.j l(com.bumptech.glide.b bVar, List list) {
        v3.n fVar;
        v3.n aVar;
        int i10;
        String str;
        int i11;
        y3.d dVar = bVar.f2170a;
        com.bumptech.glide.f fVar2 = bVar.f2172c;
        Context applicationContext = fVar2.getApplicationContext();
        androidx.lifecycle.b0 b0Var = fVar2.f2222h;
        com.bumptech.glide.j jVar = new com.bumptech.glide.j();
        e4.l lVar = new e4.l();
        h4.c cVar = jVar.f2236g;
        synchronized (cVar) {
            cVar.f5004a.add(lVar);
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 27) {
            jVar.k(new e4.s());
        }
        Resources resources = applicationContext.getResources();
        ArrayList f10 = jVar.f();
        y3.h hVar = bVar.f2173d;
        g4.a aVar2 = new g4.a(applicationContext, f10, dVar, hVar);
        e4.f0 f0Var = new e4.f0(dVar, new f9.x(13));
        e4.p pVar = new e4.p(jVar.f(), resources.getDisplayMetrics(), dVar, hVar);
        int i13 = 2;
        int i14 = 0;
        if (i12 >= 28 && b0Var.f1074a.containsKey(com.bumptech.glide.c.class)) {
            aVar = new e4.g(1);
            fVar = new e4.g(0);
        } else {
            fVar = new e4.f(pVar, i14);
            aVar = new e4.a(i13, pVar, hVar);
        }
        int i15 = 5;
        if (i12 >= 28) {
            i10 = i12;
            jVar.d(new f4.b(new z3.e(i15, f10, hVar), 1), InputStream.class, Drawable.class, "Animation");
            jVar.d(new f4.b(new z3.e(5, f10, hVar), 0), ByteBuffer.class, Drawable.class, "Animation");
        } else {
            i10 = i12;
        }
        f4.f fVar3 = new f4.f(applicationContext);
        e4.b bVar2 = new e4.b(hVar);
        d0.h hVar2 = new d0.h(5);
        f9.x xVar = new f9.x(16);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        jVar.b(ByteBuffer.class, new w1.o(29));
        jVar.b(InputStream.class, new k3.d(hVar, 13));
        jVar.d(fVar, ByteBuffer.class, Bitmap.class, "Bitmap");
        jVar.d(aVar, InputStream.class, Bitmap.class, "Bitmap");
        String str2 = Build.FINGERPRINT;
        if (!"robolectric".equals(str2)) {
            str = "Animation";
            jVar.d(new e4.f(pVar, 1), ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        } else {
            str = "Animation";
        }
        jVar.d(new e4.f0(dVar, new f9.x()), AssetFileDescriptor.class, Bitmap.class, "Bitmap");
        jVar.d(f0Var, ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        androidx.lifecycle.q0 q0Var = androidx.lifecycle.q0.f1130c;
        jVar.a(Bitmap.class, Bitmap.class, q0Var);
        jVar.d(new e4.a0(0), Bitmap.class, Bitmap.class, "Bitmap");
        jVar.c(Bitmap.class, bVar2);
        jVar.d(new e4.a(resources, fVar), ByteBuffer.class, BitmapDrawable.class, "BitmapDrawable");
        jVar.d(new e4.a(resources, aVar), InputStream.class, BitmapDrawable.class, "BitmapDrawable");
        jVar.d(new e4.a(resources, f0Var), ParcelFileDescriptor.class, BitmapDrawable.class, "BitmapDrawable");
        jVar.c(BitmapDrawable.class, new z3.e(3, dVar, bVar2));
        g4.j jVar2 = new g4.j(f10, aVar2, hVar);
        String str3 = str;
        jVar.d(jVar2, InputStream.class, g4.c.class, str3);
        jVar.d(aVar2, ByteBuffer.class, g4.c.class, str3);
        jVar.c(g4.c.class, new f9.x(15));
        jVar.a(u3.a.class, u3.a.class, q0Var);
        jVar.d(new e4.c(dVar), u3.a.class, Bitmap.class, "Bitmap");
        jVar.d(fVar3, Uri.class, Drawable.class, "legacy_append");
        jVar.d(new e4.a(1, fVar3, dVar), Uri.class, Bitmap.class, "legacy_append");
        jVar.i(new com.bumptech.glide.load.data.h(2));
        jVar.a(File.class, ByteBuffer.class, new f9.x(0));
        jVar.a(File.class, InputStream.class, new b4.m(1));
        jVar.d(new e4.a0(2), File.class, File.class, "legacy_append");
        jVar.a(File.class, ParcelFileDescriptor.class, new b4.m(0));
        jVar.a(File.class, File.class, q0Var);
        jVar.i(new com.bumptech.glide.load.data.m(hVar));
        int i16 = 1;
        if (!"robolectric".equals(str2)) {
            jVar.i(new com.bumptech.glide.load.data.h(i16));
        }
        int i17 = 0;
        b5.h hVar3 = new b5.h(applicationContext, 5, i17);
        b5.h hVar4 = new b5.h(applicationContext, 3, i17);
        b5.h hVar5 = new b5.h(applicationContext, 4, i17);
        Class cls = Integer.TYPE;
        jVar.a(cls, InputStream.class, hVar3);
        jVar.a(Integer.class, InputStream.class, hVar3);
        jVar.a(cls, AssetFileDescriptor.class, hVar4);
        jVar.a(Integer.class, AssetFileDescriptor.class, hVar4);
        jVar.a(cls, Drawable.class, hVar5);
        jVar.a(Integer.class, Drawable.class, hVar5);
        int i18 = 0;
        jVar.a(Uri.class, InputStream.class, new b5.h(applicationContext, 8, i18));
        jVar.a(Uri.class, AssetFileDescriptor.class, new b5.h(applicationContext, 7, i18));
        b4.d0 d0Var = new b4.d0(2, resources);
        b4.d0 d0Var2 = new b4.d0(i18, resources);
        b4.d0 d0Var3 = new b4.d0(1, resources);
        jVar.a(Integer.class, Uri.class, d0Var);
        jVar.a(cls, Uri.class, d0Var);
        jVar.a(Integer.class, AssetFileDescriptor.class, d0Var2);
        jVar.a(cls, AssetFileDescriptor.class, d0Var2);
        jVar.a(Integer.class, InputStream.class, d0Var3);
        jVar.a(cls, InputStream.class, d0Var3);
        jVar.a(String.class, InputStream.class, new k3.d(11));
        jVar.a(Uri.class, InputStream.class, new k3.d(11));
        int i19 = 6;
        jVar.a(String.class, InputStream.class, new f9.x(i19));
        jVar.a(String.class, ParcelFileDescriptor.class, new f9.x(5));
        jVar.a(String.class, AssetFileDescriptor.class, new f9.x(4));
        jVar.a(Uri.class, InputStream.class, new b4.b(applicationContext.getAssets(), 1));
        int i20 = 0;
        jVar.a(Uri.class, AssetFileDescriptor.class, new b4.b(applicationContext.getAssets(), i20));
        jVar.a(Uri.class, InputStream.class, new b5.h(applicationContext, 9, i20));
        jVar.a(Uri.class, InputStream.class, new b5.h(applicationContext, 10, i20));
        if (i10 >= 29) {
            i11 = 1;
            jVar.a(Uri.class, InputStream.class, new c4.b(applicationContext, 1));
            jVar.a(Uri.class, ParcelFileDescriptor.class, new c4.b(applicationContext, 0));
        } else {
            i11 = 1;
        }
        jVar.a(Uri.class, InputStream.class, new b4.g0(contentResolver, 2));
        jVar.a(Uri.class, ParcelFileDescriptor.class, new b4.g0(contentResolver, i11));
        jVar.a(Uri.class, AssetFileDescriptor.class, new b4.g0(contentResolver, i20));
        jVar.a(Uri.class, InputStream.class, new f9.x(7));
        jVar.a(URL.class, InputStream.class, new f9.x(8));
        jVar.a(Uri.class, File.class, new b5.h(applicationContext, i19, i20));
        jVar.a(b4.o.class, InputStream.class, new k3.d(14));
        jVar.a(byte[].class, ByteBuffer.class, new w1.o(27));
        jVar.a(byte[].class, InputStream.class, new w1.o(28));
        jVar.a(Uri.class, Uri.class, q0Var);
        jVar.a(Drawable.class, Drawable.class, q0Var);
        jVar.d(new e4.a0(1), Drawable.class, Drawable.class, "legacy_append");
        jVar.j(Bitmap.class, BitmapDrawable.class, new b4.d0(resources));
        jVar.j(Bitmap.class, byte[].class, hVar2);
        jVar.j(Drawable.class, byte[].class, new f.c(dVar, hVar2, xVar, 16, 0));
        jVar.j(g4.c.class, byte[].class, xVar);
        e4.f0 f0Var2 = new e4.f0(dVar, new f9.x(11));
        jVar.d(f0Var2, ByteBuffer.class, Bitmap.class, "legacy_append");
        jVar.d(new e4.a(resources, f0Var2), ByteBuffer.class, BitmapDrawable.class, "legacy_append");
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return jVar;
        }
        a3.g.z(it.next());
        throw null;
    }

    public static void l0(Parcel parcel, int i10, Long l10) {
        if (l10 == null) {
            return;
        }
        parcel.writeInt(i10 | 524288);
        parcel.writeLong(l10.longValue());
    }

    public static r6.h0 m(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return new j6.i();
            }
            return new j6.d();
        }
        return new j6.i();
    }

    public static void m0(Parcel parcel, int i10, Parcelable parcelable, int i11, boolean z9) {
        if (parcelable == null) {
            if (z9) {
                parcel.writeInt(i10 | 0);
            }
        } else {
            int t02 = t0(i10, parcel);
            parcelable.writeToParcel(parcel, i11);
            u0(t02, parcel);
        }
    }

    public static j6.e n() {
        return new j6.e(0);
    }

    public static void n0(Parcel parcel, int i10, String str, boolean z9) {
        if (str == null) {
            if (z9) {
                parcel.writeInt(i10 | 0);
            }
        } else {
            int t02 = t0(i10, parcel);
            parcel.writeString(str);
            u0(t02, parcel);
        }
    }

    public static z1.h o(y1.s sVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = sVar.length();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (sVar.b(i12, elapsedRealtime)) {
                i11++;
            }
        }
        return new z1.h(1, i10, length, i11);
    }

    public static void o0(Parcel parcel, int i10, String[] strArr, boolean z9) {
        if (strArr == null) {
            if (z9) {
                parcel.writeInt(i10 | 0);
            }
        } else {
            int t02 = t0(i10, parcel);
            parcel.writeStringArray(strArr);
            u0(t02, parcel);
        }
    }

    public static c5.b p(Intent intent, String str, Parcelable.Creator creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        w7.b.s(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
        obtain.setDataPosition(0);
        c5.b bVar = (c5.b) creator.createFromParcel(obtain);
        obtain.recycle();
        return bVar;
    }

    public static void p0(Parcel parcel, int i10, List list) {
        if (list == null) {
            return;
        }
        int t02 = t0(i10, parcel);
        parcel.writeStringList(list);
        u0(t02, parcel);
    }

    public static boolean q(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static void q0(StringBuilder sb, HashMap hashMap) {
        sb.append("{");
        boolean z9 = true;
        for (String str : hashMap.keySet()) {
            if (!z9) {
                sb.append(",");
            }
            String str2 = (String) hashMap.get(str);
            sb.append("\"");
            sb.append(str);
            sb.append("\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(str2);
                sb.append("\"");
            }
            z9 = false;
        }
        sb.append("}");
    }

    public static void r(Object obj) {
        LongSparseArray longSparseArray;
        if (!f8639d) {
            try {
                f8638c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            f8639d = true;
        }
        Class cls = f8638c;
        if (cls == null) {
            return;
        }
        if (!f8641f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f8640e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
            }
            f8641f = true;
        }
        Field field = f8640e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e12) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            f.q0.a(longSparseArray);
        }
    }

    public static void r0(Parcel parcel, int i10, Parcelable[] parcelableArr, int i11) {
        if (parcelableArr == null) {
            return;
        }
        int t02 = t0(i10, parcel);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                v0(parcel, parcelable, i11);
            }
        }
        u0(t02, parcel);
    }

    public static com.google.android.gms.common.api.j s(Status status) {
        boolean z9;
        if (status.f2363d != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return new com.google.android.gms.common.api.r(status);
        }
        return new com.google.android.gms.common.api.j(status);
    }

    public static void s0(Parcel parcel, int i10, List list, boolean z9) {
        if (list == null) {
            if (z9) {
                parcel.writeInt(i10 | 0);
                return;
            }
            return;
        }
        int t02 = t0(i10, parcel);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            Parcelable parcelable = (Parcelable) list.get(i11);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                v0(parcel, parcelable, 0);
            }
        }
        u0(t02, parcel);
    }

    public static String t(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    public static int t0(int i10, Parcel parcel) {
        parcel.writeInt(i10 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static ColorStateList u(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        ColorStateList colorStateList;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0 && (colorStateList = x.j.getColorStateList(context, resourceId)) != null) {
            return colorStateList;
        }
        return typedArray.getColorStateList(i10);
    }

    public static void u0(int i10, Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(dataPosition - i10);
        parcel.setDataPosition(dataPosition);
    }

    public static ColorStateList v(Context context, o3 o3Var, int i10) {
        int i11;
        ColorStateList colorStateList;
        if (o3Var.l(i10) && (i11 = o3Var.i(i10, 0)) != 0 && (colorStateList = x.j.getColorStateList(context, i11)) != null) {
            return colorStateList;
        }
        return o3Var.b(i10);
    }

    public static void v0(Parcel parcel, Parcelable parcelable, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i10);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static Drawable w(Context context, Context context2, int i10, Resources.Theme theme) {
        try {
            if (f8653s) {
                return N(context2, i10, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e10) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return x.j.getDrawable(context2, i10);
            }
            throw e10;
        } catch (NoClassDefFoundError unused2) {
            f8653s = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = y.p.f11448a;
        return y.i.a(resources, i10, theme);
    }

    public static Drawable x(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        Drawable G;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0 && (G = w7.b.G(context, resourceId)) != null) {
            return G;
        }
        return typedArray.getDrawable(i10);
    }

    public static int y(int i10) {
        boolean z9;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if ((i10 & (-2097152)) == -2097152) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i17 = f8648m[i14];
        if (i11 == 2) {
            i17 /= 2;
        } else if (i11 == 0) {
            i17 /= 4;
        }
        int i18 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            if (i11 == 3) {
                i16 = f8649n[i13 - 1];
            } else {
                i16 = o[i13 - 1];
            }
            return (((i16 * 12) / i17) + i18) * 4;
        }
        if (i11 == 3) {
            if (i12 == 2) {
                i15 = f8650p[i13 - 1];
            } else {
                i15 = f8651q[i13 - 1];
            }
        } else {
            i15 = f8652r[i13 - 1];
        }
        int i19 = 144;
        if (i11 == 3) {
            return a3.g.j(i15, 144, i17, i18);
        }
        if (i12 == 1) {
            i19 = 72;
        }
        return a3.g.j(i19, i15, i17, i18);
    }

    public static final String z(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }
}
