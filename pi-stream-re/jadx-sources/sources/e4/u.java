package e4;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f3518e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f3519f;

    /* renamed from: g, reason: collision with root package name */
    public static final File f3520g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile u f3521h;

    /* renamed from: b, reason: collision with root package name */
    public int f3523b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3524c = true;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f3525d = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final int f3522a = 20000;

    static {
        boolean z9;
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = true;
        if (i10 < 29) {
            z9 = true;
        } else {
            z9 = false;
        }
        f3518e = z9;
        if (i10 < 28) {
            z10 = false;
        }
        f3519f = z10;
        f3520g = new File("/proc/self/fd");
    }

    public static u a() {
        if (f3521h == null) {
            synchronized (u.class) {
                if (f3521h == null) {
                    f3521h = new u();
                }
            }
        }
        return f3521h;
    }

    public final int b() {
        boolean z9 = false;
        if (Build.VERSION.SDK_INT == 28) {
            Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (Build.MODEL.startsWith((String) it.next())) {
                    z9 = true;
                    break;
                }
            }
        }
        if (z9) {
            return 500;
        }
        return this.f3522a;
    }

    public final boolean c(int i10, int i11, boolean z9, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        if (!z9) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!f3519f) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (f3518e && !this.f3525d.get()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z10) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        if (i10 >= 0 && i11 >= 0) {
            synchronized (this) {
                int i12 = this.f3523b + 1;
                this.f3523b = i12;
                if (i12 >= 50) {
                    this.f3523b = 0;
                    int length = f3520g.list().length;
                    long b10 = b();
                    if (length < b10) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    this.f3524c = z13;
                    if (!z13 && Log.isLoggable("Downsampler", 5)) {
                        Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + b10);
                    }
                }
                z12 = this.f3524c;
            }
            if (z12) {
                return true;
            }
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
            }
            return false;
        }
        if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
        }
        return false;
    }
}
