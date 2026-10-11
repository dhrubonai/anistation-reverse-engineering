package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ks1 {
    public static final Object j = new Object();
    public static volatile ks1 k;
    public final ReentrantReadWriteLock a;
    public final ls b;
    public volatile byte c;
    public final Handler d;
    public final gs1 e;
    public final js1 f;
    public final p18 g;
    public final boolean h;
    public final u81 i;

    public ks1(c92 c92Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = (byte) 3;
        js1 js1Var = c92Var.a;
        this.f = js1Var;
        boolean z = c92Var.b;
        this.h = z;
        this.i = c92Var.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new ls(0);
        this.g = new p18((byte) 16);
        gs1 gs1Var = new gs1(this);
        this.e = gs1Var;
        reentrantReadWriteLock.writeLock().lock();
        if (!z) {
            try {
                this.c = (byte) 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                js1Var.a(new fs1(gs1Var));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static ks1 a() {
        ks1 ks1Var;
        boolean z;
        synchronized (j) {
            ks1Var = k;
            if (ks1Var != null) {
                z = true;
            } else {
                z = false;
            }
            bb4.s("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", z);
        }
        return ks1Var;
    }

    public static boolean d() {
        if (k != null) {
            return true;
        }
        return false;
    }

    public final int b(CharSequence charSequence, int i) {
        boolean z = true;
        if (c() != 1) {
            z = false;
        }
        bb4.s("Not initialized yet", z);
        bb4.r(charSequence, "charSequence cannot be null");
        dn0 dn0Var = (dn0) this.e.b;
        dn0Var.getClass();
        if (i >= 0 && i < charSequence.length()) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                hl6[] hl6VarArr = (hl6[]) spanned.getSpans(i, i + 1, hl6.class);
                if (hl6VarArr.length > 0) {
                    return spanned.getSpanStart(hl6VarArr[0]);
                }
            }
            return ((ws1) dn0Var.K(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new ws1(i))).y;
        }
        return -1;
    }

    public final int c() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void e() {
        boolean z;
        if (this.h) {
            z = true;
        } else {
            z = false;
        }
        bb4.s("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", z);
        if (c() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = (byte) 0;
            this.a.writeLock().unlock();
            gs1 gs1Var = this.e;
            ks1 ks1Var = (ks1) gs1Var.a;
            try {
                ks1Var.f.a(new fs1(gs1Var));
            } catch (Throwable th) {
                ks1Var.f(th);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = (byte) 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new is1(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a2 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:32:0x005d, B:35:0x0062, B:37:0x0066, B:39:0x0073, B:41:0x0092, B:43:0x009c, B:45:0x009f, B:47:0x00a2, B:49:0x00b2, B:50:0x00b5), top: B:31:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [jo6, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence g(java.lang.CharSequence r12, int r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks1.g(java.lang.CharSequence, int, int, int):java.lang.CharSequence");
    }

    public final void h(hs1 hs1Var) {
        this.a.writeLock().lock();
        try {
            if (this.c != 1 && this.c != 2) {
                this.b.add(hs1Var);
                this.a.writeLock().unlock();
            }
            this.d.post(new is1(Arrays.asList(hs1Var), this.c, null));
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public final void i(EditorInfo editorInfo) {
        int i;
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        gs1 gs1Var = this.e;
        gs1Var.getClass();
        Bundle bundle = editorInfo.extras;
        jy3 jy3Var = (jy3) ((zp2) gs1Var.c).x;
        int a = jy3Var.a(4);
        if (a != 0) {
            i = ((ByteBuffer) jy3Var.A).getInt(a + jy3Var.x);
        } else {
            i = 0;
        }
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
