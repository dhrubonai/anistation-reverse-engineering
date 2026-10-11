package j;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public final class a implements b0.b {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f5472a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f5473b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f5474c;

    /* renamed from: d, reason: collision with root package name */
    public char f5475d;

    /* renamed from: f, reason: collision with root package name */
    public char f5477f;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f5479h;

    /* renamed from: i, reason: collision with root package name */
    public final Context f5480i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f5481j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f5482k;

    /* renamed from: e, reason: collision with root package name */
    public int f5476e = 4096;

    /* renamed from: g, reason: collision with root package name */
    public int f5478g = 4096;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f5483l = null;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f5484m = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5485n = false;
    public boolean o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f5486p = 16;

    public a(Context context, CharSequence charSequence) {
        this.f5480i = context;
        this.f5472a = charSequence;
    }

    @Override // b0.b
    public final r a() {
        return null;
    }

    @Override // b0.b
    public final b0.b b(r rVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f5479h;
        if (drawable != null) {
            if (this.f5485n || this.o) {
                this.f5479h = drawable;
                Drawable mutate = drawable.mutate();
                this.f5479h = mutate;
                if (this.f5485n) {
                    a0.b.h(mutate, this.f5483l);
                }
                if (this.o) {
                    a0.b.i(this.f5479h, this.f5484m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // b0.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f5478g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f5477f;
    }

    @Override // b0.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f5481j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f5479h;
    }

    @Override // b0.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f5483l;
    }

    @Override // b0.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f5484m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f5474c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // b0.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f5476e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f5475d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f5472a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f5473b;
        if (charSequence == null) {
            return this.f5472a;
        }
        return charSequence;
    }

    @Override // b0.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f5482k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.f5486p & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.f5486p & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.f5486p & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        if ((this.f5486p & 8) == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c6) {
        this.f5477f = Character.toLowerCase(c6);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z9) {
        this.f5486p = (z9 ? 1 : 0) | (this.f5486p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z9) {
        int i10;
        int i11 = this.f5486p & (-3);
        if (z9) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.f5486p = i10 | i11;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f5481j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z9) {
        int i10;
        int i11 = this.f5486p & (-17);
        if (z9) {
            i10 = 16;
        } else {
            i10 = 0;
        }
        this.f5486p = i10 | i11;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f5479h = drawable;
        c();
        return this;
    }

    @Override // b0.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f5483l = colorStateList;
        this.f5485n = true;
        c();
        return this;
    }

    @Override // b0.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f5484m = mode;
        this.o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f5474c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c6) {
        this.f5475d = c6;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c6, char c10) {
        this.f5475d = c6;
        this.f5477f = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f5472a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f5473b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f5482k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z9) {
        int i10 = 8;
        int i11 = this.f5486p & 8;
        if (z9) {
            i10 = 0;
        }
        this.f5486p = i11 | i10;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // b0.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c6, int i10) {
        this.f5477f = Character.toLowerCase(c6);
        this.f5478g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // b0.b, android.view.MenuItem
    public final b0.b setContentDescription(CharSequence charSequence) {
        this.f5481j = charSequence;
        return this;
    }

    @Override // b0.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c6, int i10) {
        this.f5475d = c6;
        this.f5476e = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        this.f5472a = this.f5480i.getResources().getString(i10);
        return this;
    }

    @Override // b0.b, android.view.MenuItem
    public final b0.b setTooltipText(CharSequence charSequence) {
        this.f5482k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f5479h = x.j.getDrawable(this.f5480i, i10);
        c();
        return this;
    }

    @Override // b0.b, android.view.MenuItem
    public final MenuItem setShortcut(char c6, char c10, int i10, int i11) {
        this.f5475d = c6;
        this.f5476e = KeyEvent.normalizeMetaState(i10);
        this.f5477f = Character.toLowerCase(c10);
        this.f5478g = KeyEvent.normalizeMetaState(i11);
        return this;
    }
}
