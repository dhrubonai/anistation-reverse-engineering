package g4;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.l;
import com.bumptech.glide.o;
import java.util.ArrayList;
import p4.m;
import v3.p;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final u3.a f4416a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f4417b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4418c;

    /* renamed from: d, reason: collision with root package name */
    public final o f4419d;

    /* renamed from: e, reason: collision with root package name */
    public final y3.d f4420e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4421f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4422g;

    /* renamed from: h, reason: collision with root package name */
    public l f4423h;

    /* renamed from: i, reason: collision with root package name */
    public e f4424i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4425j;

    /* renamed from: k, reason: collision with root package name */
    public e f4426k;

    /* renamed from: l, reason: collision with root package name */
    public Bitmap f4427l;

    /* renamed from: m, reason: collision with root package name */
    public e f4428m;

    /* renamed from: n, reason: collision with root package name */
    public int f4429n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public int f4430p;

    public h(com.bumptech.glide.b bVar, u3.e eVar, int i10, int i11, d4.c cVar, Bitmap bitmap) {
        y3.d dVar = bVar.f2170a;
        com.bumptech.glide.f fVar = bVar.f2172c;
        o d10 = com.bumptech.glide.b.d(fVar.getBaseContext());
        o d11 = com.bumptech.glide.b.d(fVar.getBaseContext());
        d11.getClass();
        l t9 = new l(d11.f2277a, d11, Bitmap.class, d11.f2278b).t(o.B).t(((l4.f) ((l4.f) ((l4.f) new l4.f().d(x3.o.f11234a)).r()).o()).i(i10, i11));
        this.f4418c = new ArrayList();
        this.f4419d = d10;
        Handler handler = new Handler(Looper.getMainLooper(), new g(this, 0));
        this.f4420e = dVar;
        this.f4417b = handler;
        this.f4423h = t9;
        this.f4416a = eVar;
        c(cVar, bitmap);
    }

    public final void a() {
        int i10;
        int i11;
        if (this.f4421f && !this.f4422g) {
            e eVar = this.f4428m;
            if (eVar != null) {
                this.f4428m = null;
                b(eVar);
                return;
            }
            this.f4422g = true;
            u3.a aVar = this.f4416a;
            u3.e eVar2 = (u3.e) aVar;
            u3.c cVar = eVar2.f10235l;
            int i12 = cVar.f10211c;
            if (i12 > 0 && (i11 = eVar2.f10234k) >= 0) {
                if (i11 >= 0 && i11 < i12) {
                    i10 = ((u3.b) cVar.f10213e.get(i11)).f10206i;
                } else {
                    i10 = -1;
                }
            } else {
                i10 = 0;
            }
            long uptimeMillis = SystemClock.uptimeMillis() + i10;
            int i13 = (eVar2.f10234k + 1) % eVar2.f10235l.f10211c;
            eVar2.f10234k = i13;
            this.f4426k = new e(this.f4417b, i13, uptimeMillis);
            l A = this.f4423h.t((l4.f) new l4.f().n(new o4.b(Double.valueOf(Math.random())))).A(aVar);
            A.y(this.f4426k, A);
        }
    }

    public final void b(e eVar) {
        int i10;
        this.f4422g = false;
        boolean z9 = this.f4425j;
        Handler handler = this.f4417b;
        if (z9) {
            handler.obtainMessage(2, eVar).sendToTarget();
            return;
        }
        if (!this.f4421f) {
            this.f4428m = eVar;
            return;
        }
        if (eVar.f4413x != null) {
            Bitmap bitmap = this.f4427l;
            if (bitmap != null) {
                this.f4420e.c(bitmap);
                this.f4427l = null;
            }
            e eVar2 = this.f4424i;
            this.f4424i = eVar;
            ArrayList arrayList = this.f4418c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c cVar = (c) ((f) arrayList.get(size));
                Object callback = cVar.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    cVar.stop();
                    cVar.invalidateSelf();
                } else {
                    cVar.invalidateSelf();
                    e eVar3 = cVar.f4400a.f4399a.f4424i;
                    if (eVar3 != null) {
                        i10 = eVar3.f4411e;
                    } else {
                        i10 = -1;
                    }
                    if (i10 == ((u3.e) r6.f4416a).f10235l.f10211c - 1) {
                        cVar.f4405f++;
                    }
                    int i11 = cVar.f4406x;
                    if (i11 != -1 && cVar.f4405f >= i11) {
                        cVar.stop();
                    }
                }
            }
            if (eVar2 != null) {
                handler.obtainMessage(2, eVar2).sendToTarget();
            }
        }
        a();
    }

    public final void c(p pVar, Bitmap bitmap) {
        w7.b.q(pVar);
        w7.b.q(bitmap);
        this.f4427l = bitmap;
        this.f4423h = this.f4423h.t(new l4.f().q(pVar, true));
        this.f4429n = m.c(bitmap);
        this.o = bitmap.getWidth();
        this.f4430p = bitmap.getHeight();
    }
}
