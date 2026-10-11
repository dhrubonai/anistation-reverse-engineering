package j;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import f.p0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q implements b0.b {
    public r A;
    public MenuItem.OnActionExpandListener B;

    /* renamed from: a, reason: collision with root package name */
    public final int f5572a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5573b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5574c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5575d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f5576e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f5577f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f5578g;

    /* renamed from: h, reason: collision with root package name */
    public char f5579h;

    /* renamed from: j, reason: collision with root package name */
    public char f5581j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f5583l;

    /* renamed from: n, reason: collision with root package name */
    public final o f5585n;
    public i0 o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f5586p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f5587q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f5588r;

    /* renamed from: y, reason: collision with root package name */
    public int f5595y;

    /* renamed from: z, reason: collision with root package name */
    public View f5596z;

    /* renamed from: i, reason: collision with root package name */
    public int f5580i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f5582k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f5584m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f5589s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f5590t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5591u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5592v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5593w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f5594x = 16;
    public boolean C = false;

    public q(o oVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f5585n = oVar;
        this.f5572a = i11;
        this.f5573b = i10;
        this.f5574c = i12;
        this.f5575d = i13;
        this.f5576e = charSequence;
        this.f5595y = i14;
    }

    public static void c(StringBuilder sb, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb.append(str);
        }
    }

    @Override // b0.b
    public final r a() {
        return this.A;
    }

    @Override // b0.b
    public final b0.b b(r rVar) {
        r rVar2 = this.A;
        if (rVar2 != null) {
            rVar2.getClass();
        }
        this.f5596z = null;
        this.A = rVar;
        this.f5585n.p(true);
        r rVar3 = this.A;
        if (rVar3 != null) {
            rVar3.d(new p0(this, 3));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f5595y & 8) == 0) {
            return false;
        }
        if (this.f5596z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f5585n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f5593w && (this.f5591u || this.f5592v)) {
            drawable = drawable.mutate();
            if (this.f5591u) {
                a0.b.h(drawable, this.f5589s);
            }
            if (this.f5592v) {
                a0.b.i(drawable, this.f5590t);
            }
            this.f5593w = false;
        }
        return drawable;
    }

    public final boolean e() {
        r rVar;
        if ((this.f5595y & 8) == 0) {
            return false;
        }
        if (this.f5596z == null && (rVar = this.A) != null) {
            this.f5596z = rVar.b(this);
        }
        if (this.f5596z == null) {
            return false;
        }
        return true;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.f5585n.f(this);
    }

    public final boolean f() {
        if ((this.f5594x & 32) == 32) {
            return true;
        }
        return false;
    }

    public final void g(boolean z9) {
        if (z9) {
            this.f5594x |= 32;
        } else {
            this.f5594x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f5596z;
        if (view != null) {
            return view;
        }
        r rVar = this.A;
        if (rVar != null) {
            View b10 = rVar.b(this);
            this.f5596z = b10;
            return b10;
        }
        return null;
    }

    @Override // b0.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f5582k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f5581j;
    }

    @Override // b0.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f5587q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f5573b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f5583l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f5584m;
        if (i10 != 0) {
            Drawable G = w7.b.G(this.f5585n.f5546a, i10);
            this.f5584m = 0;
            this.f5583l = G;
            return d(G);
        }
        return null;
    }

    @Override // b0.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f5589s;
    }

    @Override // b0.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f5590t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f5578g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f5572a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // b0.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f5580i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f5579h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f5574c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f5576e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f5577f;
        if (charSequence == null) {
            return this.f5576e;
        }
        return charSequence;
    }

    @Override // b0.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f5588r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        if (this.o != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.f5594x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.f5594x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.f5594x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        r rVar = this.A;
        if (rVar != null && rVar.c()) {
            if ((this.f5594x & 8) == 0 && this.A.a()) {
                return true;
            }
            return false;
        }
        if ((this.f5594x & 8) == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i10;
        this.f5596z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f5572a) > 0) {
            view.setId(i10);
        }
        o oVar = this.f5585n;
        oVar.f5556k = true;
        oVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c6) {
        if (this.f5581j == c6) {
            return this;
        }
        this.f5581j = Character.toLowerCase(c6);
        this.f5585n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z9) {
        int i10 = this.f5594x;
        int i11 = (z9 ? 1 : 0) | (i10 & (-2));
        this.f5594x = i11;
        if (i10 != i11) {
            this.f5585n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z9) {
        boolean z10;
        int i10;
        int i11 = this.f5594x;
        int i12 = i11 & 4;
        o oVar = this.f5585n;
        int i13 = 2;
        if (i12 != 0) {
            oVar.getClass();
            ArrayList arrayList = oVar.f5551f;
            int size = arrayList.size();
            oVar.w();
            for (int i14 = 0; i14 < size; i14++) {
                q qVar = (q) arrayList.get(i14);
                if (qVar.f5573b == this.f5573b) {
                    boolean z11 = true;
                    if ((qVar.f5594x & 4) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && qVar.isCheckable()) {
                        if (qVar != this) {
                            z11 = false;
                        }
                        int i15 = qVar.f5594x;
                        int i16 = i15 & (-3);
                        if (z11) {
                            i10 = 2;
                        } else {
                            i10 = 0;
                        }
                        int i17 = i10 | i16;
                        qVar.f5594x = i17;
                        if (i15 != i17) {
                            qVar.f5585n.p(false);
                        }
                    }
                }
            }
            oVar.v();
        } else {
            int i18 = i11 & (-3);
            if (!z9) {
                i13 = 0;
            }
            int i19 = i13 | i18;
            this.f5594x = i19;
            if (i11 != i19) {
                oVar.p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z9) {
        if (z9) {
            this.f5594x |= 16;
        } else {
            this.f5594x &= -17;
        }
        this.f5585n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f5584m = 0;
        this.f5583l = drawable;
        this.f5593w = true;
        this.f5585n.p(false);
        return this;
    }

    @Override // b0.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f5589s = colorStateList;
        this.f5591u = true;
        this.f5593w = true;
        this.f5585n.p(false);
        return this;
    }

    @Override // b0.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f5590t = mode;
        this.f5592v = true;
        this.f5593w = true;
        this.f5585n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f5578g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c6) {
        if (this.f5579h == c6) {
            return this;
        }
        this.f5579h = c6;
        this.f5585n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f5586p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c6, char c10) {
        this.f5579h = c6;
        this.f5581j = Character.toLowerCase(c10);
        this.f5585n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f5595y = i10;
        o oVar = this.f5585n;
        oVar.f5556k = true;
        oVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f5576e = charSequence;
        this.f5585n.p(false);
        i0 i0Var = this.o;
        if (i0Var != null) {
            i0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f5577f = charSequence;
        this.f5585n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z9) {
        int i10;
        int i11 = this.f5594x;
        int i12 = i11 & (-9);
        boolean z10 = false;
        if (z9) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        int i13 = i10 | i12;
        this.f5594x = i13;
        if (i11 != i13) {
            z10 = true;
        }
        if (z10) {
            o oVar = this.f5585n;
            oVar.f5553h = true;
            oVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f5576e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // b0.b, android.view.MenuItem
    public final b0.b setContentDescription(CharSequence charSequence) {
        this.f5587q = charSequence;
        this.f5585n.p(false);
        return this;
    }

    @Override // b0.b, android.view.MenuItem
    public final b0.b setTooltipText(CharSequence charSequence) {
        this.f5588r = charSequence;
        this.f5585n.p(false);
        return this;
    }

    @Override // b0.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c6, int i10) {
        if (this.f5581j == c6 && this.f5582k == i10) {
            return this;
        }
        this.f5581j = Character.toLowerCase(c6);
        this.f5582k = KeyEvent.normalizeMetaState(i10);
        this.f5585n.p(false);
        return this;
    }

    @Override // b0.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c6, int i10) {
        if (this.f5579h == c6 && this.f5580i == i10) {
            return this;
        }
        this.f5579h = c6;
        this.f5580i = KeyEvent.normalizeMetaState(i10);
        this.f5585n.p(false);
        return this;
    }

    @Override // b0.b, android.view.MenuItem
    public final MenuItem setShortcut(char c6, char c10, int i10, int i11) {
        this.f5579h = c6;
        this.f5580i = KeyEvent.normalizeMetaState(i10);
        this.f5581j = Character.toLowerCase(c10);
        this.f5582k = KeyEvent.normalizeMetaState(i11);
        this.f5585n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f5583l = null;
        this.f5584m = i10;
        this.f5593w = true;
        this.f5585n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        setTitle(this.f5585n.f5546a.getString(i10));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        int i11;
        o oVar = this.f5585n;
        Context context = oVar.f5546a;
        View inflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f5596z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i11 = this.f5572a) > 0) {
            inflate.setId(i11);
        }
        oVar.f5556k = true;
        oVar.p(true);
        return this;
    }
}
