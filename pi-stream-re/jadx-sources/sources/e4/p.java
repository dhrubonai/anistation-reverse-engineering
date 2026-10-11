package e4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: f, reason: collision with root package name */
    public static final v3.k f3503f = v3.k.a(v3.b.PREFER_ARGB_8888, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* renamed from: g, reason: collision with root package name */
    public static final v3.k f3504g = new v3.k("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, v3.k.f10645e);

    /* renamed from: h, reason: collision with root package name */
    public static final v3.k f3505h;

    /* renamed from: i, reason: collision with root package name */
    public static final v3.k f3506i;

    /* renamed from: j, reason: collision with root package name */
    public static final Set f3507j;

    /* renamed from: k, reason: collision with root package name */
    public static final f9.x f3508k;

    /* renamed from: l, reason: collision with root package name */
    public static final ArrayDeque f3509l;

    /* renamed from: a, reason: collision with root package name */
    public final y3.d f3510a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f3511b;

    /* renamed from: c, reason: collision with root package name */
    public final y3.h f3512c;

    /* renamed from: d, reason: collision with root package name */
    public final List f3513d;

    /* renamed from: e, reason: collision with root package name */
    public final u f3514e = u.a();

    static {
        m mVar = n.f3496a;
        Boolean bool = Boolean.FALSE;
        f3505h = v3.k.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f3506i = v3.k.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        f3507j = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f3508k = new f9.x(9);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = p4.m.f8575a;
        f3509l = new ArrayDeque(0);
    }

    public p(ArrayList arrayList, DisplayMetrics displayMetrics, y3.d dVar, y3.h hVar) {
        this.f3513d = arrayList;
        w7.b.q(displayMetrics);
        this.f3511b = displayMetrics;
        w7.b.q(dVar);
        this.f3510a = dVar;
        w7.b.q(hVar);
        this.f3512c = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap c(f.c r5, android.graphics.BitmapFactory.Options r6, e4.o r7, y3.d r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto L22
            r7.h()
            int r1 = r5.f3634a
            switch(r1) {
                case 14: goto Lf;
                default: goto Le;
            }
        Le:
            goto L22
        Lf:
            java.lang.Object r1 = r5.f3635b
            com.bumptech.glide.load.data.n r1 = (com.bumptech.glide.load.data.n) r1
            java.lang.Object r1 = r1.f2271b
            e4.v r1 = (e4.v) r1
            monitor-enter(r1)
            byte[] r2 = r1.f3526a     // Catch: java.lang.Throwable -> L1f
            int r2 = r2.length     // Catch: java.lang.Throwable -> L1f
            r1.f3528c = r2     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)
            goto L22
        L1f:
            r5 = move-exception
            monitor-exit(r1)
            throw r5
        L22:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = e4.y.f3535b
            r4.lock()
            android.graphics.Bitmap r5 = r5.l(r6)     // Catch: java.lang.IllegalArgumentException -> L35 java.lang.Throwable -> L5a
            r4.unlock()
            return r5
        L35:
            r4 = move-exception
            java.io.IOException r1 = e(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L5a
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L5a
            if (r2 == 0) goto L46
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L5a
        L46:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L5a
            if (r0 == 0) goto L5d
            r8.c(r0)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            r0 = 0
            r6.inBitmap = r0     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            android.graphics.Bitmap r5 = c(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            java.util.concurrent.locks.Lock r6 = e4.y.f3535b
            r6.unlock()
            return r5
        L5a:
            r5 = move-exception
            goto L5e
        L5c:
            throw r1     // Catch: java.lang.Throwable -> L5a
        L5d:
            throw r1     // Catch: java.lang.Throwable -> L5a
        L5e:
            java.util.concurrent.locks.Lock r6 = e4.y.f3535b
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.p.c(f.c, android.graphics.BitmapFactory$Options, e4.o, y3.d):android.graphics.Bitmap");
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static IOException e(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i10 + ", outHeight: " + i11 + ", outMimeType: " + str + ", inBitmap: " + d(options.inBitmap), illegalArgumentException);
    }

    public static void f(BitmapFactory.Options options) {
        g(options);
        ArrayDeque arrayDeque = f3509l;
        synchronized (arrayDeque) {
            arrayDeque.offer(options);
        }
    }

    public static void g(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final d a(f.c cVar, int i10, int i11, v3.l lVar, o oVar) {
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        boolean z9;
        byte[] bArr = (byte[]) this.f3512c.d(65536, byte[].class);
        synchronized (p.class) {
            ArrayDeque arrayDeque = f3509l;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                g(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        v3.b bVar = (v3.b) lVar.c(f3503f);
        v3.m mVar = (v3.m) lVar.c(f3504g);
        n nVar = (n) lVar.c(n.f3501f);
        boolean booleanValue = ((Boolean) lVar.c(f3505h)).booleanValue();
        v3.k kVar = f3506i;
        if (lVar.c(kVar) != null && ((Boolean) lVar.c(kVar)).booleanValue()) {
            z9 = true;
        } else {
            z9 = false;
        }
        try {
            return d.c(b(cVar, options2, nVar, bVar, mVar, z9, i10, i11, booleanValue, oVar), this.f3510a);
        } finally {
            f(options2);
            this.f3512c.h(bArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0263 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0475 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x056e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap b(f.c r39, android.graphics.BitmapFactory.Options r40, e4.n r41, v3.b r42, v3.m r43, boolean r44, int r45, int r46, boolean r47, e4.o r48) {
        /*
            Method dump skipped, instructions count: 1628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.p.b(f.c, android.graphics.BitmapFactory$Options, e4.n, v3.b, v3.m, boolean, int, int, boolean, e4.o):android.graphics.Bitmap");
    }
}
