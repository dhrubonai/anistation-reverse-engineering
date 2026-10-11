package e4;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes.dex */
public final class d implements x3.e0, x3.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3476a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3477b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3478c;

    public d(Bitmap bitmap, y3.d dVar) {
        if (bitmap != null) {
            this.f3477b = bitmap;
            if (dVar != null) {
                this.f3478c = dVar;
                return;
            }
            throw new NullPointerException("BitmapPool must not be null");
        }
        throw new NullPointerException("Bitmap must not be null");
    }

    public static d c(Bitmap bitmap, y3.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new d(bitmap, dVar);
    }

    @Override // x3.b0
    public final void a() {
        switch (this.f3476a) {
            case 0:
                ((Bitmap) this.f3477b).prepareToDraw();
                return;
            default:
                x3.e0 e0Var = (x3.e0) this.f3478c;
                if (e0Var instanceof x3.b0) {
                    ((x3.b0) e0Var).a();
                    return;
                }
                return;
        }
    }

    @Override // x3.e0
    public final int b() {
        switch (this.f3476a) {
            case 0:
                return p4.m.c((Bitmap) this.f3477b);
            default:
                return ((x3.e0) this.f3478c).b();
        }
    }

    @Override // x3.e0
    public final Class d() {
        switch (this.f3476a) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // x3.e0
    public final void e() {
        int i10 = this.f3476a;
        Object obj = this.f3478c;
        switch (i10) {
            case 0:
                ((y3.d) obj).c((Bitmap) this.f3477b);
                return;
            default:
                ((x3.e0) obj).e();
                return;
        }
    }

    @Override // x3.e0
    public final Object get() {
        int i10 = this.f3476a;
        Object obj = this.f3477b;
        switch (i10) {
            case 0:
                return (Bitmap) obj;
            default:
                return new BitmapDrawable((Resources) obj, (Bitmap) ((x3.e0) this.f3478c).get());
        }
    }

    public d(Resources resources, x3.e0 e0Var) {
        w7.b.q(resources);
        this.f3477b = resources;
        w7.b.q(e0Var);
        this.f3478c = e0Var;
    }
}
