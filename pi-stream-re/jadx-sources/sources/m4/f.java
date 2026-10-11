package m4;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.util.ArrayList;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public abstract class f extends a implements n4.c {

    /* renamed from: a, reason: collision with root package name */
    public final View f7444a;

    /* renamed from: b, reason: collision with root package name */
    public final j f7445b;

    /* renamed from: c, reason: collision with root package name */
    public Animatable f7446c;

    public f(ImageView imageView) {
        w7.b.q(imageView);
        this.f7444a = imageView;
        this.f7445b = new j(imageView);
    }

    @Override // m4.i
    public final void a(l4.c cVar) {
        this.f7444a.setTag(R.id.glide_custom_view_target_tag, cVar);
    }

    @Override // m4.i
    public final void b(Drawable drawable) {
        l(null);
        ((ImageView) this.f7444a).setImageDrawable(drawable);
    }

    @Override // i4.j
    public final void c() {
        Animatable animatable = this.f7446c;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // m4.i
    public final void d(Drawable drawable) {
        l(null);
        ((ImageView) this.f7444a).setImageDrawable(drawable);
    }

    @Override // m4.i
    public final void e(Object obj, n4.d dVar) {
        if (dVar != null && dVar.a(obj, this)) {
            if (obj instanceof Animatable) {
                Animatable animatable = (Animatable) obj;
                this.f7446c = animatable;
                animatable.start();
                return;
            }
            this.f7446c = null;
            return;
        }
        l(obj);
    }

    @Override // m4.i
    public final l4.c f() {
        Object tag = this.f7444a.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof l4.c) {
                return (l4.c) tag;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // m4.i
    public final void g(Drawable drawable) {
        j jVar = this.f7445b;
        ViewTreeObserver viewTreeObserver = jVar.f7450a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(jVar.f7452c);
        }
        jVar.f7452c = null;
        jVar.f7451b.clear();
        Animatable animatable = this.f7446c;
        if (animatable != null) {
            animatable.stop();
        }
        l(null);
        ((ImageView) this.f7444a).setImageDrawable(drawable);
    }

    @Override // m4.i
    public final void h(h hVar) {
        boolean z9;
        boolean z10;
        j jVar = this.f7445b;
        int c6 = jVar.c();
        int b10 = jVar.b();
        boolean z11 = false;
        if (c6 <= 0 && c6 != Integer.MIN_VALUE) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            if (b10 <= 0 && b10 != Integer.MIN_VALUE) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                z11 = true;
            }
        }
        if (z11) {
            ((l4.h) hVar).n(c6, b10);
            return;
        }
        ArrayList arrayList = jVar.f7451b;
        if (!arrayList.contains(hVar)) {
            arrayList.add(hVar);
        }
        if (jVar.f7452c == null) {
            ViewTreeObserver viewTreeObserver = jVar.f7450a.getViewTreeObserver();
            d dVar = new d(jVar);
            jVar.f7452c = dVar;
            viewTreeObserver.addOnPreDrawListener(dVar);
        }
    }

    @Override // m4.i
    public final void i(h hVar) {
        this.f7445b.f7451b.remove(hVar);
    }

    @Override // i4.j
    public final void j() {
        Animatable animatable = this.f7446c;
        if (animatable != null) {
            animatable.start();
        }
    }

    public final void l(Object obj) {
        b bVar = (b) this;
        int i10 = bVar.f7434d;
        View view = bVar.f7444a;
        switch (i10) {
            case 0:
                ((ImageView) view).setImageBitmap((Bitmap) obj);
                break;
            default:
                ((ImageView) view).setImageDrawable((Drawable) obj);
                break;
        }
        if (obj instanceof Animatable) {
            Animatable animatable = (Animatable) obj;
            this.f7446c = animatable;
            animatable.start();
            return;
        }
        this.f7446c = null;
    }

    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return "Target for: " + this.f7444a;
    }
}
