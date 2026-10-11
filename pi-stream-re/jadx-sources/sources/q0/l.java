package q0;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f8922i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public static volatile l f8923j;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f8924a;

    /* renamed from: b, reason: collision with root package name */
    public final n.f f8925b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f8926c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f8927d;

    /* renamed from: e, reason: collision with root package name */
    public final g f8928e;

    /* renamed from: f, reason: collision with root package name */
    public final k f8929f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8930g;

    /* renamed from: h, reason: collision with root package name */
    public final e f8931h;

    public l(n nVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f8924a = reentrantReadWriteLock;
        this.f8926c = 3;
        this.f8929f = nVar.f8919a;
        int i10 = nVar.f8920b;
        this.f8930g = i10;
        this.f8931h = nVar.f8921c;
        this.f8927d = new Handler(Looper.getMainLooper());
        this.f8925b = new n.f(0);
        g gVar = new g(this);
        this.f8928e = gVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i10 == 0) {
            try {
                this.f8926c = 0;
            } catch (Throwable th) {
                this.f8924a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                ((l) gVar.f3762b).f8929f.a(new f(gVar));
            } catch (Throwable th2) {
                ((l) gVar.f3762b).d(th2);
            }
        }
    }

    public static l a() {
        l lVar;
        boolean z9;
        synchronized (f8922i) {
            lVar = f8923j;
            if (lVar != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            }
        }
        return lVar;
    }

    public final int b() {
        this.f8924a.readLock().lock();
        try {
            return this.f8926c;
        } finally {
            this.f8924a.readLock().unlock();
        }
    }

    public final void c() {
        boolean z9;
        boolean z10 = true;
        if (this.f8930g == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (b() != 1) {
                z10 = false;
            }
            if (z10) {
                return;
            }
            this.f8924a.writeLock().lock();
            try {
                if (this.f8926c == 0) {
                    return;
                }
                this.f8926c = 0;
                this.f8924a.writeLock().unlock();
                g gVar = this.f8928e;
                gVar.getClass();
                try {
                    ((l) gVar.f3762b).f8929f.a(new f(gVar));
                    return;
                } catch (Throwable th) {
                    ((l) gVar.f3762b).d(th);
                    return;
                }
            } finally {
                this.f8924a.writeLock().unlock();
            }
        }
        throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f8924a.writeLock().lock();
        try {
            this.f8926c = 2;
            arrayList.addAll(this.f8925b);
            this.f8925b.clear();
            this.f8924a.writeLock().unlock();
            this.f8927d.post(new a.d(arrayList, this.f8926c, th));
        } catch (Throwable th2) {
            this.f8924a.writeLock().unlock();
            throw th2;
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        this.f8924a.writeLock().lock();
        try {
            this.f8926c = 1;
            arrayList.addAll(this.f8925b);
            this.f8925b.clear();
            this.f8924a.writeLock().unlock();
            this.f8927d.post(new a.d(this.f8926c, arrayList));
        } catch (Throwable th) {
            this.f8924a.writeLock().unlock();
            throw th;
        }
    }

    public final CharSequence f(int i10, int i11, CharSequence charSequence) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (b() == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (i10 >= 0) {
                if (i11 >= 0) {
                    if (i10 <= i11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    com.bumptech.glide.d.i("start should be <= than end", z10);
                    if (charSequence == null) {
                        return null;
                    }
                    if (i10 <= charSequence.length()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    com.bumptech.glide.d.i("start should be < than charSequence length", z11);
                    if (i11 > charSequence.length()) {
                        z12 = false;
                    }
                    com.bumptech.glide.d.i("end should be < than charSequence length", z12);
                    if (charSequence.length() != 0 && i10 != i11) {
                        return this.f8928e.J(charSequence, i10, i11, false);
                    }
                    return charSequence;
                }
                throw new IllegalArgumentException("end cannot be negative");
            }
            throw new IllegalArgumentException("start cannot be negative");
        }
        throw new IllegalStateException("Not initialized yet");
    }

    public final void g(j jVar) {
        if (jVar != null) {
            this.f8924a.writeLock().lock();
            try {
                if (this.f8926c != 1 && this.f8926c != 2) {
                    this.f8925b.add(jVar);
                    return;
                }
                this.f8927d.post(new a.d(jVar, this.f8926c));
                return;
            } finally {
                this.f8924a.writeLock().unlock();
            }
        }
        throw new NullPointerException("initCallback cannot be null");
    }
}
