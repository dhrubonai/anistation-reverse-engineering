package g0;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4204a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f4205b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4206c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4207d;

    public f0(int i10, Class cls, int i11, int i12) {
        this.f4204a = i10;
        this.f4205b = cls;
        this.f4207d = i11;
        this.f4206c = i12;
    }

    public static boolean a(Boolean bool, Boolean bool2) {
        boolean z9;
        boolean z10;
        if (bool != null && bool.booleanValue()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (bool2 != null && bool2.booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 == z10) {
            return true;
        }
        return false;
    }

    public final Object b(View view) {
        boolean z9;
        if (Build.VERSION.SDK_INT >= this.f4206c) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            d0 d0Var = (d0) this;
            int i10 = d0Var.f4176e;
            switch (i10) {
                case 0:
                    return d0Var.d(view);
                case 1:
                    switch (i10) {
                        case 1:
                            return r0.b(view);
                        default:
                            return t0.a(view);
                    }
                case 2:
                    switch (i10) {
                        case 1:
                            return r0.b(view);
                        default:
                            return t0.a(view);
                    }
                default:
                    return d0Var.d(view);
            }
        }
        Object tag = view.getTag(this.f4204a);
        if (this.f4205b.isInstance(tag)) {
            return tag;
        }
        return null;
    }

    public final void c(View view, Object obj) {
        boolean z9;
        boolean a10;
        c cVar;
        if (Build.VERSION.SDK_INT >= this.f4206c) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            int i10 = ((d0) this).f4176e;
            switch (i10) {
                case 0:
                    Boolean bool = (Boolean) obj;
                    switch (i10) {
                        case 0:
                            r0.i(view, bool.booleanValue());
                            return;
                        default:
                            r0.g(view, bool.booleanValue());
                            return;
                    }
                case 1:
                    CharSequence charSequence = (CharSequence) obj;
                    switch (i10) {
                        case 1:
                            r0.h(view, charSequence);
                            return;
                        default:
                            t0.b(view, charSequence);
                            return;
                    }
                case 2:
                    CharSequence charSequence2 = (CharSequence) obj;
                    switch (i10) {
                        case 1:
                            r0.h(view, charSequence2);
                            return;
                        default:
                            t0.b(view, charSequence2);
                            return;
                    }
                default:
                    Boolean bool2 = (Boolean) obj;
                    switch (i10) {
                        case 0:
                            r0.i(view, bool2.booleanValue());
                            return;
                        default:
                            r0.g(view, bool2.booleanValue());
                            return;
                    }
            }
        }
        Object b10 = b(view);
        int i11 = ((d0) this).f4176e;
        switch (i11) {
            case 0:
                Boolean bool3 = (Boolean) b10;
                Boolean bool4 = (Boolean) obj;
                switch (i11) {
                    case 0:
                        a10 = a(bool3, bool4);
                        break;
                    default:
                        a10 = a(bool3, bool4);
                        break;
                }
            case 1:
                CharSequence charSequence3 = (CharSequence) b10;
                CharSequence charSequence4 = (CharSequence) obj;
                switch (i11) {
                    case 1:
                        a10 = TextUtils.equals(charSequence3, charSequence4);
                        break;
                    default:
                        a10 = TextUtils.equals(charSequence3, charSequence4);
                        break;
                }
            case 2:
                CharSequence charSequence5 = (CharSequence) b10;
                CharSequence charSequence6 = (CharSequence) obj;
                switch (i11) {
                    case 1:
                        a10 = TextUtils.equals(charSequence5, charSequence6);
                        break;
                    default:
                        a10 = TextUtils.equals(charSequence5, charSequence6);
                        break;
                }
            default:
                Boolean bool5 = (Boolean) b10;
                Boolean bool6 = (Boolean) obj;
                switch (i11) {
                    case 0:
                        a10 = a(bool5, bool6);
                        break;
                    default:
                        a10 = a(bool5, bool6);
                        break;
                }
        }
        if (!a10) {
            View.AccessibilityDelegate c6 = y0.c(view);
            if (c6 == null) {
                cVar = null;
            } else if (c6 instanceof a) {
                cVar = ((a) c6).f4164a;
            } else {
                cVar = new c(c6);
            }
            if (cVar == null) {
                cVar = new c();
            }
            y0.l(view, cVar);
            view.setTag(this.f4204a, obj);
            y0.g(view, this.f4207d);
        }
    }
}
