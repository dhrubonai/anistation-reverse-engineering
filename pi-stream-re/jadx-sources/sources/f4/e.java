package f4;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.o;
import g4.h;

/* loaded from: classes.dex */
public final class e extends c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3920b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Drawable drawable, int i10) {
        super(drawable);
        this.f3920b = i10;
    }

    @Override // x3.b0
    public final void a() {
        int i10 = this.f3920b;
        Drawable drawable = this.f3919a;
        switch (i10) {
            case 1:
                ((g4.c) drawable).f4400a.f4399a.f4427l.prepareToDraw();
                return;
            default:
                if (drawable instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                    return;
                } else {
                    if (drawable instanceof g4.c) {
                        ((g4.c) drawable).f4400a.f4399a.f4427l.prepareToDraw();
                        return;
                    }
                    return;
                }
        }
    }

    @Override // x3.e0
    public final int b() {
        int i10 = this.f3920b;
        Drawable drawable = this.f3919a;
        switch (i10) {
            case 0:
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
            default:
                h hVar = ((g4.c) drawable).f4400a.f4399a;
                u3.e eVar = (u3.e) hVar.f4416a;
                return (eVar.f10233j.length * 4) + eVar.f10227d.limit() + eVar.f10232i.length + hVar.f4429n;
        }
    }

    @Override // x3.e0
    public final Class d() {
        switch (this.f3920b) {
            case 0:
                return this.f3919a.getClass();
            default:
                return g4.c.class;
        }
    }

    @Override // x3.e0
    public final void e() {
        y3.h hVar;
        y3.h hVar2;
        y3.h hVar3;
        switch (this.f3920b) {
            case 0:
                return;
            default:
                g4.c cVar = (g4.c) this.f3919a;
                cVar.stop();
                cVar.f4403d = true;
                h hVar4 = cVar.f4400a.f4399a;
                hVar4.f4418c.clear();
                Bitmap bitmap = hVar4.f4427l;
                if (bitmap != null) {
                    hVar4.f4420e.c(bitmap);
                    hVar4.f4427l = null;
                }
                hVar4.f4421f = false;
                g4.e eVar = hVar4.f4424i;
                o oVar = hVar4.f4419d;
                if (eVar != null) {
                    oVar.l(eVar);
                    hVar4.f4424i = null;
                }
                g4.e eVar2 = hVar4.f4426k;
                if (eVar2 != null) {
                    oVar.l(eVar2);
                    hVar4.f4426k = null;
                }
                g4.e eVar3 = hVar4.f4428m;
                if (eVar3 != null) {
                    oVar.l(eVar3);
                    hVar4.f4428m = null;
                }
                u3.e eVar4 = (u3.e) hVar4.f4416a;
                eVar4.f10235l = null;
                byte[] bArr = eVar4.f10232i;
                z3.e eVar5 = eVar4.f10226c;
                if (bArr != null && (hVar3 = (y3.h) eVar5.f12045c) != null) {
                    hVar3.h(bArr);
                }
                int[] iArr = eVar4.f10233j;
                if (iArr != null && (hVar2 = (y3.h) eVar5.f12045c) != null) {
                    hVar2.h(iArr);
                }
                Bitmap bitmap2 = eVar4.f10236m;
                if (bitmap2 != null) {
                    ((y3.d) eVar5.f12044b).c(bitmap2);
                }
                eVar4.f10236m = null;
                eVar4.f10227d = null;
                eVar4.f10241s = null;
                byte[] bArr2 = eVar4.f10228e;
                if (bArr2 != null && (hVar = (y3.h) eVar5.f12045c) != null) {
                    hVar.h(bArr2);
                }
                hVar4.f4425j = true;
                return;
        }
    }
}
