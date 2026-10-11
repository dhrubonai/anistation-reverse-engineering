package androidx.appcompat.widget;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class x3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f704a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f705b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f706c;

    /* renamed from: d, reason: collision with root package name */
    public Object f707d;

    /* renamed from: e, reason: collision with root package name */
    public Object f708e;

    public x3(int i10) {
        this.f704a = i10;
        if (i10 != 3) {
            return;
        }
        this.f707d = new SparseIntArray();
        this.f708e = new SparseIntArray();
        this.f705b = false;
        this.f706c = false;
    }

    public final int a(int i10, int i11) {
        if (!this.f706c) {
            return c(i10, i11);
        }
        int i12 = ((SparseIntArray) this.f708e).get(i10, -1);
        if (i12 != -1) {
            return i12;
        }
        int c6 = c(i10, i11);
        ((SparseIntArray) this.f708e).put(i10, c6);
        return c6;
    }

    public final int b(int i10, int i11) {
        if (!this.f705b) {
            return i10 % i11;
        }
        int i12 = ((SparseIntArray) this.f707d).get(i10, -1);
        if (i12 != -1) {
            return i12;
        }
        int i13 = i10 % i11;
        ((SparseIntArray) this.f707d).put(i10, i13);
        return i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(int r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r8.f706c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L48
            java.lang.Object r0 = r8.f708e
            android.util.SparseIntArray r0 = (android.util.SparseIntArray) r0
            int r3 = r0.size()
            r4 = -1
            int r3 = r3 + r4
            r5 = r2
        L11:
            if (r5 > r3) goto L22
            int r6 = r5 + r3
            int r6 = r6 >>> r1
            int r7 = r0.keyAt(r6)
            if (r7 >= r9) goto L1f
            int r5 = r6 + 1
            goto L11
        L1f:
            int r3 = r6 + (-1)
            goto L11
        L22:
            int r5 = r5 + r4
            if (r5 < 0) goto L30
            int r3 = r0.size()
            if (r5 >= r3) goto L30
            int r0 = r0.keyAt(r5)
            goto L31
        L30:
            r0 = r4
        L31:
            if (r0 == r4) goto L48
            java.lang.Object r3 = r8.f708e
            android.util.SparseIntArray r3 = (android.util.SparseIntArray) r3
            int r3 = r3.get(r0)
            int r4 = r0 + 1
            int r0 = r8.b(r0, r10)
            int r0 = r0 + r1
            if (r0 != r10) goto L4b
            int r3 = r3 + 1
            r0 = r2
            goto L4b
        L48:
            r0 = r2
            r3 = r0
            r4 = r3
        L4b:
            if (r4 >= r9) goto L5d
            int r0 = r0 + 1
            if (r0 != r10) goto L55
            int r3 = r3 + 1
            r0 = r2
            goto L5a
        L55:
            if (r0 <= r10) goto L5a
            int r3 = r3 + 1
            r0 = r1
        L5a:
            int r4 = r4 + 1
            goto L4b
        L5d:
            int r0 = r0 + r1
            if (r0 <= r10) goto L62
            int r3 = r3 + 1
        L62:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.x3.c(int, int):int");
    }

    public final void d() {
        ((SparseIntArray) this.f707d).clear();
    }

    public final void e() {
        switch (this.f704a) {
            case 1:
                this.f705b = false;
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f708e;
                if (wakeLock != null) {
                    wakeLock.release();
                    return;
                }
                return;
            default:
                this.f705b = false;
                WifiManager.WifiLock wifiLock = (WifiManager.WifiLock) this.f708e;
                if (wifiLock != null) {
                    wifiLock.release();
                    return;
                }
                return;
        }
    }

    public final void f(boolean z9) {
        switch (this.f704a) {
            case 1:
                this.f706c = z9;
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f708e;
                if (wakeLock != null) {
                    if (this.f705b && z9) {
                        wakeLock.acquire();
                        return;
                    } else {
                        wakeLock.release();
                        return;
                    }
                }
                return;
            default:
                this.f706c = z9;
                WifiManager.WifiLock wifiLock = (WifiManager.WifiLock) this.f708e;
                if (wifiLock != null) {
                    if (this.f705b && z9) {
                        wifiLock.acquire();
                        return;
                    } else {
                        wifiLock.release();
                        return;
                    }
                }
                return;
        }
    }

    public x3(Context context, int i10) {
        this.f704a = i10;
        if (i10 != 2) {
            this.f707d = (PowerManager) context.getApplicationContext().getSystemService("power");
        } else {
            this.f707d = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        }
    }
}
