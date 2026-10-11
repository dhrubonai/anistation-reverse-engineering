package q3;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import g0.y0;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class g extends s {
    public static final String[] O = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final c P;
    public static final c Q;
    public static final c R;
    public static final c S;
    public static final c T;

    static {
        new b();
        P = new c(0, PointF.class, "topLeft");
        Q = new c(1, PointF.class, "bottomRight");
        R = new c(2, PointF.class, "bottomRight");
        S = new c(3, PointF.class, "topLeft");
        T = new c(4, PointF.class, "position");
    }

    public final void I(z zVar) {
        WeakHashMap weakHashMap = y0.f4277a;
        View view = zVar.f9197b;
        if (g0.k0.c(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            HashMap hashMap = zVar.f9196a;
            hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            hashMap.put("android:changeBounds:parent", view.getParent());
        }
    }

    @Override // q3.s
    public final void e(z zVar) {
        I(zVar);
    }

    @Override // q3.s
    public final void h(z zVar) {
        I(zVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q3.s
    public final Animator l(ViewGroup viewGroup, z zVar, z zVar2) {
        int i10;
        g gVar;
        ObjectAnimator ofObject;
        if (zVar != null && zVar2 != null) {
            HashMap hashMap = zVar.f9196a;
            HashMap hashMap2 = zVar2.f9196a;
            ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
            ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
            if (viewGroup2 != null && viewGroup3 != null) {
                Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
                Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
                int i11 = rect.left;
                int i12 = rect2.left;
                int i13 = rect.top;
                int i14 = rect2.top;
                int i15 = rect.right;
                int i16 = rect2.right;
                int i17 = rect.bottom;
                int i18 = rect2.bottom;
                int i19 = i15 - i11;
                int i20 = i17 - i13;
                int i21 = i16 - i12;
                int i22 = i18 - i14;
                Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
                Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
                if ((i19 != 0 && i20 != 0) || (i21 != 0 && i22 != 0)) {
                    if (i11 == i12 && i13 == i14) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                    if (i15 != i16 || i17 != i18) {
                        i10++;
                    }
                } else {
                    i10 = 0;
                }
                if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                    i10++;
                }
                int i23 = i10;
                if (i23 > 0) {
                    View view = zVar2.f9197b;
                    a0.a(view, i11, i13, i15, i17);
                    if (i23 == 2) {
                        if (i19 == i21 && i20 == i22) {
                            gVar = this;
                            gVar.K.getClass();
                            ofObject = ObjectAnimator.ofObject(view, T, (TypeConverter) null, w1.o.u(i11, i13, i12, i14));
                        } else {
                            gVar = this;
                            f fVar = new f(view);
                            gVar.K.getClass();
                            ObjectAnimator ofObject2 = ObjectAnimator.ofObject(fVar, P, (TypeConverter) null, w1.o.u(i11, i13, i12, i14));
                            gVar.K.getClass();
                            ObjectAnimator ofObject3 = ObjectAnimator.ofObject(fVar, Q, (TypeConverter) null, w1.o.u(i15, i17, i16, i18));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(ofObject2, ofObject3);
                            animatorSet.addListener(new d(fVar));
                            ofObject = animatorSet;
                        }
                    } else {
                        gVar = this;
                        if (i11 == i12 && i13 == i14) {
                            gVar.K.getClass();
                            ofObject = ObjectAnimator.ofObject(view, R, (TypeConverter) null, w1.o.u(i15, i17, i16, i18));
                        } else {
                            gVar.K.getClass();
                            ofObject = ObjectAnimator.ofObject(view, S, (TypeConverter) null, w1.o.u(i11, i13, i12, i14));
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                        p7.a0.X(viewGroup4, true);
                        gVar.a(new e(viewGroup4));
                    }
                    return ofObject;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // q3.s
    public final String[] q() {
        return O;
    }
}
