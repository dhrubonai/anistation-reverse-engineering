package y3;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import w1.o;

/* loaded from: classes.dex */
public final class i implements d {
    public static final Bitmap.Config A = Bitmap.Config.ARGB_8888;

    /* renamed from: a, reason: collision with root package name */
    public final j f11598a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f11599b;

    /* renamed from: c, reason: collision with root package name */
    public final o f11600c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11601d;

    /* renamed from: e, reason: collision with root package name */
    public long f11602e;

    /* renamed from: f, reason: collision with root package name */
    public int f11603f;

    /* renamed from: x, reason: collision with root package name */
    public int f11604x;

    /* renamed from: y, reason: collision with root package name */
    public int f11605y;

    /* renamed from: z, reason: collision with root package name */
    public int f11606z;

    public i(long j4) {
        Bitmap.Config config;
        n nVar = new n();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i10 >= 26) {
            config = Bitmap.Config.HARDWARE;
            hashSet.remove(config);
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f11601d = j4;
        this.f11598a = nVar;
        this.f11599b = unmodifiableSet;
        this.f11600c = new o(22);
    }

    public final void a() {
        Log.v("LruBitmapPool", "Hits=" + this.f11603f + ", misses=" + this.f11604x + ", puts=" + this.f11605y + ", evictions=" + this.f11606z + ", currentSize=" + this.f11602e + ", maxSize=" + this.f11601d + "\nStrategy=" + this.f11598a);
    }

    @Override // y3.d
    public final Bitmap b(int i10, int i11, Bitmap.Config config) {
        Bitmap d10 = d(i10, i11, config);
        if (d10 != null) {
            d10.eraseColor(0);
            return d10;
        }
        if (config == null) {
            config = A;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // y3.d
    public final synchronized void c(Bitmap bitmap) {
        try {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && this.f11598a.t(bitmap) <= this.f11601d && this.f11599b.contains(bitmap.getConfig())) {
                        int t9 = this.f11598a.t(bitmap);
                        this.f11598a.c(bitmap);
                        this.f11600c.getClass();
                        this.f11605y++;
                        this.f11602e += t9;
                        if (Log.isLoggable("LruBitmapPool", 2)) {
                            Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f11598a.C(bitmap));
                        }
                        if (Log.isLoggable("LruBitmapPool", 2)) {
                            a();
                        }
                        e(this.f11601d);
                        return;
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f11598a.C(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f11599b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            throw new NullPointerException("Bitmap must not be null");
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Bitmap d(int i10, int i11, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3;
        Bitmap b10;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.HARDWARE;
            if (config == config2) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
        }
        j jVar = this.f11598a;
        if (config != null) {
            config3 = config;
        } else {
            config3 = A;
        }
        b10 = jVar.b(i10, i11, config3);
        if (b10 == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Missing bitmap=" + this.f11598a.m(i10, i11, config));
            }
            this.f11604x++;
        } else {
            this.f11603f++;
            this.f11602e -= this.f11598a.t(b10);
            this.f11600c.getClass();
            b10.setHasAlpha(true);
            b10.setPremultiplied(true);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Log.v("LruBitmapPool", "Get bitmap=" + this.f11598a.m(i10, i11, config));
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            a();
        }
        return b10;
    }

    public final synchronized void e(long j4) {
        while (this.f11602e > j4) {
            Bitmap u9 = this.f11598a.u();
            if (u9 == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    a();
                }
                this.f11602e = 0L;
                return;
            }
            this.f11600c.getClass();
            this.f11602e -= this.f11598a.t(u9);
            this.f11606z++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + this.f11598a.C(u9));
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                a();
            }
            u9.recycle();
        }
    }

    @Override // y3.d
    public final Bitmap i(int i10, int i11, Bitmap.Config config) {
        Bitmap d10 = d(i10, i11, config);
        if (d10 == null) {
            if (config == null) {
                config = A;
            }
            return Bitmap.createBitmap(i10, i11, config);
        }
        return d10;
    }

    @Override // y3.d
    public final void p(int i10) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i10);
        }
        if (i10 < 40 && i10 < 20) {
            if (i10 >= 20 || i10 == 15) {
                e(this.f11601d / 2);
                return;
            }
            return;
        }
        s();
    }

    @Override // y3.d
    public final void s() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        e(0L);
    }
}
