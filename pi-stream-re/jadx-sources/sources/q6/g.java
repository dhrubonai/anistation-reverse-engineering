package q6;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.w;
import androidx.lifecycle.q0;
import c1.p0;
import c1.r0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.i0;
import com.google.android.gms.tasks.TaskCompletionSource;
import d2.q;
import f1.b0;
import f1.t;
import f9.x;
import h1.p;
import h8.r;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.IDN;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import msr.pistream.app.ui.home.screens.MainActivity;
import p7.c0;
import p7.f0;
import p7.l1;
import p7.m0;
import p7.w1;
import p7.x1;
import r6.h0;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f9211a = new String[0];

    /* renamed from: b, reason: collision with root package name */
    public static final x f9212b = new x(23);

    public g() {
    }

    public static int A(Context context, int i10, int i11) {
        TypedValue a02 = a0(context, i10);
        if (a02 != null) {
            int i12 = a02.resourceId;
            if (i12 != 0) {
                return x.j.getColor(context, i12);
            }
            return a02.data;
        }
        return i11;
    }

    public static int B(View view, int i10) {
        Context context = view.getContext();
        TypedValue e02 = e0(view.getContext(), view.getClass().getCanonicalName(), i10);
        int i11 = e02.resourceId;
        if (i11 != 0) {
            return x.j.getColor(context, i11);
        }
        return e02.data;
    }

    public static final void C(z6.i iVar, Throwable th) {
        try {
            p7.x xVar = (p7.x) iVar.r(q0.f1133f);
            if (xVar != null) {
                ((q7.b) xVar).G(iVar, th);
            } else {
                h0.b0(iVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                com.bumptech.glide.d.a(runtimeException, th);
                th = runtimeException;
            }
            h0.b0(iVar, th);
        }
    }

    public static boolean D(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 == 130) {
                        int i11 = rect.top;
                        int i12 = rect2.top;
                        if ((i11 < i12 || rect.bottom <= i12) && rect.bottom < rect2.bottom) {
                            return true;
                        }
                        return false;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                int i13 = rect.left;
                int i14 = rect2.left;
                if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
                    return true;
                }
                return false;
            }
            int i15 = rect.bottom;
            int i16 = rect2.bottom;
            if ((i15 > i16 || rect.top >= i16) && rect.top > rect2.top) {
                return true;
            }
            return false;
        }
        int i17 = rect.right;
        int i18 = rect2.right;
        if ((i17 > i18 || rect.left >= i18) && rect.left > rect2.left) {
            return true;
        }
        return false;
    }

    public static boolean E(int i10) {
        boolean z9;
        double pow;
        double pow2;
        double pow3;
        if (i10 != 0) {
            ThreadLocal threadLocal = z.a.f11854a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i10);
            int green = Color.green(i10);
            int blue = Color.blue(i10);
            if (dArr.length == 3) {
                double d10 = red / 255.0d;
                if (d10 < 0.04045d) {
                    pow = d10 / 12.92d;
                } else {
                    pow = Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
                }
                double d11 = green / 255.0d;
                if (d11 < 0.04045d) {
                    pow2 = d11 / 12.92d;
                } else {
                    pow2 = Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
                }
                double d12 = blue / 255.0d;
                if (d12 < 0.04045d) {
                    pow3 = d12 / 12.92d;
                } else {
                    pow3 = Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
                }
                z9 = false;
                dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
                double d13 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
                dArr[1] = d13;
                dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
                if (d13 / 100.0d > 0.5d) {
                    return true;
                }
            } else {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
        } else {
            z9 = false;
        }
        return z9;
    }

    public static int F(float f10, int i10, int i11) {
        return z.a.b(z.a.c(i11, Math.round(Color.alpha(i11) * f10)), i10);
    }

    public static int G(int i10, Rect rect, Rect rect2) {
        int i11;
        int i12;
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 == 130) {
                        i11 = rect2.top;
                        i12 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i11 = rect2.left;
                    i12 = rect.right;
                }
            } else {
                i11 = rect.top;
                i12 = rect2.bottom;
            }
        } else {
            i11 = rect.left;
            i12 = rect2.right;
        }
        return Math.max(0, i11 - i12);
    }

    public static int H(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList I(f1.t r28) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.g.I(f1.t):java.util.ArrayList");
    }

    public static p0 J(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            int i11 = b0.f3799a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                f1.o.f("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(o2.a.d(new t(Base64.decode(split[1], 0))));
                } catch (RuntimeException e10) {
                    f1.o.g("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new t2.a(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new p0(arrayList);
    }

    public static final boolean K(String str) {
        h0.u(str, "method");
        if (!h0.g(str, "GET") && !h0.g(str, "HEAD")) {
            return true;
        }
        return false;
    }

    public static z6.i L(z6.i iVar, z6.i iVar2) {
        h0.u(iVar2, "context");
        if (iVar2 != z6.j.f12080a) {
            return (z6.i) iVar2.x(iVar, z6.c.f12070c);
        }
        return iVar;
    }

    public static byte[] M(InputStream inputStream, int i10) {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int read = inputStream.read(bArr, i11, i10 - i11);
            if (read >= 0) {
                i11 += read;
            } else {
                throw new IllegalStateException(a3.g.n("Not enough bytes to read: ", i10));
            }
        }
        return bArr;
    }

    public static boolean N(int i10, Parcel parcel) {
        w0(parcel, i10, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (r0.finished() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] O(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L88
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L88
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L88
            if (r6 != 0) goto L55
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L88
            if (r6 != 0) goto L55
            if (r4 >= r9) goto L55
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L88
            if (r6 < 0) goto L39
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L88
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.util.zip.DataFormatException -> L2e java.lang.Throwable -> L88
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L88
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L88
            throw r9     // Catch: java.lang.Throwable -> L88
        L39:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            r8.<init>()     // Catch: java.lang.Throwable -> L88
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L88
            r8.append(r9)     // Catch: java.lang.Throwable -> L88
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L88
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L88
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L88
            throw r9     // Catch: java.lang.Throwable -> L88
        L55:
            if (r4 != r9) goto L69
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L88
            if (r8 == 0) goto L61
            r0.end()
            return r1
        L61:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L88
            throw r9     // Catch: java.lang.Throwable -> L88
        L69:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            r8.<init>()     // Catch: java.lang.Throwable -> L88
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L88
            r8.append(r9)     // Catch: java.lang.Throwable -> L88
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L88
            r8.append(r4)     // Catch: java.lang.Throwable -> L88
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L88
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L88
            throw r9     // Catch: java.lang.Throwable -> L88
        L88:
            r8 = move-exception
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.g.O(java.io.FileInputStream, int, int):byte[]");
    }

    public static Double P(int i10, Parcel parcel) {
        int U = U(i10, parcel);
        if (U == 0) {
            return null;
        }
        v0(parcel, U, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static int Q(int i10, Parcel parcel) {
        w0(parcel, i10, 4);
        return parcel.readInt();
    }

    public static Integer R(int i10, Parcel parcel) {
        int U = U(i10, parcel);
        if (U == 0) {
            return null;
        }
        v0(parcel, U, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long S(int i10, Parcel parcel) {
        w0(parcel, i10, 8);
        return parcel.readLong();
    }

    public static Long T(int i10, Parcel parcel) {
        int U = U(i10, parcel);
        if (U == 0) {
            return null;
        }
        v0(parcel, U, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int U(int i10, Parcel parcel) {
        if ((i10 & (-65536)) != -65536) {
            return (char) (i10 >> 16);
        }
        return parcel.readInt();
    }

    public static long V(InputStream inputStream, int i10) {
        byte[] M = M(inputStream, i10);
        long j4 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j4 += (M[i11] & 255) << (i11 * 8);
        }
        return j4;
    }

    public static int W(InputStream inputStream) {
        return (int) V(inputStream, 2);
    }

    public static y.c X(t tVar, boolean z9, boolean z10) {
        if (z9) {
            r0(3, tVar, false);
        }
        String s9 = tVar.s((int) tVar.l());
        int length = s9.length() + 11;
        long l10 = tVar.l();
        String[] strArr = new String[(int) l10];
        int i10 = length + 4;
        for (int i11 = 0; i11 < l10; i11++) {
            String s10 = tVar.s((int) tVar.l());
            strArr[i11] = s10;
            i10 = i10 + 4 + s10.length();
        }
        if (z10 && (tVar.v() & 1) == 0) {
            throw r0.a("framing bit expected to be set", null);
        }
        return new y.c(i10 + 1, s9, strArr);
    }

    public static void Y(e1.a aVar) {
        aVar.f3332k = -3.4028235E38f;
        aVar.f3331j = Integer.MIN_VALUE;
        CharSequence charSequence = aVar.f3322a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                aVar.f3322a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = aVar.f3322a;
            charSequence2.getClass();
            Z((Spannable) charSequence2, new p(3));
        }
    }

    public static void Z(Spannable spannable, p pVar) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (pVar.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static TypedValue a0(Context context, int i10) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static final boolean b(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        h0.u(bArr, "a");
        h0.u(bArr2, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (bArr[i13 + i10] != bArr2[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static boolean b0(Context context, int i10, boolean z9) {
        TypedValue a02 = a0(context, i10);
        if (a02 != null && a02.type == 18) {
            if (a02.data != 0) {
                return true;
            }
            return false;
        }
        return z9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r10.bottom <= r12.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0043, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0033, code lost:
    
        if (r10.right <= r12.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x003a, code lost:
    
        if (r10.top >= r12.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0041, code lost:
    
        if (r10.left >= r12.right) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = d(r9, r10, r11)
            boolean r1 = d(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L7d
            if (r0 != 0) goto Lf
            goto L7d
        Lf:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L3d
            if (r9 == r3) goto L36
            if (r9 == r4) goto L2f
            if (r9 != r1) goto L29
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L45
            goto L43
        L29:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L2f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L45
            goto L43
        L36:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L45
            goto L43
        L3d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L45
        L43:
            r7 = r6
            goto L46
        L45:
            r7 = r2
        L46:
            if (r7 != 0) goto L49
            return r6
        L49:
            if (r9 == r5) goto L7c
            if (r9 != r4) goto L4e
            goto L7c
        L4e:
            int r11 = G(r9, r10, r11)
            if (r9 == r5) goto L6f
            if (r9 == r3) goto L6a
            if (r9 == r4) goto L65
            if (r9 != r1) goto L5f
            int r9 = r12.bottom
            int r10 = r10.bottom
            goto L73
        L5f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L65:
            int r9 = r12.right
            int r10 = r10.right
            goto L73
        L6a:
            int r9 = r10.top
            int r10 = r12.top
            goto L73
        L6f:
            int r9 = r10.left
            int r10 = r12.left
        L73:
            int r9 = r9 - r10
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L7b
            r2 = r6
        L7b:
            return r2
        L7c:
            return r6
        L7d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.g.c(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static e3.g c0(e3.g gVar, String[] strArr, Map map) {
        int i10 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (e3.g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                e3.g gVar2 = new e3.g();
                int length = strArr.length;
                while (i10 < length) {
                    gVar2.a((e3.g) map.get(strArr[i10]));
                    i10++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                gVar.a((e3.g) map.get(strArr[0]));
                return gVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    gVar.a((e3.g) map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return gVar;
    }

    public static boolean d(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right >= rect.left && rect2.left <= rect.right) {
                return true;
            }
            return false;
        }
        if (rect2.bottom >= rect.top && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public static float d0(float f10, int i10, int i11, int i12) {
        float f11;
        if (f10 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i10 == 0) {
            f11 = i12;
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    return -3.4028235E38f;
                }
                return f10;
            }
            f11 = i11;
        }
        return f10 * f11;
    }

    public static void e(h7.p pVar) {
        int i10;
        if (pVar != null) {
            boolean z9 = false;
            if (pVar instanceof i7.f) {
                i10 = ((i7.f) pVar).getArity();
            } else if (pVar instanceof h7.a) {
                i10 = 0;
            } else if (pVar instanceof h7.l) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            if (i10 == 2) {
                z9 = true;
            }
            if (!z9) {
                ClassCastException classCastException = new ClassCastException(pVar.getClass().getName().concat(" cannot be cast to kotlin.jvm.functions.Function2"));
                h0.A0(g.class.getName(), classCastException);
                throw classCastException;
            }
        }
    }

    public static TypedValue e0(Context context, String str, int i10) {
        TypedValue a02 = a0(context, i10);
        if (a02 != null) {
            return a02;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i10)));
    }

    public static boolean g(q qVar) {
        t tVar = new t(8);
        int i10 = z1.i.b(qVar, tVar).f11928a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        qVar.n(tVar.f3858a, 0, 4);
        tVar.G(0);
        int f10 = tVar.f();
        if (f10 != 1463899717) {
            f1.o.c("WavHeaderReader", "Unsupported form type: " + f10);
            return false;
        }
        return true;
    }

    public static long g0(long j4, long j10) {
        boolean z9;
        boolean z10;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10) + Long.numberOfLeadingZeros(~j4) + Long.numberOfLeadingZeros(j4);
        if (numberOfLeadingZeros > 65) {
            return j4 * j10;
        }
        long j11 = ((j4 ^ j10) >>> 63) + Long.MAX_VALUE;
        boolean z11 = true;
        if (numberOfLeadingZeros < 64) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (j4 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (j10 != Long.MIN_VALUE) {
            z11 = false;
        }
        if (z9 | (z11 & z10)) {
            return j11;
        }
        long j12 = j4 * j10;
        if (j4 != 0 && j12 / j4 != j10) {
            return j11;
        }
        return j12;
    }

    public static final void h(long j4, long j10, long j11) {
        if ((j10 | j11) >= 0 && j10 <= j4 && j4 - j10 >= j11) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("size=" + j4 + " offset=" + j10 + " byteCount=" + j11);
    }

    public static void h0(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.d()) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(new com.google.android.gms.common.api.j(status));
        }
    }

    public static void i(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void i0(EditorInfo editorInfo, CharSequence charSequence, int i10, int i11) {
        SpannableStringBuilder spannableStringBuilder;
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        if (charSequence != null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = null;
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", spannableStringBuilder);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i10);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i11);
    }

    public static byte[] j(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static i0 j0(MainActivity mainActivity, c8.c cVar, boolean z9, k1.x xVar) {
        String str;
        String str2;
        String str3;
        LinearLayout linearLayout = new LinearLayout(mainActivity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(w8.i.e(mainActivity, 24), w8.i.e(mainActivity, 24), w8.i.e(mainActivity, 24), w8.i.e(mainActivity, 24));
        linearLayout.setBackgroundDrawable(w8.i.j(w8.i.f11063c, w8.i.e(mainActivity, 24)));
        if (z9) {
            str = "Update available";
        } else {
            str = "Update required";
        }
        TextView l10 = w8.i.l(mainActivity, str, 20, -1, 1);
        linearLayout.addView(l10, r.f.c(l10, 17, -1, -2));
        String str4 = cVar.f2084b;
        if (str4 != null && !str4.isEmpty()) {
            str2 = cVar.f2084b;
        } else {
            str2 = "v" + cVar.f2083a;
        }
        String d10 = r.f.d("New version available: ", str2);
        int i10 = w8.i.f11068h;
        TextView l11 = w8.i.l(mainActivity, d10, 13, i10, 0);
        LinearLayout.LayoutParams c6 = r.f.c(l11, 17, -1, -2);
        c6.setMargins(0, w8.i.e(mainActivity, 6), 0, 0);
        linearLayout.addView(l11, c6);
        String str5 = cVar.f2085c;
        if (str5 == null) {
            str3 = "";
        } else {
            str3 = str5.trim();
        }
        if (!str3.isEmpty()) {
            TextView l12 = w8.i.l(mainActivity, str3, 14, w8.i.f11067g, 0);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, w8.i.e(mainActivity, 12), 0, 0);
            linearLayout.addView(l12, layoutParams);
        }
        ProgressBar progressBar = new ProgressBar(mainActivity, null, R.attr.progressBarStyleHorizontal);
        progressBar.setMax(100);
        progressBar.setProgress(0);
        progressBar.setVisibility(8);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, w8.i.e(mainActivity, 6));
        layoutParams2.setMargins(0, w8.i.e(mainActivity, 16), 0, 0);
        linearLayout.addView(progressBar, layoutParams2);
        TextView l13 = w8.i.l(mainActivity, "", 12, i10, 0);
        LinearLayout.LayoutParams c10 = r.f.c(l13, 17, -1, -2);
        c10.setMargins(0, w8.i.e(mainActivity, 8), 0, 0);
        linearLayout.addView(l13, c10);
        TextView i11 = w8.i.i(mainActivity, "Update now", true);
        i11.setGravity(17);
        w8.i.b(i11);
        i11.setFocusable(true);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, w8.i.e(mainActivity, 50));
        layoutParams3.setMargins(0, w8.i.e(mainActivity, 16), 0, 0);
        linearLayout.addView(i11, layoutParams3);
        Dialog dialog = new Dialog(mainActivity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(linearLayout);
        dialog.setCancelable(z9);
        dialog.setCanceledOnTouchOutside(false);
        i0[] i0VarArr = new i0[1];
        if (z9) {
            TextView i12 = w8.i.i(mainActivity, "Later", false);
            i12.setGravity(17);
            w8.i.b(i12);
            i12.setFocusable(true);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, w8.i.e(mainActivity, 50));
            layoutParams4.setMargins(0, w8.i.e(mainActivity, 10), 0, 0);
            linearLayout.addView(i12, layoutParams4);
            i12.setOnClickListener(new r(10, i0VarArr, dialog));
        }
        if (dialog.getWindow() != null) {
            dialog.getWindow().setLayout(-1, -2);
            dialog.getWindow().setGravity(80);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        i0 i0Var = new i0(dialog, l13, progressBar, i11);
        i0VarArr[0] = i0Var;
        i11.setOnClickListener(new r(11, i0Var, xVar));
        try {
            dialog.show();
            i11.requestFocus();
            return i0Var;
        } catch (Exception e10) {
            Log.e("ForceUpdateDialog", "show", e10);
            return i0Var;
        }
    }

    public static BigDecimal k(int i10, Parcel parcel) {
        int U = U(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (U == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + U);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    public static z1.i k0(int i10, q qVar, t tVar) {
        z1.i b10 = z1.i.b(qVar, tVar);
        while (b10.f11928a != i10) {
            StringBuilder sb = new StringBuilder("Ignoring unknown WAV chunk: ");
            int i11 = b10.f11928a;
            sb.append(i11);
            f1.o.f("WavHeaderReader", sb.toString());
            long j4 = b10.f11929b;
            long j10 = 8 + j4;
            if (j4 % 2 != 0) {
                j10++;
            }
            if (j10 <= 2147483647L) {
                qVar.h((int) j10);
                b10 = z1.i.b(qVar, tVar);
            } else {
                throw r0.c("Chunk is too large (~2GB+) to skip; id: " + i11);
            }
        }
        return b10;
    }

    public static Bundle l(int i10, Parcel parcel) {
        int U = U(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (U == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + U);
        return readBundle;
    }

    public static void l0(int i10, Parcel parcel) {
        parcel.setDataPosition(parcel.dataPosition() + U(i10, parcel));
    }

    public static byte[] m(int i10, Parcel parcel) {
        int U = U(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (U == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + U);
        return createByteArray;
    }

    public static int[] n(int i10, Parcel parcel) {
        int U = U(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (U == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + U);
        return createIntArray;
    }

    public static Parcelable o(Parcel parcel, int i10, Parcelable.Creator creator) {
        int U = U(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (U == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + U);
        return parcelable;
    }

    public static f.c o0(int i10, q4.a aVar) {
        return new f.c(new f0.d(i10), aVar, f9212b, 17);
    }

    public static String p(int i10, Parcel parcel) {
        int U = U(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (U == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + U);
        return readString;
    }

    public static final String p0(String str) {
        boolean z9;
        InetAddress u9;
        h0.u(str, "<this>");
        int i10 = 0;
        int i11 = -1;
        if (o7.j.j1(str, ":")) {
            if (o7.j.C1(str, "[", false) && str.endsWith("]")) {
                u9 = u(1, str.length() - 1, str);
            } else {
                u9 = u(0, str.length(), str);
            }
            if (u9 == null) {
                return null;
            }
            byte[] address = u9.getAddress();
            if (address.length == 16) {
                int i12 = 0;
                int i13 = 0;
                while (i12 < address.length) {
                    int i14 = i12;
                    while (i14 < 16 && address[i14] == 0 && address[i14 + 1] == 0) {
                        i14 += 2;
                    }
                    int i15 = i14 - i12;
                    if (i15 > i13 && i15 >= 4) {
                        i11 = i12;
                        i13 = i15;
                    }
                    i12 = i14 + 2;
                }
                k9.g gVar = new k9.g();
                while (i10 < address.length) {
                    if (i10 == i11) {
                        gVar.K(58);
                        i10 += i13;
                        if (i10 == 16) {
                            gVar.K(58);
                        }
                    } else {
                        if (i10 > 0) {
                            gVar.K(58);
                        }
                        byte b10 = address[i10];
                        byte[] bArr = z8.b.f12133a;
                        gVar.M(((b10 & 255) << 8) | (address[i10 + 1] & 255));
                        i10 += 2;
                    }
                }
                return gVar.x(gVar.f6521b, o7.a.f8311a);
            }
            if (address.length == 4) {
                return u9.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        try {
            String ascii = IDN.toASCII(str);
            h0.s(ascii, "toASCII(host)");
            Locale locale = Locale.US;
            h0.s(locale, "US");
            String lowerCase = ascii.toLowerCase(locale);
            h0.s(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (lowerCase.length() == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                return null;
            }
            int length = lowerCase.length();
            for (int i16 = 0; i16 < length; i16++) {
                char charAt = lowerCase.charAt(i16);
                if (h0.B(charAt, 31) > 0 && h0.B(charAt, 127) < 0 && o7.j.p1(" #%/:?@[\\]", charAt, 0, false, 6) == -1) {
                }
                i10 = 1;
                break;
            }
            if (i10 != 0) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static String[] q(int i10, Parcel parcel) {
        int U = U(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (U == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + U);
        return createStringArray;
    }

    public static int q0(Parcel parcel) {
        int readInt = parcel.readInt();
        int U = U(readInt, parcel);
        char c6 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c6 == 20293) {
            int i10 = U + dataPosition;
            if (i10 >= dataPosition && i10 <= parcel.dataSize()) {
                return i10;
            }
            throw new w(a3.g.p("Size read is invalid start=", dataPosition, " end=", i10), parcel);
        }
        throw new w("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
    }

    public static ArrayList r(int i10, Parcel parcel) {
        int U = U(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (U == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + U);
        return createStringArrayList;
    }

    public static boolean r0(int i10, t tVar, boolean z9) {
        if (tVar.f3860c - tVar.f3859b < 7) {
            if (z9) {
                return false;
            }
            throw r0.a("too short header: " + (tVar.f3860c - tVar.f3859b), null);
        }
        if (tVar.v() != i10) {
            if (z9) {
                return false;
            }
            throw r0.a("expected header type " + Integer.toHexString(i10), null);
        }
        if (tVar.v() == 118 && tVar.v() == 111 && tVar.v() == 114 && tVar.v() == 98 && tVar.v() == 105 && tVar.v() == 115) {
            return true;
        }
        if (z9) {
            return false;
        }
        throw r0.a("expected characters 'vorbis'", null);
    }

    public static Object[] s(Parcel parcel, int i10, Parcelable.Creator creator) {
        int U = U(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (U == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + U);
        return createTypedArray;
    }

    public static final Object s0(long j4, h7.p pVar, b7.c cVar) {
        Object tVar;
        Object I;
        f0 f0Var = null;
        if (j4 > 0) {
            x1 x1Var = new x1(j4, cVar);
            z6.g r8 = x1Var.f10089d.getContext().r(q0.A);
            if (r8 instanceof f0) {
                f0Var = (f0) r8;
            }
            if (f0Var == null) {
                f0Var = c0.f8669a;
            }
            int i10 = 0;
            x1Var.F(false, true, new m0(f0Var.q(x1Var.f8756e, x1Var, x1Var.f8635c), i10));
            try {
                e(pVar);
                tVar = pVar.invoke(x1Var, x1Var);
            } catch (Throwable th) {
                tVar = new p7.t(th, false);
            }
            Object obj = a7.a.f156a;
            if (tVar != obj && (I = x1Var.I(tVar)) != l1.f8715b) {
                if (I instanceof p7.t) {
                    Throwable th2 = ((p7.t) I).f8743a;
                    if (!(th2 instanceof w1) || ((w1) th2).f8755a != x1Var) {
                        i10 = 1;
                    }
                    if (i10 == 0) {
                        if (tVar instanceof p7.t) {
                            throw ((p7.t) tVar).f8743a;
                        }
                    } else {
                        throw th2;
                    }
                } else {
                    tVar = l1.a(I);
                }
                return tVar;
            }
            return obj;
        }
        throw new w1("Timed out immediately", null);
    }

    public static ArrayList t(Parcel parcel, int i10, Parcelable.Creator creator) {
        int U = U(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (U == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + U);
        return createTypedArrayList;
    }

    public static void t0(ByteArrayOutputStream byteArrayOutputStream, long j4, int i10) {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((j4 >> (i11 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00dd, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0050, code lost:
    
        r0 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b0  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.net.InetAddress u(int r17, int r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.g.u(int, int, java.lang.String):java.net.InetAddress");
    }

    public static void u0(ByteArrayOutputStream byteArrayOutputStream, int i10) {
        t0(byteArrayOutputStream, i10, 2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        if (r9 > 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (r9 < 0) goto L29;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0020. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long v(long r9, long r11, java.math.RoundingMode r13) {
        /*
            r13.getClass()
            long r0 = r9 / r11
            long r2 = r11 * r0
            long r2 = r9 - r2
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L10
            return r0
        L10:
            long r9 = r9 ^ r11
            r7 = 63
            long r9 = r9 >> r7
            int r9 = (int) r9
            r10 = 1
            r9 = r9 | r10
            int[] r7 = s6.e.f9929a
            int r8 = r13.ordinal()
            r7 = r7[r8]
            r8 = 0
            switch(r7) {
                case 1: goto L50;
                case 2: goto L56;
                case 3: goto L4d;
                case 4: goto L57;
                case 5: goto L4a;
                case 6: goto L29;
                case 7: goto L29;
                case 8: goto L29;
                default: goto L23;
            }
        L23:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L29:
            long r2 = java.lang.Math.abs(r2)
            long r11 = java.lang.Math.abs(r11)
            long r11 = r11 - r2
            long r2 = r2 - r11
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r11 != 0) goto L47
            java.math.RoundingMode r11 = java.math.RoundingMode.HALF_UP
            if (r13 == r11) goto L57
            java.math.RoundingMode r11 = java.math.RoundingMode.HALF_EVEN
            if (r13 != r11) goto L56
            r11 = 1
            long r11 = r11 & r0
            int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r11 == 0) goto L56
            goto L57
        L47:
            if (r11 <= 0) goto L56
            goto L57
        L4a:
            if (r9 <= 0) goto L56
            goto L57
        L4d:
            if (r9 >= 0) goto L56
            goto L57
        L50:
            if (r6 != 0) goto L53
            goto L54
        L53:
            r10 = r8
        L54:
            if (r10 == 0) goto L5c
        L56:
            r10 = r8
        L57:
            if (r10 == 0) goto L5b
            long r9 = (long) r9
            long r0 = r0 + r9
        L5b:
            return r0
        L5c:
            java.lang.ArithmeticException r9 = new java.lang.ArithmeticException
            java.lang.String r10 = "mode was UNNECESSARY, but rounding was necessary"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.g.v(long, long, java.math.RoundingMode):long");
    }

    public static void v0(Parcel parcel, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        String hexString = Integer.toHexString(i10);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i11);
        sb.append(" got ");
        sb.append(i10);
        sb.append(" (0x");
        throw new w(a3.g.t(sb, hexString, ")"), parcel);
    }

    public static void w(int i10, Parcel parcel) {
        if (parcel.dataPosition() == i10) {
        } else {
            throw new w(a3.g.n("Overread allowed size end=", i10), parcel);
        }
    }

    public static void w0(Parcel parcel, int i10, int i11) {
        int U = U(i10, parcel);
        if (U == i11) {
            return;
        }
        String hexString = Integer.toHexString(U);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i11);
        sb.append(" got ");
        sb.append(U);
        sb.append(" (0x");
        throw new w(a3.g.t(sb, hexString, ")"), parcel);
    }

    public static boolean x(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static int y(int i10, int i11) {
        if (i11 >= 0) {
            int i12 = i10 + (i10 >> 1) + 1;
            if (i12 < i11) {
                i12 = Integer.highestOneBit(i11 - 1) << 1;
            }
            if (i12 < 0) {
                return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            }
            return i12;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }

    public static long z(long j4, long j10) {
        com.bumptech.glide.c.h("a", j4);
        com.bumptech.glide.c.h("b", j10);
        if (j4 == 0) {
            return j10;
        }
        if (j10 == 0) {
            return j4;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
        long j11 = j4 >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j10);
        long j12 = j10 >> numberOfTrailingZeros2;
        while (j11 != j12) {
            long j13 = j11 - j12;
            long j14 = (j13 >> 63) & j13;
            long j15 = (j13 - j14) - j14;
            j12 += j14;
            j11 = j15 >> Long.numberOfTrailingZeros(j15);
        }
        return j11 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public abstract g a(Object obj);

    public boolean f() {
        return false;
    }

    public void f0() {
    }

    public abstract void m0();

    public abstract void n0();

    public /* synthetic */ g(int i10) {
    }

    public /* synthetic */ g(Object obj) {
    }
}
