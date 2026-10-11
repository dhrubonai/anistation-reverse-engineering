package q3;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import g0.y0;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class c extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9125a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, Class cls, String str) {
        super(cls, str);
        this.f9125a = i10;
    }

    public final Float a(View view) {
        switch (this.f9125a) {
            case 5:
                return Float.valueOf(a0.f9121a.x(view));
            case 6:
            default:
                WeakHashMap weakHashMap = y0.f4277a;
                return Float.valueOf(g0.i0.e(view));
            case zzaja.zze.zzg /* 7 */:
                return Float.valueOf(view.getLayoutParams().width);
            case 8:
                return Float.valueOf(view.getLayoutParams().height);
            case 9:
                WeakHashMap weakHashMap2 = y0.f4277a;
                return Float.valueOf(g0.i0.f(view));
        }
    }

    public final void b(View view, PointF pointF) {
        switch (this.f9125a) {
            case 2:
                a0.a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
                return;
            case 3:
                a0.a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
                return;
            default:
                int round = Math.round(pointF.x);
                int round2 = Math.round(pointF.y);
                a0.a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
                return;
        }
    }

    public final void c(View view, Float f10) {
        switch (this.f9125a) {
            case 5:
                a0.f9121a.y(view, f10.floatValue());
                return;
            case 6:
            default:
                WeakHashMap weakHashMap = y0.f4277a;
                g0.i0.k(view, g0.i0.f(view), view.getPaddingTop(), f10.intValue(), view.getPaddingBottom());
                return;
            case zzaja.zze.zzg /* 7 */:
                view.getLayoutParams().width = f10.intValue();
                view.requestLayout();
                return;
            case 8:
                view.getLayoutParams().height = f10.intValue();
                view.requestLayout();
                return;
            case 9:
                int intValue = f10.intValue();
                int paddingTop = view.getPaddingTop();
                WeakHashMap weakHashMap2 = y0.f4277a;
                g0.i0.k(view, intValue, paddingTop, g0.i0.e(view), view.getPaddingBottom());
                return;
        }
    }

    public final void d(f fVar, PointF pointF) {
        switch (this.f9125a) {
            case 0:
                fVar.getClass();
                fVar.f9132a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                fVar.f9133b = round;
                int i10 = fVar.f9137f + 1;
                fVar.f9137f = i10;
                if (i10 == fVar.f9138g) {
                    a0.a(fVar.f9136e, fVar.f9132a, round, fVar.f9134c, fVar.f9135d);
                    fVar.f9137f = 0;
                    fVar.f9138g = 0;
                    return;
                }
                return;
            default:
                fVar.getClass();
                fVar.f9134c = Math.round(pointF.x);
                int round2 = Math.round(pointF.y);
                fVar.f9135d = round2;
                int i11 = fVar.f9138g + 1;
                fVar.f9138g = i11;
                if (fVar.f9137f == i11) {
                    a0.a(fVar.f9136e, fVar.f9132a, fVar.f9133b, fVar.f9134c, round2);
                    fVar.f9137f = 0;
                    fVar.f9138g = 0;
                    return;
                }
                return;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f9125a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return a((View) obj);
            case 6:
                WeakHashMap weakHashMap = y0.f4277a;
                return g0.j0.a((View) obj);
            case zzaja.zze.zzg /* 7 */:
                return a((View) obj);
            case 8:
                return a((View) obj);
            case 9:
                return a((View) obj);
            default:
                return a((View) obj);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f9125a) {
            case 0:
                d((f) obj, (PointF) obj2);
                return;
            case 1:
                d((f) obj, (PointF) obj2);
                return;
            case 2:
                b((View) obj, (PointF) obj2);
                return;
            case 3:
                b((View) obj, (PointF) obj2);
                return;
            case 4:
                b((View) obj, (PointF) obj2);
                return;
            case 5:
                c((View) obj, (Float) obj2);
                return;
            case 6:
                WeakHashMap weakHashMap = y0.f4277a;
                g0.j0.c((View) obj, (Rect) obj2);
                return;
            case zzaja.zze.zzg /* 7 */:
                c((View) obj, (Float) obj2);
                return;
            case 8:
                c((View) obj, (Float) obj2);
                return;
            case 9:
                c((View) obj, (Float) obj2);
                return;
            default:
                c((View) obj, (Float) obj2);
                return;
        }
    }
}
