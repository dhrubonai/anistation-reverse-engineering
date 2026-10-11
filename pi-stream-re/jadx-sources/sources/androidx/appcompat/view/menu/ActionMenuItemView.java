package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.i1;
import androidx.appcompat.widget.n;
import e.a;
import j.b;
import j.c;
import j.d0;
import j.o;
import j.q;
import p7.a0;

/* loaded from: classes.dex */
public class ActionMenuItemView extends i1 implements d0, View.OnClickListener, n {
    public Drawable A;
    public j.n B;
    public b C;
    public c D;
    public boolean E;
    public boolean F;
    public final int G;
    public int H;
    public final int I;

    /* renamed from: y, reason: collision with root package name */
    public q f293y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f294z;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.E = m();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f3272c, 0, 0);
        this.G = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.I = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.H = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.n
    public final boolean a() {
        return l();
    }

    @Override // androidx.appcompat.widget.n
    public final boolean b() {
        if (l() && this.f293y.getIcon() == null) {
            return true;
        }
        return false;
    }

    @Override // j.d0
    public final void c(q qVar) {
        int i10;
        this.f293y = qVar;
        setIcon(qVar.getIcon());
        setTitle(qVar.getTitleCondensed());
        setId(qVar.f5572a);
        if (qVar.isVisible()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setVisibility(i10);
        setEnabled(qVar.isEnabled());
        if (qVar.hasSubMenu() && this.C == null) {
            this.C = new b(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // j.d0
    public q getItemData() {
        return this.f293y;
    }

    public final boolean l() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean m() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 < 480 && ((i10 < 640 || i11 < 480) && configuration.orientation != 2)) {
            return false;
        }
        return true;
    }

    public final void n() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z9;
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f294z);
        if (this.A != null) {
            if ((this.f293y.f5595y & 4) == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9 || (!this.E && !this.F)) {
                z10 = false;
            }
        }
        boolean z12 = z11 & z10;
        CharSequence charSequence3 = null;
        if (z12) {
            charSequence = this.f294z;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence4 = this.f293y.f5587q;
        if (TextUtils.isEmpty(charSequence4)) {
            if (z12) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f293y.f5576e;
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(charSequence4);
        }
        CharSequence charSequence5 = this.f293y.f5588r;
        if (TextUtils.isEmpty(charSequence5)) {
            if (!z12) {
                charSequence3 = this.f293y.f5576e;
            }
            a0.W(this, charSequence3);
            return;
        }
        a0.W(this, charSequence5);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j.n nVar = this.B;
        if (nVar != null) {
            nVar.d(this.f293y);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.E = m();
        n();
    }

    @Override // androidx.appcompat.widget.i1, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        boolean l10 = l();
        if (l10 && (i13 = this.H) >= 0) {
            super.setPadding(i13, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int i14 = this.G;
        if (mode == Integer.MIN_VALUE) {
            i12 = Math.min(size, i14);
        } else {
            i12 = i14;
        }
        if (mode != 1073741824 && i14 > 0 && measuredWidth < i12) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
        }
        if (!l10 && this.A != null) {
            super.setPadding((getMeasuredWidth() - this.A.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar;
        if (this.f293y.hasSubMenu() && (bVar = this.C) != null && bVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z9) {
    }

    public void setChecked(boolean z9) {
    }

    public void setExpandedFormat(boolean z9) {
        if (this.F != z9) {
            this.F = z9;
            q qVar = this.f293y;
            if (qVar != null) {
                o oVar = qVar.f5585n;
                oVar.f5556k = true;
                oVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.A = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.I;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        n();
    }

    public void setItemInvoker(j.n nVar) {
        this.B = nVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.H = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(c cVar) {
        this.D = cVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f294z = charSequence;
        n();
    }
}
