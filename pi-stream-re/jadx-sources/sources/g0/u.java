package g0;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f4255a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f4256b;

    /* renamed from: c, reason: collision with root package name */
    public final View f4257c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4258d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f4259e;

    public u(View view) {
        this.f4257c = view;
    }

    public final boolean a(float f10, float f11, boolean z9) {
        ViewParent f12;
        if (!this.f4258d || (f12 = f(0)) == null) {
            return false;
        }
        try {
            return h1.a(f12, this.f4257c, f10, f11, z9);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + f12 + " does not implement interface method onNestedFling", e10);
            return false;
        }
    }

    public final boolean b(float f10, float f11) {
        ViewParent f12;
        if (!this.f4258d || (f12 = f(0)) == null) {
            return false;
        }
        try {
            return h1.b(f12, this.f4257c, f10, f11);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + f12 + " does not implement interface method onNestedPreFling", e10);
            return false;
        }
    }

    public final boolean c(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        ViewParent f10;
        int i13;
        int i14;
        int[] iArr3;
        if (!this.f4258d || (f10 = f(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.f4257c;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            if (this.f4259e == null) {
                this.f4259e = new int[2];
            }
            iArr3 = this.f4259e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        View view2 = this.f4257c;
        if (f10 instanceof v) {
            ((v) f10).c(view2, i10, i11, iArr3, i12);
        } else if (i12 == 0) {
            try {
                h1.c(f10, view2, i10, i11, iArr3);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + f10 + " does not implement interface method onNestedPreScroll", e10);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        if (iArr3[0] == 0 && iArr3[1] == 0) {
            return false;
        }
        return true;
    }

    public final void d(int i10, int i11, int i12, int[] iArr) {
        e(0, i10, 0, i11, null, i12, iArr);
    }

    public final boolean e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent f10;
        int i15;
        int i16;
        int[] iArr3;
        if (!this.f4258d || (f10 = f(i14)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        View view = this.f4257c;
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            i15 = iArr[0];
            i16 = iArr[1];
        } else {
            i15 = 0;
            i16 = 0;
        }
        if (iArr2 == null) {
            if (this.f4259e == null) {
                this.f4259e = new int[2];
            }
            int[] iArr4 = this.f4259e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view2 = this.f4257c;
        if (f10 instanceof w) {
            ((w) f10).d(view2, i10, i11, i12, i13, i14, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i12;
            iArr3[1] = iArr3[1] + i13;
            if (f10 instanceof v) {
                ((v) f10).e(view2, i10, i11, i12, i13, i14);
            } else if (i14 == 0) {
                try {
                    h1.d(f10, view2, i10, i11, i12, i13);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + f10 + " does not implement interface method onNestedScroll", e10);
                }
            }
        }
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i15;
            iArr[1] = iArr[1] - i16;
        }
        return true;
    }

    public final ViewParent f(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return null;
            }
            return this.f4256b;
        }
        return this.f4255a;
    }

    public final boolean g(int i10, int i11) {
        boolean z9;
        boolean f10;
        if (f(i11) != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return true;
        }
        if (this.f4258d) {
            View view = this.f4257c;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z10 = parent instanceof v;
                if (z10) {
                    f10 = ((v) parent).f(view2, view, i10, i11);
                } else {
                    if (i11 == 0) {
                        try {
                            f10 = h1.f(parent, view2, view, i10);
                        } catch (AbstractMethodError e10) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e10);
                        }
                    }
                    f10 = false;
                }
                if (f10) {
                    if (i11 != 0) {
                        if (i11 == 1) {
                            this.f4256b = parent;
                        }
                    } else {
                        this.f4255a = parent;
                    }
                    if (z10) {
                        ((v) parent).a(view2, view, i10, i11);
                    } else if (i11 == 0) {
                        try {
                            h1.e(parent, view2, view, i10);
                        } catch (AbstractMethodError e11) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e11);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
        }
        return false;
    }

    public final void h(int i10) {
        ViewParent f10 = f(i10);
        if (f10 != null) {
            boolean z9 = f10 instanceof v;
            View view = this.f4257c;
            if (z9) {
                ((v) f10).b(view, i10);
            } else if (i10 == 0) {
                try {
                    h1.g(f10, view);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + f10 + " does not implement interface method onStopNestedScroll", e10);
                }
            }
            if (i10 != 0) {
                if (i10 == 1) {
                    this.f4256b = null;
                    return;
                }
                return;
            }
            this.f4255a = null;
        }
    }
}
