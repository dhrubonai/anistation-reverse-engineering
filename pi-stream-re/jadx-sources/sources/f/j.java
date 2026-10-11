package f;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.widget.f2;
import androidx.core.widget.NestedScrollView;
import g0.y0;
import java.util.WeakHashMap;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class j extends androidx.activity.l implements DialogInterface, m {

    /* renamed from: c, reason: collision with root package name */
    public g0 f3736c;

    /* renamed from: d, reason: collision with root package name */
    public final h0 f3737d;

    /* renamed from: e, reason: collision with root package name */
    public final h f3738e;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v1, types: [f.h0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(android.content.Context r2, int r3) {
        /*
            r1 = this;
            int r3 = o(r2, r3)
            int r0 = k(r2, r3)
            r1.<init>(r2, r0)
            f.h0 r0 = new f.h0
            r0.<init>()
            r1.f3737d = r0
            f.q r0 = r1.j()
            int r2 = k(r2, r3)
            r3 = r0
            f.g0 r3 = (f.g0) r3
            r3.f3690l0 = r2
            r2 = 0
            r0.e(r2)
            f.h r2 = new f.h
            android.content.Context r3 = r1.getContext()
            android.view.Window r0 = r1.getWindow()
            r2.<init>(r3, r1, r0)
            r1.f3738e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.j.<init>(android.content.Context, int):void");
    }

    public static int k(Context context, int i10) {
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            return typedValue.resourceId;
        }
        return i10;
    }

    public static int o(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // f.m
    public final /* bridge */ /* synthetic */ void a() {
    }

    @Override // f.m
    public final /* bridge */ /* synthetic */ void b() {
    }

    @Override // f.m
    public final /* bridge */ /* synthetic */ void c() {
    }

    @Override // androidx.activity.l, android.app.Dialog
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j().a(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void dismiss() {
        super.dismiss();
        j().f();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return r6.h0.L(this.f3737d, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final View findViewById(int i10) {
        g0 g0Var = (g0) j();
        g0Var.x();
        return g0Var.C.findViewById(i10);
    }

    public final q j() {
        if (this.f3736c == null) {
            n0 n0Var = q.f3763a;
            this.f3736c = new g0(getContext(), getWindow(), this, this);
        }
        return this.f3736c;
    }

    @Override // android.app.Dialog
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void invalidateOptionsMenu() {
        j().c();
    }

    public final void m(Bundle bundle) {
        j().b();
        super.onCreate(bundle);
        j().e(bundle);
    }

    @Override // androidx.activity.l, android.app.Dialog
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void onStop() {
        super.onStop();
        g0 g0Var = (g0) j();
        g0Var.D();
        u0 u0Var = g0Var.F;
        if (u0Var != null) {
            u0Var.V = false;
            i.m mVar = u0Var.U;
            if (mVar != null) {
                mVar.a();
            }
        }
    }

    @Override // androidx.activity.l, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        boolean z9;
        int i10;
        View view;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        ListAdapter listAdapter;
        int i12;
        int i13;
        View view2;
        View findViewById;
        m(bundle);
        h hVar = this.f3738e;
        hVar.f3705b.setContentView(hVar.E);
        Window window = hVar.f3706c;
        View findViewById2 = window.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        View view3 = hVar.f3710g;
        int i14 = 0;
        Context context = hVar.f3704a;
        if (view3 == null) {
            if (hVar.f3711h != 0) {
                view3 = LayoutInflater.from(context).inflate(hVar.f3711h, viewGroup, false);
            } else {
                view3 = null;
            }
        }
        if (view3 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 || !h.a(view3)) {
            window.setFlags(131072, 131072);
        }
        if (z9) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view3, new ViewGroup.LayoutParams(-1, -1));
            if (hVar.f3712i) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (hVar.f3709f != null) {
                ((LinearLayout.LayoutParams) ((f2) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup d10 = h.d(findViewById6, findViewById3);
        ViewGroup d11 = h.d(findViewById7, findViewById4);
        ViewGroup d12 = h.d(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        hVar.f3724v = nestedScrollView;
        nestedScrollView.setFocusable(false);
        hVar.f3724v.setNestedScrollingEnabled(false);
        TextView textView = (TextView) d11.findViewById(android.R.id.message);
        hVar.A = textView;
        if (textView != null) {
            textView.setVisibility(8);
            hVar.f3724v.removeView(hVar.A);
            if (hVar.f3709f != null) {
                ViewGroup viewGroup2 = (ViewGroup) hVar.f3724v.getParent();
                int indexOfChild = viewGroup2.indexOfChild(hVar.f3724v);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(hVar.f3709f, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                d11.setVisibility(8);
            }
        }
        Button button = (Button) d12.findViewById(android.R.id.button1);
        hVar.f3713j = button;
        b bVar = hVar.K;
        button.setOnClickListener(bVar);
        boolean isEmpty = TextUtils.isEmpty(hVar.f3714k);
        int i15 = hVar.f3707d;
        if (isEmpty && hVar.f3716m == null) {
            hVar.f3713j.setVisibility(8);
            i10 = 0;
        } else {
            hVar.f3713j.setText(hVar.f3714k);
            Drawable drawable = hVar.f3716m;
            if (drawable != null) {
                drawable.setBounds(0, 0, i15, i15);
                hVar.f3713j.setCompoundDrawables(hVar.f3716m, null, null, null);
            }
            hVar.f3713j.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) d12.findViewById(android.R.id.button2);
        hVar.f3717n = button2;
        button2.setOnClickListener(bVar);
        if (TextUtils.isEmpty(hVar.o) && hVar.f3719q == null) {
            hVar.f3717n.setVisibility(8);
        } else {
            hVar.f3717n.setText(hVar.o);
            Drawable drawable2 = hVar.f3719q;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i15, i15);
                hVar.f3717n.setCompoundDrawables(hVar.f3719q, null, null, null);
            }
            hVar.f3717n.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) d12.findViewById(android.R.id.button3);
        hVar.f3720r = button3;
        button3.setOnClickListener(bVar);
        if (TextUtils.isEmpty(hVar.f3721s) && hVar.f3723u == null) {
            hVar.f3720r.setVisibility(8);
            view = null;
        } else {
            hVar.f3720r.setText(hVar.f3721s);
            Drawable drawable3 = hVar.f3723u;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i15, i15);
                view = null;
                hVar.f3720r.setCompoundDrawables(hVar.f3723u, null, null, null);
            } else {
                view = null;
            }
            hVar.f3720r.setVisibility(0);
            i10 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 == 1) {
                h.b(hVar.f3713j);
            } else if (i10 == 2) {
                h.b(hVar.f3717n);
            } else if (i10 == 4) {
                h.b(hVar.f3720r);
            }
        }
        if (i10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            d12.setVisibility(8);
        }
        if (hVar.B != null) {
            d10.addView(hVar.B, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            hVar.f3727y = (ImageView) window.findViewById(android.R.id.icon);
            if ((!TextUtils.isEmpty(hVar.f3708e)) && hVar.I) {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                hVar.f3728z = textView2;
                textView2.setText(hVar.f3708e);
                int i16 = hVar.f3725w;
                if (i16 != 0) {
                    hVar.f3727y.setImageResource(i16);
                } else {
                    Drawable drawable4 = hVar.f3726x;
                    if (drawable4 != null) {
                        hVar.f3727y.setImageDrawable(drawable4);
                    } else {
                        hVar.f3728z.setPadding(hVar.f3727y.getPaddingLeft(), hVar.f3727y.getPaddingTop(), hVar.f3727y.getPaddingRight(), hVar.f3727y.getPaddingBottom());
                        hVar.f3727y.setVisibility(8);
                    }
                }
            } else {
                window.findViewById(R.id.title_template).setVisibility(8);
                hVar.f3727y.setVisibility(8);
                d10.setVisibility(8);
            }
        }
        if (viewGroup.getVisibility() != 8) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (d10 != null && d10.getVisibility() != 8) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (d12.getVisibility() != 8) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13 && (findViewById = d11.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i11 != 0) {
            NestedScrollView nestedScrollView2 = hVar.f3724v;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (hVar.f3709f != null) {
                view2 = d10.findViewById(R.id.titleDividerNoCustom);
            } else {
                view2 = view;
            }
            if (view2 != null) {
                view2.setVisibility(0);
            }
        } else {
            View findViewById9 = d11.findViewById(R.id.textSpacerNoTitle);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = hVar.f3709f;
        if (alertController$RecycleListView instanceof AlertController$RecycleListView) {
            alertController$RecycleListView.getClass();
            if (!z13 || i11 == 0) {
                int paddingLeft = alertController$RecycleListView.getPaddingLeft();
                if (i11 != 0) {
                    i12 = alertController$RecycleListView.getPaddingTop();
                } else {
                    i12 = alertController$RecycleListView.f290a;
                }
                int paddingRight = alertController$RecycleListView.getPaddingRight();
                if (z13) {
                    i13 = alertController$RecycleListView.getPaddingBottom();
                } else {
                    i13 = alertController$RecycleListView.f291b;
                }
                alertController$RecycleListView.setPadding(paddingLeft, i12, paddingRight, i13);
            }
        }
        if (!z12) {
            View view4 = hVar.f3709f;
            if (view4 == null) {
                view4 = hVar.f3724v;
            }
            if (view4 != null) {
                if (z13) {
                    i14 = 2;
                }
                View findViewById10 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById11 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = y0.f4277a;
                g0.o0.d(view4, i11 | i14, 3);
                if (findViewById10 != null) {
                    d11.removeView(findViewById10);
                }
                if (findViewById11 != null) {
                    d11.removeView(findViewById11);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = hVar.f3709f;
        if (alertController$RecycleListView2 != null && (listAdapter = hVar.C) != null) {
            alertController$RecycleListView2.setAdapter(listAdapter);
            int i17 = hVar.D;
            if (i17 > -1) {
                alertController$RecycleListView2.setItemChecked(i17, true);
                alertController$RecycleListView2.setSelection(i17);
            }
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z9;
        NestedScrollView nestedScrollView = this.f3738e.f3724v;
        if (nestedScrollView != null && nestedScrollView.j(keyEvent)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        boolean z9;
        NestedScrollView nestedScrollView = this.f3738e.f3724v;
        if (nestedScrollView != null && nestedScrollView.j(keyEvent)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // androidx.activity.l, android.app.Dialog
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void setContentView(int i10) {
        j().i(i10);
    }

    @Override // androidx.activity.l, android.app.Dialog
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void setContentView(View view) {
        j().j(view);
    }

    @Override // androidx.activity.l, android.app.Dialog
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j().k(view, layoutParams);
    }

    @Override // android.app.Dialog
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void setTitle(int i10) {
        super.setTitle(i10);
        j().l(getContext().getString(i10));
    }

    public final void t(CharSequence charSequence) {
        super.setTitle(charSequence);
        j().l(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean u(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        t(charSequence);
        h hVar = this.f3738e;
        hVar.f3708e = charSequence;
        TextView textView = hVar.f3728z;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
