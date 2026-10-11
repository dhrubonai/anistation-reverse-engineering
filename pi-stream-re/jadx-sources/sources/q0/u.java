package q0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Handler;
import java.nio.MappedByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class u implements k {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8954a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.appcompat.widget.r f8955b;

    /* renamed from: c, reason: collision with root package name */
    public final j6.e f8956c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8957d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f8958e;

    /* renamed from: f, reason: collision with root package name */
    public Executor f8959f;

    /* renamed from: x, reason: collision with root package name */
    public ThreadPoolExecutor f8960x;

    /* renamed from: y, reason: collision with root package name */
    public com.bumptech.glide.d f8961y;

    /* renamed from: z, reason: collision with root package name */
    public l0.a f8962z;

    public u(Context context, androidx.appcompat.widget.r rVar) {
        j6.e eVar = n.f8934d;
        this.f8957d = new Object();
        if (context != null) {
            this.f8954a = context.getApplicationContext();
            this.f8955b = rVar;
            this.f8956c = eVar;
            return;
        }
        throw new NullPointerException("Context cannot be null");
    }

    @Override // q0.k
    public final void a(com.bumptech.glide.d dVar) {
        synchronized (this.f8957d) {
            this.f8961y = dVar;
        }
        c();
    }

    public final void b() {
        synchronized (this.f8957d) {
            this.f8961y = null;
            l0.a aVar = this.f8962z;
            if (aVar != null) {
                j6.e eVar = this.f8956c;
                Context context = this.f8954a;
                eVar.getClass();
                context.getContentResolver().unregisterContentObserver(aVar);
                this.f8962z = null;
            }
            Handler handler = this.f8958e;
            if (handler != null) {
                handler.removeCallbacks(null);
            }
            this.f8958e = null;
            ThreadPoolExecutor threadPoolExecutor = this.f8960x;
            if (threadPoolExecutor != null) {
                threadPoolExecutor.shutdown();
            }
            this.f8959f = null;
            this.f8960x = null;
        }
    }

    public final void c() {
        synchronized (this.f8957d) {
            if (this.f8961y == null) {
                return;
            }
            final int i10 = 0;
            if (this.f8959f == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat", i10));
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                this.f8960x = threadPoolExecutor;
                this.f8959f = threadPoolExecutor;
            }
            this.f8959f.execute(new Runnable(this) { // from class: q0.t

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ u f8953b;

                {
                    this.f8953b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            u uVar = this.f8953b;
                            synchronized (uVar.f8957d) {
                                if (uVar.f8961y != null) {
                                    try {
                                        d0.i d10 = uVar.d();
                                        int i11 = d10.f3032e;
                                        if (i11 == 2) {
                                            synchronized (uVar.f8957d) {
                                            }
                                        }
                                        if (i11 == 0) {
                                            try {
                                                int i12 = c0.n.f1613a;
                                                c0.m.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                                j6.e eVar = uVar.f8956c;
                                                Context context = uVar.f8954a;
                                                eVar.getClass();
                                                Typeface z9 = z.i.f11865a.z(context, new d0.i[]{d10}, 0);
                                                MappedByteBuffer O = p7.a0.O(uVar.f8954a, d10.f3028a);
                                                if (O != null && z9 != null) {
                                                    try {
                                                        c0.m.a("EmojiCompat.MetadataRepo.create");
                                                        i.g gVar = new i.g(z9, j5.a.Q(O));
                                                        c0.m.b();
                                                        c0.m.b();
                                                        synchronized (uVar.f8957d) {
                                                            com.bumptech.glide.d dVar = uVar.f8961y;
                                                            if (dVar != null) {
                                                                dVar.N(gVar);
                                                            }
                                                        }
                                                        uVar.b();
                                                        return;
                                                    } finally {
                                                        int i13 = c0.n.f1613a;
                                                        c0.m.b();
                                                    }
                                                }
                                                throw new RuntimeException("Unable to open file.");
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        throw new RuntimeException("fetchFonts result is not OK. (" + i11 + ")");
                                    } catch (Throwable th2) {
                                        synchronized (uVar.f8957d) {
                                            com.bumptech.glide.d dVar2 = uVar.f8961y;
                                            if (dVar2 != null) {
                                                dVar2.M(th2);
                                            }
                                            uVar.b();
                                            return;
                                        }
                                    }
                                }
                                return;
                            }
                        default:
                            this.f8953b.c();
                            return;
                    }
                }
            });
        }
    }

    public final d0.i d() {
        try {
            j6.e eVar = this.f8956c;
            Context context = this.f8954a;
            androidx.appcompat.widget.r rVar = this.f8955b;
            eVar.getClass();
            d0.h H = w7.b.H(context, rVar);
            if (H.f3026a == 0) {
                d0.i[] iVarArr = (d0.i[]) H.f3027b;
                if (iVarArr != null && iVarArr.length != 0) {
                    return iVarArr[0];
                }
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            throw new RuntimeException("fetchFonts failed (" + H.f3026a + ")");
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException("provider not found", e10);
        }
    }
}
