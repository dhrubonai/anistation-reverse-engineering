package f;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class h {
    public TextView A;
    public View B;
    public ListAdapter C;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final boolean I;
    public final f J;

    /* renamed from: a, reason: collision with root package name */
    public final Context f3704a;

    /* renamed from: b, reason: collision with root package name */
    public final j f3705b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f3706c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3707d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f3708e;

    /* renamed from: f, reason: collision with root package name */
    public AlertController$RecycleListView f3709f;

    /* renamed from: g, reason: collision with root package name */
    public View f3710g;

    /* renamed from: h, reason: collision with root package name */
    public int f3711h;

    /* renamed from: j, reason: collision with root package name */
    public Button f3713j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f3714k;

    /* renamed from: l, reason: collision with root package name */
    public Message f3715l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f3716m;

    /* renamed from: n, reason: collision with root package name */
    public Button f3717n;
    public CharSequence o;

    /* renamed from: p, reason: collision with root package name */
    public Message f3718p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f3719q;

    /* renamed from: r, reason: collision with root package name */
    public Button f3720r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f3721s;

    /* renamed from: t, reason: collision with root package name */
    public Message f3722t;

    /* renamed from: u, reason: collision with root package name */
    public Drawable f3723u;

    /* renamed from: v, reason: collision with root package name */
    public NestedScrollView f3724v;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f3726x;

    /* renamed from: y, reason: collision with root package name */
    public ImageView f3727y;

    /* renamed from: z, reason: collision with root package name */
    public TextView f3728z;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3712i = false;

    /* renamed from: w, reason: collision with root package name */
    public int f3725w = 0;
    public int D = -1;
    public final b K = new b(this, 0);

    public h(Context context, j jVar, Window window) {
        this.f3704a = context;
        this.f3705b = jVar;
        this.f3706c = window;
        this.J = new f(jVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, e.a.f3274e, R.attr.alertDialogStyle, 0);
        this.E = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.F = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.G = obtainStyledAttributes.getResourceId(7, 0);
        this.H = obtainStyledAttributes.getResourceId(3, 0);
        this.I = obtainStyledAttributes.getBoolean(6, true);
        this.f3707d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        jVar.j().h(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public static void c(View view, View view2, View view3) {
        int i10;
        int i11 = 0;
        if (view2 != null) {
            if (view.canScrollVertically(-1)) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            view2.setVisibility(i10);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i11 = 4;
            }
            view3.setVisibility(i11);
        }
    }

    public static ViewGroup d(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void e(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message message;
        if (onClickListener != null) {
            message = this.J.obtainMessage(i10, onClickListener);
        } else {
            message = null;
        }
        if (i10 != -3) {
            if (i10 != -2) {
                if (i10 == -1) {
                    this.f3714k = charSequence;
                    this.f3715l = message;
                    this.f3716m = null;
                    return;
                }
                throw new IllegalArgumentException("Button does not exist");
            }
            this.o = charSequence;
            this.f3718p = message;
            this.f3719q = null;
            return;
        }
        this.f3721s = charSequence;
        this.f3722t = message;
        this.f3723u = null;
    }
}
